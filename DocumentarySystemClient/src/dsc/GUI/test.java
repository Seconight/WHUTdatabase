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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setOpaque(false);
		tabbedPane.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		tabbedPane.setBounds(0, 92, 1202, 651);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("入住", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("退租", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("更换房间", null, panel_2, null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u5458\u8D26\u53F7\uFF1A");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(35, 26, 240, 46);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("88888888");
		lblNewLabel.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel.setBounds(275, 26, 168, 46);
		contentPane.add(lblNewLabel);
		
	}
}
