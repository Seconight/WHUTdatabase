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
	public static String R1INTRO = "一等宿舍,环境优良,独立卫浴,价格500/月";
	
	//二型宿舍介绍
	public static String R2INTRO = "二等宿舍,环境较好,独立卫浴,价格300/月";
	
	//三型宿舍介绍
	public static String R3INTRO = "三等宿舍,环境一般,价格200/月";
	
	//客户端请求服务名称
	public static String ADDRESS = "localhost";
	
	//管理员账号
	public static String admID = "admin";
	
	//管理员密码
	public static String admPW = "123";
	
}
