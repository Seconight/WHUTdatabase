package dss.Object;

public class Application {
	
	private String ANo;			//������
	private int AType;			//��������
	private String AATime;		//�ύ��������
	private String ASTime;		//��ͬ��ʼʱ��
	private int ARTime;			//���ʱ��
	private float ASPay;		//Ӧ�����
	private float AAPay;		//ʵ�����
	private String ASNo;		//����ѧ��ѧ��
	private String AORNo;		//ԭ�����
	private String ANRNo;		//�·����
	private String ACNo;		//ס�޺�
	
	//���캯��
	public Application() {}
	
	public Application(String ANo,int AType,String AATime,String ASTime,int ARTime,
			float ASPay,float AAPay,String ASNo,String AORNo,String ANRNo,String ACNo)
	{
		this.ANo = ANo;
		this.AType = AType;
		this.AATime = AATime;
		this.ASTime = ASTime;
		this.ARTime = ARTime;
		this.ASPay = ASPay;
		this.AAPay = AAPay;
		this.ASNo = ASNo;
		this.AORNo = AORNo;
		this.ANRNo = ANRNo;
		this.ACNo = ACNo;
	}
	
	public float getAAPay() {
		return AAPay;
	}
	
	public String getAATime() {
		return AATime;
	}
	
	public String getACNo() {
		return ACNo;
	}
	
	public String getANo() {
		return ANo;
	}
	
	public String getANRNo() {
		return ANRNo;
	}
	
	public String getAORNo() {
		return AORNo;
	}
	
	public int getARTime() {
		return ARTime;
	}
	
	public String getASNo() {
		return ASNo;
	}
	
	public float getASPay() {
		return ASPay;
	}
	
	public String getASTime() {
		return ASTime;
	}
	
	public int getAType() {
		return AType;
	}
	
	public void setAAPay(float aAPay) {
		AAPay = aAPay;
	}
	
	public void setAATime(String aATime) {
		AATime = aATime;
	}
	
	public void setACNo(String aCNo) {
		ACNo = aCNo;
	}
	
	public void setANo(String aNo) {
		ANo = aNo;
	}
	
	public void setANRNo(String aNRNo) {
		ANRNo = aNRNo;
	}
	
	public void setAORNo(String aORNo) {
		AORNo = aORNo;
	}
	
	public void setARTime(int aRTime) {
		ARTime = aRTime;
	}
	
	public void setASNo(String aSNo) {
		ASNo = aSNo;
	}
	
	public void setASPay(float aSPay) {
		ASPay = aSPay;
	}
	
	public void setASTime(String aSTime) {
		ASTime = aSTime;
	}
	
	public void setAType(int aType) {
		AType = aType;
	}
	
	
	
}
