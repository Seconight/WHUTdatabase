package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Message;
import dss.Object.Student;
import dss.Services.*;

public class StudentInstance extends BaseServe implements StudentApplications{

	//�ɹ����ص�ǰѧ������ʧ�ܷ���null
	@Override
	public Student studentLogin(String id, String password) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("LOGINSTU");
		message.addKV("name", id);
		message.addKV("password", password);
		message = communicate(message);
		return (Student)message.getObject();
	}

	//�ɹ����ص�ǰѧ������ʧ�ܷ���null
	@Override
	public Student changePassword(String id, String uPassword, String newPassword) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("CHANGEPASSWORD");
		message.addKV("id", id);
		message.addKV("up", uPassword);
		message.addKV("np", newPassword);
		message = communicate(message);
		return (Student)message.getObject();
	}

	//�ɹ����ص�ǰlist����ʧ�ܷ���null
	@Override
	public List<Student> getStudentsInfo() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLSTU");
		message = communicate(message);
		return (List<Student>)message.getObject();
	}

	//�ɹ����ص�ǰѧ������ʧ�ܷ���null
	@Override
	public Student studentRegister(Student currentStudent) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("REGISTER");
		message.setObj(currentStudent);
		message = communicate(message);
		return (Student)message.getObject();
	}

	@Override
	public boolean updateStudent(Student currentStudent) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("UPDATESTU");
		message.setObj(currentStudent);
		message = communicate(message);
		return message.getJudge();
	}

}
