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

public class Login extends BaseGUI implements ActionListener {
	private JTextField text_account = new JTextField();// �˺ſ�
	private JTextField text_password = new JPasswordField();// �����
	JLabel label = new JLabel(
			"\u6B22\u8FCE\u4F7F\u7528\u6B66\u6C49\u7406\u5DE5\u5B66\u751F\u4F4F\u5BBF\u7BA1\u7406\u7CFB\u7EDF");// ��ӭ����
	JLabel lblNewLabel = new JLabel("\u8D26\u53F7");// �˺�
	JLabel label_1 = new JLabel("\u5BC6\u7801");// ����
	JButton button_login = new JButton("\u767B\u5F55");
	JButton button_register = new JButton("\u6CE8\u518C");
	
	/**
	 * ��������
	 */
	public Login() {

		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		label.setBounds(291, 74, 640, 39);
		bgp.add(label);

		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("��������_CNKI", Font.PLAIN, 30));
		lblNewLabel.setBounds(471, 218, 60, 30);
		bgp.add(lblNewLabel);

		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("��������_CNKI", Font.PLAIN, 30));
		label_1.setBounds(471, 258, 60, 30);
		bgp.add(label_1);

		text_account.setFont(new Font("����", Font.PLAIN, 25));
		text_account.setBounds(541, 218, 200, 30);
		bgp.add(text_account);
		text_account.setColumns(10);

		text_password.setFont(new Font("����", Font.PLAIN, 25));
		text_password.setBounds(541, 258, 200, 30);
		bgp.add(text_password);
		text_password.setColumns(10);
		button_login.setForeground(Color.WHITE);
		button_login.setFont(new Font("��������_CNKI", Font.PLAIN, 33));

		button_login.setBounds(501, 310, 100, 34);
		button_login.setContentAreaFilled(false);//���ð�ť͸��
		bgp.add(button_login);
		button_register.setForeground(Color.WHITE);
		button_register.setFont(new Font("��������_CNKI", Font.PLAIN, 33));
		
		
		button_register.setBounds(611, 310, 100, 34);
		button_register.setContentAreaFilled(false);//���ð�ť͸��
		bgp.add(button_register);

	}

	/**
	 * @author 15758 
	 * ��½�¼�
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean flag = false;// ������־�û��Ƿ���ȷ
		try {
			if ((JButton) e.getSource() == button_login) {

				for (;;) {// ���������û���Ϣ���Դ����ж��������Ϣ�Ƿ���ȷ

					if (true) {
						if (flag) {// ���ʱѧ��

						} else {// ���ʱ�޹�

						}
						flag = true;
						break;// �����Ϣ��ȷ���˳����������Ч��
					}
				}
				if (!flag) {// ��Ϣ����ȷ����������

				} else {
					// ���������Ϣ��ȷʱ���Ϳ�ʼ����ѡ����棬����ѡ�������뵽��Ƭ��������
					//new SystemGui();
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "�����쳣", "����",JOptionPane.WARNING_MESSAGE);
			new Login();
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//������ק�ƶ�ʵ��
//	private void setDragable() {
//		this.addMouseListener(new java.awt.event.MouseAdapter() {
//			public void mouseReleased(java.awt.event.MouseEvent e) {
//				isDragged = false;
//				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//			}
//
//			public void mousePressed(java.awt.event.MouseEvent e) {
//				tmp = new Point(e.getX(), e.getY());
//				isDragged = true;
//				setCursor(new Cursor(Cursor.MOVE_CURSOR));
//			}
//		});
//		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
//			public void mouseDragged(java.awt.event.MouseEvent e) {
//				if (isDragged) {
//					loc = new Point(getLocation().x + e.getX() - tmp.x, getLocation().y + e.getY() - tmp.y);
//					setLocation(loc);
//				}
//			}
//		});
//	}
//}
//
//	class BGPanel extends JPanel {
//	Image im;
//
//	public BGPanel(Image im) {
//		this.im = im;
//		this.setOpaque(true);
//	}
//
//	// Draw the back ground.
//	public void paintComponent(Graphics g) {
//		super.paintComponents(g);
//		g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);
//
//	}
}