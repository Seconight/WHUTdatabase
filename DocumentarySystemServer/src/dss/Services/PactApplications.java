package dss.Services;

import dss.Object.Pact;
import dss.Object.Student;

import java.sql.SQLException;
import java.util.*;

public interface PactApplications {
	
	//����һ����ͬ
	public boolean addNewPact(Pact currentPact) throws SQLException;
	
	//ɾ��һ����ͬ
	public boolean deletePact(Pact currentPact) throws SQLException;
	
	//����һ����ͬ
	public boolean uploadPact(Pact currentPact) throws SQLException;
	
	//ѧ����ѯ��Ӧ�ĺ�ͬ
	public Pact checkStuPact(Student currentStudent) throws SQLException;
	
	//����Ա��ѯ���к�ͬ
	public List<Pact> getAllPacts() throws SQLException;
	
}
