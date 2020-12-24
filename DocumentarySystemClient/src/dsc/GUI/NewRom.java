package dsc.GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dss.Object.Room;

public class NewRom extends BaseGUI {
	private JTextField textField = new JTextField();// 楼栋;
	private JTextField textField_1 = new JTextField();// 宿舍号;
	 JTextField textField_2 = new JTextField();// 类别;
	JLabel label = new JLabel("录入");// 新建
	JLabel lblNewLabel_1 = new JLabel("楼栋");// 
	JLabel lblNewLabel = new JLabel("宿舍号");// 
	JLabel lblNewLabel_2 = new JLabel("楼栋类别");// 
	JLabel lblNewLabel_3 = new JLabel("楼栋金额");// 
	JLabel lblNewLabel_4 = new JLabel("院系");// 
	JLabel lblNewLable_5 =new JLabel("类别码");
	JButton button = new JButton("新建");// 
	String[] dept = { "经济", "管理", "能动", "航海", "机设", "外国语", "马克思主义", "计算机科学与技术", "化生", "物流" };
	JComboBox comboBox = new JComboBox(dept);// 系
	String[] sex = { "男", "女" };
	JComboBox comboBox_1 = new JComboBox(sex);// 性别
	String[] money = { "200", "300", "500"};
	JComboBox comboBox_2 = new JComboBox(money);// 花费

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewRom frame = new NewRom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public NewRom() {

		label.setForeground(Color.WHITE);
		label.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		label.setBounds(521, 15, 160, 36);
		bgp.add(label);
		

		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(451, 87, 80, 36);
		bgp.add(lblNewLabel_1);
		

		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel.setBounds(411, 133, 120, 36);
		bgp.add(lblNewLabel);
		

		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(371, 185,160, 36);
		bgp.add(lblNewLabel_2);
		

		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(371, 241, 160, 36);
		bgp.add(lblNewLabel_3);
		

		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(451, 295, 80, 36);
		bgp.add(lblNewLabel_4);
		
//		lblNewLable_5.setForeground(Color.WHITE);
//		lblNewLable_5.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
//		lblNewLable_5.setBounds(411, 345, 120, 36);
//		bgp.add(lblNewLable_5);
		
		comboBox.setFont(new Font("宋体", Font.PLAIN, 30));
		comboBox.setBounds(552, 290, 250, 36);
		bgp.add(comboBox);
		String aString =comboBox.getSelectedItem().toString();

		comboBox_1.setFont(new Font("宋体", Font.PLAIN, 30));
		comboBox_1.setBounds(552, 185, 60, 36);
		bgp.add(comboBox_1);	
		String bString =comboBox_1.getSelectedItem().toString();

		comboBox_2.setFont(new Font("宋体", Font.PLAIN, 30));
		comboBox_2.setBounds(552, 241, 80, 36);
		bgp.add(comboBox_2);

		textField.setFont(new Font("宋体", Font.PLAIN, 30));
		textField.setBounds(552, 87, 180, 36);
		bgp.add(textField);
		textField.setColumns(10);
		
		textField_1.setFont(new Font("宋体", Font.PLAIN, 30));
		textField_1.setBounds(552, 136, 180, 36);
		bgp.add(textField_1);
		textField_1.setColumns(10);
		
//		textField_2.setFont(new Font("宋体", Font.PLAIN, 30));
//		textField_2.setBounds(552, 341, 180, 36);
//		bgp.add(textField_2);
//		textField_2.setColumns(10);
//		if (aString.equals("男")&&bString.equals("200")) {
//			textField_2.setText("11");
//		}else if (aString.equals("男")&&bString.equals("300")) {
//			textField_2.setText("12");
//		}else if (aString.equals("男")&&bString.equals("500")) {
//			textField_2.setText("15");
//		}else if (aString.equals("女")&&bString.equals("200")) {
//			textField_2.setText("01");
//		}else if (aString.equals("女")&&bString.equals("300")) {
//			textField_2.setText("02");
//		}else if (aString.equals("女")&&bString.equals("500")) {
//			textField_2.setText("03");
//		}
		button.setFont(new Font("华光隶书_CNKI", Font.PLAIN, 40));
		button.setBounds(526, 407, 150, 36);
		bgp.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int  rFloor =Integer.valueOf(textField.getText());
				String rNo =textField_1.getText();
				String aString =comboBox_1.getSelectedItem().toString();//类别
				String rRent =comboBox_2.getSelectedItem().toString();//金额float
				String rDept =comboBox.getSelectedItem().toString();//院系
				String rType="00";
				if (aString.equals("男")&&rRent.equals("200")) {
					rType="11";
				}else if (aString.equals("男")&&rRent.equals("300")) {
					rType="12";
				}else if (aString.equals("男")&&rRent.equals("500")) {
					rType="13";
				}else if (aString.equals("女")&&rRent.equals("200")) {
					rType="01";
				}else if (aString.equals("女")&&rRent.equals("300")) {
					rType="02";
				}else if (aString.equals("女")&&rRent.equals("500")) {
					rType="03";
				}
				int Rstatus =0;
				float money =0;
				if (rRent.equals("200")) {
					money=200;
				}else if (rRent.equals("300")) {
					money=300;
				}else if (rRent.equals("500")) {
					money=500;
				}
				Room rom=new Room(rNo, rType, money, rDept, rFloor, Rstatus);
				if(roomInstance.addRoom(rom)) {
					JOptionPane.showMessageDialog(null,  "录入成功", "请返回原界面！",JOptionPane.ERROR_MESSAGE);
					DisPose();
				}
			}
		});
		
		
		}
	
	
	
	
}
