package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.Object.Student;

public class StudentDAO extends BaseDAO{
	
	//预处理语句
	PreparedStatement preparedStatement;
	//执行语句
	Statement statement;
	//结果集
	ResultSet resultSet;
	
	//构造函数
	public StudentDAO() throws SQLException {
		this.flush();
	}
	
	
	//用于保存表项信息，键为学号，值为学生对象
	public Hashtable<String ,Student> studentTable = new Hashtable<String, Student>();
	
	
	
	public void terminate() throws SQLException
	{
		if(this.preparedStatement!=null) this.preparedStatement.close();
		if(this.statement!=null) this.statement.close();
		if(this.resultSet!=null) this.resultSet.close();
	}
	
	public void flush() throws SQLException{
		//清空数据表
		studentTable.clear();
		//连接数据库
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
		//关闭相关组件连接
		terminate();
		disconnect();
	}
	
	//插入数据
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
			//关掉对应组件
			terminate();
			//断开数据库连接
			disconnect();
			//更新现有数据项
			flush();
			return true;
		}
	}
	
	//更新数据
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
	
	//删除数据
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
	
	//获取全部数据
	public Enumeration<Student> getAll() throws SQLException{
		return studentTable.elements();
	}
	
	//根据姓名查找信息
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
