package dss.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dss.Object.Constants;


public class BaseDAO {
	
    //�������ݿ����
    static Connection databaseConnection;
    
    //�������ݿ������
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
    
    //�ر����ݿ������
    protected void disconnect() {
    	try {
			databaseConnection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("disconnect failed");
		}
    }
    
    
}
