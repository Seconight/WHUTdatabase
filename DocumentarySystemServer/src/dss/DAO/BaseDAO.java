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
    
    //进行数据库的连接
    protected void connect(){
    	try
	    {
	        Class.forName(Constants.driverName);
	        databaseConnection=DriverManager.getConnection(
	        		Constants.dbURL,
	        		Constants.userName,
	        		Constants.password);
	        //System.out.println("success!");
	     }
	      catch(Exception e)
	   {
	        e.printStackTrace();
	        System.out.print("connect fail!");
	   }
    }
    
    //关闭数据库的连接
    protected void disconnect() {
    	try {
			databaseConnection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("disconnect failed");
		}
    }
    
    
}
