package dss.DAO;

import java.lang.reflect.Constructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.Object.Room;
import dss.Object.Student;;

public class RoomDAO extends BaseDAO{
	
	
	//Ԥ�������
	PreparedStatement preparedStatement;
	//ִ�����
	Statement statement;
	//�����
	ResultSet resultSet;
	
	//���캯��
	public RoomDAO() throws SQLException{
		this.flush();
	}

		//���ڱ��������Ϣ
		public Hashtable<String ,Room> roomTable = new Hashtable<String, Room>();
		
		
		public void terminate() throws SQLException
		{
			if(this.preparedStatement!=null) this.preparedStatement.close();
			if(this.statement!=null) this.statement.close();
			if(this.resultSet!=null) this.resultSet.close();
		}
		
		public void flush() throws SQLException{
			roomTable.clear();
			connect();
			statement = databaseConnection.createStatement();
			String getall = "SELECT * FROM dbo.Room";
			resultSet = statement.executeQuery(getall);
			while (resultSet.next()) {
				String number = resultSet.getString("RNo");
				String type = resultSet.getString("RType");
				float money = resultSet.getFloat("RRent");
				String department = resultSet.getString("RDept");
				int floor = resultSet.getInt("RFloor");
				int status = resultSet.getInt("RStatus");
				Room room = new Room(number,type,money,department,floor,status);
				roomTable.put(number, room);
			}
			terminate();
			disconnect();
		}
		
		
		//��������
		public boolean insert(Room currentRoom) throws SQLException{
			if(roomTable.containsKey(currentRoom.getNumber()))
				return false;
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"insert into dbo.Room values"
						+ "(?,?,?,?,?,?);"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, currentRoom.getNumber());
				preparedStatement.setString(2, currentRoom.getType());
				preparedStatement.setFloat(3, currentRoom.getMoney());
				preparedStatement.setString(4, currentRoom.getDepartment());
				preparedStatement.setInt(5,currentRoom.getFloor());
				preparedStatement.setInt(6, currentRoom.getStatus());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
			
		}
		
		//��������
		public boolean update(Room currentRoom) throws SQLException{
			if(!roomTable.containsKey(currentRoom.getNumber()))
				return false;
			else {
				connect();
				preparedStatement = databaseConnection.prepareStatement(
						"update dbo.Room set RNo=?,RType=?,RRent=?,RDept=?,RFloor=?,RStatus=?"
						+ " where RNo=?;"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, currentRoom.getNumber());
				preparedStatement.setString(2, currentRoom.getType());
				preparedStatement.setFloat(3, currentRoom.getMoney());
				preparedStatement.setString(4, currentRoom.getDepartment());
				preparedStatement.setInt(5,currentRoom.getFloor());
				preparedStatement.setInt(6, currentRoom.getStatus());
				preparedStatement.setString(7, currentRoom.getNumber());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//ɾ������
		public boolean delete(Room currentRoom) throws SQLException{
			if(!roomTable.containsKey(currentRoom.getNumber()))
				return false;
			else {
				connect();
				
				preparedStatement = databaseConnection.prepareStatement(
						"delete from dbo.Room where RNo=?;"
						,PreparedStatement.NO_GENERATED_KEYS);
				preparedStatement.setString(1, currentRoom.getNumber());
				preparedStatement.executeUpdate();
				terminate();
				disconnect();
				flush();
				return true;
			}
		}
		
		//��ȡȫ������
		public Enumeration<Room> getAll() throws SQLException{
			return this.roomTable.elements();
		}
		
		//���ݷ���Ų�����Ϣ
		public Room search(String number) throws SQLException {
			Room result = null;
			Enumeration<Room> e = getAll();
			while (e.hasMoreElements()) {
				Room room = (Room) e.nextElement();
				if(room.getNumber().equals(number))
					result = room;
			}
			return result;
		}
}
