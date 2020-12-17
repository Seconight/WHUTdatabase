package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dss.Object.Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Register extends BaseGUI {
	private JTextField textField=new JTextField();//������;
	private JTextField textField_1= new JTextField();//ѧ��;
	private JPasswordField passwordField= new JPasswordField();//����;
	private JPasswordField passwordField_1= new JPasswordField();//ȷ������;
	JLabel label = new JLabel("\u8D26\u53F7\u6CE8\u518C");//ע�����
	JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D");//����
	JLabel lblNewLabel = new JLabel("\u5B66\u53F7");//ѧ��
	JLabel lblNewLabel_2 = new JLabel("\u6027\u522B");//�Ա�
	JLabel lblNewLabel_3 = new JLabel("\u5E74\u9F84");//����
	JLabel lblNewLabel_4 = new JLabel("\u7CFB");//ϵ
	JLabel lblNewLabel_5 = new JLabel("\u5BC6\u7801");//����
	JLabel lblNewLabel_6 = new JLabel("\u786E\u8BA4\u5BC6\u7801");//ȷ������
	JButton button = new JButton("\u6CE8\u518C");//ע�ᰴť
	String[] dept= {"����","����","�ܶ�","����","����","�����","���˼����","�������ѧ�뼼��","����","����"};
	JComboBox comboBox = new JComboBox(dept);//ϵ
	String []sex= {"��","Ů"};
	JComboBox comboBox_1 = new JComboBox(sex);//�Ա�
	String[] age= {"15","16","17","18","19","20","21","22","23","24","25","26","27"};
	JComboBox comboBox_2 = new JComboBox(age);//����
	
	public Register() {

		label.setForeground(Color.WHITE);
		label.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		label.setBounds(521, 15, 160, 36);
		bgp.add(label);
		

		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(451, 67, 80, 36);
		bgp.add(lblNewLabel_1);
		

		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel.setBounds(451, 113, 80, 36);
		bgp.add(lblNewLabel);
		

		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(451, 165,80, 36);
		bgp.add(lblNewLabel_2);
		

		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(451, 221, 80, 36);
		bgp.add(lblNewLabel_3);
		

		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(491, 275, 40, 36);
		bgp.add(lblNewLabel_4);
		

		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_5.setBounds(451, 324, 80, 36);
		bgp.add(lblNewLabel_5);
		

		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		lblNewLabel_6.setBounds(371, 373, 160, 36);
		bgp.add(lblNewLabel_6);
		

		
		comboBox.setFont(new Font("����", Font.PLAIN, 30));
		comboBox.setBounds(552, 270, 250, 36);
		bgp.add(comboBox);
		

		comboBox_1.setFont(new Font("����", Font.PLAIN, 30));
		comboBox_1.setBounds(552, 165, 60, 36);
		bgp.add(comboBox_1);
		

		comboBox_2.setFont(new Font("����", Font.PLAIN, 30));
		comboBox_2.setBounds(552, 221, 80, 36);
		bgp.add(comboBox_2);
		

		textField.setFont(new Font("����", Font.PLAIN, 30));
		textField.setBounds(551, 67, 180, 36);
		bgp.add(textField);
		textField.setColumns(10);
		

		textField_1.setFont(new Font("����", Font.PLAIN, 30));
		textField_1.setBounds(552, 116, 200, 36);
		bgp.add(textField_1);
		textField_1.setColumns(10);
		

		passwordField.setFont(new Font("����", Font.PLAIN, 30));
		passwordField.setBounds(552, 324, 250, 36);
		bgp.add(passwordField);
		

		passwordField_1.setFont(new Font("����", Font.PLAIN, 30));
		passwordField_1.setBounds(552, 373, 250, 36);
		bgp.add(passwordField_1);
		

		button.setFont(new Font("��������_CNKI", Font.PLAIN, 40));
		button.setBounds(526, 437, 150, 36);
		bgp.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String name=textField.getText();
				String No=textField_1.getText();
				String pwd=new String(passwordField.getPassword());
				String pwd1=new String(passwordField_1.getPassword());
				String dept=(String)comboBox.getSelectedItem();
				String sex=(String)comboBox_1.getSelectedItem();
				int sex1=0;
				if(sex.equals("��"))
				{
					sex1=1;
				}
				int age=Integer.parseInt((String) comboBox_2.getSelectedItem());
				if(pwd.equals(pwd1))
				{
					Student student=new Student(No,age,name,dept,sex1,pwd,null);
					if(studentInstance.studentRegister(student)!=null)
					{
						JOptionPane.showMessageDialog(null,  "ע��ɹ�", "�뷵�ص�½���棡",JOptionPane.ERROR_MESSAGE);
						DisPose();
					}
					else {
						JOptionPane.showMessageDialog(null,  "��ǰѧ���Ѵ��ڣ�", "����������ѧ��",JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null,  "�������벻ͬ", "���������������ȷ������",JOptionPane.ERROR_MESSAGE);
					passwordField.setText("");
					passwordField_1.setText("");
				}
			}
		});
	}
}
