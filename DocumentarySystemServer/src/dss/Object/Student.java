package dss.Object;

//��ʾѧ��ʵ��
public class Student {
	
	private String name;			//ѧ������
	private String nubmer;			//ѧ��ѧ��
	private String department;		//ѧ��Ժϵ
	private boolean sex;			//ѧ���Ա�
	private int age;				//ѧ������
	private String password;		//ѧ������
	private String sroom;			//ѧ����ס����
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNubmer(String nubmer) {
		this.nubmer = nubmer;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public void setSroom(String sroom) {
		this.sroom = sroom;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNubmer() {
		return nubmer;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getSroom() {
		return sroom;
	}
	
	public boolean getSex() {
		return sex;
	}

}
