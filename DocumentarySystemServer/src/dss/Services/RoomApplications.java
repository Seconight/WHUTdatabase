package dss.Services;

import java.util.List;
import dss.Object.*;

public interface RoomApplications {
	
	//学生查询空余宿舍信息
	public List<Room> getSuitableRooms(Student currentStudent,Room targetRoom);
	
	//管理员更新宿舍信息
	public boolean uploadRoomInfo(Room currentRoom);
	
	//管理员删除宿舍信息
	public boolean deleteRoom(Room currentRoom);
	
	//管理员获取全部宿舍信息
	public List<Room> getAllRooms();
	
	//管理员新增宿舍
	public boolean addRoom(Room currentRoom);
	
	//查找特定宿舍
	public Room getRoom(String number);
	
}
