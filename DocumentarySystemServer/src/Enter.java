
import dss.Object.*;
import dss.ServicesInstance.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import dss.DAO.*;
import Server.*;
import Server.Process;

public class Enter {
	public static void main(String[] args) throws SQLException {
				
		AppInstance appInstance = new AppInstance();
		PactInstance pactInstance = new PactInstance();
		RoomInstance roomInstance = new RoomInstance();
		StudentInstance studentInstance = new StudentInstance();
		
		//开启服务器
		Process process = new Process();
		process.beginning();
		
		
		//测试
//		application测试
//		if(appInstance.searchApplication("2018000002") == null) System.out.println("err");
//		System.out.println("check:"+appInstance.searchApplication("2018000002").getAATime());
//		
//		Application a = new Application();
//		a.setANo("2018000002");
//		if(appInstance.deleteApplication(a))
//			System.out.println("delete app success");
//		
//		Pact cuuPact = new Pact("2018000001","2020-12-01",300,5,"0018002","2018000100001");
//		if(pactInstance.addNewPact(cuuPact))
//			System.out.println("add success");
		
//		Pact cuuPact1 = new Pact("2018000002","2020-12-02",600,5,"0018001","2018000100002");
//		if(pactInstance.addNewPact(cuuPact1))
//			System.out.println("add success");
//		
//		Pact cuuPact2 = new Pact("2018000112","2020-12-02",500,5,"0018001","2018000100002");
//		if(pactInstance.addNewPact(cuuPact2))
//			System.out.println("add success");
//		
//		List<Pact> pacts = pactInstance.getAllPacts();
//		for (int i = 0; i < pacts.size(); i++) {
//			System.out.println("this is "+pacts.get(i).getPSNo());
//		}
		
//		if(pactInstance.deletePact(cuuPact2))
//			System.out.println("delect success");
//		
//		if(pactInstance.uploadPact(cuuPact1))
//			System.out.println("update it");
		
//		Student stu = new Student();
//		stu.setName("田家兴");
//		stu.setNubmer("2018000100001");
//		
//		Pact a = pactInstance.checkStuPact(stu);
//		
//		System.out.println("this is "+a.getPMoney());
		
	}
}
