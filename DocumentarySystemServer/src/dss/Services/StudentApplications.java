package dss.Services;

import dss.Object.Student;
import java.util.*;

public interface StudentApplications {
	
	//ѧ����¼
	public Student studentLogin(String id, String password);
	
	//ѧ����������
	public Student changePassword(String id,String uPassword,String newPassword);
	
	//����ѧ����Ϣ
	public boolean updateStudent(Student currentStudent);
	
	//����Ա��ȡȫ��ѧ����Ϣ
	public List<Student> getStudentsInfo();
	
	//ѧ������ע��
	public Student studentRegister(Student currentStudent);
	
}
