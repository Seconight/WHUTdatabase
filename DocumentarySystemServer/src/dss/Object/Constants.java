package dss.Object;

import java.sql.Connection;

//���������˹�������Ҫ�ĳ���
public class Constants {
	
	
	//���ݿ��û���
	public static String userName = "sa";
	
	//���ݿ��û�����
	public static String password = "123456Tt";
		
	//��������
	public static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
	//�������ݿ������
	public static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=DormitoryDB";
	    
	//�������ݿ����
	public static Connection databaseConnection;
	
	//һ���������
	public static String R1INTRO = "һ������,��������,������ԡ,�۸�500/��";
	
	//�����������
	public static String R2INTRO = "��������,�����Ϻ�,������ԡ,�۸�300/��";
	
	//�����������
	public static String R3INTRO = "��������,����һ��,�۸�200/��";
	
	//�ͻ��������������
	public static String ADDRESS = "localhost";
	
	//����Ա�˺�
	public static String admID = "admin";
	
	//����Ա����
	public static String admPW = "123";
	
}
