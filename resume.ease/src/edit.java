import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.CardLayout;

public class edit extends JFrame {
	String s;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTextField t22;
	private JTextField t23;
	private JTextField t24;
	private JTextField t25;
	private JTextField t21;
	private JTextField t16;
	private JTextField t18;
	private JTextField t15;
	private JTextField t17;
	private JTextField t20;
	private JTextField t19;
	private JTextField textField_24;
	private JTextField t26;
	private JTextField t27;
	private JTextField t28;
	private JTextField t29;
	private JTable table;
	private JTextField textField_29;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					edit frame = new edit();
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
	public edit() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1700, 730);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(222, 184, 135));
		panel_2.setBounds(5, 0, 1360, 41);
		contentPane.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 15, 1360, 671);
		contentPane.add(tabbedPane);
		DefaultTableModel model=new DefaultTableModel();
		Object[] column = {"ID","Name","Contact","DOB","Address"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(723, 0, 622, 606);
		panel.add(scrollPane);
		
		textField_29 = new JTextField();
		textField_29.setBounds(440, 464, 191, 38);
		panel.add(textField_29);
		textField_29.setColumns(10);
		
		table = new JTable();
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Perpetua", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String no= textField_29.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Resumease_db","root","toor");
					Statement stmt=con.createStatement();
					String sql="Select * from personal where phoneno='"+no+"'";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()) {
						int ID = rs.getInt("p_id");
						String Name = rs.getString("name");
						String Contact = rs.getString("phoneno");
						String DOB = rs.getString("dob");
						String Address = rs.getString("address");
						Object[] row= {ID,Name,Contact,DOB,Address};
						model.addRow(row);
					}
					
				}catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
				}
			
		});
		
		btnNewButton.setBounds(255, 519, 115, 38);
		panel.add(btnNewButton);
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(222, 184, 135));
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 0, 481, 318);
		panel_1.add(p1);
		
		JRadioButton r1 = new JRadioButton("Personal Information");
		r1.setForeground(new Color(255, 248, 220));
		r1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		r1.setBackground(new Color(210, 105, 30));
		r1.setBounds(150, 7, 153, 27);
		p1.add(r1);
		
		JLabel l8 = new JLabel("Full Name:");
		l8.setFont(new Font("Bell MT", Font.BOLD, 18));
		l8.setBounds(20, 55, 101, 27);
		p1.add(l8);
		
		t1 = new JTextField();
		t1.setText((String) null);
		t1.setForeground(new Color(139, 69, 19));
		t1.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t1.setColumns(10);
		t1.setBackground(new Color(255, 248, 220));
		t1.setBounds(117, 57, 340, 32);
		p1.add(t1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(556, 7, 480, 315);
		p1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(490, 0, 480, 315);
		p1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(10, 357, 480, 315);
		p1.add(lblNewLabel_3_1);
		
		t2 = new JTextField();
		t2.setText((String) null);
		t2.setForeground(new Color(139, 69, 19));
		t2.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 248, 220));
		t2.setBounds(117, 108, 340, 32);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setText((String) null);
		t3.setForeground(new Color(139, 69, 19));
		t3.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t3.setColumns(10);
		t3.setBackground(new Color(255, 248, 220));
		t3.setBounds(117, 160, 340, 32);
		p1.add(t3);
		
		t5 = new JTextField();
		t5.setText((String) null);
		t5.setForeground(new Color(139, 69, 19));
		t5.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t5.setColumns(10);
		t5.setBackground(new Color(255, 248, 220));
		t5.setBounds(117, 262, 340, 32);
		p1.add(t5);
		
		JLabel l9 = new JLabel("Phone No:");
		l9.setFont(new Font("Bell MT", Font.BOLD, 18));
		l9.setBounds(20, 108, 87, 32);
		p1.add(l9);
		
		JLabel l10 = new JLabel("Email:");
		l10.setFont(new Font("Bell MT", Font.BOLD, 18));
		l10.setBounds(20, 160, 87, 32);
		p1.add(l10);
		
		JLabel l11 = new JLabel("DOB:");
		l11.setFont(new Font("Bell MT", Font.BOLD, 18));
		l11.setBounds(20, 212, 87, 32);
		p1.add(l11);
		
		JLabel l12 = new JLabel("Address:");
		l12.setFont(new Font("Bell MT", Font.BOLD, 18));
		l12.setBounds(20, 262, 87, 32);
		p1.add(l12);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(0, 0, 480, 322);
		l1.setIcon(new ImageIcon("b2f264b2bd0b51f284a7cea5acf8993f.jpg"));
		p1.add(l1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(117, 212, 334, 32);
		p1.add(dateChooser);
		
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10, 336, 481, 318);
		panel_1.add(p2);
		
		JRadioButton r2 = new JRadioButton("Academic Qualifications");
		r2.setForeground(new Color(255, 248, 220));
		r2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		r2.setBackground(new Color(210, 105, 30));
		r2.setBounds(145, 7, 181, 27);
		p2.add(r2);
		
		JLabel lblHighSchool = new JLabel("High School:");
		lblHighSchool.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblHighSchool.setBounds(20, 88, 121, 27);
		p2.add(lblHighSchool);
		
		t6 = new JTextField();
		t6.setText((String) null);
		t6.setForeground(new Color(139, 69, 19));
		t6.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t6.setColumns(10);
		t6.setBackground(new Color(255, 248, 220));
		t6.setBounds(137, 87, 100, 32);
		p2.add(t6);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(556, 7, 480, 315);
		p2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(490, 0, 480, 315);
		p2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1.setBounds(10, 357, 480, 315);
		p2.add(lblNewLabel_3_1_1);
		
		JLabel lblGraduation = new JLabel("Graduation:");
		lblGraduation.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblGraduation.setBounds(20, 164, 100, 32);
		p2.add(lblGraduation);
		
		JLabel lblPostGraduation = new JLabel("Post");
		lblPostGraduation.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblPostGraduation.setBounds(20, 233, 79, 32);
		p2.add(lblPostGraduation);
		
		t7 = new JTextField();
		t7.setText((String) null);
		t7.setForeground(new Color(139, 69, 19));
		t7.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t7.setColumns(10);
		t7.setBackground(new Color(255, 248, 220));
		t7.setBounds(247, 87, 100, 32);
		p2.add(t7);
		
		t8 = new JTextField();
		t8.setText((String) null);
		t8.setForeground(new Color(139, 69, 19));
		t8.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t8.setColumns(10);
		t8.setBackground(new Color(255, 248, 220));
		t8.setBounds(357, 87, 100, 32);
		p2.add(t8);
		
		t9 = new JTextField();
		t9.setText((String) null);
		t9.setForeground(new Color(139, 69, 19));
		t9.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t9.setColumns(10);
		t9.setBackground(new Color(255, 248, 220));
		t9.setBounds(137, 166, 100, 32);
		p2.add(t9);
		
		t10 = new JTextField();
		t10.setText((String) null);
		t10.setForeground(new Color(139, 69, 19));
		t10.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t10.setColumns(10);
		t10.setBackground(new Color(255, 248, 220));
		t10.setBounds(247, 166, 100, 32);
		p2.add(t10);
		
		t11 = new JTextField();
		t11.setText((String) null);
		t11.setForeground(new Color(139, 69, 19));
		t11.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t11.setColumns(10);
		t11.setBackground(new Color(255, 248, 220));
		t11.setBounds(357, 166, 100, 32);
		p2.add(t11);
		
		t12 = new JTextField();
		t12.setText((String) null);
		t12.setForeground(new Color(139, 69, 19));
		t12.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t12.setColumns(10);
		t12.setBackground(new Color(255, 248, 220));
		t12.setBounds(137, 247, 100, 32);
		p2.add(t12);
		
		t13 = new JTextField();
		t13.setText((String) null);
		t13.setForeground(new Color(139, 69, 19));
		t13.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t13.setColumns(10);
		t13.setBackground(new Color(255, 248, 220));
		t13.setBounds(247, 247, 100, 32);
		p2.add(t13);
		
		t14 = new JTextField();
		t14.setText((String) null);
		t14.setForeground(new Color(139, 69, 19));
		t14.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t14.setColumns(10);
		t14.setBackground(new Color(255, 248, 220));
		t14.setBounds(357, 247, 100, 32);
		p2.add(t14);
		
		JLabel lblGraduation_1 = new JLabel("Graduation:");
		lblGraduation_1.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblGraduation_1.setBounds(20, 257, 100, 32);
		p2.add(lblGraduation_1);
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setHorizontalAlignment(SwingConstants.CENTER);
		lblStream.setFont(new Font("Bell MT", Font.PLAIN, 16));
		lblStream.setBounds(137, 45, 100, 32);
		p2.add(lblStream);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Bell MT", Font.PLAIN, 16));
		lblGrade.setBounds(247, 44, 100, 32);
		p2.add(lblGrade);
		
		JLabel lblPassingYear = new JLabel("Passing Year");
		lblPassingYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassingYear.setFont(new Font("Bell MT", Font.PLAIN, 16));
		lblPassingYear.setBounds(357, 45, 100, 32);
		p2.add(lblPassingYear);
		
		JLabel l2 = new JLabel("New label");
		l2.setBounds(0, 0, 480, 315);
		l2.setIcon(new ImageIcon("b2f264b2bd0b51f284a7cea5acf8993f.jpg"));
		p2.add(l2);
		
		JPanel p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(499, 336, 481, 318);
		panel_1.add(p4);
		
		JRadioButton r4 = new JRadioButton("Skills");
		r4.setForeground(new Color(255, 248, 220));
		r4.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		r4.setBackground(new Color(210, 105, 30));
		r4.setBounds(201, 7, 68, 27);
		p4.add(r4);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setBounds(556, 7, 480, 315);
		p4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(490, 0, 480, 315);
		p4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("New label");
		lblNewLabel_3_1_2.setBounds(10, 357, 480, 315);
		p4.add(lblNewLabel_3_1_2);
		
		t22 = new JTextField();
		t22.setText((String) null);
		t22.setForeground(new Color(139, 69, 19));
		t22.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t22.setColumns(10);
		t22.setBackground(new Color(255, 248, 220));
		t22.setBounds(21, 112, 436, 32);
		p4.add(t22);
		
		t23 = new JTextField();
		t23.setText((String) null);
		t23.setForeground(new Color(139, 69, 19));
		t23.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t23.setColumns(10);
		t23.setBackground(new Color(255, 248, 220));
		t23.setBounds(21, 169, 436, 32);
		p4.add(t23);
		
		t24 = new JTextField();
		t24.setText((String) null);
		t24.setForeground(new Color(139, 69, 19));
		t24.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t24.setColumns(10);
		t24.setBackground(new Color(255, 248, 220));
		t24.setBounds(21, 220, 436, 32);
		p4.add(t24);
		
		t25 = new JTextField();
		t25.setText((String) null);
		t25.setForeground(new Color(139, 69, 19));
		t25.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t25.setColumns(10);
		t25.setBackground(new Color(255, 248, 220));
		t25.setBounds(21, 275, 436, 32);
		p4.add(t25);
		
		JLabel lblAddYourSkills = new JLabel("(Add your skills in the order you want to show in your resume)");
		lblAddYourSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddYourSkills.setFont(new Font("Bell MT", Font.PLAIN, 16));
		lblAddYourSkills.setBounds(0, 27, 480, 32);
		p4.add(lblAddYourSkills);
		
		t21 = new JTextField();
		t21.setText((String) null);
		t21.setForeground(new Color(139, 69, 19));
		t21.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t21.setColumns(10);
		t21.setBackground(new Color(255, 248, 220));
		t21.setBounds(21, 64, 436, 32);
		p4.add(t21);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(0, 0, 480, 315);
		l4.setIcon(new ImageIcon("b2f264b2bd0b51f284a7cea5acf8993f.jpg"));
		p4.add(l4);
		
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(501, 0, 481, 318);
		panel_1.add(p3);
		
		JRadioButton r3 = new JRadioButton("Work Experience");
		r3.setForeground(new Color(255, 248, 220));
		r3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		r3.setBackground(new Color(210, 105, 30));
		r3.setBounds(164, 7, 159, 27);
		p3.add(r3);
		
		JLabel y1_3 = new JLabel("(Enter details about your recent job)");
		y1_3.setHorizontalAlignment(SwingConstants.CENTER);
		y1_3.setFont(new Font("Bell MT", Font.PLAIN, 16));
		y1_3.setBounds(0, 34, 481, 27);
		p3.add(y1_3);
		
		t16 = new JTextField();
		t16.setText((String) null);
		t16.setForeground(new Color(139, 69, 19));
		t16.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t16.setColumns(10);
		t16.setBackground(new Color(255, 248, 220));
		t16.setBounds(101, 123, 120, 32);
		p3.add(t16);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setBounds(556, 7, 480, 315);
		p3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setBounds(490, 0, 480, 315);
		p3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("New label");
		lblNewLabel_3_1_3.setBounds(10, 357, 480, 315);
		p3.add(lblNewLabel_3_1_3);
		
		t18 = new JTextField();
		t18.setText((String) null);
		t18.setForeground(new Color(139, 69, 19));
		t18.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t18.setColumns(10);
		t18.setBackground(new Color(255, 248, 220));
		t18.setBounds(101, 183, 340, 32);
		p3.add(t18);
		
		t15 = new JTextField();
		t15.setText((String) null);
		t15.setForeground(new Color(139, 69, 19));
		t15.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t15.setColumns(10);
		t15.setBackground(new Color(255, 248, 220));
		t15.setBounds(101, 72, 340, 32);
		p3.add(t15);
		
		t17 = new JTextField();
		t17.setText((String) null);
		t17.setForeground(new Color(139, 69, 19));
		t17.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t17.setColumns(10);
		t17.setBackground(new Color(255, 248, 220));
		t17.setBounds(321, 123, 120, 32);
		p3.add(t17);
		
		t20 = new JTextField();
		t20.setText((String) null);
		t20.setForeground(new Color(139, 69, 19));
		t20.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t20.setColumns(10);
		t20.setBackground(new Color(255, 248, 220));
		t20.setBounds(101, 269, 340, 32);
		p3.add(t20);
		
		JLabel y2_3 = new JLabel("Job Title:");
		y2_3.setFont(new Font("Bell MT", Font.BOLD, 16));
		y2_3.setBounds(10, 72, 87, 32);
		p3.add(y2_3);
		
		JLabel y3_3 = new JLabel("Start Date:");
		y3_3.setFont(new Font("Bell MT", Font.BOLD, 16));
		y3_3.setBounds(10, 122, 87, 32);
		p3.add(y3_3);
		
		JLabel y4_3 = new JLabel("End Date:");
		y4_3.setFont(new Font("Bell MT", Font.BOLD, 16));
		y4_3.setBounds(236, 122, 87, 32);
		p3.add(y4_3);
		
		JLabel y5_3 = new JLabel("Work");
		y5_3.setFont(new Font("Bell MT", Font.BOLD, 16));
		y5_3.setBounds(22, 207, 59, 32);
		p3.add(y5_3);
		
		t19 = new JTextField();
		t19.setText((String) null);
		t19.setForeground(new Color(139, 69, 19));
		t19.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t19.setColumns(10);
		t19.setBackground(new Color(255, 248, 220));
		t19.setBounds(101, 226, 340, 32);
		p3.add(t19);
		
		JLabel y5_3_1 = new JLabel("Details:");
		y5_3_1.setFont(new Font("Bell MT", Font.BOLD, 16));
		y5_3_1.setBounds(22, 225, 75, 32);
		p3.add(y5_3_1);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(0, 0, 480, 315);
		l3.setIcon(new ImageIcon("b2f264b2bd0b51f284a7cea5acf8993f.jpg"));
		p3.add(l3);
		
		JButton b1 = new JButton("Clear All");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				 t2.setText("");
				 t3.setText("");
				 dateChooser.validate();
				 t5.setText("");
				 t6.setText("");
				 t8.setText("");
				 t9.setText("");
				 t10.setText("");
				 t11.setText("");
				 t12.setText("");
				 t13.setText("");
				 t14.setText("");
				 t15.setText("");
				 t16.setText("");
				 t17.setText("");
				 t18.setText("");
				 t19.setText("");
				 t20.setText("");
				 t21.setText("");
				 t22.setText("");
				 t23.setText("");
				 t24.setText("");
				 t25.setText("");
				 t26.setText("");
				 t27.setText("");
				 t28.setText("");
				 t29.setText("");
				 textField_24.setText("");
				 
				
				String image =textField_24.getText();
				image = image.replace("\\","\\\\");
			}
		});
		b1.setFont(new Font("Perpetua", Font.BOLD, 18));
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBounds(990, 11, 137, 43);
		panel_1.add(b1);
		
		JButton b2 = new JButton("Back");
		b2.setFont(new Font("Perpetua", Font.BOLD, 18));
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBounds(1137, 11, 135, 43);
		panel_1.add(b2);
		
		JPanel p5 = new JPanel();
		p5.setLayout(null);
		p5.setBounds(992, 65, 280, 253);
		panel_1.add(p5);
		
		JLabel l6 = new JLabel("Attach Photo:");
		l6.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		l6.setBounds(94, 11, 99, 33);
		p5.add(l6);
		
		JLabel lbl_image = new JLabel("+");
		lbl_image.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image.setBounds(52, 46, 172, 137);
		p5.add(lbl_image);
		
		JButton btnBrowse = new JButton("Browse");
		
			btnBrowse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
				
					/*JFileChooser browseImageFile = new JFileChooser();
			        //Filter image extensions
			        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
			        browseImageFile.addChoosableFileFilter(fnef);
			        int showOpenDialogue = browseImageFile.showOpenDialog(null);
			         
			        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
			            File selectedImageFile = browseImageFile.getSelectedFile();
			            String selectedImagePath = selectedImageFile.getAbsolutePath();
			            JOptionPane.showMessageDialog(null, selectedImagePath);
			            //Display image on jlable
			            ImageIcon ii = new ImageIcon(selectedImagePath);
//			            Resize image to fit label
			            Image image = ii.getImage().getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), Image.SCALE_SMOOTH);
			             
			            imglabel.setIcon(new ImageIcon(image));
			        }*/
					
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(null);
					File f = chooser.getSelectedFile();
					String filename = f.getAbsolutePath();
				
					
					textField_24.setText(filename);
					ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(),Image.SCALE_SMOOTH));
					
					lbl_image.setIcon(icon);
					
					
					
				    /* public void actionPerformed(ActionEvent e){
				         JFileChooser fileChooser = new JFileChooser();
				         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
				         fileChooser.addChoosableFileFilter(filter);
				         int result = fileChooser.showSaveDialog(null);
				         if(result == JFileChooser.APPROVE_OPTION){
				             File selectedFile = fileChooser.getSelectedFile();
				             String path = selectedFile.getAbsolutePath();
				             lbl_image.setIcon(ResizeImage(path));
				             */
				             s = filename;
				             textField_24.setText(s);
				             
				             
				             
							
							 
							 
				             /* }
				         else if(result == JFileChooser.CANCEL_OPTION){
				             System.out.println("No Data");
				         }
					
				}*/ 
				

		//			public ImageIcon ResizeImage(string imgfilename) {
		//				ImageIcon MyImage = new ImageIcon(imgfilename);
		//		        Image img = MyImage.getImage();
		//		        Image newImage = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(),Image.SCALE_SMOOTH);
		//		        ImageIcon image = new ImageIcon(newImage);
		//		        return image;
		//			}
					
				}		
			});
		btnBrowse.setFont(new Font("Perpetua", Font.BOLD, 18));
		btnBrowse.setBackground(new Color(255, 248, 220));
		btnBrowse.setBounds(94, 220, 99, 22);
		p5.add(btnBrowse);
		
		textField_24 = new JTextField();
		textField_24.setText((String) null);
		textField_24.setColumns(10);
		textField_24.setBounds(37, 194, 200, 19);
		p5.add(textField_24);
		
		JPanel p6 = new JPanel();
		p6.setLayout(null);
		p6.setBounds(990, 336, 280, 239);
		panel_1.add(p6);
		
		JLabel l7 = new JLabel(" Accomplishments :");
		l7.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		l7.setBounds(66, 11, 155, 33);
		p6.add(l7);
		
		t26 = new JTextField();
		t26.setText((String) null);
		t26.setForeground(new Color(139, 69, 19));
		t26.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t26.setColumns(10);
		t26.setBackground(new Color(255, 248, 220));
		t26.setBounds(10, 58, 260, 32);
		p6.add(t26);
		
		t27 = new JTextField();
		t27.setText((String) null);
		t27.setForeground(new Color(139, 69, 19));
		t27.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t27.setColumns(10);
		t27.setBackground(new Color(255, 248, 220));
		t27.setBounds(10, 101, 260, 32);
		p6.add(t27);
		
		t28 = new JTextField();
		t28.setText((String) null);
		t28.setForeground(new Color(139, 69, 19));
		t28.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t28.setColumns(10);
		t28.setBackground(new Color(255, 248, 220));
		t28.setBounds(10, 144, 260, 32);
		p6.add(t28);
		
		t29 = new JTextField();
		t29.setText((String) null);
		t29.setForeground(new Color(139, 69, 19));
		t29.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		t29.setColumns(10);
		t29.setBackground(new Color(255, 248, 220));
		t29.setBounds(10, 187, 260, 32);
		p6.add(t29);
		
		JButton b3 = new JButton("Go-->");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String phoneno=t2.getText();
				String email=t3.getText();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dob= dateFormat.format(dateChooser.getDate());
				String address=t5.getText();
				String hs = t6.getText();
				String hg = t7.getText();
				String hy = t8.getText();
				String gs = t9.getText();
				String gg = t10.getText();
				String gy = t11.getText();
				String pgs = t12.getText();
				String pgg = t13.getText();
				String pgy = t14.getText();
				String job = t15.getText();
				String startdate = t16.getText();
				String enddate = t17.getText();
				String wkdetails1 = t18.getText();
				String wrkdetails2 = t19.getText();
				String wrkdetails3 = t20.getText();
				String skills1 = t21.getText();
				String skills2 = t22.getText();
				String skills3 = t23.getText();
				String skills4 = t24.getText();
				String skills5 = t25.getText();
				String acc1 = t26.getText();
				String acc2 = t27.getText();
				String acc3 = t28.getText();
				String acc4 = t29.getText();
				String img = textField_24.getText();
				
				
				try {
					 Connection conn;
                    PreparedStatement ps;
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resumease_db", "root", "toor");
                     
                   
					 ps = conn.prepareStatement("update personal set name=?,phoneno=?, email=?, dob=?,address=?, hs=?, hg=?, hy=?, gs=?, gg=?, gy=?, pgs=?, pgg=?, pgy=?, job=?, startdate=?, enddate=?, wkdetails1=?, wrkdetails2=?, wrkdetails3=?, skills1=?, skills2=?,skills3=?, skills4=?, skills5=?, acc1=?, acc2=?, acc3=?, acc4=?, img=?, path=?" );
									 
							FileInputStream ig = new FileInputStream(textField_24.getText());
							 
							 ByteArrayOutputStream bos= new ByteArrayOutputStream();
							 byte[] buf=new byte[1024];
							
								for(int readNum;(readNum=ig.read(buf))!=-1;) {
									 bos.write(buf,0,readNum);
								 }
						
							 byte[] person_image = bos.toByteArray();
							
					 
					 ps.setString(1, name);
					 ps.setString(2, phoneno);
					 ps.setString(3, email);
					 ps.setString(4,  dob);
					 ps.setString(5, address);
					 ps.setString(6, hs);
					 ps.setString(7, hg);
					 ps.setString(8, hy);
					 ps.setString(9, gs);
					 ps.setString(10, gg);
					 ps.setString(11, gy);
					 ps.setString(12, pgs);
					 ps.setString(13, pgg);
					 ps.setString(14, pgy);
					 ps.setString(15, job);
					 ps.setString(16, startdate);
					 ps.setString(17, enddate);
					 ps.setString(18, wkdetails1);
					 ps.setString(19, wrkdetails2);
					 ps.setString(20, wrkdetails3);
					 ps.setString(21, skills1);
					 ps.setString(22, skills2);
					 ps.setString(23, skills3);
					 ps.setString(24, skills4);
					 ps.setString(25, skills5);
					 ps.setString(26, acc1);
					 ps.setString(27, acc2);
					 ps.setString(28, acc3);
					 ps.setString(29, acc4);
					
					 
					ps.setBytes(30, person_image);
					 ps.setString(31, img);
					
					 
					 ps.executeUpdate();
					 
					 
					 
					 JOptionPane.showMessageDialog(null, "Details Saved Succesfully");
				
					 
						 
					
					/*
					 t1.setText("");
					 t2.setText("");
					 t3.setText("");
					 dateChooser.validate();
					 t5.setText("");
					 t6.setText("");
					 t8.setText("");
					 t9.setText("");
					 t10.setText("");
					 t11.setText("");
					 t12.setText("");
					 t13.setText("");
					 t14.setText("");
					 t15.setText("");
					 t16.setText("");
					 t17.setText("");
					 t18.setText("");
					 t19.setText("");
					 t20.setText("");
					 t21.setText("");
					 t22.setText("");
					 t23.setText("");
					 t24.setText("");
					 t25.setText("");
					 t26.setText("");
					 t27.setText("");
					 t28.setText("");
					 t29.setText("");
					 textField.setText("");
					 
					
					String image =textField.getText();
					image = image.replace("\\","\\\\");
					*/
					
					 contentPane.setVisible(false);
					 design d=new design();
					 d.setVisible(true);
					 }
					 
					
				catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		b3.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
		b3.setBackground(new Color(255, 248, 220));
		b3.setBounds(1052, 586, 159, 68);
		panel_1.add(b3);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Perpetua", Font.BOLD, 20));
		btnEdit.setForeground(new Color(139, 69, 19));
		btnEdit.setBackground(new Color(255, 250, 205));
		btnEdit.setBounds(255, 568, 115, 38);
		panel.add(btnEdit);
		
		JLabel lblNewLabel = new JLabel("Enter Your registered Phone Number:");
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel.setBounds(99, 469, 331, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\yashu\\Desktop\\Mini\\PicsArt_11-14-05.19.37.jpg"));
		lblNewLabel_3.setBounds(10, 0, 437, 192);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\yashu\\Desktop\\Mini\\PicsArt_11-14-05.24.52.jpg"));
		lblNewLabel_4.setBounds(10, 192, 437, 235);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\yashu\\Desktop\\Mini\\PicsArt_11-15-01.48.36.jpg"));
		lblNewLabel_5.setBounds(451, 0, 255, 427);
		panel.add(lblNewLabel_5);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowId = table.getSelectedRow();
				TableModel model =table.getModel();
				String id= model.getValueAt(rowId, 0).toString();
				try
				{
				java.sql.Connection conn;
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resumease_db", "root", "toor");

					
					java.sql.Statement stmt=conn.createStatement();
					String sql="Select * from personal where p_id = '"+id+"'";
					ResultSet rs=stmt.executeQuery(sql);
					rs.next();
					
					t1.setText(rs.getString("name"));
					 t2.setText(rs.getString("phoneno"));
					 t3.setText(rs.getString("email"));
					 
					 dateChooser.setDate(rs.getDate("dob"));
					 t5.setText(rs.getString("address"));
					 t6.setText(rs.getString("hs"));
					 t8.setText(rs.getString("hy"));
					 t7.setText(rs.getString("hg"));
					 t9.setText(rs.getString("gs"));
					 t10.setText(rs.getString("gg"));
					 t11.setText(rs.getString("gy"));
					 t12.setText(rs.getString("pgs"));
					 t13.setText(rs.getString("pgg"));
					 t14.setText(rs.getString("pgy"));
					 t15.setText(rs.getString("job"));
					 t16.setText(rs.getString("startdate"));
					 t17.setText(rs.getString("enddate"));
					 t18.setText(rs.getString("wkdetails1"));
					 t19.setText(rs.getString("wrkdetails2"));
					 t20.setText(rs.getString("wrkdetails3"));
					 t21.setText(rs.getString("skills1"));
					 t22.setText(rs.getString("skills2"));
					 t23.setText(rs.getString("skills3"));
					 t24.setText(rs.getString("skills4"));
					 t25.setText(rs.getString("skills5"));
					 t26.setText(rs.getString("acc1"));
					 t27.setText(rs.getString("acc2"));
					 t28.setText(rs.getString("acc3"));
					 t29.setText(rs.getString("acc4"));
					 
					 byte[] img=  rs.getBytes("img");
				    	ImageIcon image = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH));
				    	//Image im = image.getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
				    	//Image myImg = im.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
				    	//ImageIcon newImage = new ImageIcon(myImg);
				    	lbl_image.setIcon(image);
					 
					 textField_24.setText(rs.getString("path"));
					 tabbedPane.setSelectedIndex(1);
					 
					
					
					} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
	}
}
