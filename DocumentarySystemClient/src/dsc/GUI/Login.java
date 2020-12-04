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

public class Login extends JFrame {

	private JPanel contentPane;

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
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDragable();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = screensize.width; //获得屏幕宽
        int h=screensize.height;//高
		setBounds((w-1202)/2, (h-743)/2, 1202, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		BackgroundPanel bgp;
		bgp = new BackgroundPanel((new ImageIcon("src/dsc/GUI/image/bg.jpg")).getImage());
		bgp.setLayout(null);
		contentPane.add(bgp);
		
		JButton button,button_2;
		JLabel label;
		
		Icon icon1=new ImageIcon("src/dsc/GUI/image/关闭.png");//关闭图标
		Icon icon3=new ImageIcon("src/dsc/GUI/image/最小化.png");//最小化图标
		Icon icon4=new ImageIcon("src/dsc/GUI/image/登录.png");//登录图标
		label = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u6B66\u6C49\u7406\u5DE5\u5B66\u751F\u4F4F\u5BBF\u7BA1\u7406\u7CFB\u7EDF");//欢迎标语
				
		button = new JButton("",icon1);
		button_2 = new JButton("",icon3);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);//关闭
			}
		});
		button.setBounds(1162, 0, 30, 30);
		bgp.add(button);
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED); //最小化
				button.setBounds(1162, 0, 30, 30);//按钮回位
				button_2.setBounds(1102, 0, 30, 30);
			}
		});
		button_2.setBounds(1132, 0, 30, 30);
		bgp.add(button_2);

		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(291, 74, 640, 39);
		bgp.add(label);
		
		JLabel lblNewLabel = new JLabel("\u8D26\u53F7");//账号
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		lblNewLabel.setBounds(471, 218, 60, 30);
		bgp.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");//密码
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 30));
		label_1.setBounds(471, 258, 60, 30);
		bgp.add(label_1);
		
		textField = new JTextField();//账号框
		textField.setFont(new Font("宋体", Font.PLAIN, 25));
		textField.setBounds(541, 218, 200, 30);
		bgp.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();//密码框
		textField_1.setFont(new Font("宋体", Font.PLAIN, 25));
		textField_1.setBounds(541, 258, 200, 30);
		bgp.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(556, 310, 100, 34);
		button_1.setIcon(icon4);
		bgp.add(button_1);
		
	}


Point loc = null;
Point tmp = null;
boolean isDragged = false;
private JTextField textField;
private JTextField textField_1;
//窗口拖拽移动实现
private void  setDragable() {
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
           if(isDragged) {
               loc = new Point(getLocation().x + e.getX() - tmp.x,
               getLocation().y + e.getY() - tmp.y);
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

	//Draw the back ground.
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);

		}
}