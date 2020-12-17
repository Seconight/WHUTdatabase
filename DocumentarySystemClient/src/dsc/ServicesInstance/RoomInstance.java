package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Message;
import dss.Object.Room;
import dss.Object.Student;
import dss.Services.*;


public class RoomInstance extends BaseServe implements RoomApplications{

	
	//����room
	@Override
	public boolean uploadRoomInfo(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("UPDATEROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//ɾ��room��ʵ�����Ǹ���Rno��ɾ����Ӧ��room
	@Override
	public boolean deleteRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//��ȡ����room��Ϣ
	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLROOMS");
		message = communicate(message);
		return (List<Room>)message.getObject();
	}

	//����room,return boolean
	@Override
	public boolean addRoom(Room currentRoom) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("ADDROOM");
		message.setObj(currentRoom);
		message = communicate(message);
		return message.getJudge();
	}

	//��������Ų�ѯ������Ϣ
	@Override
	public Room getRoom(String number) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETROOM");
		message.setObj(number);
		message = communicate(message);
		return (Room)message.getObject();
	}

	//��GUI��ȥ����
	@Override
	public List<Room> getSuitableRooms(Student currentStudent, Room targetRoom) {
		// TODO Auto-generated method stub
		return null;
	}

}
