package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Message;
import dss.Object.Pact;
import dss.Object.Student;
import dss.Services.*;

public class PactInstance extends BaseServe implements PactApplications{

	//������ͬ�����ز���
	@Override
	public boolean addNewPact(Pact currrentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("ADDPACT");
		message.setObj(currrentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//ɾ����ͬ(ʵ���ϻ�úžͿ���ɾ��)
	@Override
	public boolean deletePact(Pact currentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEPACT");
		message.setObj(currentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//���º�ͬ�����ز���
	@Override
	public boolean uploadPact(Pact currentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("UPDATEPACT");
		message.setObj(currentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//����ѧ����ѯ��Ӧ�ĺ�ͬ������list
	@Override
	public Pact checkStuPact(Student currentStudent) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("CHECKPACT");
		message.setObj(currentStudent);
		message = communicate(message);
		return (Pact)message.getObject();
	}

	//��ȡȫ����ͬ
	@Override
	public List<Pact> getAllPacts() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLPACT");
		message = communicate(message);
		return (List<Pact>)message.getObject();
	}

}
