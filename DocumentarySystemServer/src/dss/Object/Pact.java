package dss.Object;

public class Pact {
	private String PNo;			//ס�޺�
	private String PSTime;		//��ͬ��ʼʱ��
	private float PMoney;		//��ͬ���
	private int PTime;			//��ͬʱ��
	private String PRNo;		//�����		
	private String PSNo;		//���ѧ��ѧ��
	
	//���캯��
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
