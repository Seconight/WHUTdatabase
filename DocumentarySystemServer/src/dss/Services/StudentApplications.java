package dss.Services;

import dss.Object.Student;
import java.util.*;

public interface StudentApplications {
	
	//学生登录
	public Student studentLogin(String id, String password);
	
	//学生更改密码
	public Student changePassword(String id,String uPassword,String newPassword);
	
	//更改学生信息
	public boolean updateStudent(Student currentStudent);
	
	//管理员获取全部学生信息
	public List<Student> getStudentsInfo();
	
	//学生进行注册
	public Student studentRegister(Student currentStudent);
	
}
