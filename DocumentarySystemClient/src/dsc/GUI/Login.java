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

		button_login.setBounds(501, 310, 100, 34);
		button_login.setContentAreaFilled(false);//设置按钮透明
		bgp.add(button_login);
		button_register.setForeground(Color.WHITE);
		button_register.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 33));
		
		
		button_register.setBounds(611, 310, 100, 34);
		button_register.setContentAreaFilled(false);//设置按钮透明
		bgp.add(button_register);

	}

	/**
	 * @author 15758 
	 * 登陆事件
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean flag = false;// 用来标志用户是否正确
		try {
			if ((JButton) e.getSource() == button_login) {

				for (;;) {// 遍历所有用户信息，以此来判断输入的信息是否正确

					if (true) {
						if (flag) {// 如果时学生

						} else {// 如果时宿管

						}
						flag = true;
						break;// 如果信息正确就退出遍历，提高效率
					}
				}
				if (!flag) {// 信息不正确，重新输入

				} else {
					// 当输入的信息正确时，就开始加载选项卡界面，并把选项卡界面加入到卡片布局器中
					//new SystemGui();
				}
			}
		} catch (Exception e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "发生异常", "警告",JOptionPane.WARNING_MESSAGE);
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

//窗口拖拽移动实现
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