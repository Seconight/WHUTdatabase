package dss.Services;

import dss.Object.*;

public interface AppApplications {
	
	//学生提交入住申请
	public boolean applyForDor(Application application);
	
	//学生提交退宿申请
	public boolean applyForExit(Application application);
	
	//学生提交更换宿舍或更改入住时间申请
	public boolean applyForChange(Application application);
	
	//管理员查询一个申请表
	public Application searchApplication(String number);
	
	//管理员删除申请表
	public boolean deleteApplication(Application application);
	
}
