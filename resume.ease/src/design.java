import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.xdevapi.Statement;


import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class design extends JFrame {

	private JPanel contentPane;
	private JTextField Enter_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					design frame = new design();
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
	public design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1200,801);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_print = new JPanel();
		panel_print.setBackground(new Color(255, 255, 255));
		panel_print.setBounds(451, 10, 723, 736);
		contentPane.add(panel_print);
		panel_print.setLayout(null);
		
		JLabel lblNewLabel_16_3 = new JLabel("Accomplishments:");
		lblNewLabel_16_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16_3.setForeground(new Color(70, 130, 180));
		lblNewLabel_16_3.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_16_3.setBounds(367, 468, 335, 40);
		panel_print.add(lblNewLabel_16_3);
		
		JLabel lblNewLabel_16_2 = new JLabel("Previous Job Details:");
		lblNewLabel_16_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_16_2.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_16_2.setBounds(20, 469, 326, 40);
		panel_print.add(lblNewLabel_16_2);
		
		JLabel lblNewLabel_16_1 = new JLabel("Skills:");
		lblNewLabel_16_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_16_1.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_16_1.setBounds(367, 222, 335, 40);
		panel_print.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_16 = new JLabel("Academic Qualifications:");
		lblNewLabel_16.setForeground(new Color(70, 130, 180));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_16.setBounds(20, 222, 326, 40);
		panel_print.add(lblNewLabel_16);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setForeground(Color.WHITE);
		separator_3_1.setBackground(Color.BLACK);
		separator_3_1.setBounds(216, 131, 195, 9);
		panel_print.add(separator_3_1);
		
		JLabel photu = new JLabel("photo");
		photu.setHorizontalAlignment(SwingConstants.CENTER);
		photu.setBounds(10, 11, 180, 191);
		panel_print.add(photu);
		
		JLabel lblNewLabel_3 = new JLabel("NAME:");
		lblNewLabel_3.setForeground(new Color(70, 130, 180));
		lblNewLabel_3.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_3.setBounds(216, 29, 72, 26);
		panel_print.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Get In Touch Through:");
		lblNewLabel_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(214, 102, 197, 26);
		panel_print.add(lblNewLabel_1);
		
		JLabel lblNewLabel_10 = new JLabel("nl");
		lblNewLabel_10.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(283, 29, 317, 27);
		panel_print.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("nl");
		lblNewLabel_11.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(271, 139, 165, 26);
		panel_print.add(lblNewLabel_11);
		
		JLabel lblNewLabel_6 = new JLabel("Phone:");
		lblNewLabel_6.setForeground(new Color(70, 130, 180));
		lblNewLabel_6.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(216, 137, 61, 26);
		panel_print.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Email:");
		lblNewLabel_3_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_2.setFont(new Font("Perpetua", Font.PLAIN, 21));
		lblNewLabel_3_2.setBounds(446, 134, 61, 33);
		panel_print.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_12 = new JLabel("nl");
		lblNewLabel_12.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(500, 139, 213, 25);
		panel_print.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("nl");
		lblNewLabel_13.setFont(new Font("Perpetua", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(283, 173, 432, 27);
		panel_print.add(lblNewLabel_13);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address:");
		lblNewLabel_3_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_1.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(216, 169, 86, 33);
		panel_print.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_24 = new JLabel("Dob:");
		lblNewLabel_24.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_24.setForeground(new Color(70, 130, 180));
		lblNewLabel_24.setBounds(216, 64, 49, 25);
		panel_print.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("nl");
		lblNewLabel_25.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(264, 66, 116, 25);
		panel_print.add(lblNewLabel_25);
		
		JLabel lblNewLabel_5 = new JLabel(">Completed my High School in");
		lblNewLabel_5.setForeground(new Color(70, 130, 180));
		lblNewLabel_5.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(20, 273, 209, 27);
		panel_print.add(lblNewLabel_5);
		
		JLabel lblNewLabel_14 = new JLabel("nl");
		lblNewLabel_14.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(234, 273, 83, 27);
		panel_print.add(lblNewLabel_14);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("20211125_004305_0000.png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_4.setBounds(20, 222, 326, 40);
		panel_print.add(lblNewLabel_4);
		
		JLabel hg = new JLabel("nl");
		hg.setFont(new Font("Perpetua", Font.PLAIN, 18));
		hg.setBounds(95, 297, 29, 20);
		panel_print.add(hg);
		
		JLabel lblNewLabel_4_1 = new JLabel("Skills:");
		lblNewLabel_4_1.setIcon(new ImageIcon("20211125_004305_0000.png"));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_4_1.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(367, 222, 335, 40);
		panel_print.add(lblNewLabel_4_1);
		
		JLabel skills1 = new JLabel("New label");
		skills1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		skills1.setBounds(403, 270, 300, 33);
		panel_print.add(skills1);
		
		JLabel skills2 = new JLabel("New label");
		skills2.setFont(new Font("Perpetua", Font.PLAIN, 18));
		skills2.setBounds(403, 304, 300, 33);
		panel_print.add(skills2);
		
		JLabel skills3 = new JLabel("New label");
		skills3.setFont(new Font("Perpetua", Font.PLAIN, 18));
		skills3.setBounds(403, 341, 300, 33);
		panel_print.add(skills3);
		
		JLabel skills4 = new JLabel("New label");
		skills4.setFont(new Font("Perpetua", Font.PLAIN, 18));
		skills4.setBounds(403, 373, 300, 33);
		panel_print.add(skills4);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon("20211125_004305_0000.png"));
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_4_1_1.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(20, 468, 326, 41);
		panel_print.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Title:");
		lblNewLabel_7.setForeground(new Color(70, 130, 180));
		lblNewLabel_7.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(20, 520, 49, 27);
		panel_print.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Worked");
		lblNewLabel_7_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_7_1.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_7_1.setBounds(20, 561, 72, 27);
		panel_print.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("From:");
		lblNewLabel_7_1_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_7_1_1.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_7_1_1.setBounds(91, 561, 49, 27);
		panel_print.add(lblNewLabel_7_1_1);
		
		JLabel to = new JLabel("To:");
		to.setForeground(new Color(70, 130, 180));
		to.setFont(new Font("Perpetua", Font.PLAIN, 20));
		to.setBounds(98, 583, 42, 27);
		panel_print.add(to);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Work Details:");
		lblNewLabel_7_1_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_7_1_2.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_7_1_2.setBounds(20, 611, 104, 27);
		panel_print.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("");
		lblNewLabel_4_1_2.setIcon(new ImageIcon("20211125_004305_0000.png"));
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_4_1_2.setFont(new Font("Perpetua", Font.BOLD, 20));
		lblNewLabel_4_1_2.setBounds(367, 468, 335, 41);
		panel_print.add(lblNewLabel_4_1_2);
		
		JLabel acc1 = new JLabel("New label");
		acc1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		acc1.setBounds(403, 533, 310, 33);
		panel_print.add(acc1);
		
		JLabel acc2 = new JLabel("New label");
		acc2.setFont(new Font("Perpetua", Font.PLAIN, 18));
		acc2.setBounds(403, 577, 310, 33);
		panel_print.add(acc2);
		
		JLabel acc3 = new JLabel("New label");
		acc3.setFont(new Font("Perpetua", Font.PLAIN, 18));
		acc3.setBounds(403, 621, 310, 33);
		panel_print.add(acc3);
		
		JLabel acc4 = new JLabel("New label");
		acc4.setFont(new Font("Perpetua", Font.PLAIN, 18));
		acc4.setBounds(403, 665, 310, 33);
		panel_print.add(acc4);
		
		JLabel Job = new JLabel("nl");
		Job.setFont(new Font("Perpetua", Font.PLAIN, 18));
		Job.setBounds(71, 521, 213, 26);
		panel_print.add(Job);
		
		JLabel start = new JLabel("nl");
		start.setFont(new Font("Perpetua", Font.PLAIN, 18));
		start.setBounds(144, 561, 213, 27);
		panel_print.add(start);
		
		JLabel end = new JLabel("nl");
		end.setFont(new Font("Perpetua", Font.PLAIN, 18));
		end.setBounds(144, 583, 213, 27);
		panel_print.add(end);
		
		JLabel w1 = new JLabel("New label");
		w1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		w1.setBounds(134, 611, 213, 27);
		panel_print.add(w1);
		
		JLabel w2 = new JLabel("New label");
		w2.setFont(new Font("Perpetua", Font.PLAIN, 18));
		w2.setBounds(134, 648, 213, 27);
		panel_print.add(w2);
		
		JLabel w3 = new JLabel("New label");
		w3.setFont(new Font("Perpetua", Font.PLAIN, 18));
		w3.setBounds(134, 686, 213, 27);
		panel_print.add(w3);
		
		JLabel hy = new JLabel("nl");
		hy.setFont(new Font("Perpetua", Font.PLAIN, 18));
		hy.setBounds(239, 294, 49, 27);
		panel_print.add(hy);
		
		JLabel gs = new JLabel("nl");
		gs.setFont(new Font("Perpetua", Font.PLAIN, 18));
		gs.setBounds(230, 331, 72, 27);
		panel_print.add(gs);
		
		JLabel gg = new JLabel("nl");
		gg.setFont(new Font("Perpetua", Font.PLAIN, 18));
		gg.setBounds(95, 351, 29, 27);
		panel_print.add(gg);
		
		JLabel pgs = new JLabel("nl");
		pgs.setFont(new Font("Perpetua", Font.PLAIN, 18));
		pgs.setBounds(265, 388, 72, 27);
		panel_print.add(pgs);
		
		JLabel pgg = new JLabel("nl");
		pgg.setFont(new Font("Perpetua", Font.PLAIN, 18));
		pgg.setBounds(95, 410, 23, 27);
		panel_print.add(pgg);
		
		JLabel pgy = new JLabel("nl");
		pgy.setFont(new Font("Perpetua", Font.PLAIN, 18));
		pgy.setBounds(241, 411, 61, 27);
		panel_print.add(pgy);
		
		JLabel lblNewLabel_2 = new JLabel("with");
		lblNewLabel_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(60, 297, 37, 20);
		panel_print.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("grade in the year");
		lblNewLabel_5_3.setForeground(new Color(70, 130, 180));
		lblNewLabel_5_3.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5_3.setBounds(124, 292, 116, 31);
		panel_print.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel(">Completed my Graduation in");
		lblNewLabel_5_4.setForeground(new Color(70, 130, 180));
		lblNewLabel_5_4.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5_4.setBounds(20, 331, 209, 27);
		panel_print.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("with");
		lblNewLabel_2_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_2_1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(60, 354, 37, 20);
		panel_print.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("grade in the year");
		lblNewLabel_5_3_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_5_3_1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5_3_1.setBounds(124, 349, 116, 31);
		panel_print.add(lblNewLabel_5_3_1);
		
		JLabel gy = new JLabel("nl");
		gy.setFont(new Font("Perpetua", Font.PLAIN, 18));
		gy.setBounds(239, 351, 49, 27);
		panel_print.add(gy);
		
		JLabel lblNewLabel_5_4_1 = new JLabel(">Completed my Post Graduation in");
		lblNewLabel_5_4_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_5_4_1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5_4_1.setBounds(20, 388, 242, 27);
		panel_print.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("with");
		lblNewLabel_2_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_2_2.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(60, 413, 37, 20);
		panel_print.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_5_3_1_1 = new JLabel("grade in the year");
		lblNewLabel_5_3_1_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_5_3_1_1.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel_5_3_1_1.setBounds(124, 408, 116, 31);
		panel_print.add(lblNewLabel_5_3_1_1);
		
		JLabel skills5 = new JLabel("New label");
		skills5.setFont(new Font("Perpetua", Font.PLAIN, 18));
		skills5.setBounds(403, 407, 300, 33);
		panel_print.add(skills5);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("20211125_004305_0000.png"));
		lblNewLabel_15.setBounds(0, 11, 723, 200);
		panel_print.add(lblNewLabel_15);
		
		
		
		JLabel lblNewLabel = new JLabel("Print Screen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrinterJob job = PrinterJob.getPrinterJob();
	            job.setJobName("Print Data");
	            
	            job.setPrintable(new Printable(){
	            public int print(Graphics pg,PageFormat pf, int pageNum){
	                    pf.setOrientation(PageFormat.LANDSCAPE);
	                 if(pageNum > 0){
	                    return Printable.NO_SUCH_PAGE;
	                }
	                
	                Graphics2D g2 = (Graphics2D)pg;
	                g2.translate(pf.getImageableX(), pf.getImageableY());
	                g2.scale(0.9,0.9);
	                
	                panel_print.print(g2);
	         
	               
	                return Printable.PAGE_EXISTS;
	                         
	                
	            }
	    });
	            boolean ok = job.printDialog();
	        if(ok){
	        try{
	            
	        job.print();
	        }
	        catch (PrinterException ex){
		ex.printStackTrace();
	}
	        }
	        
	       
				
			}
		});
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 18));
		lblNewLabel.setBounds(257, 547, 157, 57);
		contentPane.add(lblNewLabel);
		
		Enter_id = new JTextField();
		Enter_id.setBounds(213, 362, 157, 50);
		contentPane.add(Enter_id);
		Enter_id.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Perpetua", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					java.sql.Connection conn;
		            PreparedStatement ps;
		            String user =Enter_id.getText();

		            Class.forName("com.mysql.cj.jdbc.Driver");
		            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resumease_db", "root", "toor");

					
					java.sql.Statement stmt=conn.createStatement();
					String sql="Select * from personal where p_id = '"+user+"'";
					ResultSet rs=stmt.executeQuery(sql);
				    while(rs.next()) 
				    {
				    	lblNewLabel_10.setText(rs.getString("name"));
				    	lblNewLabel_11.setText(rs.getString("phoneno"));
				    	lblNewLabel_12.setText(rs.getString("email"));
				    	lblNewLabel_25.setText(rs.getString("dob"));
				    	lblNewLabel_13.setText(rs.getString("address"));
				    	lblNewLabel_14.setText(rs.getString("hs"));
				    	hg.setText(rs.getString("hg"));
				    	skills1.setText(rs.getString("skills1"));
				    	skills2.setText(rs.getString("skills2"));
				    	skills3.setText(rs.getString("skills3"));
				    	skills4.setText(rs.getString("skills4"));
				    	skills5.setText(rs.getString("skills5"));
				    	Job.setText(rs.getString("job"));
				    	start.setText(rs.getString("startdate"));
				    	end.setText(rs.getString("enddate"));
				    	w1.setText(rs.getString("wkdetails1"));
				    	w2.setText(rs.getString("wrkdetails2"));
				    	w3.setText(rs.getString("wrkdetails3"));
				    	acc1.setText(rs.getString("acc1"));
				    	acc2.setText(rs.getString("acc2"));
				    	acc3.setText(rs.getString("acc3"));
				    	acc4.setText(rs.getString("acc4"));
				    	hy.setText(rs.getString("hy"));
				    	gg.setText(rs.getString("gg"));
				    	gs.setText(rs.getString("gs"));
				    	gy.setText(rs.getString("gy"));
				    	pgs.setText(rs.getString("pgs"));
				    	pgg.setText(rs.getString("pgg"));
				    	pgy.setText(rs.getString("pgy"));
				    	byte[] img=  rs.getBytes("img");
				    	ImageIcon image = new ImageIcon(img);
				    	Image im = image.getImage();
				    	Image myImg = im.getScaledInstance(photu.getWidth(), photu.getHeight(), Image.SCALE_SMOOTH);
				    	ImageIcon newImage = new ImageIcon(myImg);
				    	photu.setIcon(newImage);
				    	
				    	
					}
							} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
			
		btnNewButton.setBounds(121, 442, 176, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Your User ID:");
		lblNewLabel_8.setForeground(new Color(139, 69, 19));
		lblNewLabel_8.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(46, 361, 157, 50);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("PicsArt_11-14-05.19.37.jpg"));
		lblNewLabel_9.setBounds(10, 11, 431, 226);
		contentPane.add(lblNewLabel_9);
		
		JButton btnBack = new JButton("Edit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				updatetemplate u=new updatetemplate();
				u.setVisible(true);
			}
		});
		btnBack.setForeground(new Color(139, 69, 19));
		btnBack.setFont(new Font("Perpetua", Font.BOLD, 18));
		btnBack.setBackground(new Color(222, 184, 135));
		btnBack.setBounds(10, 550, 176, 50);
		contentPane.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(new Color(139, 69, 19));
		btnNewButton_1.setFont(new Font("Perpetua", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(222, 184, 135));
		btnNewButton_1.setBounds(247, 550, 176, 50);
		contentPane.add(btnNewButton_1);
		
		
		try
		{
			java.sql.Connection conn;
            PreparedStatement ps;

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resumease_db", "root", "");

			
			java.sql.Statement stmt=conn.createStatement();
			String sql="Select * from personal order by p_id desc limit 1";
			ResultSet rs=stmt.executeQuery(sql);
		    while(rs.next()) 
		    {
		    	lblNewLabel_10.setText(rs.getString("name"));
		    	lblNewLabel_11.setText(rs.getString("phoneno"));
		    	lblNewLabel_12.setText(rs.getString("email"));
		    	lblNewLabel_25.setText(rs.getString("dob"));
		    	lblNewLabel_13.setText(rs.getString("address"));
		    	lblNewLabel_14.setText(rs.getString("hs"));
		    	hg.setText(rs.getString("hg"));
		    	skills1.setText(rs.getString("skills1"));
		    	skills2.setText(rs.getString("skills2"));
		    	skills3.setText(rs.getString("skills3"));
		    	skills4.setText(rs.getString("skills4"));
		    	Job.setText(rs.getString("job"));
		    	start.setText(rs.getString("startdate"));
		    	end.setText(rs.getString("enddate"));
		    	w1.setText(rs.getString("wkdetails1"));
		    	w2.setText(rs.getString("wrkdetails2"));
		    	w3.setText(rs.getString("wrkdetails3"));
		    	acc1.setText(rs.getString("acc1"));
		    	acc2.setText(rs.getString("acc2"));
		    	acc3.setText(rs.getString("acc3"));
		    	acc4.setText(rs.getString("acc4"));
		    	hy.setText(rs.getString("hy"));
		    	gg.setText(rs.getString("gg"));
		    	gs.setText(rs.getString("gs"));
		    	pgs.setText(rs.getString("pgs"));
		    	pgg.setText(rs.getString("pgg"));
		    	pgy.setText(rs.getString("pgy"));
		    	
		    	
		   
		    	byte[] img=  rs.getBytes("img");
		    	ImageIcon image = new ImageIcon(img);
		    	Image im = image.getImage();
		    	Image myImg = im.getScaledInstance(photu.getWidth(), photu.getHeight(), Image.SCALE_SMOOTH);
		    	ImageIcon newImage = new ImageIcon(myImg);
		    	photu.setIcon(newImage);
		    	
		    	
		    	
			}
					} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
	}
}
