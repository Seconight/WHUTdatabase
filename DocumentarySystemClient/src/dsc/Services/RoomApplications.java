package dsc.Services;

import java.util.List;
import dsc.Object.*;
import dsc.Object.Room;

public interface RoomApplications {
	
	//ѧ����ѯ����������Ϣ
	public List<Room> getSuitableRooms();
	
	//����Ա����������Ϣ
	public boolean uploadRoomInfo(Room currentRoom);
	
	//����Աɾ��������Ϣ
	public boolean deleteRoom(Room currentRoom);
	
	//����Ա��ȡȫ��������Ϣ
	public List<Room> getAllRooms();
	
	//����Ա��������
	public boolean addRoom(Room currentRoom);
	
	//�����ض�����
	public Room getRoom(String number);
	
}
