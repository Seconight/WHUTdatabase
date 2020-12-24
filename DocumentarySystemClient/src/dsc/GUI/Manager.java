package dsc.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dsc.ServicesInstance.AppInstance;
import dss.Object.Application;
import dss.Object.Pact;
import dss.Object.Room;
import dss.Object.Student;
import dss.Services.AppApplications;

import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;

public class Manager extends BaseGUI {
	JLabel label = new JLabel("管理员模式");// 管理员界面展示
	JLabel lblNewLabel1 = new JLabel("");//
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel room_table = new JPanel();// 宿舍选项卡
	JPanel panel_1 = new JPanel();// 申请表选项卡
	JPanel panel_2 = new JPanel(); // 合同选项卡
	JLabel label_10 = new JLabel("\u5BBF\u820D\u60C5\u51B5");// 房间选择
	JMenuBar menuBar = new JMenuBar();
	JMenu mnNewMenu = new JMenu("\u9662\u7CFB\u9009\u62E9");// 院系选择
	JCheckBoxMenuItem economic = new JCheckBoxMenuItem("\u7ECF\u6D4E");// 经济
	JCheckBoxMenuItem management = new JCheckBoxMenuItem("\u7BA1\u7406");// 管理
	JCheckBoxMenuItem active = new JCheckBoxMenuItem("\u80FD\u52A8");// 能动
	JCheckBoxMenuItem navigation = new JCheckBoxMenuItem("\u822A\u6D77");// 航海
	JCheckBoxMenuItem machine = new JCheckBoxMenuItem("\u673A\u8BBE");// 机设
	JCheckBoxMenuItem language = new JCheckBoxMenuItem("\u5916\u56FD\u8BED");// 外国语
	JCheckBoxMenuItem philosophy = new JCheckBoxMenuItem("\u9A6C\u514B\u601D\u4E3B\u4E49");// 马克思主义
	JCheckBoxMenuItem computer = new JCheckBoxMenuItem("\u8BA1\u7B97\u673A\u79D1\u5B66\u4E0E\u6280\u672F");// 计算机科学与技术
	JCheckBoxMenuItem biological = new JCheckBoxMenuItem("\u5316\u751F");// 化生
	JCheckBoxMenuItem chckbxmntmNewCheckItem_9 = new JCheckBoxMenuItem("\u7269\u6D41");// 物流
	JMenu mnNewMenu_1 = new JMenu("\u7A7A\u4F59\u623F\u95F4");// 空余房间选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem_10 = new JCheckBoxMenuItem("\u7A7A\u4F59\u623F\u95F4");// 空余房间
	JCheckBoxMenuItem chckbxmntmNewCheckItem_11 = new JCheckBoxMenuItem("\u6240\u6709\u623F\u95F4");// 所有房间
	JMenu mnNewMenu_2 = new JMenu("\u697C\u680B\u9009\u62E9");// 楼栋选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem_12 = new JCheckBoxMenuItem("1\u680B");// 1栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_13 = new JCheckBoxMenuItem("2\u680B");// 2栋
	JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("3\u680B");// 3栋
	JCheckBoxMenuItem checkBoxMenuItem_1 = new JCheckBoxMenuItem("4\u680B");// 4栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_14 = new JCheckBoxMenuItem("5\u680B");// 5栋
	JMenu mnNewMenu_3 = new JMenu("\u6708\u79DF\u91D1");// 月租金
	JCheckBoxMenuItem chckbxmntmNewCheckItem_15 = new JCheckBoxMenuItem("200\u5143/\u6708");// 200/月
	JCheckBoxMenuItem checkBoxMenuItem_2 = new JCheckBoxMenuItem("300\u5143/\u6708");// 300/月
	JCheckBoxMenuItem checkBoxMenuItem_3 = new JCheckBoxMenuItem("500\u5143/\u6708");// 400/月
	JTable table = new JTable();// 房间信息表;//开始时间;//结束时间
	JCheckBoxMenuItem chckbxmntmNewCheckItem_16 = new JCheckBoxMenuItem("\u6240\u6709\u9662\u7CFB");// 所有院系
	JCheckBoxMenuItem chckbxmntmNewCheckItem_17 = new JCheckBoxMenuItem("\u6240\u6709\u697C\u680B");// 所有楼栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_18 = new JCheckBoxMenuItem("\u6240\u6709\u6708\u79DF");// 所有月租
	JLabel label_15 = new JLabel("\u5408\u540C\u4FE1\u606F");// 更换房间的房间选择
	JTable table_1 = new JTable();

	private final JPanel panel_3 = new JPanel();
	private final JLabel label_1 = new JLabel("\u8F93\u5165\u5B66\u751F\u59D3\u540D\u6216\u7533\u8BF7\u8868\u7C7B\u578B\u67E5\u8BE2");// 输入关键词查询
	private JTextField textField = new JTextField();
	private final JButton btnD = new JButton("查询信息");
	private final JLabel label_2 = new JLabel("输入学生姓名查询");
	private final JTextField textField_1 = new JTextField();
	private final JButton button_3 = new JButton("\u70B9\u51FB\u67E5\u8BE2");// shanchu?
	private final JTable table_3 = new JTable();
	private final JLabel label_3 = new JLabel("\u5B66\u751F\u4FE1\u606F");// 学生信息
	private final JLabel label_4 = new JLabel("\u8F93\u5165\u59D3\u540D\u6216\u9662\u7CFB\u67E5\u8BE2");
	private final JTextField textField_2 = new JTextField();
	private final JButton button_4 = new JButton("\u70B9\u51FB\u67E5\u8BE2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String[] columnNames = { "房间号", "房间类型", "月租金", "系", "楼栋", "状态" }; // 定义表格列名数组
	String[] appColumnStrings = { "单号", "类别", "时间", "入住时长", "状态", "宿舍", "申请人" };;// 定义表头
	String[] pacStrings = { "合同号", "开始时间", "合同时长", "房间号", "学号", "合同金额" };//
	String[] stuStrings = { "学号", "姓名", "性别", "学院", "年龄", "房间号" };

	/**
	 * Create the frame.
	 */
	public Manager() {
		textField.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField.setBounds(259, 471, 90, 50);
		textField.setColumns(10);

		java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
		int hang = ALLRoom.size();

		String[][] room = new String[hang][6];
		int j = 0;
		for (int i = 0; i < ALLRoom.size(); i++) {
			room[j][0] = ALLRoom.get(i).getNumber();
			room[j][1] = ALLRoom.get(i).getType();
			room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
			room[j][3] = ALLRoom.get(i).getDepartment();
			room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
			if (ALLRoom.get(i).getStatus() == 1) {
				room[j][5] = "已使用";
			} else {
				room[j][5] = "未使用";
			}
			j++;
		}

		DefaultTableModel df = new DefaultTableModel();
		df.setDataVector(room, columnNames);
		table = new JTable(df);
		JTableHeader tab_header = table.getTableHeader(); // 获取表头
		tab_header.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		tab_header.setPreferredSize(new Dimension(tab_header.getWidth(), 50)); // 修改表头的高度
		table.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		table.setRowHeight(41);

		label.setForeground(Color.WHITE);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(35, 26, 240, 46);
		bgp.add(label);

		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel1.setBounds(275, 26, 168, 46);
		bgp.add(lblNewLabel1);
		tabbedPane.setBackground(Color.CYAN);

		tabbedPane.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		tabbedPane.setBounds(0, 92, 1202, 651);
		bgp.add(tabbedPane);
		room_table.setBackground(Color.CYAN);

		room_table.setLayout(null);
		tabbedPane.addTab("宿舍", null, room_table, null);

		table.setBounds(0, 49, 1170, 407);
		room_table.add(table);

		label_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_10.setBounds(5, 0, 160, 50);
		room_table.add(label_10);

		menuBar.setOpaque(false);
		menuBar.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.setBounds(540, 0, 650, 50);
		room_table.add(menuBar);

		mnNewMenu.setForeground(Color.MAGENTA);
		mnNewMenu.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu);

		economic.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(economic);
		economic.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);

				getRoomByCla("经济", df);
			}
		});

		management.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(management);
		management.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("管理", df);
			}
		});

		active.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(active);
		active.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("能动", df);
			}
		});

		navigation.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(navigation);
		navigation.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("航海", df);
			}
		});

		machine.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(machine);
		machine.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("机设", df);
			}
		});

		language.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(language);
		language.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("外国语", df);
			}
		});

		philosophy.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(philosophy);
		philosophy.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("马克思", df);
			}
		});

		computer.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(computer);
		computer.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("计算机科学与技术", df);
			}
		});

		biological.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(biological);
		biological.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("化生", df);
			}
		});

		chckbxmntmNewCheckItem_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_9);
		chckbxmntmNewCheckItem_9.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_16.setState(false);
				getRoomByCla("物流", df);
			}
		});

		chckbxmntmNewCheckItem_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_16);
		chckbxmntmNewCheckItem_16.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				management.setState(false);
				economic.setState(false);
				active.setState(false);
				navigation.setState(false);
				machine.setState(false);
				language.setState(false);
				philosophy.setState(false);
				computer.setState(false);
				biological.setState(false);
				chckbxmntmNewCheckItem_9.setState(false);
				getRoomByCla("所有", df);
			}
		});

		mnNewMenu_1.setForeground(Color.MAGENTA);
		mnNewMenu_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_1);

		chckbxmntmNewCheckItem_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_10);
		chckbxmntmNewCheckItem_10.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_11.setState(false);
				getRoomByfre(0, df);
			}
		});

		chckbxmntmNewCheckItem_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_11);
		chckbxmntmNewCheckItem_11.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_10.setState(false);
				getRoomByfre(1, df);
			}
		});

		mnNewMenu_2.setForeground(Color.MAGENTA);
		mnNewMenu_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_2);

		chckbxmntmNewCheckItem_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_12);
		chckbxmntmNewCheckItem_12.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_13.setState(false);
				checkBoxMenuItem.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				chckbxmntmNewCheckItem_17.setState(false);
				getRoomByflo(1, df);
			}
		});

		chckbxmntmNewCheckItem_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_13);
		chckbxmntmNewCheckItem_13.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				checkBoxMenuItem.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				chckbxmntmNewCheckItem_17.setState(false);
				getRoomByflo(2, df);
			}
		});

		checkBoxMenuItem.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(checkBoxMenuItem);
		checkBoxMenuItem.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				chckbxmntmNewCheckItem_17.setState(false);
				getRoomByflo(3, df);
			}
		});

		checkBoxMenuItem_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(checkBoxMenuItem_1);
		checkBoxMenuItem_1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				checkBoxMenuItem.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				chckbxmntmNewCheckItem_17.setState(false);
				getRoomByflo(4, df);
			}
		});

		chckbxmntmNewCheckItem_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_14);
		chckbxmntmNewCheckItem_14.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				checkBoxMenuItem.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem_17.setState(false);
				getRoomByflo(5, df);
			}
		});

		chckbxmntmNewCheckItem_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_17);// 所有楼栋
		chckbxmntmNewCheckItem_17.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_12.setState(false);
				chckbxmntmNewCheckItem_13.setState(false);
				checkBoxMenuItem.setState(false);
				checkBoxMenuItem_1.setState(false);
				chckbxmntmNewCheckItem_14.setState(false);
				getRoomByflo(0, df);
			}
		});

		mnNewMenu_3.setForeground(Color.MAGENTA);
		mnNewMenu_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_3);

		chckbxmntmNewCheckItem_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_15);
		chckbxmntmNewCheckItem_15.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				checkBoxMenuItem_2.setState(false);
				checkBoxMenuItem_3.setState(false);
				chckbxmntmNewCheckItem_18.setState(false);

				getRoomByMon(200, df);
			}
		});

		checkBoxMenuItem_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_2);
		checkBoxMenuItem_2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_15.setState(false);
				checkBoxMenuItem_3.setState(false);
				chckbxmntmNewCheckItem_18.setState(false);

				getRoomByMon(300, df);
			}
		});

		checkBoxMenuItem_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_3);
		checkBoxMenuItem_3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_15.setState(false);
				checkBoxMenuItem_2.setState(false);
				chckbxmntmNewCheckItem_18.setState(false);
				getRoomByMon(500, df);
			}
		});

		chckbxmntmNewCheckItem_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_18);
		chckbxmntmNewCheckItem_18.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				chckbxmntmNewCheckItem_15.setState(false);
				checkBoxMenuItem_2.setState(false);
				checkBoxMenuItem_3.setState(false);
				getRoomByMon(0, df);
			}
		});

//		JScrollBar scrollBar = new JScrollBar();
//		scrollBar.setBounds(1170, 49, 20, 407);
//		panel.add(scrollBar);
		JScrollPane scrollBar_1 = new JScrollPane(table);
		scrollBar_1.setBounds(0, 41, 1197, 418);
		room_table.add(scrollBar_1);

		JButton button = new JButton("\u70B9\u51FB\u66F4\u65B0");
		button.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button.setBounds(144, 505, 200, 50);
		// room_table.add(button);

		JButton button_1 = new JButton("删除宿舍");
		button_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_1.setBounds(250, 505, 200, 50);
		room_table.add(button_1);
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int count = table.getSelectedRow();
				String getname = table.getValueAt(count, 0).toString();
				if (getname.isEmpty()) {
					JOptionPane.showMessageDialog(null, "请选择宿舍号", "未选择任何项目", JOptionPane.ERROR_MESSAGE);
				} else {
					java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
					Room room = new Room();
					for (int i = 0; i < ALLRoom.size(); i++) {
						if (ALLRoom.get(i).getNumber().equals(getname)) {
							room = ALLRoom.get(i);
						}
					}
					if (roomInstance.deleteRoom(room)) {
						JOptionPane.showMessageDialog(null, "房间" + getname, "已删除", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "无法删除", "无法删除", JOptionPane.ERROR_MESSAGE);

					}
				}
			}
		});

		JButton button_2 = new JButton("添加宿舍");
		button_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_2.setBounds(750, 505, 200, 50);
		room_table.add(button_2);
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				NewRom newRom = new NewRom();
				newRom.setVisible(true);
			}
		});

		java.util.List<Application> ALLApp = appInstance.getAllApplications();
		int hang2 = ALLApp.size();
		String[][] app = new String[hang2][7];
		int j2 = 0;
		for (int i = 0; i < hang2; i++) {

			app[j2][0] = ALLApp.get(i).getANo();
			if (ALLApp.get(i).getAType() == 1) {
				app[j2][1] = "入住";
			} else if (ALLApp.get(i).getAType() == 2) {
				app[j2][1] = "退宿";
			} else {
				app[j2][1] = "更换";
			}

			app[j2][2] = ALLApp.get(i).getAATime();
			app[j2][3] = String.valueOf(ALLApp.get(i).getARTime());
			if (ALLApp.get(i).getASPay() == ALLApp.get(i).getAAPay()) {
				app[j2][4] = "已付款";
			} else {
				app[j2][4] = "未付款";
			}
			app[j2][5] = ALLApp.get(i).getANRNo();
			app[j2][6] = ALLApp.get(i).getASNo();

			j2++;
		}

		DefaultTableModel df2 = new DefaultTableModel();
		df2.setDataVector(app, appColumnStrings);
		JTable table2 = new JTable(df2);
		JTableHeader tab_header2 = table2.getTableHeader(); // 获取表头
		tab_header2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		tab_header2.setPreferredSize(new Dimension(tab_header2.getWidth(), 50)); // 修改表头的高度
		table2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		table2.setRowHeight(41);

		table2.setBounds(0, 49, 1170, 407);
		panel_1.add(table2);

		panel_1.setBackground(Color.CYAN);
		panel_1.setLayout(null);
		tabbedPane.addTab("申请表", null, panel_1, null);

//		table_2 = new JTable();
//		table_2.setBounds(0, 49, 1170, 407);
//		panel_1.add(table_2);

//		JScrollBar scrollBar_2 = new JScrollBar();
//		scrollBar_2.setBounds(1170, 49, 21, 407);
//		panel_1.add(scrollBar_2);
		JScrollPane scrollBar1 = new JScrollPane(table2);
		scrollBar1.setBounds(0, 41, 1200, 418);
		panel_1.add(scrollBar1);

		ButtonGroup group = new ButtonGroup();

		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_1.setBounds(38, 501, 560, 50);

		panel_1.add(label_1);

		textField = new JTextField();
		textField.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField.setBounds(655, 509, 238, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		btnD.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		btnD.setBounds(908, 501, 215, 50);
		panel_1.add(btnD);
		
		JLabel label_5 = new JLabel("\u7533\u8BF7\u8868\u60C5\u51B5");
		label_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_5.setBounds(0, 0, 224, 50);
		panel_1.add(label_5);
		btnD.addActionListener(new ActionListener() {
////申请
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String aString = textField.getText();
				String cString = "00000";// 名称匹配
				java.util.List<Student> students = studentInstance.getStudentsInfo();
				for (int i = 0; i < students.size(); i++) {
					if (students.get(i).getName().equals(aString)) {
						cString = students.get(i).getNubmer();
						break;
					}
				}
				String bString;// 类型匹配
				java.util.List<Application> ALLApp = appInstance.getAllApplications();
				int hang2 = ALLApp.size();
				String[][] app = new String[hang2][7];
				int j2 = 0;
				boolean fla = false;
				for (int i = 0; i < ALLApp.size(); i++) {
					if (cString.equals(ALLApp.get(i).getASNo())) {// 姓名匹配
						app[j2][0] = ALLApp.get(i).getANo();
						if (ALLApp.get(i).getAType() == 1) {
							app[j2][1] = "入住";
						} else if (ALLApp.get(i).getAType() == 2) {
							app[j2][1] = "退宿";
						} else {
							app[j2][1] = "更换";
						}
						app[j2][2] = ALLApp.get(i).getAATime();
						app[j2][3] = String.valueOf(ALLApp.get(i).getARTime());
						if (ALLApp.get(i).getASPay() == ALLApp.get(i).getAAPay()) {
							app[j2][4] = "已付款";
						} else {
							app[j2][4] = "未付款";
						}
						app[j2][5] = ALLApp.get(i).getANRNo();
						app[j2][6] = ALLApp.get(i).getASNo();
						fla = true;
					} else {// 入住类型匹配
						if (ALLApp.get(i).getAType() == 1) {
							bString = "入住";
						} else if (ALLApp.get(i).getAType() == 2) {
							bString = "退宿";
						} else {
							bString = "更换";
						}
						if (aString.equals(bString)) {
							app[j2][0] = ALLApp.get(i).getANo();
							app[j2][1] = aString;
							app[j2][2] = ALLApp.get(i).getAATime();
							app[j2][3] = String.valueOf(ALLApp.get(i).getARTime());
							if (ALLApp.get(i).getASPay() == ALLApp.get(i).getAAPay()) {
								app[j2][4] = "已付款";
							} else {
								app[j2][4] = "未付款";
							}
							app[j2][5] = ALLApp.get(i).getANRNo();
							app[j2][6] = ALLApp.get(i).getASNo();
							fla = true;
						}
					}
					if (app[j2][0]==null) {
						fla=false;
					}
					if (fla) {
						j2++;
					}
				}
				df2.setDataVector(app, appColumnStrings);
			}
		});

		/**************************************************************************/

		java.util.List<Pact> aLLPct = pactInstance.getAllPacts();
		int hang3 = aLLPct.size();
		String[][] pct = new String[hang3][6];
		int n = 0;
		for (int i = 0; i < hang3; i++) {

			pct[n][0] = aLLPct.get(i).getPNo();
			pct[n][1] = aLLPct.get(i).getPSTime();
			pct[n][2] = String.valueOf(aLLPct.get(i).getPTime());
			pct[n][3] = String.valueOf(aLLPct.get(i).getPRNo());
			pct[n][4] = aLLPct.get(i).getPSNo();
			pct[n][5] = String.valueOf(aLLPct.get(i).getPMoney());

			n++;
		}

		DefaultTableModel df3 = new DefaultTableModel();
		df3.setDataVector(pct, pacStrings);
		JTable table3 = new JTable(df3);
		JTableHeader tab_header3 = table3.getTableHeader(); // 获取表头
		tab_header3.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		tab_header3.setPreferredSize(new Dimension(tab_header3.getWidth(), 50)); // 修改表头的高度
		table3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		table3.setRowHeight(41);

		panel_2.setBackground(Color.CYAN);
		panel_2.setLayout(null);
		tabbedPane.addTab("合同", null, panel_2, null);
		label_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_15.setBounds(5, 0, 160, 50);
		panel_2.add(label_15);

		panel_2.add(label_15);
		panel_2.add(table3);

		JScrollPane scrollBar2 = new JScrollPane(table3);
		scrollBar2.setBounds(0, 41, 1197, 418);
		panel_2.add(scrollBar2);

		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_2.setBounds(43, 501, 363, 50);

		panel_2.add(label_2);
		textField_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_1.setColumns(10);
		textField_1.setBounds(433, 509, 257, 34);

		panel_2.add(textField_1);
		button_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_3.setBounds(757, 501, 215, 50);
		panel_2.add(button_3);
		button_3.addActionListener(new ActionListener() {
///合同
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String aString = textField_1.getText();
				java.util.List<Pact> aLLPct = pactInstance.getAllPacts();
				String cString = null;
				java.util.List<Student> students = studentInstance.getStudentsInfo();
				for (int i = 0; i < students.size(); i++) {
					if (students.get(i).getName().equals(aString)) {
						cString = students.get(i).getNubmer();
					}
				}

				int hang3 = aLLPct.size();
				String[][] pct = new String[hang3][6];
				int n = 0;
				boolean fla = false;
				for (int i = 0; i < aLLPct.size(); i++) {
					if (cString.equals(aLLPct.get(i).getPSNo())) {// 姓名
						pct[n][0] = aLLPct.get(i).getPNo();
						pct[n][1] = aLLPct.get(i).getPSTime();
						pct[n][2] = String.valueOf(aLLPct.get(i).getPTime());
						pct[n][3] = String.valueOf(aLLPct.get(i).getPRNo());
						pct[n][4] = aLLPct.get(i).getPSNo();
						pct[n][5] = String.valueOf(aLLPct.get(i).getPMoney());
						fla = true;
					}
					if (fla) {
						n++;
					}
				}

				for (int i = 0; i < n; i++) {
					String aStr = pct[i][0];
					String vStr = null;
					if (aStr == vStr) {
						for (int k = 0; k < 6; k++) {
							// System.out.print(pct[i][k]);
							// pct[i][k] = pct[i + 1][k];
						}
						// System.out.println();
					}
				}

				df3.setDataVector(pct, pacStrings);
			}
		});

		/********************************************************************/
		java.util.List<Student> aLLStu = studentInstance.getStudentsInfo();
		int hang4 = aLLStu.size();
		String[][] stu = new String[hang4][6];
		int n1 = 0;
		for (int i = 0; i < hang4; i++) {

			stu[n1][0] = aLLStu.get(i).getNubmer();
			stu[n1][1] = aLLStu.get(i).getName();
			if (aLLStu.get(i).getSex() == 1) {
				stu[n1][2] = "男";
			} else {
				stu[n1][2] = "女";
			}
			stu[n1][3] = aLLStu.get(i).getDepartment();
			stu[n1][4] = String.valueOf(aLLStu.get(i).getAge());
			stu[n1][5] = aLLStu.get(i).getSroom();
			// stu[n1][6] = aLLStu.get(i).getASNo();
			n1++;
		}

		DefaultTableModel df4 = new DefaultTableModel();
		df4.setDataVector(stu, stuStrings);
		JTable table4 = new JTable(df4);
		JTableHeader tab_header4 = table4.getTableHeader(); // 获取表头
		tab_header4.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		tab_header4.setPreferredSize(new Dimension(tab_header4.getWidth(), 50)); // 修改表头的高度
		table4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		table4.setRowHeight(41);

		panel_3.setBackground(Color.CYAN);
		panel_3.setToolTipText("");
		panel_3.setLayout(null);
		tabbedPane.addTab("学生信息", null, panel_3, null);
		table_3.setBounds(0, 50, 1171, 407);

		panel_3.add(table4);
//		scrollBar_3.setBounds(1172, 50, 21, 407);
//
//		panel_3.add(scrollBar_3);

		JScrollPane scrollBar3 = new JScrollPane(table4);
		scrollBar3.setBounds(0, 41, 1197, 418);
		panel_3.add(scrollBar3);

		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_3.setBounds(0, 0, 160, 50);

		panel_3.add(label_3);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_4.setBounds(53, 502, 472, 50);

		panel_3.add(label_4);
		textField_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_2.setColumns(10);
		textField_2.setBounds(463, 510, 257, 34);

		panel_3.add(textField_2);
		button_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_4.setBounds(771, 502, 215, 50);

		panel_3.add(button_4);
		button_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String aString = textField_2.getText();
				java.util.List<Student> aLLStu = studentInstance.getStudentsInfo();
				int hang4 = aLLStu.size();

				String[][] stu = new String[hang4][6];
				int n1 = 0;
				for (int i = 0; i < aLLStu.size(); i++) {
					if (aString.equals(aLLStu.get(i).getNubmer())) {
						// hang4++;
						stu[n1][0] = aLLStu.get(i).getNubmer();
						stu[n1][1] = aLLStu.get(i).getName();
						if (aLLStu.get(i).getSex() == 1) {
							stu[n1][2] = "男";
						} else {
							stu[n1][2] = "女";
						}
						stu[n1][3] = aLLStu.get(i).getDepartment();
						stu[n1][4] = String.valueOf(aLLStu.get(i).getAge());
						stu[n1][5] = aLLStu.get(i).getSroom();
					} else if (aString.equals(aLLStu.get(i).getName())) {

						stu[n1][0] = aLLStu.get(i).getNubmer();
						stu[n1][1] = aLLStu.get(i).getName();
						if (aLLStu.get(i).getSex() == 1) {
							stu[n1][2] = "男";
						} else {
							stu[n1][2] = "女";
						}
						stu[n1][3] = aLLStu.get(i).getDepartment();
						stu[n1][4] = String.valueOf(aLLStu.get(i).getAge());
						stu[n1][5] = aLLStu.get(i).getSroom();
					} else if (aString.equals(aLLStu.get(i).getDepartment())) {
						// hang4++;
						stu[n1][0] = aLLStu.get(i).getNubmer();
						stu[n1][1] = aLLStu.get(i).getName();
						if (aLLStu.get(i).getSex() == 1) {
							stu[n1][2] = "男";
						} else {
							stu[n1][2] = "女";
						}
						stu[n1][3] = aLLStu.get(i).getDepartment();
						stu[n1][4] = String.valueOf(aLLStu.get(i).getAge());
						stu[n1][5] = aLLStu.get(i).getSroom();
					}

				}

				df4.setDataVector(stu, stuStrings);

			}
		});
	}

	public void getRoomByfre(int a, DefaultTableModel df) {
		java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
		int aaa = ALLRoom.size();
		String[][] room = new String[aaa][6];
		int j = 0;
		boolean fal = false;
		for (int i = 0; i < ALLRoom.size(); i++) {
			if (a == 0) {
				if (ALLRoom.get(i).getStatus() == a) {

					room[j][5] = "未使用";
					room[j][0] = ALLRoom.get(i).getNumber();
					room[j][1] = ALLRoom.get(i).getType();
					room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
					room[j][3] = ALLRoom.get(i).getDepartment();
					room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
					fal = true;
				} else {
					fal = false;
				}
				if (fal) {
					j++;
				}
			} else {
				room[j][0] = ALLRoom.get(i).getNumber();
				room[j][1] = ALLRoom.get(i).getType();
				room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
				room[j][3] = ALLRoom.get(i).getDepartment();
				room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
				if (ALLRoom.get(i).getStatus() == 0) {
					room[j][5] = "未使用";
				} else {
					room[j][5] = "已使用";
				}
				j++;
			}

		}
		df.setDataVector(room, columnNames);
	}

	public void getRoomByCla(String st, DefaultTableModel df) {
		java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
		int aaa = ALLRoom.size();
		String[][] room = new String[aaa][6];
		int j = 0;
		if (st.equals("所有")) {
			for (int i = 0; i < ALLRoom.size(); i++) {
				room[j][0] = ALLRoom.get(i).getNumber();
				room[j][1] = ALLRoom.get(i).getType();
				room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
				room[j][3] = ALLRoom.get(i).getDepartment();
				room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
				if (ALLRoom.get(i).getStatus() == 1) {
					room[j][5] = "已使用";
				} else {
					room[j][5] = "未使用";
				}
				j++;
			}

		} else {
			for (int i = 0; i < ALLRoom.size(); i++) {
				if (ALLRoom.get(i).getDepartment().equals(st)) {
					room[j][0] = ALLRoom.get(i).getNumber();
					room[j][1] = ALLRoom.get(i).getType();
					room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
					room[j][3] = ALLRoom.get(i).getDepartment();
					room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
					if (ALLRoom.get(i).getStatus() == 1) {
						room[j][5] = "已使用";
					} else {
						room[j][5] = "未使用";
					}
					j++;
				}
			}
		}

		df.setDataVector(room, columnNames);
	}

	public void getRoomByflo(int a, DefaultTableModel df) {
		java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
		int aaa = ALLRoom.size();
		String[][] room = new String[aaa][6];
		int j = 0;
		if (a == 0) {
			for (int i = 0; i < ALLRoom.size(); i++) {

				room[j][0] = ALLRoom.get(i).getNumber();
				room[j][1] = ALLRoom.get(i).getType();
				room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
				room[j][3] = ALLRoom.get(i).getDepartment();
				room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
				if (ALLRoom.get(i).getStatus() == 1) {
					room[j][5] = "已使用";
				} else {
					room[j][5] = "未使用";
				}
				j++;
			}
		} else {
			for (int i = 0; i < ALLRoom.size(); i++) {
				if (ALLRoom.get(i).getFloor() == a) {
					room[j][4] = Integer.toString(a);
					room[j][0] = ALLRoom.get(i).getNumber();
					room[j][1] = ALLRoom.get(i).getType();
					room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
					room[j][3] = ALLRoom.get(i).getDepartment();
					if (ALLRoom.get(i).getStatus() == 1) {
						room[j][5] = "已使用";
					} else {
						room[j][5] = "未使用";
					}
					j++;
				}
			}
		}
		df.setDataVector(room, columnNames);
	}

	public void getRoomByMon(int a, DefaultTableModel df) {

		java.util.List<Room> ALLRoom = roomInstance.getAllRooms();
		int aaa = ALLRoom.size();
		String[][] room = new String[aaa][6];
		int j = 0;
		if (a == 0) {
			for (int i = 0; i < ALLRoom.size(); i++) {

				room[j][0] = ALLRoom.get(i).getNumber();
				room[j][1] = ALLRoom.get(i).getType();
				room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
				room[j][3] = ALLRoom.get(i).getDepartment();
				room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
				if (ALLRoom.get(i).getStatus() == 1) {
					room[j][5] = "已使用";
				} else {
					room[j][5] = "未使用";
				}
				j++;
			}
		} else {
			for (int i = 0; i < ALLRoom.size(); i++) {
				if (ALLRoom.get(i).getMoney() == a) {
					room[j][4] = Integer.toString(a);
					room[j][0] = ALLRoom.get(i).getNumber();
					room[j][1] = ALLRoom.get(i).getType();
					room[j][2] = Float.toString(ALLRoom.get(i).getMoney());
					room[j][3] = ALLRoom.get(i).getDepartment();
					room[j][4] = Integer.toString(ALLRoom.get(i).getFloor());
					if (ALLRoom.get(i).getStatus() == 1) {
						room[j][5] = "已使用";
					} else {
						room[j][5] = "未使用";
					}
					j++;
				}
			}
		}
		df.setDataVector(room, columnNames);

	}

	public void getApp() {
		java.util.List<Application> ALLApp = appInstance.getAllApplications();
		int hang = ALLApp.size();
		String[][] app = new String[hang][6];
		int j = 0;
		for (int i = 0; i < hang; i++) {

			app[j][0] = ALLApp.get(i).getANo();
			app[j][1] = ALLApp.get(i).getAATime();
			app[j][2] = String.valueOf(ALLApp.get(i).getARTime());
			if (ALLApp.get(i).getASPay() == ALLApp.get(i).getAAPay()) {
				app[j][3] = "已付款";
			} else {
				app[j][3] = "未付款";
			}
			app[j][4] = ALLApp.get(i).getANRNo();
			app[j][5] = ALLApp.get(i).getASNo();

			j++;
		}
	}
}
