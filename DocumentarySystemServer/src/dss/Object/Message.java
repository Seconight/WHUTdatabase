package dss.Object;

import java.io.Serializable;
import java.util.Hashtable;

//客户与服务端交流的载体
public class Message implements Serializable{
	
	private final long serialVersionUID = -8511975064392998611L;
	
	//表示要申请的服务
	private String function;
	
	//承载的对象
	private Object object;
	
	//表示执行结果
	private boolean judge;
	
	//存放对应信息与对象
	private Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
	
	//设置要申请的服务
	public void setFunction(String func) {
		this.function = func;
	}
	
	//设置承载对象
	public void setObj(Object object) {
		this.object = object;
	}
	
	//设置执行结果
	public void setJudge(boolean ju) {
		this.judge = ju;
	}
	
	//获得承载对象
	public Object getObject() {
		return object;
	}
	
	//获取要进行的服务
	public String getFunction() {
		return function;
	}
	
	//获得judge
	public boolean getJudge() {
		return judge;
	}
	
	//根据名称获得对象
	public Object getValueObject(String a) {
		return hashtable.get(a);
	}
	
	//向表中增加对象
	public void addKV(String key,Object value) {
		hashtable.put(key, value);
	}
	
}

