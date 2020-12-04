package dsc.Services;

import dsc.Object.Pact;
import dsc.Object.Student;
import java.util.*;

public interface PactApplications {
	
	//����һ����ͬ
	public boolean addNewPact(Pact currrentPact);
	
	//ɾ��һ����ͬ
	public boolean deletePact(Pact currentPact);
	
	//����һ����ͬ
	public boolean uploadPact(Pact currentPact);
	
	//ѧ����ѯ��Ӧ�ĺ�ͬ
	public Pact checkStuPact(Student currentStudent);
	
	//����Ա��ѯ���к�ͬ
	public List<Pact> getAllPacts();
	
}
