
import dss.Object.*;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.DAO.*;

public class Enter {
	public static void main(String[] args) throws SQLException {
				
		//Enumeration<Student> e = dao.studentTable.elements();
		
		
	
//		while(e.hasMoreElements()) {
//			Student current = e.nextElement();
//			if(current.getName().equals(name)) {
//				boolean judge = dao.delete(yetToDeleteStudent);
//				if(judge) System.out.println("ddd");
//			}
//			System.out.println("this is "+current.getName());
//			System.out.println(current.getDepartment());
//			//Student addNew = new Student("201800010002",20,"Õı”Ó","CS",1,"321",null);
//			//boolean oo = dao.insert(addNew);
//			//if(oo) System.out.println("insert success");
//		}
		
		
		
		RoomDAO roomDAO = new RoomDAO();
		Enumeration<Room> er = roomDAO.roomTable.elements();
		while (er.hasMoreElements()) {
			Room room = (Room) er.nextElement();
			System.out.println("jj + "+room.getDepartment());
			System.out.println(room.getStatus());
		}
	
		Room cuRoom = new Room("0018001","11",500,"CS",1,1);
		boolean judge = roomDAO.update(cuRoom);
		if(judge) System.out.println("update success");
//		ApplicaitonDAO appDAO = new ApplicaitonDAO();
//		Application addNewApplication = new Application(
//				"2018000002",
//				1,
//				"2020-12-2",
//				"2020-12-2",
//				5,
//				400,
//				400,
//				"2018000100001",
//				null,
//				null,
//				null);
//		boolean judge = appDAO.insert(addNewApplication);
//		if(judge) System.out.println("insert success");
		
		
		
	}
}
