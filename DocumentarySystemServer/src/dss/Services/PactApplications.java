package dss.Services;

import dss.Object.Pact;
import dss.Object.Student;

import java.sql.SQLException;
import java.util.*;

public interface PactApplications {
	
	//新增一个合同
	public boolean addNewPact(Pact currentPact) throws SQLException;
	
	//删除一个合同
	public boolean deletePact(Pact currentPact) throws SQLException;
	
	//更新一个合同
	public boolean uploadPact(Pact currentPact) throws SQLException;
	
	//学生查询对应的合同
	public Pact checkStuPact(Student currentStudent) throws SQLException;
	
	//管理员查询所有合同
	public List<Pact> getAllPacts() throws SQLException;
	
}
