package dss.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import dss.Object.Student;

public class ApplicaitonDAO extends BaseDAO{
	//Ԥ�������
		PreparedStatement preparedStatement;
		//ִ�����
		Statement statement;
		//�����
		ResultSet resultSet;
		
		//���ڱ��������Ϣ
		public Hashtable<String ,Student> studentTable = new Hashtable<String, Student>();
		
		
		public void terminate() throws SQLException
		{
			this.preparedStatement.close();
			this.statement.close();
			this.resultSet.close();
		}
		
		//��������
		public void insert() throws SQLException{
			
		}
		
		//��������
		public void update() throws SQLException{
			
		}
		
		//ɾ������
		public void delete() throws SQLException{
			
		}
		
		//��ȡȫ������
		public void getAll() throws SQLException{
			
		}
		
		//����**������Ϣ
		public void search() throws SQLException {
			
		}
}
