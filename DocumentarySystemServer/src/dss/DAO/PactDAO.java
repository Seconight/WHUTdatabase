package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.Object.Pact;
import dss.Object.Room;
import dss.Object.Student;

public class PactDAO extends BaseDAO{
	//预处理语句
		PreparedStatement preparedStatement;
		//执行语句
		Statement statement;
		//结果集
		ResultSet resultSet;
		
		//用于保存表项信息
		public Hashtable<String ,Pact> pactTable = new Hashtable<String, Pact>();
		
		public PactDAO() throws SQLException{
			this.flush();
		}
		
		public void flush() throws SQLException{
			pactTable.clear();
			connect();
			statement = databaseConnection.createStatement();
			String sql = "select * from dbo.Pact";
			resultSet = statement.executeQuery(sql);
			
			String PNo = resultSet.getString("PNo");
			String PSTime = resultSet.getString("PSTime");
			float PMoney = resultSet.getFloat("PMoney");
			int PTime = resultSet.getInt("PTime");
			String PRNo = resultSet.getString("PRNo");
			String PSNo = resultSet.getString("PSNo");
			
			Pact current = new Pact(PNo,PSTime,PMoney,PTime,PRNo,PSNo);
			pactTable.put(PNo,current);
			
			terminate();
			disconnect();
		}
		
		
		public void terminate() throws SQLException
		{
			if(this.preparedStatement!=null) this.preparedStatement.close();
			if(this.statement!=null) this.statement.close();
			if(this.resultSet!=null) this.resultSet.close();
		}
		
		//插入数据
		public boolean insert(Pact currentPact) throws SQLException{
			if(pactTable.containsKey(currentPact.getPNo())) {
				return false;
			}
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"insert into dbo.Pact values"
						+ "(?,?,?,?,?,?);"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, currentPact.getPNo());
				preparedStatement.setString(2,currentPact.getPSTime());
				preparedStatement.setFloat(3, currentPact.getPMoney());
				preparedStatement.setInt(4, currentPact.getPTime());
				preparedStatement.setString(5, currentPact.getPRNo());
				preparedStatement.setString(6, currentPact.getPSNo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//更新数据
		public boolean update(Pact currentPact) throws SQLException{
			if(!pactTable.containsKey(currentPact.getPNo())) {
				return false;
			}
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"update dbo.Pact set PNo=?,PSTime=?,PMoney=?,PTime=?,PRNo=?,PSNo=? "
						+ "where PNo=?"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, currentPact.getPNo());
				preparedStatement.setString(2,currentPact.getPSTime());
				preparedStatement.setFloat(3, currentPact.getPMoney());
				preparedStatement.setInt(4, currentPact.getPTime());
				preparedStatement.setString(5, currentPact.getPRNo());
				preparedStatement.setString(6, currentPact.getPSNo());
				preparedStatement.setString(7, currentPact.getPNo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//删除数据
		public boolean delete(Pact currentPact) throws SQLException{
			if(!pactTable.containsKey(currentPact.getPNo())) {
				return false;
			}
			else {
				connect();
				
				preparedStatement = databaseConnection.prepareStatement(
						"delete from dbo.Pact where PNo=?;"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1,currentPact.getPNo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//获取全部数据
		public Enumeration<Pact> getAll() throws SQLException{
			return this.pactTable.elements();
		}
		
		//根据**查找信息
		public Pact search(String number) throws SQLException {
			Pact result = null;
			Enumeration<Pact> e = getAll();
			while (e.hasMoreElements()) {
				Pact current = (Pact) e.nextElement();
				if(current.getPNo().equals(number))
					result = current;
			}
			return null;
		}
}
