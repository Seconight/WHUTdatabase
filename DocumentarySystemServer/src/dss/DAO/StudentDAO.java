package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.Object.Student;

public class StudentDAO extends BaseDAO{
	
	//Ԥ�������
	PreparedStatement preparedStatement;
	//ִ�����
	Statement statement;
	//�����
	ResultSet resultSet;
	
	//���캯��
	public StudentDAO() throws SQLException {
		this.flush();
	}
	
	
	//���ڱ��������Ϣ����Ϊѧ�ţ�ֵΪѧ������
	public Hashtable<String ,Student> studentTable = new Hashtable<String, Student>();
	
	
	
	public void terminate() throws SQLException
	{
		if(this.preparedStatement!=null) this.preparedStatement.close();
		if(this.statement!=null) this.statement.close();
		if(this.resultSet!=null) this.resultSet.close();
	}
	
	public void flush() throws SQLException{
		//������ݱ�
		studentTable.clear();
		//�������ݿ�
		connect();
		statement = databaseConnection.createStatement();
		String getall = "SELECT * FROM dbo.Student";
		resultSet = statement.executeQuery(getall);
		while (resultSet.next()) {
			String name = resultSet.getString("SName");
			String number = resultSet.getString("SNo");
			int age = resultSet.getInt("SAge");
			String department = resultSet.getString("SDept");
			int sex = resultSet.getInt("SSex");
			String password = resultSet.getString("SPassword");
			String room = resultSet.getString("SRoom");
			Student student = new Student(number,age,name,department,sex,password,room);
			studentTable.put(number, student);
		}
		//�ر�����������
		terminate();
		disconnect();
	}
	
	//��������
	public boolean insert(Student currentStudent) throws SQLException{
		
		if(studentTable.contains(currentStudent.getNubmer()))
			return false;
		else {
			connect();
			
			preparedStatement = databaseConnection.prepareStatement(
					"insert into dbo.Student values "
					+ "(?,?,?,?,?,?,?);",
					PreparedStatement.NO_GENERATED_KEYS);
			preparedStatement.setString(1,currentStudent.getNubmer());
			preparedStatement.setInt(2, currentStudent.getAge());
			preparedStatement.setString(3,currentStudent.getName());
			preparedStatement.setString(4, currentStudent.getDepartment());
			preparedStatement.setInt(5, currentStudent.getSex());
			preparedStatement.setString(6, currentStudent.getPassword());
			preparedStatement.setString(7,currentStudent.getSroom());
			preparedStatement.executeUpdate();
			//�ص���Ӧ���
			terminate();
			//�Ͽ����ݿ�����
			disconnect();
			//��������������
			flush();
			return true;
		}
	}
	
	//��������
	public boolean update(Student currentStudent) throws SQLException{
		if(!studentTable.containsKey(currentStudent.getNubmer()))
			return false;
		else {
			connect();
			preparedStatement = databaseConnection.prepareStatement(
					"update dbo.Student set SNo=?,SAge=?,SName=?,SDept=?,SSex=?,SPassword=?,SRoom=?"
					+ " where SNo=?;",
					PreparedStatement.NO_GENERATED_KEYS);
			preparedStatement.setString(1,currentStudent.getNubmer());
			preparedStatement.setInt(2, currentStudent.getAge());
			preparedStatement.setString(3, currentStudent.getName());
			preparedStatement.setString(4, currentStudent.getDepartment());
			preparedStatement.setInt(5, currentStudent.getSex());
			preparedStatement.setString(6, currentStudent.getPassword());
			preparedStatement.setString(7, currentStudent.getSroom());
			preparedStatement.setString(8,currentStudent.getNubmer());
			preparedStatement.executeUpdate();
			terminate();
			disconnect();
			flush();
			return true;
		}
	}
	
	//ɾ������
	public boolean delete(Student currentStudent) throws SQLException{
		if(!studentTable.containsKey(currentStudent.getNubmer()))
			return false;
		else {
			connect();
			preparedStatement = databaseConnection.prepareStatement(
					"delete from dbo.Student where SNo=?;",
					PreparedStatement.NO_GENERATED_KEYS);
			preparedStatement.setString(1, currentStudent.getNubmer());
			preparedStatement.executeUpdate();
			terminate();
			disconnect();
			flush();
			return true;
		}
	}
	
	//��ȡȫ������
	public Enumeration<Student> getAll() throws SQLException{
		return studentTable.elements();
	}
	
	//��������������Ϣ
	public Student search(String name) throws SQLException {
		Student result = null;
		Enumeration<Student> e = studentTable.elements();
		
		while (e.hasMoreElements()) {
			Student student = (Student) e.nextElement();
			if (student.getName().equals(name)) {
				result = student;
			}
		}
		
		return result;
	}
}
