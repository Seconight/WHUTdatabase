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
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Application extends JFrame {
	private static final long serialVersionUID = 1L;
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel contentPane = new JPanel();
	boolean isDragged = false;
	Point loc = null;
	Point tmp = null;
	Icon icon1 = new ImageIcon("src/dsc/GUI/image/关闭1.png");// 关闭图标
	Icon icon3 = new ImageIcon("src/dsc/GUI/image/最小化1.png");// 最小化图标
	JButton button_shutdown = new JButton("", icon1);
	JButton button_minimize = new JButton("", icon3);
	private final JLabel label = new JLabel("\u8868\u53F7");
	private final JLabel label_1 = new JLabel("\u7533\u8BF7\u7C7B\u578B");
	private final JLabel label_2 = new JLabel("\u63D0\u4EA4\u65F6\u95F4");
	private final JLabel label_3 = new JLabel("\u79DF\u501F\u5F00\u59CB\u65F6\u95F4");
	private final JLabel label_4 = new JLabel("\u79DF\u501F\u65F6\u957F");
	private final JLabel label_5 = new JLabel("\u5E94\u4ED8\u91D1\u989D");
	private final JLabel label_6 = new JLabel("\u5B9E\u4ED8\u91D1\u989D");
	private final JLabel label_7 = new JLabel("\u7533\u8BF7\u4EBA\u5B66\u53F7");
	private final JLabel label_8 = new JLabel("\u539F\u623F\u95F4\u53F7");
	private final JLabel label_9 = new JLabel("\u65B0\u623F\u95F4\u53F7");
	private final JLabel label_10 = new JLabel("\u4F4F\u5BBF\u53F7");
	private final JLabel label_11 = new JLabel("8888888888");
	private final JLabel label_12 = new JLabel("8");
	private final JLabel label_13 = new JLabel("2020\u5E7410\u670822\u65E5");
	private final JLabel label_14 = new JLabel("2020\u5E7410\u670822\u65E5");
	private final JLabel label_15 = new JLabel("22\u6708");
	private final JLabel label_16 = new JLabel("22222\u5143");
	private final JLabel label_17 = new JLabel("22222\u5143");
	private final JLabel label_18 = new JLabel("88888888888888");
	private final JLabel label_19 = new JLabel("8888888");
	private final JLabel label_20 = new JLabel("8888888");
	private final JLabel label_21 = new JLabel("8888888888");
	private final JLabel label_22 = new JLabel("\u57FA\u672C\u4FE1\u606F\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
	private final JLabel label_23 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u57FA\u672C\u4FE1\u606F");
	private final JLabel label_24 = new JLabel("\u91D1\u989D\u4FE1\u606F\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
	private final JLabel label_25 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u91D1\u989D\u4FE1\u606F");
	private final JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
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
	public Application() {
		setDragable();
		setUndecorated(true);
		setBounds((screensize.width - 618) / 2, (screensize.height - 1000) / 2, 618, 1000);

		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panel.setBackground(Color.CYAN);
		//contentPane.setBackground(COLOR);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		button_shutdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);// 关闭
			}
		});
		button_shutdown.setBounds(578, 0, 30, 30);
		panel.add(button_shutdown);

		button_minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED); // 最小化
			}
		});
		button_minimize.setBounds(548, 0, 30, 30);
		panel.add(button_minimize);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(0, 0, 80, 40);
		panel.add(label);
		
		label_1.setBounds(0, 49, 160, 40);
		label_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_1);
		label_2.setBounds(94, 140, 160, 40);
		label_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_2);
		label_3.setBounds(14, 210, 240, 40);
		label_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_3);
		label_4.setBounds(94, 280, 160, 40);
		label_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_4);
		label_5.setBounds(40, 701, 160, 40);
		label_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_5);
		label_6.setBounds(40, 772, 160, 40);
		label_6.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_6);
		label_7.setBounds(54, 350, 200, 40);
		label_7.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_7);
		label_8.setBounds(94, 420, 160, 40);
		label_8.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_8);
		label_9.setBounds(94, 490, 160, 40);
		label_9.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_9);
		label_10.setBounds(134, 560, 120, 40);
		label_10.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_10);
		label_11.setBounds(84, 0, 210, 40);
		label_11.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_11);
		label_12.setBounds(171, 49, 22, 40);
		label_12.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_12);
		label_13.setBounds(270, 140, 290, 40);
		label_13.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_13);
		label_14.setBounds(268, 210, 290, 40);
		label_14.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_14);
		label_15.setBounds(268, 280, 91, 40);
		label_15.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_15);
		label_16.setBounds(228, 701, 150, 40);
		label_16.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_16);
		label_17.setBounds(228, 772, 150, 40);
		label_17.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_17);
		label_18.setBounds(270, 350, 294, 40);
		label_18.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_18);
		label_19.setBounds(270, 420, 147, 40);
		label_19.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_19);
		label_20.setBounds(270, 490, 147, 40);
		label_20.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_20);
		label_21.setBounds(270, 560, 210, 40);
		label_21.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		panel.add(label_21);
		
		JButton button = new JButton("\u70B9\u51FB\u652F\u4ED8");
		button.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		//button.setContentAreaFilled(false);
		button.setBounds(392, 738, 202, 40);
		panel.add(button);
		
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		//button_1.setContentAreaFilled(false);
		button_1.setBounds(249, 887, 120, 40);
		panel.add(button_1);
		label_22.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_22.setBounds(10, 102, 598, 30);
		
		panel.add(label_22);
		label_23.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_23.setBounds(24, 613, 570, 30);
		
		panel.add(label_23);
		label_24.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_24.setBounds(10, 656, 598, 30);
		
		panel.add(label_24);
		label_25.setFont(new Font("华光楷体一_CNKI", Font.ITALIC, 30));
		label_25.setBounds(24, 825, 570, 30);
		
		panel.add(label_25);
		
	
	}
	//窗口拖拽移动实现
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
