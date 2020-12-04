package dss.Object;

import java.sql.Connection;

//本类声明了工程中需要的常量
public class Constants {
	
	
	//数据库用户名
	public static String userName = "sa";
	
	//数据库用户密码
	public static String password = "123456Tt";
		
	//驱动名称
	public static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
	//连接数据库服务器
	public static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=DormitoryDB";
	    
	//连接数据库对象
	public static Connection databaseConnection;
	
	//一型宿舍介绍
	public static String R1INTRO = "";
	
	//二型宿舍介绍
	public static String R2INTRO = "";
	
	//三型宿舍介绍
	public static String R3INTRO = "";
	
	//客户端请求服务名称
	public static String ADDRESS = "localhost";
	
}
