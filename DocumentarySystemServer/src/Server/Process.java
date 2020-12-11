package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import dss.Object.*;


public class Process implements Serializable{
	public void beginning() {
		
		try {
			//
			//�˿ں�12521
			//
			System.out.println("Start!!");
			ServerSocket serverSocket = new ServerSocket(12521);
			System.out.println("IP:"+InetAddress.getByName("localhost"));
			while(true) {
				Socket current = serverSocket.accept();
				System.out.println("accept");
				client c = new client(current);
				c.start();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	//�����������ݲ�ͬ��
	public void processing(Socket current) {
		ObjectInputStream input ;
		ObjectOutputStream output;
		try {
			
			input = new ObjectInputStream(current.getInputStream());
			output = new ObjectOutputStream(current.getOutputStream());
			//��ȡ��Ϣ
			Message get = (Message)input.readObject();
			//�������ö��� ׼��ʵ�ֹ���
			Functions func = Functions.searchFunctions(get.getFunction());
			func.get(current);
			func.setMes(get);
			func.setInput(input);
			func.setOutput(output);
			//to work
			func.function();
			input.close();
			output.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
		catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//�û�����,�̳��̣߳�ÿ��һ���û����ͻ��һ���߳�
	class client extends Thread{
		Socket current;
		public client(Socket currentSocket) {
			// TODO Auto-generated constructor stub
			this.current = currentSocket;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			processing(current);
		}
	}
}
