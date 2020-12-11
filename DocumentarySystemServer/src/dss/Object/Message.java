package dss.Object;

import java.io.Serializable;
import java.util.Hashtable;

//客户与服务端交流的载体
public class Message implements Serializable{
	
	private final long serialVersionUID = -8511975064392998611L;
	
	private String function;
	
	private Object object;
	
	private boolean judge;
	
	private Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
	
	public void setFunction(String func) {
		this.function = func;
	}
	
	public void setObj(Object object) {
		this.object = object;
	}
	
	public void setJudge(boolean ju) {
		this.judge = ju;
	}
	
	public Object getObject() {
		return object;
	}
	
	public String getFunction() {
		return function;
	}
	
	public boolean getJudge() {
		return judge;
	}
	
	public Object getValueObject(String a) {
		return hashtable.get(a);
	}
	
	public void addKV(String key,Object value) {
		hashtable.put(key, value);
	}
	
}

