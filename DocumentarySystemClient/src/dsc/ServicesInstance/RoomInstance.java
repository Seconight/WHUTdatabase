package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Room;
import dss.Object.Student;
import dss.Services.*;


public class RoomInstance extends BaseServe implements RoomApplications{

	

	@Override
	public boolean uploadRoomInfo(Room currentRoom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room getRoom(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> getSuitableRooms(Student currentStudent, Room targetRoom) {
		// TODO Auto-generated method stub
		return null;
	}

}
