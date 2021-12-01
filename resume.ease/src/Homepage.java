import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		new Homepage();

	}

	/**
	 * Create the frame.
	 */
	public Homepage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		getContentPane().setBackground(new Color(153, 204, 255));
		setBackground(new Color(175, 238, 238));
		setContentPane(contentPane);
		setTitle("ResumEase");
		contentPane.setVisible(true);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(96, 143, 600, 339);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(46, 96, 681, 425);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("How do you want to start ?");
		lblNewLabel_1.setBounds(189, 94, 309, 25);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		
		JLabel lblNewLabel = new JLabel("WELCOME !");
		lblNewLabel.setBounds(0, 41, 681, 42);
		lblNewLabel.setIcon(new ImageIcon("icons8-handshake-24.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 24));
		
		JButton btnNewButton = new JButton("Edit Resume");
		btnNewButton.setBounds(265, 181, 154, 62);
		btnNewButton.setForeground(new Color(139, 69, 19));
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				edit t= new edit();
				t.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		JButton btnNewButton1 = new JButton("Create Resume");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				template t= new template();
				t.setVisible(true);
			}
		});
		btnNewButton1.setBounds(255, 289, 180, 62);
		btnNewButton1.setForeground(new Color(139, 69, 19));
		panel_1.add(btnNewButton1);
		btnNewButton1.setBackground(new Color(255, 250, 205));
		btnNewButton1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(61, 243, 33, 62);
		lblNewLabel_3.setIcon(new ImageIcon("icons8-edit-30.png"));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(400, 244, 55, 53);
		lblNewLabel_4.setIcon(new ImageIcon("icons8-create-48.png"));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(299, 29, 85, 67);
		lblNewLabel_5.setIcon(new ImageIcon("icons8-hospitality-64.png"));
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(33, 34, 101, 85);
		lblNewLabel_7.setIcon(new ImageIcon("icons8-edit-100.png"));
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("icons8-vertical-line-100.png"));
		lblNewLabel_8.setBounds(604, -1, 55, 138);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("New label");
		lblNewLabel_8_1.setIcon(new ImageIcon("icons8-vertical-line-100.png"));
		lblNewLabel_8_1.setBounds(604, 287, 55, 138);
		panel_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("New label");
		lblNewLabel_8_2.setIcon(new ImageIcon("icons8-vertical-line-100.png"));
		lblNewLabel_8_2.setBounds(604, 138, 55, 138);
		panel_1.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("New label");
		lblNewLabel_8_3.setIcon(new ImageIcon("icons8-vertical-line-100.png"));
		lblNewLabel_8_3.setBounds(-22, 138, 55, 138);
		panel_1.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("New label");
		lblNewLabel_8_4.setIcon(new ImageIcon("icons8-vertical-line-100.png"));
		lblNewLabel_8_4.setBounds(-22, 276, 55, 138);
		panel_1.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(222, 184, 135));
		lblNewLabel_2.setIcon(new ImageIcon("free-light-blue-background.jpg"));
		lblNewLabel_2.setBounds(10, 59, 110, 21);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(222, 184, 135));
		panel_2.setBounds(0, 0, 774, 69);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("PicsArt_11-15-07.33.15.png"));
		lblNewLabel_6.setBounds(10, 11, 167, 47);
		panel_2.add(lblNewLabel_6);
		
			
			
		
		
	}
}
