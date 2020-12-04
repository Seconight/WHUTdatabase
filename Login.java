package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
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
import javax.swing.JTextField;
import dsc.GUI.SystemGui;
public class Login extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private BackgroundPanel bgp;
	private JButton button, button_2,button_entryButton;
	private JLabel label,lblNewLabel,label_1;
	
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;
	private JTextField text_Idword,text_Password;

	
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	

	/**
	 * Launch the application.
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

	
	/**
	 * 登陆事件响应
	 * @author 15758
	 * @return null
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  boolean flag=false;//用来标志用户是否正确

	        if ((JButton)e.getSource()== button_entryButton) {//如果是登陆事件
	            //获得所有用户信息
	        	new SystemGui();
	            for (;;) {//遍历所有用户信息，以此来判断输入的信息是否正确
	                
	                if (flag) {//判断身份
	                   //学生
	                    }else{
	                       //管理员
	                    }
	                    flag = true;
	                    break;//如果信息正确就退出遍历，提高效率
	                }
	            }
	            if(flag){//信息不正确，重新输入
	                
	            }else{
	                //当输入的信息正确时，就开始加载选项卡界面
	            	
	            }
	        }
	
	
	
	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDragable();
		
		setBounds((screensize.width - 1202) / 2, (screensize.height - 743) / 2, 1202, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		bgp = new BackgroundPanel((new ImageIcon("src/dsc/GUI/image/bg.jpg")).getImage());
		bgp.setLayout(null);
		contentPane.add(bgp);

		Icon icon1 = new ImageIcon("src/dsc/GUI/image/关闭.png");// 关闭图标
		Icon icon3 = new ImageIcon("src/dsc/GUI/image/最小化.png");// 最小化图标
		Icon icon4 = new ImageIcon("src/dsc/GUI/image/登录.png");// 登录图标
		label = new JLabel(
				"\u6B22\u8FCE\u4F7F\u7528\u6B66\u6C49\u7406\u5DE5\u5B66\u751F\u4F4F\u5BBF\u7BA1\u7406\u7CFB\u7EDF");// 欢迎标语

		button = new JButton("", icon1);
		button_2 = new JButton("", icon3);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);// 关闭
			}
		});
		button.setBounds(1162, 0, 30, 30);
		bgp.add(button);

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED); // 最小化
				button.setBounds(1162, 0, 30, 30);// 按钮回位
				button_2.setBounds(1102, 0, 30, 30);
			}
		});
		button_2.setBounds(1132, 0, 30, 30);
		bgp.add(button_2);

		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(291, 74, 640, 39);
		bgp.add(label);

	    lblNewLabel = new JLabel("\u8D26\u53F7");// 账号
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		lblNewLabel.setBounds(471, 218, 60, 30);
		bgp.add(lblNewLabel);
		
		label_1 = new JLabel("\u5BC6\u7801");// 密码
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		label_1.setBounds(471, 258, 60, 30);
		bgp.add(label_1);

		text_Idword = new JTextField();// 账号框
		text_Idword.setFont(new Font("宋体", Font.PLAIN, 25));
		text_Idword.setBounds(541, 218, 200, 30);
		bgp.add(text_Idword);
		text_Idword.setColumns(10);

		text_Password = new JPasswordField();// 密码框
		text_Password.setFont(new Font("宋体", Font.PLAIN, 25));
		text_Password.setBounds(541, 258, 200, 30);
		bgp.add(text_Password);
		text_Password.setColumns(10);

		
		button_entryButton = new JButton("");
		button_entryButton.setBounds(556, 310, 100, 34);
		button_entryButton.setIcon(icon4);
		bgp.add(button_entryButton);
		button_entryButton.addActionListener(this);

	}

	


	/**
	 * 窗口拖拽移动实现
	 * 
	 */
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


class BackgroundPanel extends JPanel {
	Image im;

	public BackgroundPanel(Image im) {
		this.im = im;
		this.setOpaque(true);
	}

	// Draw the back ground.
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);

	}
}