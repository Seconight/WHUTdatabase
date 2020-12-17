package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Message;
import dss.Object.Room;
import dss.Object.Student;
import dss.Services.*;


public class RoomInstance extends BaseServe implements RoomApplications{

	
	//更新room
	@Override
	public boolean uploadRoomInfo(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("UPDATEROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//删除room，实际上是根据Rno来删除对应的room
	@Override
	public boolean deleteRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//获取所有room信息
	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLROOMS");
		message = communicate(message);
		return (List<Room>)message.getObject();
	}

	//新增room,return boolean
	@Override
	public boolean addRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("ADDROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//根据宿舍号查询宿舍信息
	@Override
	public Room getRoom(String number) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETROOM");
		message.setObj(number);
		message = communicate(message);
		return (Room)message.getObject();
	}

	//在GUI层去定义
	@Override
	public List<Room> getSuitableRooms(Student currentStudent, Room targetRoom) {
		// TODO Auto-generated method stub
		return null;
	}

}
