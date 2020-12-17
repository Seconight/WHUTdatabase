package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Application;
import dss.Object.Message;
import dss.Services.*;

public class AppInstance extends BaseServe implements AppApplications{

	@Override
	public boolean applyForDor(Application application) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("APPLY");
		message.setObj(application);
		message = communicate(message);
		return message.getJudge();
	}

	//�ԣ�ͬ��
	@Override
	public boolean applyForExit(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	//�ԣ�ͬ��
	@Override
	public boolean applyForChange(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	//���ݵ���Ѱ�������
	@Override
	public Application searchApplication(String number) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("SEARCHAPP");
		message.setObj(number);
		message = communicate(message);
		return (Application)message.getObject();
	}

	//ɾ������� 
	@Override
	public boolean deleteApplication(Application application) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEAPP");
		message.setObj(application);
		message = communicate(message);
		return message.getJudge();
	}

	//��ȡ�����������Ϣ
	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLAPP");
		message = communicate(message);
		return (List<Application>)message.getObject();
	}

}
