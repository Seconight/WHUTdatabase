package dsc.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author 15758
 *
 */
public class SystemGui extends JFrame implements ChangeListener, ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame frame = new JFrame();
	JTabbedPane paneParent = new JTabbedPane();
	JPanel paneWelcome = new JPanel();
	JPanel paneStudent = new JPanel();
	JPanel paneDormitory = new JPanel();
	JPanel paneButton = new JPanel();
	JLabel labelWelcome = new JLabel("ѧ���������ϵͳ");
	JLabel labelWelcome2 = new JLabel("��������Ϊϵͳ����Ա");
	DefaultTableModel tableModel;
	JTable table;
	JScrollPane s;
	JButton buttonSave = new JButton("����");
	JButton buttonDelete = new JButton("ɾ��");
	JButton buttonIncrease = new JButton("����");
	Vector<String> dataTitle = new Vector<String>();
	Vector<String> TitleDormitor = new Vector<String>();
	Vector<Vector<Object>> data = new Vector<Vector<Object>>();

	public SystemGui() {
		frame.setSize(1202, 743);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		// ѡ�
		frame.add(paneParent);
		paneParent.setBounds(0, 0, 956, 690);
		frame.add(paneButton);
		paneButton.setBounds(510, 0, 200, 600);
		paneParent.addTab("ѧ������ϵͳ", null, paneWelcome, null);
		paneParent.addTab("ѧ����Ϣ", null, paneStudent, "ѧ����Ϣ");
		paneParent.addTab("������Ϣ", null, paneDormitory, "������Ϣ");
		// ��ӭҳ
		paneWelcome.setLayout(null);
		paneWelcome.add(labelWelcome);
		labelWelcome.setBounds(50, 150, 500, 100);
		labelWelcome.setFont(new java.awt.Font("Dialog", 1, 40));
		labelWelcome.setForeground(Color.blue);
		paneWelcome.add(labelWelcome2);
		labelWelcome2.setBounds(60, 300, 500, 40);
		labelWelcome2.setFont(new java.awt.Font("Dialog", 1, 30));
		labelWelcome2.setForeground(Color.BLUE);
		// ����
		dataTitle.add("ѧ��");
		dataTitle.add("����");
		dataTitle.add("�Ա�");
		dataTitle.add("רҵ");
		dataTitle.add("�����");
		dataTitle.add("��סʱ��");
		TitleDormitor.add("�����");
		TitleDormitor.add("����绰");
		tableModel = new DefaultTableModel(data, dataTitle);
		table = new JTable(tableModel);
		s = new JScrollPane(table);
		paneStudent.setLayout(null);
		paneStudent.add(s);
		s.setBounds(5, 10, 500, 510);
		// ��ť
		paneButton.setLayout(null);
		paneButton.add(buttonSave);
		buttonSave.setBounds(25, 30, 100, 30);
		paneParent.addChangeListener(this);
		paneButton.add(buttonDelete);
		buttonDelete.setBounds(25, 80, 100, 30);
		paneButton.add(buttonIncrease);
		buttonIncrease.setBounds(25, 130, 100, 30);
		buttonSave.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonIncrease.addActionListener(this);
		buttonDelete.setVisible(false);
		buttonSave.setVisible(false);
		buttonIncrease.setVisible(false);
	}



	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
}