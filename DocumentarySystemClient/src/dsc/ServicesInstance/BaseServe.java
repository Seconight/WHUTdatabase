package dsc.ServicesInstance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

import dsc.Object.Message;

public class BaseServe {
	
	protected Socket clientSocket;
	protected ObjectOutputStream objectOutputStream;
	protected ObjectInputStream objectInputStream;
	
	//���������ͨ�� change the information
	public Message communicate(Message m) {
		try {
			clientSocket = new Socket(InetAddress.getByName("localhost"),12521);
			objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
			//д����Ϣ
			objectOutputStream.writeObject(m);
			//��ջ����� ʵ�������
			objectOutputStream.flush();
			objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
			//��ȡ����Ϣ
			m = (Message)objectInputStream.readObject();
			//�ر����
			clientSocket.close();
			objectInputStream.close();
			objectOutputStream.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
}
