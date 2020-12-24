package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends BaseGUI {
	private JTextField text_account = new JTextField();// 账号框
	private JTextField text_password = new JPasswordField();// 密码框
	JLabel label = new JLabel(
			"\u6B22\u8FCE\u4F7F\u7528\u6B66\u6C49\u7406\u5DE5\u5B66\u751F\u4F4F\u5BBF\u7BA1\u7406\u7CFB\u7EDF");// 欢迎标语
	JLabel lblNewLabel = new JLabel("\u8D26\u53F7");// 账号
	JLabel label_1 = new JLabel("\u5BC6\u7801");// 密码
	JButton button_login = new JButton("\u767B\u5F55");
	JButton button_register = new JButton("\u6CE8\u518C");
	
	/**
	 * 创建界面
	 */
	public Login() {
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(291, 74, 640, 39);
		bgp.add(label);

		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		lblNewLabel.setBounds(471, 218, 60, 30);
		bgp.add(lblNewLabel);

		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		label_1.setBounds(471, 258, 60, 30);
		bgp.add(label_1);

		text_account.setFont(new Font("宋体", Font.PLAIN, 25));
		text_account.setBounds(541, 218, 200, 30);
		bgp.add(text_account);
		text_account.setColumns(10);

		text_password.setFont(new Font("宋体", Font.PLAIN, 25));
		text_password.setBounds(541, 258, 200, 30);
		bgp.add(text_password);
		text_password.setColumns(10);
		button_login.setForeground(Color.WHITE);
		button_login.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 33));
		button_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//获得账号
				String No=text_account.getText();
				//获得密码
				String pwd=text_password.getText();
				//管理员登陆
				if(No.equals(dss.Object.Constants.admID)) {
					if(pwd.equals(dss.Object.Constants.admPW)) {
						Manager mng = new Manager();
						mng.setVisible(true);
						DisPose();
					}
					else {
						JOptionPane.showMessageDialog(null, "管理员密码错误！");
					}
				}
				else {
					//学生登陆验证
					dss.Object.Student student = studentInstance.studentLogin(No, pwd);
					if(student == null) {
						JOptionPane.showMessageDialog(null,  "请重新输入账号和密码", "账号密码不匹配",JOptionPane.ERROR_MESSAGE);
						text_account.setText("");
						text_password.setText("");
					}
					else {
				
						currentStudent = student;
						StudentGUI std=new StudentGUI(currentStudent);
						std.setVisible(true);
						DisPose();
					}
				}
			}
		});
		

		button_login.setBounds(501, 310, 100, 34);
		button_login.setContentAreaFilled(false);//设置按钮透明
		bgp.add(button_login);
	
		
		button_register.setBounds(611, 310, 100, 34);
		button_register.setContentAreaFilled(false);//设置按钮透明
		button_register.setForeground(Color.WHITE);
		button_register.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 33));
		button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Register register=new Register();
			register.setVisible(true);
			}
		});
		bgp.add(button_register);

	}

	/**
	 * 
	 * @param args
	 */

}