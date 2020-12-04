package dsc.Services;

import dsc.Object.Pact;
import dsc.Object.Student;
import java.util.*;

public interface PactApplications {
	
	//新增一个合同
	public boolean addNewPact(Pact currrentPact);
	
	//删除一个合同
	public boolean deletePact(Pact currentPact);
	
	//更新一个合同
	public boolean uploadPact(Pact currentPact);
	
	//学生查询对应的合同
	public Pact checkStuPact(Student currentStudent);
	
	//管理员查询所有合同
	public List<Pact> getAllPacts();
	
}
