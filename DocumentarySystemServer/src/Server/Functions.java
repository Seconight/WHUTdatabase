package Server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import dss.Object.*;
import dss.ServicesInstance.*;



public abstract class Functions implements Serializable{

	private static final long serialVersionUID = -8511975064392998611L;
	static Hashtable<String, Functions> functions = new Hashtable<String, Functions>();
	protected ObjectInputStream input;
	protected ObjectOutputStream output;
	protected Message message;
	protected Socket a;
	
	//服务实例，用于处理用户发来的信息
	AppInstance appInstance = new AppInstance();
	PactInstance pactInstance = new PactInstance();
	RoomInstance roomInstance = new RoomInstance();
	StudentInstance studentInstance = new StudentInstance();
	
	//to add functions
	//静态函数，在构建对象时运行，同时也方便新增功能
	static {
		
		functions.put("LOGINSTU",new LoginStu());
		functions.put("CHANGEPASSWORD", new ChangePassword());
		functions.put("GETALLSTU",new GetStudentInfo());
		functions.put("REGISTER",new Register());
		functions.put("ADDPACT",new AddPact());
		functions.put("DELETEPACT",new DeletePact());
		functions.put("UPDATEPACT",new UpdatePact());
		functions.put("CHECKPACT", new CheckPactStu());
		functions.put("GETALLPACT",new GetAllPact());
		functions.put("UPDATEROOM",new UpdateRoom());
		functions.put("DELETEROOM",new DeleteRoom());
		functions.put("ADDROOM",new AddRoom());
		functions.put("GETROOM",new GetRoom());
		functions.put("GETALLROOMS", new GetAllRooms());
		functions.put("APPLY",new Apply());
		functions.put("SEARCHAPP", new SearchApp());
		functions.put("DELETEAPP", new DeleteApp());
		functions.put("GETALLAPP", new GetAllApp());
		
	}
	
	
	//虚函数，服务功能
	public abstract void function();
	
	
	//获取当前Socket对象
	public void get(Socket a) {
		this.a = a;
	}
	
	//析构函数
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		input.close();
		output.close();
	}
	
	//寻找对应的服务
	public static Functions searchFunctions(String f) {
		if(functions.containsKey(f)) return functions.get(f);
		else return null;
	}
	
	//设置对象输入流
	public void setInput(ObjectInputStream input) {
		this.input = input;
	}
	
	//设置输出流对象
	public void setOutput(ObjectOutputStream output) {
		this.output = output;
	}
	
	//获得用户写过来的message
	public void setMes(Message a) {
		this.message = a;
	}
	
	//回写给用户message
	public void feedback() {
		try {
			output.writeObject(message);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//学生登录服务
class LoginStu extends Functions{
	@Override
	public void function() {
		// TODO Auto-generated method stub
		String name = (String)message.getValueObject("name");
		String password = (String)message.getValueObject("password");
		System.out.println(name + " LOGIN");
		Student current = studentInstance.studentLogin(name, password);
		message.setObj(current);
		feedback();
	}
}

//修改密码服务
class ChangePassword extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		String id = (String)message.getValueObject("id");
		String uPassword = (String)message.getValueObject("up");
		String newPassword = (String)message.getValueObject("np");
		System.out.println(id + " CHANGEPASSWORD");
		Student current = studentInstance.changePassword(id, uPassword, newPassword);
		message.setObj(current);
		feedback();
		
	}
}

//获取学生信息服务
class GetStudentInfo extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		List<Student> s = studentInstance.getStudentsInfo();
		System.out.println("GETALLSTUDENT");
		message.setObj(s);
		feedback();
	}
}

//学生注册服务
class Register extends Functions{
	@Override
	public void function() {
		// TODO Auto-generated method stub
		Student addNew = (Student)message.getObject();
		System.out.println("REGISTER");
		message.setObj(studentInstance.studentRegister(addNew));
		feedback();
	}
}

//新增合同服务
class AddPact extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		try {
			message.setJudge(pactInstance.addNewPact((Pact)message.getObject()));
			System.out.println("ADD_NEW_PACT");
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//删除合同服务
class DeletePact extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		try {
			message.setJudge(pactInstance.deletePact((Pact)message.getObject()));
			System.out.println("DELETE_PACT");
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//更新合同服务
class UpdatePact extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		try {
			message.setJudge(pactInstance.uploadPact((Pact)message.getObject()));
			System.out.println("UPDATE_PACT");
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//根据学生查询合同
class CheckPactStu extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		Student current = (Student)message.getObject();
		try {
			Pact result = pactInstance.checkStuPact(current);
			message.setObj(result);
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//获得所有合同
class GetAllPact extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("GETALLPACT");
		try {
			List<Pact> result = pactInstance.getAllPacts();
			message.setObj(result);
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//更新宿舍服务
class UpdateRoom extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		message.setJudge(roomInstance.uploadRoomInfo(((Room)message.getObject())));
		System.out.println("UPDATE_ROOM");
		feedback();
	}
	
}

//删除宿舍服务
class DeleteRoom extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		message.setJudge(roomInstance.deleteRoom((Room)message.getObject()));
		System.out.println("DELETE_ROOM");
		feedback();
	}
	
}

//新增宿舍服务
class AddRoom extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		message.setJudge(roomInstance.addRoom((Room)message.getObject()));
		System.out.println("ADD_ROOM");
		feedback();
	}
}

//根据宿舍号获取宿舍
class GetRoom extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		Room result = roomInstance.getRoom((String)message.getObject());
		message.setObj(result);
		System.out.println("GET_ROOM");
		feedback();
	}
	
}

//获取所有宿舍信息
class GetAllRooms extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		List<Room> result = roomInstance.getAllRooms();
		message.setObj(result);
		System.out.println("GET_ALL_ROOMS");
		feedback();
	}
	
}

//申请(入住、退宿、更改)
class Apply extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		Application current = (Application)message.getObject();
		try {
			System.out.println("APPLY");
			message.setJudge(appInstance.applyForDor(current));
			feedback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

//根据单号查找对应的申请表
class SearchApp extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		Application result = appInstance.searchApplication((String)message.getObject());
		System.out.println("SEARCH_APP");
		message.setObj(result);
		feedback();
	}
	
}

//删除申请表
class DeleteApp extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		message.setJudge(appInstance.deleteApplication((Application)message.getObject()));
		System.out.println("DELETE_APP");
		feedback();
	}
	
}

//获取所有申请表
class GetAllApp extends Functions{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		message.setObj(appInstance.getAllApplications());
		System.out.println("GET_ALL_APP");
		feedback();
	}
	
}


//class Login extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		
//		String name = (String)message.getValueObject("name");
//		String password = (String)message.getValueObject("password");
//		System.out.println(name+" LOGIN ");
//		try {
//			User user = userServer.login(name, password);
//			message.setObj(user);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class GetAllUserFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		try {
//			Enumeration<User> u = userServer.getAllUser();
//			List<User> a = new ArrayList<User>();
//			while (u.hasMoreElements()) {
//				User user = (User) u.nextElement();
//				a.add(user);
//			}
//			message.setObj(a);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class GetAllDocFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODOs Auto-generated method stub
//		try {
//			Enumeration<Doc> d = docServer.getAllDoc();
//			List<Doc> a = new ArrayList<Doc>();
//			while (d.hasMoreElements()) {
//				Doc doc = (Doc) d.nextElement();
//				a.add(doc);
//			}
//			message.setObj(a);
//			feedback();
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class UpdateUserFunc extends Functions{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 5476848455391570744L;
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		User cur = (User)message.getObject();
//		System.out.println(cur+" UPDATE");
//		try {
//			if(userServer.updateUser(cur)) message.setJudge(true);
//			else message.setJudge(false);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class DeleteUserFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		String name = (String)message.getValueObject("name");
//		System.out.println(name+" DELETE");
//		try {
//			if(userServer.deleteUser(name)) message.setJudge(true);
//			else message.setJudge(false);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class InsertUserFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		User user = (User)message.getObject();
//		System.out.println(user+" INSERT");
//		try {
//			if(userServer.createUser(user)) message.setJudge(true);
//			else message.setJudge(false);
//			feedback();
//		} catch (SQLException e) {
//			// TODO: handle exception
//		}
//	}
//	
//}
//
//class SearchUserFunc extends Functions{
//	@Override
//	public void function() {
//		try {
//			message.setObj(userServer.getUser((String)message.getValueObject("name")));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
//
//class InsertDocFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		Doc doc = (Doc)message.getObject();
//		System.out.println(doc+" INSERT");
//		try {
//			if(docServer.addDoc(doc)) message.setJudge(true);
//			else message.setJudge(false);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//class SearchDocFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		String ID = (String)message.getObject();
//		try {
//			message.setObj(docServer.getDoc(ID));
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//
//
//
//class ChangePasswordFunc extends Functions{
//
//	@Override
//	public void function() {
//		// TODO Auto-generated method stub
//		try {
//			System.out.println((User)message.getObject()+" CHANGEPASSWORD");
//			boolean judge = 
//			userServer.changePassword((User)message.getObject(),
//					(String)message.getValueObject("password"));
//			if(judge) message.setJudge(true);
//			else message.setJudge(false);
//			feedback();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//


	

