package dss.Services;

import java.util.List;
import dss.Object.*;

public interface RoomApplications {
	
	//ѧ����ѯ����������Ϣ
	public List<Room> getSuitableRooms(Student currentStudent,Room targetRoom);
	
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
