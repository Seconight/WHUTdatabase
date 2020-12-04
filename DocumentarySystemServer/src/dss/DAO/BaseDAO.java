package dss.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dss.Object.Constants;


public class BaseDAO {
	
    //连接数据库对象
    static Connection databaseConnection;

    //连接数据库
    public static void connectToDatabase() {
    	 try
    	    {
    	        Class.forName(Constants.driverName);
    	        databaseConnection=DriverManager.getConnection(
    	        		Constants.dbURL,
    	        		Constants.userName,
    	        		Constants.password);
    	        System.out.println("success!");
    	     }
    	      catch(Exception e)
    	   {
    	        e.printStackTrace();
    	        System.out.print("fail!");
    	   }
    }
    //断开数据库连接
    public static void closeDatabase() {
    	try {
    		databaseConnection.close();
		} 
    	catch (SQLException e) {
			// TODO: handle exception
		}
    }
    
    //本函数用于测试数据库是否连接成功
    //测试之前将Room中加入数据
    public static void testDataOut() {
    	try {
			Statement stmt = databaseConnection.createStatement();
			String sql="select * from dbo.Room;";
			//stmt.execute(s);
			ResultSet resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				String cno = resultSet.getString(1);
				int credit = resultSet.getInt(3);
				System.out.println(cno+" "+" money:"+credit);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //main function
    
    public static void main(String[] args) {
		//connectToDatabase();
		//testDataOut();
		//closeDatabase();
	}
	
}
