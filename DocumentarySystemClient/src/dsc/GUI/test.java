package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;

public class test extends JFrame {

	private JPanel contentPane = new JPanel();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1202, 743);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(1132, 0, 30, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(1162, 0, 30, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("\u59D3\u540D\uFF1A");//姓名：
		label.setForeground(Color.WHITE);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(14, 13, 120, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7530\u5BB6\u5174");//田家兴
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_1.setBounds(133, 13, 120, 30);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5B66\u53F7\uFF1A");//学号：
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_2.setBounds(14, 56, 120, 30);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("0121810880214");//0121810880214
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_3.setBounds(133, 56, 243, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u9662\u7CFB\uFF1A");//院系：
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_4.setBounds(14, 99, 120, 30);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u8BA1\u7B97\u673A\u79D1\u5B66\u4E0E\u6280\u672F");//计算机科学与技术
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_5.setBounds(133, 99, 320, 30);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u623F\u95F4\u53F7\uFF1A");//房间号：
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_6.setBounds(587, 13, 160, 30);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u5230\u671F\u65F6\u95F4\uFF1A");//到期时间：
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_7.setBounds(547, 56, 200, 30);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u6D77\u56DB-702");//海四-702
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_8.setBounds(761, 13, 167, 30);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("2020\u5E7410\u670810\u65E5");//2020年10月10日
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label_9.setBounds(761, 56, 272, 30);
		contentPane.add(label_9);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setOpaque(false);
		tabbedPane.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		tabbedPane.setBounds(0, 135, 1202, 608);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("入住", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("退租", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("更换房间", null, panel_2, null);
		
	}
}
