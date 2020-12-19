package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dss.Object.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dsc.ServicesInstance.AppInstance;
import dsc.ServicesInstance.PactInstance;
import dsc.ServicesInstance.RoomInstance;
import dsc.ServicesInstance.StudentInstance;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ApplicationGUI extends JFrame  {
	private static final long serialVersionUID = 1L;
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel contentPane = new JPanel();
	boolean isDragged = false;
	Point loc = null;
	Point tmp = null;
	Icon icon1 = new ImageIcon("src/dsc/GUI/image/关闭1.png");// 关闭图标
	Icon icon3 = new ImageIcon("src/dsc/GUI/image/最小化1.png");// 最小化图标
	JButton button_shutdown = new JButton("", icon1);
	JButton button_minimize = new JButton("", icon3);
	private final JLabel label = new JLabel("\u8868\u53F7");
	private final JLabel label_1 = new JLabel("\u7533\u8BF7\u7C7B\u578B");
	private final JLabel label_2 = new JLabel("\u63D0\u4EA4\u65F6\u95F4");
	private final JLabel label_3 = new JLabel("\u79DF\u501F\u5F00\u59CB\u65F6\u95F4");
	private final JLabel label_4 = new JLabel("\u79DF\u501F\u65F6\u957F");
	private final JLabel label_5 = new JLabel("\u5E94\u4ED8\u91D1\u989D");
	private final JLabel label_6 = new JLabel("\u5B9E\u4ED8\u91D1\u989D");
	private final JLabel label_7 = new JLabel("\u7533\u8BF7\u4EBA\u5B66\u53F7");
	private final JLabel label_8 = new JLabel("\u539F\u623F\u95F4\u53F7");
	private final JLabel label_9 = new JLabel("\u65B0\u623F\u95F4\u53F7");
	private final JLabel label_10 = new JLabel("\u4F4F\u5BBF\u53F7");
	private final JLabel label_11 = new JLabel("");
	private final JLabel label_12 = new JLabel("");
	private final JLabel label_13 = new JLabel("");
	private final JLabel label_14 = new JLabel("");
	private final JLabel label_15 = new JLabel("");
	private final JLabel label_16 = new JLabel("");
	private final JLabel label_17 = new JLabel("");
	private final JLabel label_18 = new JLabel("");
	private final JLabel label_19 = new JLabel("");
	private final JLabel label_20 = new JLabel("");
	private final JLabel label_21 = new JLabel("");
	private final JLabel label_22 = new JLabel("\u57FA\u672C\u4FE1\u606F\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
	private final JLabel label_23 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u57FA\u672C\u4FE1\u606F");
	private final JLabel label_24 = new JLabel("\u91D1\u989D\u4FE1\u606F\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
	private final JLabel label_25 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u91D1\u989D\u4FE1\u606F");
	private final JPanel panel = new JPanel();
	AppInstance appInstance = new AppInstance();
	PactInstance pactInstance = new PactInstance();
	RoomInstance roomInstance = new RoomInstance();
	StudentInstance studentInstance = new StudentInstance();
	JButton button = new JButton("\u70B9\u51FB\u652F\u4ED8");
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ApplicationGUI(dss.Object.Student std,String APPnum,int APPtype,String applyTime,String Stime,int Month,String stdNum,String hetong,String oldR,int oldType,String newR,int newType,int SP,int AP) {
		setDragable();
		setUndecorated(true);
		setBounds((screensize.width - 618) / 2, (screensize.height - 1000) / 2, 618, 1000);
			if(APPtype>0)
		  {
			button.setText("\u70B9\u51FB\u652F\u4ED8");
		  }
			if(SP==0)
			{
				button.setText("点击付款");
				button.setEnabled(false);
			}
			if(SP<0)
			{
				button.setText("点击收款");
			}
	
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panel.setBackground(Color.CYAN);
		//contentPane.setBackground(COLOR);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		button_shutdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);// 关闭
			}
		});
		button_shutdown.setBounds(588, 0, 30, 30);
		panel.add(button_shutdown);

		button_minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED); // 最小化
			}
		});
		button_minimize.setBounds(558, 0, 30, 30);
		panel.add(button_minimize);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(0, 0, 80, 40);
		panel.add(label);
		
		label_1.setBounds(0, 38, 160, 40);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_1);
		label_2.setBounds(94, 106, 160, 40);
		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_2);
		label_3.setBounds(14, 147, 240, 40);
		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_3);
		label_4.setBounds(94, 184, 160, 40);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_4);
		label_5.setBounds(40, 701, 160, 40);
		label_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_5);
		label_6.setBounds(40, 772, 160, 40);
		label_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_6);
		label_7.setBounds(54, 222, 200, 40);
		label_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_7);
		label_8.setBounds(14, 320, 160, 40);
		label_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_8);
		label_9.setBounds(14, 459, 160, 40);
		label_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_9);
		label_10.setBounds(134, 258, 120, 40);
		label_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_10);
		label_11.setText(APPnum);
		label_11.setBounds(84, 0, 285, 40);
		label_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_11);
		label_12.setText(Integer.toString(APPtype));
		label_12.setBounds(174, 38, 22, 40);
		label_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_12);
		label_13.setText(applyTime);
		label_13.setBounds(268, 106, 290, 40);
		label_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_13);
		label_14.setText(Stime);
		label_14.setBounds(268, 147, 290, 40);
		label_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_14);
		label_15.setText(Integer.toString(Month)+"个月");
		label_15.setBounds(268, 184, 160, 40);
		label_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_15);
		label_16.setText(Integer.toString(SP)+"元");
		label_16.setBounds(214, 701, 164, 40);
		label_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_16);
		label_17.setText("0元");
		label_17.setBounds(214, 772, 164, 40);
		label_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_17);
		label_18.setText(stdNum);
		label_18.setBounds(268, 222, 294, 40);
		label_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_18);
		label_19.setText(oldR);
		label_19.setBounds(174, 320, 240, 40);
		label_19.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_19);
		label_20.setText(newR);
		label_20.setBounds(174, 459, 240, 40);
		label_20.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_20);
		label_21.setText(hetong);
		label_21.setBounds(268, 258, 245, 40);
		label_21.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_21);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label_17.setText(Integer.toString(SP)+"元");
				if(SP<0)
				{
					JOptionPane.showMessageDialog(null, "返还金额："+(-SP)+"元", "", JOptionPane.OK_OPTION);
				}
				else if(SP>0){
					JOptionPane.showMessageDialog(null, "支付金额："+SP+"元", "", JOptionPane.OK_OPTION);
				}
			}
		});
		button.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		//button.setContentAreaFilled(false);
		button.setBounds(392, 738, 202, 40);
		panel.add(button);
		
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!label_17.getText().equals(label_16.getText())) {
					JOptionPane.showMessageDialog(null, "请点击按钮进行金额处理!", "未处理金额信息", JOptionPane.ERROR_MESSAGE);
				}
			else {
				if(APPtype==1)
				{
					java.util.List<Pact> ALLpact=pactInstance.getAllPacts();
					int num1 = ALLpact.size();
					num1++;
					int num=num1;
					String APPnum1= "";
					int count=0; //计数
					while(num>=1) {
					num/=10;
					count++;
					}
					for(int i=0;i<10-count;i++)
					{
						APPnum1+="0";
					}
					APPnum1+=num1;
					Application application=new Application(APPnum,APPtype,applyTime,Stime,Month,
							SP,SP,stdNum,null,newR,null);
					appInstance.applyForDor(application);
					Pact currrentPact=new Pact(APPnum, Stime, SP, Month, newR, stdNum);
					pactInstance.addNewPact(currrentPact);
					//std.(newR);
					java.util.List<Student> ALLstu=studentInstance.getStudentsInfo();
					for(int i=0;i<ALLstu.size();i++)
					{
						if(ALLstu.get(i).getNubmer().equals(std.getNubmer()))
						{
							Student stu1=ALLstu.get(i);
							
							stu1.setSroom(newR);
							std.setSroom(newR);
							studentInstance.updateStudent(stu1);
							break;
						}
					}
					java.util.List<Room> ALLroom=roomInstance.getAllRooms();
					for(int i=0;i<ALLroom.size();i++)
					{
						if(ALLroom.get(i).getNumber().equals(newR))
						{
							Room room=ALLroom.get(i);
							room.setStatus(1);
							roomInstance.uploadRoomInfo(room);
							break;
						}
					}
					JOptionPane.showMessageDialog(null,   "入住成功！","",JOptionPane.OK_OPTION);
				}
			if(APPtype==2)
			{//退租
				Application application=new Application(APPnum,APPtype,applyTime,Stime,Month,
						SP,SP,stdNum,oldR,null,hetong);
				appInstance.applyForDor(application);
				java.util.List<Room> ALLroom=roomInstance.getAllRooms();
				for(int i=0;i<ALLroom.size();i++)
				{
					if(ALLroom.get(i).getNumber().equals(oldR))
					{
						Room room=ALLroom.get(i);
						room.setStatus(0);
						roomInstance.uploadRoomInfo(room);
						break;
					}
				}
				java.util.List<Pact> ALLpact=pactInstance.getAllPacts();
				for(int i=0;i<ALLpact.size();i++)
				{
					if(ALLpact.get(i).getPNo().equals(hetong))
					{
						Pact pact=ALLpact.get(i);
						pact.setPMoney(0);
						pact.setPTime(Month);
						pactInstance.uploadPact(pact);
						break;
					}
				}
				java.util.List<Student> ALLstu=studentInstance.getStudentsInfo();
				for(int i=0;i<ALLstu.size();i++)
				{
					if(ALLstu.get(i).getNubmer().equals(std.getNubmer()))
					{
						Student stu1=ALLstu.get(i);
						stu1.setSroom(null);
						std.setSroom(null);
						studentInstance.updateStudent(stu1);
						break;
					}
				}
			}
			if(APPtype==3)
			{//更换
				Application application=new Application(APPnum,APPtype,applyTime,Stime,Month,
						SP,SP,stdNum,oldR,newR,hetong);
				appInstance.applyForDor(application);
				java.util.List<Room> ALLroom=roomInstance.getAllRooms();
				for(int i=0;i<ALLroom.size();i++)
				{
					if(ALLroom.get(i).getNumber().equals(oldR))
					{
						Room room=ALLroom.get(i);
						room.setStatus(0);
						roomInstance.uploadRoomInfo(room);
						break;
					}
				}
				for(int i=0;i<ALLroom.size();i++)
				{
					if(ALLroom.get(i).getNumber().equals(newR))
					{
						Room room=ALLroom.get(i);
						room.setStatus(1);
						roomInstance.uploadRoomInfo(room);
						break;
					}
				}
				java.util.List<Pact> ALLpact=pactInstance.getAllPacts();
				for(int i=0;i<ALLpact.size();i++)
				{
					if(ALLpact.get(i).getPNo().equals(hetong))
					{
						Pact pact=ALLpact.get(i);
						pact.setPMoney(pact.getPMoney()+SP);
						pact.setPTime(Month);
						pact.setPRNo(newR);
						pactInstance.uploadPact(pact);
						break;
					}
				}
				java.util.List<Student> ALLstu=studentInstance.getStudentsInfo();
				for(int i=0;i<ALLstu.size();i++)
				{
					if(ALLstu.get(i).getNubmer().equals(std.getNubmer()))
					{
						Student stu1=ALLstu.get(i);
						stu1.setSroom(newR);
						std.setSroom(newR);
						studentInstance.updateStudent(stu1);
						break;
					}
				}
			}
				dispose();
				StudentGUI stuGui=new StudentGUI(std);
				stuGui.setVisible(true);
			}
				
			}
		});
		button_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		//button_1.setContentAreaFilled(false);
		button_1.setBounds(249, 887, 120, 40);
		panel.add(button_1);
		label_22.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_22.setBounds(10, 76, 599, 30);
		
		panel.add(label_22);
		label_23.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_23.setBounds(24, 613, 570, 30);
		
		panel.add(label_23);
		label_24.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_24.setBounds(10, 656, 598, 30);
		
		panel.add(label_24);
		label_25.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_25.setBounds(24, 825, 570, 30);
		
		panel.add(label_25);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		if(oldType==1)
		{
			textArea.setText(Constants.R1INTRO);
		}
		if(oldType==2)
		{
			textArea.setText(Constants.R2INTRO);
		}
		if(oldType==3)
		{
			textArea.setText(Constants.R3INTRO);
		}
		textArea.setBounds(14, 358, 590, 98);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea.setEditable(false);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		if(newType==1)
		{
			textArea_1.setText(Constants.R1INTRO);
		}
		if(newType==2)
		{
			textArea_1.setText(Constants.R2INTRO);
		}
		if(newType==3)
		{
			textArea_1.setText(Constants.R3INTRO);
		}
		textArea_1.setBounds(14, 497, 590, 98);
		panel.add(textArea_1);
		
	
	}
	//窗口拖拽移动实现
		private void setDragable() {
			this.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseReleased(java.awt.event.MouseEvent e) {
					isDragged = false;
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
					tmp = new Point(e.getX(), e.getY());
					isDragged = true;
					setCursor(new Cursor(Cursor.MOVE_CURSOR));
				}
			});
			this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseDragged(java.awt.event.MouseEvent e) {
					if (isDragged) {
						loc = new Point(getLocation().x + e.getX() - tmp.x, getLocation().y + e.getY() - tmp.y);
						setLocation(loc);
					}
				}
			});
		}
}
