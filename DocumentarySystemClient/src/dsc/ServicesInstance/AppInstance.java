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

	//略，同上
	@Override
	public boolean applyForExit(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	//略，同上
	@Override
	public boolean applyForChange(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	//根据单号寻找申请表
	@Override
	public Application searchApplication(String number) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("SEARCHAPP");
		message.setObj(number);
		message = communicate(message);
		return (Application)message.getObject();
	}

	//删除申请表 
	@Override
	public boolean deleteApplication(Application application) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("DELETEAPP");
		message.setObj(application);
		message = communicate(message);
		return message.getJudge();
	}

	//获取所有申请表信息
	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.setFunction("GETALLAPP");
		message = communicate(message);
		return (List<Application>)message.getObject();
	}

}
