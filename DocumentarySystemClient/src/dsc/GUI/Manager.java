package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager extends BaseGUI {
	JLabel label = new JLabel("\u7BA1\u7406\u5458\u8D26\u53F7\uFF1A");//管理员账号
	JLabel lblNewLabel1 = new JLabel("88888888");//
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel panel = new JPanel();//宿舍选项卡
	JPanel panel_1 = new JPanel();//申请表选项卡
	JPanel panel_2 = new JPanel(); //合同选项卡
	JLabel label_10 = new JLabel("\u5BBF\u820D\u60C5\u51B5");//房间选择
	JMenuBar menuBar = new JMenuBar();
	JMenu mnNewMenu = new JMenu("\u9662\u7CFB\u9009\u62E9");//院系选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("\u7ECF\u6D4E");//经济
	JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("\u7BA1\u7406");//管理
	JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("\u80FD\u52A8");//能动
	JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("\u822A\u6D77");//航海
	JCheckBoxMenuItem chckbxmntmNewCheckItem_4 = new JCheckBoxMenuItem("\u673A\u8BBE");//机设
	JCheckBoxMenuItem chckbxmntmNewCheckItem_5 = new JCheckBoxMenuItem("\u5916\u56FD\u8BED");//外国语
	JCheckBoxMenuItem chckbxmntmNewCheckItem_6 = new JCheckBoxMenuItem("\u9A6C\u514B\u601D\u4E3B\u4E49");//马克思主义
	JCheckBoxMenuItem chckbxmntmNewCheckItem_7 = new JCheckBoxMenuItem("\u8BA1\u7B97\u673A\u79D1\u5B66\u4E0E\u6280\u672F");//计算机科学与技术
	JCheckBoxMenuItem chckbxmntmNewCheckItem_8 = new JCheckBoxMenuItem("\u5316\u751F");//化生
	JCheckBoxMenuItem chckbxmntmNewCheckItem_9 = new JCheckBoxMenuItem("\u7269\u6D41");//物流
	JMenu mnNewMenu_1 = new JMenu("\u7A7A\u4F59\u623F\u95F4");//空余房间选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem_10 = new JCheckBoxMenuItem("\u7A7A\u4F59\u623F\u95F4");//空余房间
	JCheckBoxMenuItem chckbxmntmNewCheckItem_11 = new JCheckBoxMenuItem("\u6240\u6709\u623F\u95F4");//所有房间
	JMenu mnNewMenu_2 = new JMenu("\u697C\u680B\u9009\u62E9");//楼栋选择
	JCheckBoxMenuItem chckbxmntmNewCheckItem_12 = new JCheckBoxMenuItem("1\u680B");//1栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_13 = new JCheckBoxMenuItem("2\u680B");//2栋
	JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("3\u680B");//3栋
	JCheckBoxMenuItem checkBoxMenuItem_1 = new JCheckBoxMenuItem("4\u680B");//4栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_14 = new JCheckBoxMenuItem("5\u680B");//5栋
	JMenu mnNewMenu_3 = new JMenu("\u6708\u79DF\u91D1");//月租金
	JCheckBoxMenuItem chckbxmntmNewCheckItem_15 = new JCheckBoxMenuItem("200\u5143/\u6708");//200/月
	JCheckBoxMenuItem checkBoxMenuItem_2 = new JCheckBoxMenuItem("300\u5143/\u6708");//300/月
	JCheckBoxMenuItem checkBoxMenuItem_3 = new JCheckBoxMenuItem("400\u5143/\u6708");//400/月
	JTable table=new JTable();//房间信息表;//开始时间;//结束时间
	JCheckBoxMenuItem chckbxmntmNewCheckItem_16 = new JCheckBoxMenuItem("\u6240\u6709\u9662\u7CFB");//所有院系
	JCheckBoxMenuItem chckbxmntmNewCheckItem_17 = new JCheckBoxMenuItem("\u6240\u6709\u697C\u680B");//所有楼栋
	JCheckBoxMenuItem chckbxmntmNewCheckItem_18 = new JCheckBoxMenuItem("\u6240\u6709\u6708\u79DF");//所有月租
	JLabel label_15 = new JLabel("\u5408\u540C\u4FE1\u606F");//更换房间的房间选择
	JTable table_1 = new JTable();
	JScrollBar scrollBar_1 = new JScrollBar();//更换界面
	private final JPanel panel_3 = new JPanel();
	private JTable table_2;
	private final JLabel label_1 = new JLabel("\u8F93\u5165\u5173\u952E\u5B57\u67E5\u8BE2");
	private JTextField textField;
	private final JButton btnD = new JButton("\u70B9\u51FB\u67E5\u8BE2");
	private final JLabel label_2 = new JLabel("\u8F93\u5165\u5173\u952E\u5B57\u67E5\u8BE2");
	private final JTextField textField_1 = new JTextField();
	private final JButton button_3 = new JButton("\u70B9\u51FB\u67E5\u8BE2");
	private final JTable table_3 = new JTable();
	private final JScrollBar scrollBar_3 = new JScrollBar();
	private final JLabel label_3 = new JLabel("\u5B66\u751F\u4FE1\u606F");
	private final JLabel label_4 = new JLabel("\u8F93\u5165\u5173\u952E\u5B57\u67E5\u8BE2");
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

	/**
	 * Create the frame.
	 */
	public Manager() {
	

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
		panel.setBackground(Color.CYAN);
		
		panel.setLayout(null);
		tabbedPane.addTab("宿舍", null, panel, null);
		

		table.setBounds(0, 49, 1170, 407);
		panel.add(table);
		

		label_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_10.setBounds(5, 0, 160, 50);
		panel.add(label_10);
		

		menuBar.setOpaque(false);
		menuBar.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.setBounds(540, 0, 650, 50);
		panel.add(menuBar);
		

		mnNewMenu.setForeground(Color.MAGENTA);
		mnNewMenu.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu);
		

		chckbxmntmNewCheckItem.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem);
		

		chckbxmntmNewCheckItem_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_1);
		

		chckbxmntmNewCheckItem_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_2);
		

		chckbxmntmNewCheckItem_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_3);
		

		chckbxmntmNewCheckItem_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_4);
		

		chckbxmntmNewCheckItem_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_5);
		

		chckbxmntmNewCheckItem_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_6);
		

		chckbxmntmNewCheckItem_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_7);
		

		chckbxmntmNewCheckItem_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_8);
		

		chckbxmntmNewCheckItem_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu.add(chckbxmntmNewCheckItem_9);
		chckbxmntmNewCheckItem_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu.add(chckbxmntmNewCheckItem_16);
		

		mnNewMenu_1.setForeground(Color.MAGENTA);
		mnNewMenu_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_1);
		

		chckbxmntmNewCheckItem_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_10);
		

		chckbxmntmNewCheckItem_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_11);
		

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
		chckbxmntmNewCheckItem_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_2.add(chckbxmntmNewCheckItem_17);
		

		mnNewMenu_3.setForeground(Color.MAGENTA);
		mnNewMenu_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		menuBar.add(mnNewMenu_3);
		

		chckbxmntmNewCheckItem_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_15);
		

		checkBoxMenuItem_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_2);
		

		checkBoxMenuItem_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		mnNewMenu_3.add(checkBoxMenuItem_3);
		chckbxmntmNewCheckItem_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 35));
		
		mnNewMenu_3.add(chckbxmntmNewCheckItem_18);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1170, 49, 20, 407);
		panel.add(scrollBar);
		
		JButton button = new JButton("\u70B9\u51FB\u66F4\u65B0");
		button.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button.setBounds(144, 505, 200, 50);
		panel.add(button);
		
		JButton button_1 = new JButton("\u70B9\u51FB\u5220\u9664");
		button_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_1.setBounds(409, 505, 200, 50);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u70B9\u51FB\u65B0\u589E");
		button_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_2.setBounds(670, 505, 200, 50);
		panel.add(button_2);
		panel_1.setBackground(Color.CYAN);
		
		panel_1.setLayout(null);
		tabbedPane.addTab("申请表", null, panel_1, null);
		
		table_2 = new JTable();
		table_2.setBounds(0, 49, 1170, 407);
		panel_1.add(table_2);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(1170, 49, 21, 407);
		panel_1.add(scrollBar_2);
		
		JRadioButton radioButton = new JRadioButton("\u5165\u4F4F\u7533\u8BF7");
		radioButton.setOpaque(false);
		radioButton.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		radioButton.setBounds(10, 6, 189, 34);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u9000\u5BBF\u7533\u8BF7");
		radioButton_1.setOpaque(false);
		radioButton_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		radioButton_1.setBounds(205, 6, 189, 34);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u6362\u5BBF\u7533\u8BF7");
		radioButton_2.setOpaque(false);
		radioButton_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		radioButton_2.setBounds(400, 6, 189, 34);
		panel_1.add(radioButton_2);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_1.setBounds(38, 501, 280, 50);
		
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField.setBounds(332, 509, 257, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		btnD.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		btnD.setBounds(613, 501, 215, 50);
		
		panel_1.add(btnD);
		panel_2.setBackground(Color.CYAN);
		
		panel_2.setLayout(null);
		tabbedPane.addTab("合同", null, panel_2, null);
		label_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_15.setBounds(5, 0, 160, 50);
		panel_2.add(label_15);
		
		panel_2.add(label_15);
		table_1.setBounds(0, 49, 1170, 407);
		panel_2.add(table_1);
		scrollBar_1.setBounds(1170, 49, 21, 407);
		
		panel_2.add(scrollBar_1);
		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_2.setBounds(43, 501, 280, 50);
		
		panel_2.add(label_2);
		textField_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_1.setColumns(10);
		textField_1.setBounds(337, 509, 257, 34);
		
		panel_2.add(textField_1);
		button_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_3.setBounds(623, 501, 215, 50);
		
		panel_2.add(button_3);
		panel_3.setBackground(Color.CYAN);
		panel_3.setToolTipText("");
		panel_3.setLayout(null);
		tabbedPane.addTab("学生信息", null, panel_3, null);
		table_3.setBounds(0, 50, 1171, 407);
		
		panel_3.add(table_3);
		scrollBar_3.setBounds(1172, 50, 21, 407);
		
		panel_3.add(scrollBar_3);
		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_3.setBounds(0, 0, 160, 50);
		
		panel_3.add(label_3);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_4.setBounds(53, 502, 280, 50);
		
		panel_3.add(label_4);
		textField_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		textField_2.setColumns(10);
		textField_2.setBounds(347, 507, 257, 34);
		
		panel_3.add(textField_2);
		button_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button_4.setBounds(618, 498, 215, 50);
		
		panel_3.add(button_4);
		
		

	}
}
