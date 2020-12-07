package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import dss.Object.Student;

public class ApplicaitonDAO extends BaseDAO{
	//预处理语句
		PreparedStatement preparedStatement;
		//执行语句
		Statement statement;
		//结果集
		ResultSet resultSet;
		
		//用于保存表项信息
		public Hashtable<String ,Student> studentTable = new Hashtable<String, Student>();
		
		
		public void terminate() throws SQLException
		{
			this.preparedStatement.close();
			this.statement.close();
			this.resultSet.close();
		}
		
		//插入数据
		public void insert() throws SQLException{
			
		}
		
		//更新数据
		public void update() throws SQLException{
			
		}
		
		//删除数据
		public void delete() throws SQLException{
			
		}
		
		//获取全部数据
		public void getAll() throws SQLException{
			
		}
		
		//根据**查找信息
		public void search() throws SQLException {
			
		}
}
