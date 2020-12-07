package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import dss.Object.Student;

public class StudentDAO extends BaseDAO{
	
	//Ԥ�������
	PreparedStatement preparedStatement;
	//ִ�����
	Statement statement;
	//�����
	ResultSet resultSet;
	
	//���ڱ��������Ϣ����Ϊ������ֵΪѧ������
	public Hashtable<String ,Student> studentTable = new Hashtable<String, Student>();
	
	
	public void terminate() throws SQLException
	{
		this.preparedStatement.close();
		this.statement.close();
		this.resultSet.close();
	}
	
	public void flush() throws SQLException{
		studentTable.clear();
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
			studentTable.put(name, student);
		}
	}
	
	//��������
	public boolean insert(Student currentStudent) throws SQLException{
		//String in = "select * from";
		if(studentTable.contains(currentStudent.getName()))
			return false;
		else {
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
			//��������������
			flush();
			return true;
		}
	}
	
	//��������
	public boolean update(Student currentStudent) throws SQLException{
		if(!studentTable.containsKey(currentStudent.getName()))
			return false;
		else {
			preparedStatement = databaseConnection.prepareStatement(
					"update dbo.Student set SNo=?,SAge=?,SName=?,SDept=?,SSex=?,SPassword=?,SRoom=?;",
					PreparedStatement.NO_GENERATED_KEYS);
			preparedStatement.setString(1,currentStudent.getNubmer());
			preparedStatement.setInt(2, currentStudent.getAge());
			preparedStatement.setString(3, currentStudent.getName());
			preparedStatement.setString(4, currentStudent.getDepartment());
			preparedStatement.setInt(5, currentStudent.getSex());
			preparedStatement.setString(6, currentStudent.getPassword());
			preparedStatement.setString(7, currentStudent.getSroom());
			terminate();
			flush();
			return true;
		}
	}
	
	//ɾ������
	public boolean delete(Student currentStudent) throws SQLException{
		if(!studentTable.contains(currentStudent.getName()))
			return false;
		else {
			preparedStatement = databaseConnection.prepareStatement(
					"delete from dbo.Student where SNo=?",
					PreparedStatement.NO_GENERATED_KEYS);
			preparedStatement.setString(1, currentStudent.getNubmer());
			terminate();
			flush();
			return true;
		}
	}
	
	//��ȡȫ������
	public void getAll() throws SQLException{
		
	}
	
	//����**������Ϣ
	public void search() throws SQLException {
		
	}
}
