package dss.Object;

public class Pact {
	private String PNo;			//住宿号
	private String PSTime;		//合同开始时间
	private float PMoney;		//合同金额
	private int PTime;			//合同时长
	private String PRNo;		//房间号		
	private String PSNo;		//租借学生学号
	
	//构造函数
	public Pact() {}
	
	public Pact(String PNo,String PSTime,float PMoney,int PTime,String PRNo,String PSNo) {
		this.PNo = PNo;
		this.PSTime = PSTime;
		this.PMoney = PMoney;
		this.PTime = PTime;
		this.PRNo = PRNo;
		this.PSNo = PSNo;
	}
	
	public void setPMoney(float pMoney) {
		PMoney = pMoney;
	}
	
	public void setPNo(String pNo) {
		PNo = pNo;
	}
	
	public void setPRNo(String pRNo) {
		PRNo = pRNo;
	}
	
	public void setPSNo(String pSNo) {
		PSNo = pSNo;
	}
	
	public void setPSTime(String pSTime) {
		PSTime = pSTime;
	}
	
	public void setPTime(int pTime) {
		PTime = pTime;
	}
	
	public float getPMoney() {
		return PMoney;
	}
	
	public String getPNo() {
		return PNo;
	}
	
	public String getPRNo() {
		return PRNo;
	}
	
	public String getPSNo() {
		return PSNo;
	}
	
	public String getPSTime() {
		return PSTime;
	}
	
	public int getPTime() {
		return PTime;
	}
	
}
