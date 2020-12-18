import java.awt.EventQueue;
import java.util.List;

import dsc.GUI.Login;
import dsc.ServicesInstance.*;
import dss.Object.*;
//测试类，用于测试客户端与服务端的连接
public class Test {
	
	public static void main(String[] args) {
		
	
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						Login frame = new Login();
//						frame.setVisible(true);
//						
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
		
		
		StudentInstance instance = new StudentInstance();
		
		
		
//		Student student = instance.studentLogin("2018000100001", "123");
//		System.out.println(student.getName()+" "+student.getDepartment()+"系");
//		List<Student> list = instance.getStudentsInfo();
//		for(Student i : list) {
//			System.out.println(i.getName() + i.getNubmer());
//		}
//		instance.changePassword("2018000100002", "321","wy");
		Student add = new Student("2018000200009",22,"卜乐婷","PP",0,"321",null);
		if(instance.updateStudent(add)) System.out.println("hh");
		Student add2 = new Student("2018000200010",22,"卜乐婷","PP",0,"123",null);
		if(!instance.updateStudent(add2)) System.out.println("jj");
//		instance.studentRegister(add);
		
//		PactInstance instance = new PactInstance();
//		Pact cuuPact2 = new Pact("2018000112","2020-12-02",500,5,"0018001","2018000200009");
//		Pact delete = new Pact(); delete.setPNo("2018000000");
//		instance.addNewPact(cuuPact2);
//		instance.deletePact(delete);
//		cuuPact2.setPMoney(520);
//		instance.uploadPact(cuuPact2);
//		List<Pact> pacts = instance.getAllPacts();
//		for(Pact i : pacts) {
//			System.out.println(i.getPNo());
//		}
		
//		RoomInstance roomInstance = new RoomInstance();
//		Room add1 = new Room("0018101","01",600,"EE",3,1);
//		Room toDelete = new Room("0000999","00",1000,"FU",3,1);
//		roomInstance.addRoom(add1);
//		roomInstance.addRoom(toDelete);
//		roomInstance.deleteRoom(toDelete);
//		add1.setMoney(520);
//		roomInstance.uploadRoomInfo(add1);
//		List<Room> rooms = roomInstance.getAllRooms();
//		for(Room i : rooms) {
//			System.out.println(i.getNumber()+" "+i.getMoney());
//		}
		
//		AppInstance appInstance = new AppInstance();
//		Application add1 = new Application(
//				"2018000002",
//				3,
//				"2020-12-17",
//				"2020-12-17",
//				6,
//				500,
//				500,
//				"2018000200009",
//				null,
//				null,
//				null
//			);
//		Application add2 = new Application(
//				"2018000098",
//				3,
//				"2020-12-17",
//				"2020-12-17",
//				6,
//				500,
//				500,
//				"2018000200009",
//				null,
//				null,
//				null
//			);
//		appInstance.applyForDor(add1);
//		appInstance.applyForDor(add2);
//		appInstance.deleteApplication(add2);
//		Application current = appInstance.searchApplication("2018000002");
//		System.out.println("this is "+current.getASNo());
//		List<Application> apps = appInstance.getAllApplications();
//		for(Application i : apps) {
//			System.out.println(i.getANo());
//		}
	}
}
