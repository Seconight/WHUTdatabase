package dsc.GUI;

import java.awt.*;
import java.util.*;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import dsc.ServicesInstance.RoomInstance;
import dss.Object.Application;
import dss.Object.Pact;
import dss.Object.Room;
import dss.Object.Student;
import javafx.scene.control.DatePicker;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;

public class StudentGUI extends BaseGUI {
	
	JLabel label_9 = new JLabel("2020\u5E7410\u670810\u65E5");//2020年10月10日
	JLabel label_8 = new JLabel("\u6D77\u56DB-702");//海四-702
	JLabel label_7 = new JLabel("\u5230\u671F\u65F6\u95F4\uFF1A");//到期时间：
	JLabel label_6 = new JLabel("\u623F\u95F4\u53F7\uFF1A");//房间号：
	JLabel label_5 = new JLabel("\u8BA1\u7B97\u673A\u79D1\u5B66\u4E0E\u6280\u672F");//计算机科学与技术
	JLabel label_4 = new JLabel("\u9662\u7CFB\uFF1A");//院系：
	JLabel label_3 = new JLabel("0121810880214");//0121810880214
	JLabel label_2 = new JLabel("\u5B66\u53F7\uFF1A");//学号：
	JLabel label_1 = new JLabel("\u7530\u5BB6\u5174");//田家兴
	JLabel label = new JLabel("\u59D3\u540D\uFF1A");//姓名：
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	JPanel panel = new JPanel();//入住选项卡
	JPanel panel_1 = new JPanel();//退租选项卡
	JPanel panel_2 = new JPanel(); //更换房间选项卡
	JLabel label_10 = new JLabel("\u623F\u95F4\u9009\u62E9");//房间选择
	JMenuBar menuBar = new JMenuBar();
	JMenu mnNewMenu_2 = new JMenu("\u697C\u680B\u9009\u62E9");//楼栋选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem_12 = new JCheckBoxMenuItem("1\u680B");//1栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_13 = new JCheckBoxMenuItem("2\u680B");//2栋
	JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("3\u680B");//3栋
	JCheckBoxMenuItem checkBoxMenuItem_1 = new JCheckBoxMenuItem("4\u680B");//4栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_14 = new JCheckBoxMenuItem("5\u680B");//5栋
	JMenu mnNewMenu_3 = new JMenu("\u6708\u79DF\u91D1");//月租金
	JCheckBoxMenuItem chckbxmntmNewCheckItem_15 = new JCheckBoxMenuItem("200\u5143/\u6708");//200/月
	JCheckBoxMenuItem checkBoxMenuItem_2 = new JCheckBoxMenuItem("300\u5143/\u6708");//300/月
	JCheckBoxMenuItem checkBoxMenuItem_3 = new JCheckBoxMenuItem("500\u5143/\u6708");//500/月;//开始时间;//结束时间
	JLabel label_13 = new JLabel("\u65F6\u957F\u6700\u5C116\u4E2A\u6708\u6700\u591A12\u4E2A\u6708");//时长
	JLabel label_11 = new JLabel("\u9009\u62E9\u5F00\u59CB\u65F6\u95F4");//选择开始时间
	JLabel label_12 = new JLabel("\u9009\u62E9\u7ED3\u675F\u65F6\u95F4");//选择结束时间
	JButton btnNewButton = new JButton("\u751F\u6210\u7533\u8BF7\u8868");//生成申请表按钮
	JButton btnNewButton_1 = new JButton("\u751F\u6210\u7533\u8BF7\u8868");
	JButton btnNewButton_2 = new JButton("\u751F\u6210\u7533\u8BF7\u8868");
	JLabel label_14 = new JLabel("\u786E\u8BA4\u5BC6\u7801");//退租确认密码
	JLabel label_15 = new JLabel("\u623F\u95F4\u9009\u62E9");//更换房间的房间选择
	JTable table_1 = new JTable();
	JMenuBar menuBar_1 = new JMenuBar();
	JMenu mnNewMenu_4 = new JMenu("\u9662\u7CFB\u9009\u62E9");//更换界面院系选择
	JMenu mnNewMenu_5 = new JMenu("\u7A7A\u4F59\u623F\u95F4");//更换界面空余房间选择
	JMenu mnNewMenu_6 = new JMenu("\u697C\u680B\u9009\u62E9");//更换界面楼栋选择
	JMenu mnNewMenu_7 = new JMenu("\u6708\u79DF\u91D1");//更换界面月租金
	JCheckBoxMenuItem chckbxmntmNewCheckItem_19 = new JCheckBoxMenuItem("\u7ECF\u6D4E");//更换界面经济
	JCheckBoxMenuItem chckbxmntmNewCheckItem_20 = new JCheckBoxMenuItem("\u7BA1\u7406");//更换界面管理
	JCheckBoxMenuItem checkBoxMenuItem_4 = new JCheckBoxMenuItem("\u80FD\u52A8");//更换界面能动
	JCheckBoxMenuItem checkBoxMenuItem_5 = new JCheckBoxMenuItem("航海");//更换界面航海
	JCheckBoxMenuItem checkBoxMenuItem_6 = new JCheckBoxMenuItem("机设");//更换机设
	JCheckBoxMenuItem checkBoxMenuItem_7 = new JCheckBoxMenuItem("外国语");//更换界面外国语
	JCheckBoxMenuItem checkBoxMenuItem_8 = new JCheckBoxMenuItem("马克思主义");//更换界面马克思主义
	JCheckBoxMenuItem checkBoxMenuItem_9 = new JCheckBoxMenuItem("计算机科学与技术");//更换界面计算机科学与技术
	JCheckBoxMenuItem checkBoxMenuItem_10 = new JCheckBoxMenuItem("化生");//更换界面化生
	JCheckBoxMenuItem checkBoxMenuItem_11 = new JCheckBoxMenuItem("物流");//更换界面物流
	JCheckBoxMenuItem checkBoxMenuItem_12 = new JCheckBoxMenuItem("所有院系");//更换界面所有院系
	JCheckBoxMenuItem checkBoxMenuItem_13 = new JCheckBoxMenuItem("空余房间");//更换界面空余房间
	JCheckBoxMenuItem checkBoxMenuItem_14 = new JCheckBoxMenuItem("所有房间");//更换界面所有房间
	JCheckBoxMenuItem checkBoxMenuItem_15 = new JCheckBoxMenuItem("1栋");//更换界面1栋
	JCheckBoxMenuItem checkBoxMenuItem_16 = new JCheckBoxMenuItem("2栋");//更换界面2栋
	JCheckBoxMenuItem checkBoxMenuItem_17 = new JCheckBoxMenuItem("3栋");//更换界面3栋
	JCheckBoxMenuItem checkBoxMenuItem_18 = new JCheckBoxMenuItem("4栋");//更换界面4栋
	JCheckBoxMenuItem checkBoxMenuItem_19 = new JCheckBoxMenuItem("5栋");//更换界面5栋
	JCheckBoxMenuItem checkBoxMenuItem_20 = new JCheckBoxMenuItem("所有楼栋");//更换界面所有楼栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_21 = new JCheckBoxMenuItem("200/月");//更换界面200/月
	JCheckBoxMenuItem checkBoxMenuItem_21 = new JCheckBoxMenuItem("300/月");//更换界面300/月
	JCheckBoxMenuItem checkBoxMenuItem_22 = new JCheckBoxMenuItem("400/月");//更换界面400/月
	JCheckBoxMenuItem checkBoxMenuItem_23 = new JCheckBoxMenuItem("所有月租");//更换界面所有月租
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private final JTextField textField_13 = new JTextField();
	private final JLabel label_29 = new JLabel("\u65E5");
	private final JLabel label_30 = new JLabel("\u65E5");
	private final JTextField textField_14 = new JTextField();
	private JPasswordField passwordField;
	private JTable table;
	JScrollPane scrollPane;
	String[] month= {"3","9"};
	JComboBox comboBox = new JComboBox(month);
	JComboBox comboBox_1 = new JComboBox(month);
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	String[] columnNames = { "房间号", "房间类型","月租金","系","楼栋","状态"}; // 定义表格列名数组
	private final JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("\u6240\u6709\u697C\u680B");
	private final JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("\u6240\u6709\u6708\u79DF");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JLabel lblNewLabel = new JLabel("\u8BF7\u614E\u91CD\u8003\u8651\u540E\u8F93\u5165\u5BC6\u7801\u8FDB\u884C\u9000\u79DF\uFF01");
	
	public StudentGUI(dss.Object.Student std) {
		textField.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField.setBounds(259, 471, 90, 50);
		textField.setColumns(10);
		int hang=0;
		
		java.util.List<Room> ALLRoom=roomInstance.getAllRooms();
	
		for(int i=0;i<ALLRoom.size();i++)
		{
			String str=ALLRoom.get(i).getType();
			String TypeSex=str.substring(0,1);
			if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex))
			{
				hang++;
			}
		}
		String[][] room= new String[hang][6];
		int j=0;
		for(int i=0;i<ALLRoom.size();i++)
			{
			String str=ALLRoom.get(i).getType();
			String TypeSex=str.substring(0,1);
			if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex))
			{
				
				room[j][0]=ALLRoom.get(i).getNumber();
				room[j][1]=ALLRoom.get(i).getType();
				room[j][2]=Float.toString(ALLRoom.get(i).getMoney());
				room[j][3]=ALLRoom.get(i).getDepartment();
				room[j][4]=Integer.toString(ALLRoom.get(i).getFloor());
				room[j][5]="未使用";
				j++;
			}		
		}
		DefaultTableModel df=new DefaultTableModel();
		df.setDataVector(room, columnNames);
		table=new JTable(df);
		JTableHeader tab_header = table.getTableHeader();					//获取表头			
		tab_header.setFont(new Font("微软雅黑", Font.PLAIN, 30));	
		tab_header.setPreferredSize(new Dimension(tab_header.getWidth(), 50));	//修改表头的高度
		table.setFont(new Font("微软雅黑", Font.PLAIN, 30));
			

		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(14, 13, 120, 30);
		bgp.add(label);
		
		String name=std.getName();
		label_1.setText(name);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_1.setBounds(133, 13, 120, 30);
		bgp.add(label_1);
		

		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_2.setBounds(14, 56, 120, 30);
		bgp.add(label_2);
		

		String No=std.getNubmer();
		label_3.setText(No);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_3.setBounds(133, 56, 300, 30);
		bgp.add(label_3);
		

		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_4.setBounds(627, 99, 120, 30);
		bgp.add(label_4);
		

		String dept=std.getDepartment();
		label_5.setText(dept);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_5.setBounds(761, 99, 320, 30);
		bgp.add(label_5);
		

		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_6.setBounds(587, 13, 160, 30);
		bgp.add(label_6);
		

		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_7.setBounds(547, 56, 200, 30);
		bgp.add(label_7);
		

		String NoRoom=std.getSroom();
		if(NoRoom==null)
		{
			label_8.setText("未入住");
		}
		else {
			label_8.setText(NoRoom);
		}
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_8.setBounds(761, 13, 167, 30);
		bgp.add(label_8);
		

		Pact pact=pactInstance.checkStuPact(std);
		if(pact==null)
		{
			label_9.setText("");
		}
		else {
			String stime=pact.getPSTime();//合同开始时间2020-09-01
			String[] con=stime.split("-");//分割出月份
			int Year=Integer.parseInt(con[0]);//年
			int Month=Integer.parseInt(con[1]);//月份
			int zujie=pact.getPTime();//租借时长
			int z=zujie+Month;
			int k=z/12;
			int m=z%12;
			int newYear=Year+k;//终止年
			int newMonth=m;//终止月
			label_9.setText(newYear+"-"+newMonth+"-"+"01");
		}
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_9.setBounds(761, 56, 272, 30);
		bgp.add(label_9);
		tabbedPane.setBackground(Color.WHITE);


		
		tabbedPane.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		tabbedPane.setBounds(0, 92, 1202, 651);
		bgp.add(tabbedPane);
		panel.setBackground(Color.CYAN);
		
		panel.setLayout(null);
		tabbedPane.addTab("入住", null, panel, null);
	
		
		label_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_10.setBounds(5, 0, 160, 50);
		panel.add(label_10);
		

		menuBar.setOpaque(false);
		menuBar.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.setBounds(900, 0, 650, 49);
		panel.add(menuBar);
		

		mnNewMenu_2.setForeground(Color.MAGENTA);
		mnNewMenu_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_2);
		

		chckbxmntmNewCheckItem_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_12);
		

		chckbxmntmNewCheckItem_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_13);
		

		checkBoxMenuItem.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(checkBoxMenuItem);
		

		checkBoxMenuItem_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(checkBoxMenuItem_1);
		

		chckbxmntmNewCheckItem_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_14);
		chckbxmntmNewCheckItem.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_2.add(chckbxmntmNewCheckItem);
		

		mnNewMenu_3.setForeground(Color.MAGENTA);
		mnNewMenu_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_3);
		

		chckbxmntmNewCheckItem_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_15);
		

		checkBoxMenuItem_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_2);
		

		checkBoxMenuItem_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_3);
		chckbxmntmNewCheckItem_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_3.add(chckbxmntmNewCheckItem_1);
		

		label_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_11.setBounds(5, 471, 240, 50);
		panel.add(label_11);
		

		label_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_12.setBounds(5, 534, 240, 50);
		panel.add(label_12);
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		label_13.setBounds(526, 499, 403, 50);
		
		panel.add(label_13);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow()==-1)
				{
					JOptionPane.showMessageDialog(null,  "未选择房间", "请选择房间！",JOptionPane.ERROR_MESSAGE);
				}
				else {
					Calendar now = Calendar.getInstance();
					int cuY=now.get(Calendar.YEAR);
					int cuM=now.get(Calendar.MONTH)+1;
					int cuD=cuY*12+cuM;
					if((!textField.getText().equals(""))&&(!textField_1.getText().equals("")))
					{
						int smallY=Integer.parseInt(textField.getText());
						int bigY=Integer.parseInt(textField_1.getText());
						int smallM=Integer.parseInt((String)comboBox.getSelectedItem());
						int bigM=Integer.parseInt((String)comboBox_1.getSelectedItem());
						if((bigY*12+bigM-(smallY*12+smallM))>=6&&(bigY*12+bigM-(smallY*12+smallM))<=12&&(smallY*12+smallM>=cuD))
						{//可以提交
							DisPose();
							java.util.List<Application> ALLapp=appInstance.getAllApplications();
							int num1 = ALLapp.size();
							num1++;
							int num=num1;
							String APPnum= "";
							int count=0; //计数
							while(num>=1) {
							num/=10;
							count++;
							}
							for(int i=0;i<10-count;i++)
							{
								APPnum+="0";
							}
							APPnum+=num1;
							Date day=new Date();    
							SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							String stime=smallY+"-"+smallM+"-"+"1";
							int row=table.getSelectedRow();
							String NType=(String)table.getValueAt(row, 1);
							String NRoomNum=(String)table.getValueAt(row, 0);
							int type=Integer.parseInt(NType.substring(1));
							int SP=0;
							if(type==1)
							{
								SP=(bigY*12+bigM-(smallY*12+smallM))*500;
							}
							if(type==2)
							{
								SP=(bigY*12+bigM-(smallY*12+smallM))*300;
							}
							if(type==3)
							{
								SP=(bigY*12+bigM-(smallY*12+smallM))*200;
							}
							ApplicationGUI app=new ApplicationGUI(std,APPnum,1,df.format(day),stime,bigY*12+bigM-(smallY*12+smallM),std.getNubmer(),null,null,0,NRoomNum,type,SP,0);
							app.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null,  "输入信息错误", "请重新选择时间！",JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							textField_1.setText("");
						}
					}
				}
				
			}
		});
		

		btnNewButton.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		btnNewButton.setBounds(943, 499, 240, 50);
		panel.add(btnNewButton);
		
		JLabel label_18 = new JLabel("\u5E74");
		label_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_18.setBounds(349, 471, 40, 50);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("\u67081\u65E5");
		label_19.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_19.setBounds(434, 471, 94, 50);
		panel.add(label_19);
		
		JLabel label_22 = new JLabel("\u5E74");
		label_22.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_22.setBounds(349, 534, 40, 50);
		panel.add(label_22);
		table.setPreferredScrollableViewportSize(new Dimension(500,600));
		
		table.setRowHeight(50);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 48, 1197, 418);
		panel.add(scrollPane);
		comboBox.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		

		comboBox.setBounds(389, 471, 46, 50);
		panel.add(comboBox);
		comboBox_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		

		comboBox_1.setBounds(389, 534, 46, 50);
		panel.add(comboBox_1);
		
		panel.add(textField);
		textField_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_1.setColumns(10);
		textField_1.setBounds(259, 534, 90, 50);
		
		panel.add(textField_1);
		
		JLabel label_21 = new JLabel("\u67081\u65E5");
		label_21.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_21.setBounds(434, 534, 94, 50);
		panel.add(label_21);
		
		//scrollPane.setViewportView(table);
		panel_1.setBackground(Color.CYAN);
		
		panel_1.setLayout(null);
		tabbedPane.addTab("退租", null, panel_1, null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pwd=passwordField.getPassword().toString();
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
				java.util.List<Room> ALLroom=roomInstance.getAllRooms();
				for(int i=0;i<ALLroom.size();i++)
				{
					if(ALLroom.get(i).getNumber().equals(std.getSroom()))
					{
						Room room=ALLroom.get(i);
						room.setStatus(0);
						roomInstance.uploadRoomInfo(room);
						break;
					}
				}
			}
		});
		
		btnNewButton_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		btnNewButton_1.setBounds(479, 416, 240, 50);
		
		panel_1.add(btnNewButton_1);
		label_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_14.setBounds(361, 141, 160, 50);
		
		panel_1.add(label_14);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		passwordField.setBounds(535, 141, 300, 50);
		panel_1.add(passwordField);
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(287, 26, 612, 64);
		
		panel_1.add(lblNewLabel);
		panel_2.setBackground(Color.CYAN);
		
		panel_2.setLayout(null);
		tabbedPane.addTab("更换房间", null, panel_2, null);
		btnNewButton_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		btnNewButton_2.setBounds(481, 534, 240, 50);
		
		panel_2.add(btnNewButton_2);
		label_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_15.setBounds(5, 0, 160, 50);
		panel_2.add(label_15);
		
		panel_2.add(label_15);
		table_1.setBounds(0, 49, 1170, 407);
		panel_2.add(table_1);
		menuBar_1.setBounds(540, 0, 650, 50);
		menuBar_1.setOpaque(false);
		panel_2.add(menuBar_1);
		mnNewMenu_4.setForeground(Color.MAGENTA);
		mnNewMenu_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		
		menuBar_1.add(mnNewMenu_4);
		chckbxmntmNewCheckItem_19.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(chckbxmntmNewCheckItem_19);
		chckbxmntmNewCheckItem_20.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(chckbxmntmNewCheckItem_20);
		checkBoxMenuItem_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_4);
		checkBoxMenuItem_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_5);
		checkBoxMenuItem_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_6);
		checkBoxMenuItem_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_7);
		checkBoxMenuItem_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_8);
		checkBoxMenuItem_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_9);
		checkBoxMenuItem_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_10);
		checkBoxMenuItem_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_11);
		checkBoxMenuItem_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_4.add(checkBoxMenuItem_12);
		mnNewMenu_5.setForeground(Color.MAGENTA);
		mnNewMenu_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		
		menuBar_1.add(mnNewMenu_5);
		checkBoxMenuItem_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_5.add(checkBoxMenuItem_13);
		checkBoxMenuItem_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_5.add(checkBoxMenuItem_14);
		mnNewMenu_6.setForeground(Color.MAGENTA);
		mnNewMenu_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		
		menuBar_1.add(mnNewMenu_6);
		checkBoxMenuItem_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_15);
		checkBoxMenuItem_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_16);
		checkBoxMenuItem_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_17);
		checkBoxMenuItem_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_18);
		checkBoxMenuItem_19.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_19);
		checkBoxMenuItem_20.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_6.add(checkBoxMenuItem_20);
		mnNewMenu_7.setForeground(Color.MAGENTA);
		mnNewMenu_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		
		menuBar_1.add(mnNewMenu_7);
		chckbxmntmNewCheckItem_21.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_7.add(chckbxmntmNewCheckItem_21);
		checkBoxMenuItem_21.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_7.add(checkBoxMenuItem_21);
		checkBoxMenuItem_22.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_7.add(checkBoxMenuItem_22);
		checkBoxMenuItem_23.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_7.add(checkBoxMenuItem_23);
		
		JLabel label_16 = new JLabel("\u5F53\u524D\u7ED3\u675F\u65F6\u95F4");
		label_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_16.setBounds(5, 464, 240, 50);
		panel_2.add(label_16);
		
		JLabel label_17 = new JLabel("\u66F4\u6362\u7ED3\u675F\u65F6\u95F4");
		label_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_17.setBounds(625, 464, 240, 50);
		panel_2.add(label_17);
		
		textField_5 = new JTextField();
		textField_5.setText("2020");
		textField_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_5.setColumns(10);
		textField_5.setBounds(259, 464, 90, 50);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("2020");
		textField_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_6.setColumns(10);
		textField_6.setBounds(879, 464, 90, 50);
		panel_2.add(textField_6);
		
		JLabel label_23 = new JLabel("\u5E74");
		label_23.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_23.setBounds(349, 464, 40, 50);
		panel_2.add(label_23);
		
		textField_9 = new JTextField();
		textField_9.setText("10");
		textField_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_9.setColumns(10);
		textField_9.setBounds(390, 464, 40, 50);
		panel_2.add(textField_9);
		
		JLabel label_24 = new JLabel("\u6708");
		label_24.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_24.setBounds(430, 464, 40, 50);
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("\u5E74");
		label_25.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_25.setBounds(969, 464, 40, 50);
		panel_2.add(label_25);
		
		textField_10 = new JTextField();
		textField_10.setText("10");
		textField_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_10.setColumns(10);
		textField_10.setBounds(1008, 464, 40, 50);
		panel_2.add(textField_10);
		
		JLabel label_26 = new JLabel("\u6708");
		label_26.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_26.setBounds(1048, 464, 40, 50);
		panel_2.add(label_26);
		textField_13.setText("22");
		textField_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_13.setColumns(10);
		textField_13.setBounds(470, 464, 48, 50);
		
		panel_2.add(textField_13);
		label_29.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_29.setBounds(518, 464, 40, 50);
		
		panel_2.add(label_29);
		label_30.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_30.setBounds(1130, 464, 40, 50);
		
		panel_2.add(label_30);
		textField_14.setText("22");
		textField_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_14.setColumns(10);
		textField_14.setBounds(1088, 464, 48, 50);
		
		panel_2.add(textField_14);
		chckbxmntmNewCheckItem.addItemListener(new ItemListener() {
			//所有楼栋
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem.setState(false);
				int money=0;
				if(checkBoxMenuItem_2.getState())
				{
					money=300;
				}else if(checkBoxMenuItem_3.getState())
				{
					money=500;
				}
				else if(chckbxmntmNewCheckItem_15.getState()) {
					money=200;
				}else if(chckbxmntmNewCheckItem_1.getState())
				{
					money=0;
				}
				//选择所有三栋
				GetNeed(std, 0, money,df);
			}
		});
		checkBoxMenuItem.addItemListener(new ItemListener() {
			//3
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem.setState(false);
				int money=0;
				if(checkBoxMenuItem_2.getState())
				{
					money=300;
				}else if(checkBoxMenuItem_3.getState())
				{
					money=500;
				}
				else if(chckbxmntmNewCheckItem_15.getState()) {
					money=200;
				}else if(chckbxmntmNewCheckItem_1.getState())
				{
					money=0;
				}
				//选择所有三栋
				GetNeed(std, 3, money,df);
			}
		});
		chckbxmntmNewCheckItem_12.addItemListener(new ItemListener() {
			//1
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				checkBoxMenuItem.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem.setState(false);
				int money=0;
				if(checkBoxMenuItem_2.getState())
				{
					money=300;
				}else if(checkBoxMenuItem_3.getState())
				{
					money=500;
				}
				else if(chckbxmntmNewCheckItem_15.getState()) {
					money=200;
				}else if(chckbxmntmNewCheckItem_1.getState())
				{
					money=0;
				}
				//选择所有三栋
				GetNeed(std, 1, money,df);
			}
		});
		chckbxmntmNewCheckItem_13.addItemListener(new ItemListener() {
			//2
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				checkBoxMenuItem.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem.setState(false);
				int money=0;
				if(checkBoxMenuItem_2.getState())
				{
					money=300;
				}else if(checkBoxMenuItem_3.getState())
				{
					money=500;
				}
				else if(chckbxmntmNewCheckItem_15.getState()) {
					money=200;
				}else if(chckbxmntmNewCheckItem_1.getState())
				{
					money=0;
				}
				//选择所有三栋
				GetNeed(std, 2, money,df);
			}
		});
	checkBoxMenuItem_1.addItemListener(new ItemListener() {
			//4
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				checkBoxMenuItem.setState(false);
				chckbxmntmNewCheckItem.setState(false);
				int money=0;
				if(checkBoxMenuItem_2.getState())
				{
					money=300;
				}else if(checkBoxMenuItem_3.getState())
				{
					money=500;
				}
				else if(chckbxmntmNewCheckItem_15.getState()) {
					money=200;
				}else if(chckbxmntmNewCheckItem_1.getState())
				{
					money=0;
				}
				//选择所有三栋
				GetNeed(std, 4, money,df);
			}
		});
	chckbxmntmNewCheckItem_14.addItemListener(new ItemListener() {
		//5
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO 自动生成的方法存根
			chckbxmntmNewCheckItem_12.setState(false);
			chckbxmntmNewCheckItem_13.setState(false);
			checkBoxMenuItem.setState(false);
			checkBoxMenuItem_1.setState(false);
			chckbxmntmNewCheckItem.setState(false);
			int money=0;
			if(checkBoxMenuItem_2.getState())
			{
				money=300;
			}else if(checkBoxMenuItem_3.getState())
			{
				money=500;
			}
			else if(chckbxmntmNewCheckItem_15.getState()) {
				money=200;
			}else if(chckbxmntmNewCheckItem_1.getState())
			{
				money=0;
			}
			//选择所有三栋
			GetNeed(std,5, money,df);
		}
	});
	checkBoxMenuItem_2.addItemListener(new ItemListener() {
			//300
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_15.setState(false);
				checkBoxMenuItem_3.setState(false);
				chckbxmntmNewCheckItem_1.setState(false);
				int floor=0;
				if(checkBoxMenuItem.getState())
				{
					floor=3;
				}else if(chckbxmntmNewCheckItem_12.getState())
				{
					floor=1;
				}
				else if(chckbxmntmNewCheckItem_13.getState()) {
					floor=2;
				}
				else if(checkBoxMenuItem_1.getState()) {
					floor=4;
				}
				else if(chckbxmntmNewCheckItem_14.getState()) {
					floor=5;
				}else if(chckbxmntmNewCheckItem.getState()) {
					floor=0;
				}
				//选择所有三栋
				GetNeed(std,floor, 300,df);
			}
		});
	checkBoxMenuItem_3.addItemListener(new ItemListener() {
		//500
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO 自动生成的方法存根
			chckbxmntmNewCheckItem_15.setState(false);
			checkBoxMenuItem_2.setState(false);
			chckbxmntmNewCheckItem_1.setState(false);
			int floor=0;
			if(checkBoxMenuItem.getState())
			{
				floor=3;
			}else if(chckbxmntmNewCheckItem_12.getState())
			{
				floor=1;
			}
			else if(chckbxmntmNewCheckItem_13.getState()) {
				floor=2;
			}
			else if(checkBoxMenuItem_1.getState()) {
				floor=4;
			}
			else if(chckbxmntmNewCheckItem_14.getState()) {
				floor=5;
			}else if(chckbxmntmNewCheckItem.getState()) {
				floor=0;
			}
			//选择所有三栋
			GetNeed(std,floor, 500,df);
		}
	});
	chckbxmntmNewCheckItem_15.addItemListener(new ItemListener() {
		//200
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO 自动生成的方法存根
			checkBoxMenuItem_2.setState(false);
			checkBoxMenuItem_3.setState(false);
			chckbxmntmNewCheckItem_1.setState(false);
			int floor=0;
			if(checkBoxMenuItem.getState())
			{
				floor=3;
			}else if(chckbxmntmNewCheckItem_12.getState())
			{
				floor=1;
			}
			else if(chckbxmntmNewCheckItem_13.getState()) {
				floor=2;
			}
			else if(checkBoxMenuItem_1.getState()) {
				floor=4;
			}
			else if(chckbxmntmNewCheckItem_14.getState()) {
				floor=5;
			}else if(chckbxmntmNewCheckItem.getState()) {
				floor=0;
			}
			//选择所有三栋
			GetNeed(std,floor, 200,df);
		}
	});
	chckbxmntmNewCheckItem_1.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO 自动生成的方法存根
			checkBoxMenuItem_2.setState(false);
			checkBoxMenuItem_3.setState(false);
			chckbxmntmNewCheckItem_15.setState(false);
			int floor=0;
			if(checkBoxMenuItem.getState())
			{
				floor=3;
			}else if(chckbxmntmNewCheckItem_12.getState())
			{
				floor=1;
			}
			else if(chckbxmntmNewCheckItem_13.getState()) {
				floor=2;
			}
			else if(checkBoxMenuItem_1.getState()) {
				floor=4;
			}
			else if(chckbxmntmNewCheckItem_14.getState()) {
				floor=5;
			}else if(chckbxmntmNewCheckItem.getState()) {
				floor=0;
			}
			//选择所有三栋
			GetNeed(std,floor, 0,df);
		}
	});
		
		if(std.getSroom()!=null)
		{//不能选择入住申请
	        tabbedPane.setSelectedIndex(1); 
	        tabbedPane.setEnabledAt(0, false);
		}

	}
	//获得所有空房间并选择需要的
	public void GetNeed(Student std,int floor,int money,DefaultTableModel df)
	{
		java.util.List<Room> ALLRoom=roomInstance.getAllRooms();
		
		int hang=0;
		if(floor==0)
		{
			if(money==0)
			{
				for(int i=0;i<ALLRoom.size();i++)
				{
					String str=ALLRoom.get(i).getType();
					String TypeSex=str.substring(0,1);
					if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex))
					{
						hang++;
					}
				}
				String[][] room= new String[hang][6];
				int j=0;
				for(int i=0;i<ALLRoom.size();i++)
				{
				String str=ALLRoom.get(i).getType();
				String TypeSex=str.substring(0,1);
				if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex))
				{
					
					room[j][0]=ALLRoom.get(i).getNumber();
					room[j][1]=ALLRoom.get(i).getType();
					room[j][2]=Float.toString(ALLRoom.get(i).getMoney());
					room[j][3]=ALLRoom.get(i).getDepartment();
					room[j][4]=Integer.toString(ALLRoom.get(i).getFloor());
					room[j][5]="未使用";
					j++;
				}		
				}
				df.setDataVector(room, columnNames);
				
			}
			else {
				for(int i=0;i<ALLRoom.size();i++)
				{
					String str=ALLRoom.get(i).getType();
					String TypeSex=str.substring(0,1);
					if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getMoney()==money)
					{
						hang++;
					}
				}
				String[][] room= new String[hang][6];
				int j=0;
				for(int i=0;i<ALLRoom.size();i++)
				{
				String str=ALLRoom.get(i).getType();
				String TypeSex=str.substring(0,1);
				if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getMoney()==money)
				{
					
					room[j][0]=ALLRoom.get(i).getNumber();
					room[j][1]=ALLRoom.get(i).getType();
					room[j][2]=Float.toString(ALLRoom.get(i).getMoney());
					room[j][3]=ALLRoom.get(i).getDepartment();
					room[j][4]=Integer.toString(ALLRoom.get(i).getFloor());
					room[j][5]="未使用";
					j++;
				}		
				}
				df.setDataVector(room, columnNames);
			}
		}
		else {
			if(money==0)
			{
				for(int i=0;i<ALLRoom.size();i++)
				{
					String str=ALLRoom.get(i).getType();
					String TypeSex=str.substring(0,1);
					if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getFloor()==floor)
					{
						hang++;
					}
				}
				String[][] room= new String[hang][6];
				int j=0;
				for(int i=0;i<ALLRoom.size();i++)
				{
				String str=ALLRoom.get(i).getType();
				String TypeSex=str.substring(0,1);
				if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getFloor()==floor)
				{
					
					room[j][0]=ALLRoom.get(i).getNumber();
					room[j][1]=ALLRoom.get(i).getType();
					room[j][2]=Float.toString(ALLRoom.get(i).getMoney());
					room[j][3]=ALLRoom.get(i).getDepartment();
					room[j][4]=Integer.toString(ALLRoom.get(i).getFloor());
					room[j][5]="未使用";
					j++;
				}		
				}
				df.setDataVector(room, columnNames);
			}
			else {
				for(int i=0;i<ALLRoom.size();i++)
				{
					String str=ALLRoom.get(i).getType();
					String TypeSex=str.substring(0,1);
					if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getFloor()==floor&&ALLRoom.get(i).getMoney()==money)
					{
						hang++;
					}
				}
				String[][] room= new String[hang][6];
				int j=0;
				for(int i=0;i<ALLRoom.size();i++)
				{
				String str=ALLRoom.get(i).getType();
				String TypeSex=str.substring(0,1);
				if(ALLRoom.get(i).getStatus()!=1&&ALLRoom.get(i).getDepartment().equals(std.getDepartment())&&std.getSex()==Integer.parseInt(TypeSex)&&ALLRoom.get(i).getFloor()==floor&&ALLRoom.get(i).getMoney()==money)
				{
					
					room[j][0]=ALLRoom.get(i).getNumber();
					room[j][1]=ALLRoom.get(i).getType();
					room[j][2]=Float.toString(ALLRoom.get(i).getMoney());
					room[j][3]=ALLRoom.get(i).getDepartment();
					room[j][4]=Integer.toString(ALLRoom.get(i).getFloor());
					room[j][5]="未使用";
					j++;
				}		
				}
				df.setDataVector(room, columnNames);
			}
		}
		
	}
}
