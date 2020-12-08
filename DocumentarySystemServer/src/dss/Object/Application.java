package dss.Object;

public class Application {
	
	private String ANo;			//申请表号
	private int AType;			//申请类型
	private String AATime;		//提交申请日期
	private String ASTime;		//合同开始时间
	private int ARTime;			//租借时长
	private float ASPay;		//应付金额
	private float AAPay;		//实付金额
	private String ASNo;		//申请学生学号
	private String AORNo;		//原房间号
	private String ANRNo;		//新房间号
	private String ACNo;		//住宿号
	
	//构造函数
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
