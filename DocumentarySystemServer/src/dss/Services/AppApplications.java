package dss.Services;

import java.sql.SQLException;
import java.util.List;

import dss.Object.*;

public interface AppApplications {
	
	//学生提交申请表
	public boolean applyForDor(Application application) throws SQLException;
	
	//学生提交退宿申请(我感觉没用，请忽略)
	public boolean applyForExit(Application application);
	
	//学生提交更换宿舍或更改入住时间申请(我感觉没用，请忽略)
	public boolean applyForChange(Application application);
	
	//管理员查询一个申请表
	public Application searchApplication(String number);
	
	//管理员删除申请表
	public boolean deleteApplication(Application application);
	
	//管理员获取所有申请表
	public List<Application> getAllApplications();
	
}
