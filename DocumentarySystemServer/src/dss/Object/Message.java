package dss.Object;

import java.io.Serializable;
import java.util.Hashtable;

//�ͻ������˽���������
public class Message implements Serializable{
	
	private final long serialVersionUID = -8511975064392998611L;
	
	//��ʾҪ����ķ���
	private String function;
	
	//���صĶ���
	private Object object;
	
	//��ʾִ�н��
	private boolean judge;
	
	//��Ŷ�Ӧ��Ϣ�����
	private Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
	
	//����Ҫ����ķ���
	public void setFunction(String func) {
		this.function = func;
	}
	
	//���ó��ض���
	public void setObj(Object object) {
		this.object = object;
	}
	
	//����ִ�н��
	public void setJudge(boolean ju) {
		this.judge = ju;
	}
	
	//��ó��ض���
	public Object getObject() {
		return object;
	}
	
	//��ȡҪ���еķ���
	public String getFunction() {
		return function;
	}
	
	//���judge
	public boolean getJudge() {
		return judge;
	}
	
	//�������ƻ�ö���
	public Object getValueObject(String a) {
		return hashtable.get(a);
	}
	
	//��������Ӷ���
	public void addKV(String key,Object value) {
		hashtable.put(key, value);
	}
	
}

