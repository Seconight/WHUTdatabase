package dsc.ServicesInstance;

import java.util.List;

import dss.Object.Message;
import dss.Object.Pact;
import dss.Object.Student;
import dss.Services.*;

public class PactInstance extends BaseServe implements PactApplications{

	//新增合同，返回布尔
	@Override
	public boolean addNewPact(Pact currrentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("ADDPACT");
		message.setObj(currrentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//删除合同(实际上获得号就可以删除)
	@Override
	public boolean deletePact(Pact currentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEPACT");
		message.setObj(currentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//更新合同，返回布尔
	@Override
	public boolean uploadPact(Pact currentPact) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("UPDATEPACT");
		message.setObj(currentPact);
		message = communicate(message);
		return message.getJudge();
	}

	//根据学生查询对应的合同，返回list
	@Override
	public Pact checkStuPact(Student currentStudent) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("CHECKPACT");
		message.setObj(currentStudent);
		message = communicate(message);
		return (Pact)message.getObject();
	}

	//获取全部合同
	@Override
	public List<Pact> getAllPacts() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLPACT");
		message = communicate(message);
		return (List<Pact>)message.getObject();
	}

}
