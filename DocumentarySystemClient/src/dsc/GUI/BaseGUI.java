package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dsc.ServicesInstance.AppInstance;
import dsc.ServicesInstance.PactInstance;
import dsc.ServicesInstance.RoomInstance;
import dsc.ServicesInstance.StudentInstance;
import dss.Object.Student;

import javax.swing.JLabel;

public class BaseGUI extends JFrame {

	AppInstance appInstance = new AppInstance();
	PactInstance pactInstance = new PactInstance();
	RoomInstance roomInstance = new RoomInstance();
	StudentInstance studentInstance = new StudentInstance();
	
	
	Student currentStudent = new Student();
	public  static final long serialVersionUID = 1L;
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

	public JPanel contentPane = new JPanel();
	boolean isDragged = false;
	Point loc = null;
	Point tmp = null;
	Icon icon1 = new ImageIcon("src/dsc/GUI/image/关闭.png");// 关闭图标
	Icon icon3 = new ImageIcon("src/dsc/GUI/image/最小化.png");// 最小化图标
	BackgroundPanel bgp = new BackgroundPanel((new ImageIcon("src/dsc/GUI/image/bg.jpg")).getImage());
	JButton button_shutdown = new JButton("", icon1);
	JButton button_minimize = new JButton("", icon3);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseGUI frame = new BaseGUI();
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
	public BaseGUI() {
		setUndecorated(true);// 这样就可以去掉Jframe中对window的装饰了，
		setDragable();

		setBounds((screensize.width - 1202) / 2, (screensize.height - 743) / 2, 1202, 743);

		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		bgp.setLayout(null);
		contentPane.add(bgp);

		button_shutdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);// 关闭
			}
		});
		button_shutdown.setBounds(1170, 0, 30, 30);
		bgp.add(button_shutdown);

		button_minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED); // 最小化
			}
		});
		button_minimize.setBounds(1140, 0, 30, 30);
		bgp.add(button_minimize);
	}
	//窗口拖拽移动实现
	public void DisPose()
	{
		this.dispose();
	}
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
