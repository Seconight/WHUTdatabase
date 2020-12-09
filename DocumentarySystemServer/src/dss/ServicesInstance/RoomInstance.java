package dss.ServicesInstance;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import dss.DAO.RoomDAO;
import dss.Object.Room;
import dss.Object.Student;
import dss.Services.*;


public class RoomInstance extends BaseServe implements RoomApplications{

	@Override
	public List<Room> getSuitableRooms(Student currentStudent,Room targetRoom) {
		//���������ֱ��ʾ��ǰѡ����Ϣ��ѧ���Լ�����ѡ��ķ���
		ArrayList<Room> rooms = new ArrayList<Room>();
		try {
			RoomDAO roomDAO = new RoomDAO();
			Enumeration<Room> e = roomDAO.getAll();
			while (e.hasMoreElements()) {
				Room room = (Room) e.nextElement();		
				//TODO:����ѧ������ѡ����ʵķ���
				rooms.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return rooms;
	}

	@Override
	public boolean uploadRoomInfo(Room currentRoom) {
		// TODO Auto-generated method stub
		try {
			RoomDAO roomDAO = new RoomDAO();
			if(roomDAO.update(currentRoom))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		
		try {
			RoomDAO roomDAO = new RoomDAO();
			if(roomDAO.delete(currentRoom))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		List<Room> rooms = new ArrayList<Room>();
		try {
			RoomDAO roomDAO = new RoomDAO();
			Enumeration<Room> e = roomDAO.getAll();
			while (e.hasMoreElements()) {
				Room room = (Room) e.nextElement();
				rooms.add(room);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rooms;
	}

	@Override
	public boolean addRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		
		try {
			RoomDAO roomDAO = new RoomDAO();
			if(roomDAO.insert(currentRoom))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Room getRoom(String number) {
		// TODO Auto-generated method stub
		Room result = null;
		try {
			RoomDAO roomDAO = new RoomDAO();
			result = roomDAO.search(number);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
