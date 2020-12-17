package dss.Services;

import java.sql.SQLException;
import java.util.List;

import dss.Object.*;

public interface AppApplications {
	
	//ѧ���ύ�����
	public boolean applyForDor(Application application) throws SQLException;
	
	//ѧ���ύ��������(�Ҹо�û�ã������)
	public boolean applyForExit(Application application);
	
	//ѧ���ύ��������������סʱ������(�Ҹо�û�ã������)
	public boolean applyForChange(Application application);
	
	//����Ա��ѯһ�������
	public Application searchApplication(String number);
	
	//����Աɾ�������
	public boolean deleteApplication(Application application);
	
	//����Ա��ȡ���������
	public List<Application> getAllApplications();
	
}
