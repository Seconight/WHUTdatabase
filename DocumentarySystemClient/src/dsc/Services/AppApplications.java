package dsc.Services;

import dsc.Object.Application;

public interface AppApplications {
	
	//ѧ���ύ��ס����
	public boolean applyForDor(Application application);
		
	//ѧ���ύ��������
	public boolean applyForExit(Application application);
		
	//ѧ���ύ��������������סʱ������
	public boolean applyForChange(Application application);
		
	//����Ա��ѯһ�������
	public Application searchApplication(String number);
		
	//����Աɾ�������
	public boolean deleteApplication(Application application);
}
