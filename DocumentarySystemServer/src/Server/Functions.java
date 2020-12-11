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



public abstract class Functions implements Serializable{

	private static final long serialVersionUID = -8511975064392998611L;
	static Hashtable<String, Functions> functions = new Hashtable<String, Functions>();
	protected ObjectInputStream input;
	protected ObjectOutputStream output;
	protected Message message;
	protected Socket a;
	
	
	
	//to add functions
	//��̬�������ڹ�������ʱ���У�ͬʱҲ������������
	static {
		
//		functions.put("LOGIN",new Login());
//		functions.put("ALLUSER",new GetAllUserFunc());
//		functions.put("ALLDOC",new GetAllDocFunc());
//		functions.put("UPUSER",new UpdateUserFunc());
//		functions.put("DEUSER",new DeleteUserFunc());
//		functions.put("INUSER",new InsertUserFunc());
//		functions.put("SEUSER",new SearchUserFunc());
//		functions.put("INDOC",new InsertDocFunc());
//		functions.put("CHPA",new ChangePasswordFunc());
//		functions.put("SEDOC",new SearchDocFunc());
	}
	
	
	//�麯����������
	public abstract void function();
	
	
	//��ȡ��ǰSocket����
	public void get(Socket a) {
		this.a = a;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		input.close();
		output.close();
	}
	
	
	
	//Ѱ�Ҷ�Ӧ�ķ���
	public static Functions searchFunctions(String f) {
		if(functions.containsKey(f)) return functions.get(f);
		else return null;
	}
	
	//���ö���������
	public void setInput(ObjectInputStream input) {
		this.input = input;
	}
	
	//�������������
	public void setOutput(ObjectOutputStream output) {
		this.output = output;
	}
	
	//����û�д������message
	public void setMes(Message a) {
		this.message = a;
	}
	
	//��д���û�message
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


	

