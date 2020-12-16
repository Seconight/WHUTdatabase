package dss.Object;

import java.io.Serializable;

public class Room implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8729958241992957177L;
	private String number;			//房间号
	private String type;			//房间类型
	private float money;			//房月租金
	private String department;		//房间所属院系
	private int floor;				//房间楼栋
	private int status;			//房间状态
	
	//构造函数
	public Room() {}
	
	public Room(String number, String type, float money, String department,int floor,int status) {
		this.number = number;
		this.type = type;
		this.money = money;
		this.department = department;
		this.floor = floor;
		this.status = status;
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public float getMoney() {
		return money;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void setMoney(float money) {
		this.money = money;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
