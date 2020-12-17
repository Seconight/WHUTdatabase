package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.Object.Application;
import dss.Object.Student;

public class ApplicaitonDAO extends BaseDAO{
	//Ԥ�������
		PreparedStatement preparedStatement;
		//ִ�����
		Statement statement;
		//�����
		ResultSet resultSet;
		
		//���캯��
		public ApplicaitonDAO() {
			try {
				flush();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//���ڱ��������Ϣ
		public Hashtable<String ,Application> appTable = new Hashtable<String, Application>();
		
		
		public void terminate() throws SQLException
		{
			if(this.preparedStatement!=null) this.preparedStatement.close();
			if(this.statement!=null) this.statement.close();
			if(this.resultSet!=null) this.resultSet.close();
		}
		
		public void flush() throws SQLException{
			appTable.clear();
			connect();
			statement = databaseConnection.createStatement();
			String q = "select * from dbo.Application;";
			resultSet = statement.executeQuery(q);
			while (resultSet.next()) {
				String ANo = resultSet.getString("ANo");
				int AType = resultSet.getInt("AType");
				String AATime = resultSet.getString("AATime");
				String ASTime = resultSet.getString("ASTime");
				int ARTime = resultSet.getInt("ARTime");
				float ASPay = resultSet.getFloat("ASPay");
				float AAPay = resultSet.getFloat("AAPay");
				String ASNo = resultSet.getString("ASNo");
				String AORNo = resultSet.getString("AORNo");
				String ANRNo = resultSet.getString("ANRNo");
				String ACNo = resultSet.getString("ACNo");
				Application app = new Application(ANo,AType,AATime,ASTime,ARTime,
						ASPay,AAPay,ASNo,AORNo,ANRNo,ACNo);
				appTable.put(ANo,app);
			}
			//�ر�����������
			terminate();
			disconnect();
		}
		
		//��������
		public boolean insert(Application application) throws SQLException{
			if(appTable.containsKey(application.getANo()))
				return false;
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"insert into dbo.Application values "
						+ "(?,?,?,?,?,?,?,?,?,?,?);"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, application.getANo());
				preparedStatement.setInt(2, application.getAType());
				preparedStatement.setString(3, application.getAATime());
				preparedStatement.setString(4, application.getASTime());
				preparedStatement.setInt(5, application.getARTime());
				preparedStatement.setFloat(6, application.getASPay());
				preparedStatement.setFloat(7, application.getAAPay());
				preparedStatement.setString(8, application.getASNo());
				preparedStatement.setString(9, application.getAORNo());
				preparedStatement.setString(10, application.getANRNo());
				preparedStatement.setString(11, application.getACNo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//��������
		public boolean update(Application application) throws SQLException{
			if(!appTable.containsKey(application.getANo()))
				return false;
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"update dbo.Application set ANo=?,AType=?,AATime=?,ASTime=?,ARTime=?," + 
						"ASPay=?,AAPay=?,ASNo=?,AORNo=?,ANRNo=?,ACNo=? "
						+"where ANo=?;"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, application.getANo());
				preparedStatement.setInt(2, application.getAType());
				preparedStatement.setString(3, application.getAATime());
				preparedStatement.setString(4, application.getASTime());
				preparedStatement.setInt(5, application.getARTime());
				preparedStatement.setFloat(6, application.getASPay());
				preparedStatement.setFloat(7, application.getAAPay());
				preparedStatement.setString(8, application.getASNo());
				preparedStatement.setString(9, application.getAORNo());
				preparedStatement.setString(10, application.getANRNo());
				preparedStatement.setString(11, application.getACNo());
				preparedStatement.setString(12, application.getANo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}

		}
		
		//ɾ������
		public boolean delete(Application application) throws SQLException{
			if(!appTable.containsKey(application.getANo()))
				return false;
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"delete from dbo.Application where ANo=?;"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, application.getANo());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//��ȡȫ������
		public Enumeration<Application> getAll() throws SQLException{
			return appTable.elements();
		}
		
		//����**������Ϣ
		public Application search(String number) throws SQLException {
			Application result = null;
			flush();
			Enumeration<Application> e = getAll();
			while (e.hasMoreElements()) {
				Application application = (Application) e.nextElement();
				if(application.getANo().equals(number)) {
					result = application;
				}
			}
			return result;
		}
}
