import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterYourUsername;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image icon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1079, 753);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		contentPane.setLayout(null);
		setTitle("ResumEase");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		panel.setBounds(0, 67, 440, 647);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 201, 439, 302);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(153, 204, 204));
		lblNewLabel_1.setIcon(new ImageIcon("PicsArt_11-14-05.24.52.jpg"));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 250, 250));
		separator.setBounds(81, 619, 426, -5);
		panel.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(20, 134, 544, 43);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(248, 248, 255));
		separator_1.setBounds(122, 642, 317, 25);
		panel.add(separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Bell MT", Font.BOLD, 20));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(148, 173, 314, 43);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBackground(new Color(222, 184, 135));
		lblNewLabel_13.setIcon(new ImageIcon("PicsArt_11-14-05.19.37.jpg"));
		lblNewLabel_13.setBounds(0, 0, 439, 204);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_5 = new JLabel("Kick start your Career using ");
		lblNewLabel_5.setBounds(59, 524, 334, 55);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(139, 69, 19));
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD, 24));
		
		JLabel lblNewLabel_12 = new JLabel("ResumEase!");
		lblNewLabel_12.setBounds(138, 569, 172, 43);
		panel.add(lblNewLabel_12);
		lblNewLabel_12.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblNewLabel_12.setForeground(new Color(139, 69, 19));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBounds(441, 67, 622, 647);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setBounds(256, 535, 121, 34);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setIcon(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Signup s = new Signup();
				s.setVisible(true);
				
				
			}
			
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(222, 184, 135));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		JLabel lblNewLabel_7 = new JLabel("Enter your details");
		lblNewLabel_7.setIcon(new ImageIcon("icons8-login-64.png"));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblNewLabel_7.setForeground(new Color(139, 69, 19));
		lblNewLabel_7.setBounds(0, 11, 622, 64);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account? Click here");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(139, 69, 19));
		lblNewLabel_3.setBounds(0, 446, 622, 34);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(267, 344, 103, 34);
		btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 102)));
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton){
	                  try{
	                	
	                      String username = txtEnterYourUsername.getText();
	                      @SuppressWarnings("deprecation")
						  String Password = passwordField.getText();
	                      Connection conn;
	                      PreparedStatement ps;
	                     

	                      Class.forName("com.mysql.cj.jdbc.Driver");
	                      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resumease_db", "root", "toor");

	                      String q1 = "select * from login where username = ? and password = ?";
	                      

	                      ps = conn.prepareStatement(q1);

	                      ps.setString(1,username);
	                      ps.setString(2,Password);

	                      ResultSet rs = ps.executeQuery();

	                      if(rs.next()){
	                          JOptionPane.showMessageDialog(null,"Login Successful","Welcome Candidate",JOptionPane.INFORMATION_MESSAGE);
	                          setVisible(false);
	                          Homepage f=new Homepage();
	                          f.setVisible(true);
	                      }else{
	                          JOptionPane.showMessageDialog(null,"Incorrect Username or Password","Login Error",JOptionPane.ERROR_MESSAGE);
	                      }
	                  }catch (Exception ae){
	                      ae.printStackTrace();
	                      System.out.println(ae);
	                  }
	              }
	          }
	      });
		
			
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setText("");
			}
		});
		passwordField.setForeground(new Color(139, 69, 19));
		passwordField.setBackground(new Color(240, 248, 255));
		passwordField.setBounds(107, 280, 427, 34);
		passwordField.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 102)));
		panel_1.add(passwordField);
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		txtEnterYourUsername = new JTextField();
		txtEnterYourUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterYourUsername.setText("");
			}
		});
		txtEnterYourUsername.setText("Enter your Username");
		txtEnterYourUsername.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtEnterYourUsername.setForeground(new Color(139, 69, 19));
		txtEnterYourUsername.setBackground(new Color(240, 248, 255));
		txtEnterYourUsername.setBounds(107, 158, 427, 34);
		txtEnterYourUsername.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 102)));
		panel_1.add(txtEnterYourUsername);
		txtEnterYourUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setBounds(107, 235, 111, 21);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setBounds(107, 107, 181, 40);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(139, 69, 19));
		separator_3.setForeground(new Color(255, 255, 255));
		separator_3.setBounds(92, 215, 456, 9);
		panel_1.add(separator_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(139, 69, 19));
		separator_5.setBounds(135, 491, 356, 2);
		panel_1.add(separator_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setIcon(new ImageIcon("icons8-small-business-30 (1).png"));
		lblNewLabel_8.setBounds(97, 26, 37, 39);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("icons8-admin-64.png"));
		lblNewLabel_10.setBounds(97, 563, 61, 81);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setIcon(new ImageIcon("b2f264b2bd0b51f284a7cea5acf8993f.jpg"));
		lblNewLabel_11.setBounds(0, 0, 622, 644);
		panel_1.add(lblNewLabel_11);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(27, 354, 348, 2);
		panel_1.add(separator_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(222, 184, 135));
		panel_2.setBounds(0, 0, 1063, 67);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("PicsArt_11-15-07.33.15.png"));
		lblNewLabel_6.setBounds(10, 11, 167, 45);
		panel_2.add(lblNewLabel_6);
	}

	private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
