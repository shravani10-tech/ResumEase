import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


public class Signup extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtEnterName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image icon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 722);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("ResumEase");
		
		JLabel lblNewLabel = new JLabel("We at ResumEase help you to create professional looking resume in few easy steps.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 90, 825, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Just choose the template, add your content, download and get one step closer to your dream job.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 105, 825, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("_MG_6463_DREAM(12X12).jpg"));
		lblNewLabel_8.setBounds(89, 51, 78, 28);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setIcon(new ImageIcon("PicsArt_11-15-01.48.36.jpg"));
		lblNewLabel_11.setBounds(53, 174, 329, 423);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("icons8-sign-up-64.png"));
		lblNewLabel_12.setBounds(84, 174, 78, 58);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(677, 51, 136, 28);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("icons8-name-30.png"));
		lblNewLabel_10.setBounds(84, 259, 30, 30);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("icons8-password-24.png"));
		lblNewLabel_13.setBounds(84, 371, 30, 28);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("icons8-email-24.png"));
		lblNewLabel_14.setBounds(84, 460, 45, 41);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("icons8-address-24.png"));
		lblNewLabel_15.setBounds(84, 569, 30, 28);
		contentPane.add(lblNewLabel_15);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(0, 0, 825, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("PicsArt_11-15-07.33.15.png"));
		lblNewLabel_2.setBounds(10, 11, 167, 36);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(392, 174, 382, 423);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Name:");
		lblNewLabel_4.setForeground(new Color(139, 69, 19));
		lblNewLabel_4.setBounds(40, 42, 61, 26);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Perpetua", Font.BOLD, 22));
		
		JLabel lblNewLabel_3 = new JLabel("SIGN UP");
		lblNewLabel_3.setIcon(new ImageIcon("icons8-login-26.png"));
		lblNewLabel_3.setBounds(0, 5, 382, 26);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		txtEnterName = new JTextField();
		txtEnterName.setForeground(new Color(210, 105, 30));
		txtEnterName.setBounds(39, 70, 296, 26);
		panel_1.add(txtEnterName);
		txtEnterName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		txtEnterName.setText("Enter Name");
		txtEnterName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterName.setText("");
			}
		});
		txtEnterName.setBackground(new Color(255, 248, 220));
		txtEnterName.setBorder(BorderFactory.createLineBorder(new Color(255, 248, 220)));
		txtEnterName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 107, 325, 2);
		panel_1.add(separator);
		separator.setForeground(new Color(139, 69, 19));
		separator.setBackground(new Color(139, 69, 19));
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setForeground(new Color(139, 69, 19));
		lblNewLabel_5.setBounds(40, 115, 106, 31);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Perpetua", Font.BOLD, 22));
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(210, 105, 30));
		passwordField.setBounds(40, 144, 296, 26);
		panel_1.add(passwordField);
		passwordField.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		passwordField.setBackground(new Color(255, 248, 220));
		passwordField.setBorder(BorderFactory.createLineBorder(new Color(255, 248, 220)));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 181, 325, 12);
		panel_1.add(separator_1);
		separator_1.setForeground(new Color(139, 69, 19));
		separator_1.setBackground(new Color(139, 69, 19));
		
		JLabel lblNewLabel_6 = new JLabel("Email id:");
		lblNewLabel_6.setForeground(new Color(139, 69, 19));
		lblNewLabel_6.setBounds(40, 190, 96, 38);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Perpetua", Font.BOLD, 22));
		
		textField = new JTextField();
		textField.setForeground(new Color(210, 105, 30));
		textField.setBounds(39, 227, 296, 26);
		panel_1.add(textField);
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		textField.setBackground(new Color(255, 248, 220));
		textField.setText("Enter Email id");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setBorder(BorderFactory.createLineBorder(new Color(255, 248, 220)));
		textField.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(139, 69, 19));
		separator_2.setBounds(26, 264, 325, 2);
		panel_1.add(separator_2);
		separator_2.setBackground(new Color(139, 69, 19));
		
		JLabel lblNewLabel_7 = new JLabel("Address:");
		lblNewLabel_7.setForeground(new Color(139, 69, 19));
		lblNewLabel_7.setBounds(40, 277, 96, 35);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Perpetua", Font.BOLD, 22));
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(210, 105, 30));
		textField_1.setBounds(39, 310, 296, 44);
		panel_1.add(textField_1);
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		textField_1.setBackground(new Color(255, 248, 220));
		textField_1.setText("Enter Address");
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setText("");
			}
		});
		textField_1.setBorder(BorderFactory.createLineBorder(new Color(255, 248, 220)));
		textField_1.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(139, 69, 19));
		separator_3.setBounds(26, 365, 325, 2);
		panel_1.add(separator_3);
		separator_3.setBackground(new Color(139, 69, 19));
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(134, 378, 106, 34);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user, pass, email, add;
				user=txtEnterName.getText();
				pass=passwordField.getText();
				email=textField.getText();
				add=textField_1.getText();
				if(pass.equals("") || user.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter required information"); 
					 return;
				}
				
				try {
					 Connection conn;
                     PreparedStatement ps;

                     Class.forName("com.mysql.cj.jdbc.Driver");
                     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resumease_db", "root", "");

					 ps = conn.prepareStatement("insert into login(username,password,email,address)values(?,?,?,?)");
					 ps.setString(1, user);
					 ps.setString(2, pass);
					 ps.setString(3, email);
					 ps.setString(4, add);
					 ps.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Signup is done");
					
					 txtEnterName.setText("");
					 passwordField.setText("");
					 textField.setText("");
					 textField_1.setText("");
					 setVisible(false);
					 login l = new login();
					 l.setVisible(true);
					
					
				}catch (SQLException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 18));
	}
}
