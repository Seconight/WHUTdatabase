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
	
	//与服务器端通信 change the information
	public Message communicate(Message m) {
		try {
			clientSocket = new Socket(InetAddress.getByName("localhost"),12521);
			objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
			//写出信息
			objectOutputStream.writeObject(m);
			//清空缓冲区 实现输出流
			objectOutputStream.flush();
			objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
			//获取到信息
			m = (Message)objectInputStream.readObject();
			//关闭组件
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
