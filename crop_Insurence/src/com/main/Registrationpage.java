package com.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.vaccination.dao.DatabaseOperations;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Registrationpage extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField SName;
	private JTextField Mobile;
	private JTextField Email;
	private JPasswordField pass;
	private final ButtonGroup bg = new ButtonGroup();
	String gender;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrationpage frame = new Registrationpage();
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
	public Registrationpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(0, 204, 102));
		panel.setBounds(0, 0, 1043, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pradhan Mantri Fasal Bima Yojana");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(297, 10, 459, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MINISTRY OF AGRICULTURE AND FARMERS WELFARE");
		lblNewLabel_1.setFont(new Font("Shruti", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(294, 52, 474, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/Croplogo.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(236, 10, 77, 76);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 204, 102));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(991, 0, 52, 47);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("FARMER REGISTRATOION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(314, 107, 401, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Farmer name:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4.setBounds(78, 203, 133, 29);
		contentPane.add(lblNewLabel_4);
		
		fname = new JTextField();
		fname.setBounds(221, 203, 187, 29);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Farmer Sername:");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(450, 203, 162, 29);
		contentPane.add(lblNewLabel_4_1);
		
		SName = new JTextField();
		SName.setColumns(10);
		SName.setBounds(622, 206, 187, 29);
		contentPane.add(SName);
		
		JLabel lblNewLabel_4_2 = new JLabel("Date of Birth:");
		lblNewLabel_4_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(78, 278, 133, 29);
		contentPane.add(lblNewLabel_4_2);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(221, 278, 187, 29);
		contentPane.add(dob);
		
		JLabel lblNewLabel_4_3 = new JLabel("Mobile No:");
		lblNewLabel_4_3.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(450, 281, 133, 29);
		contentPane.add(lblNewLabel_4_3);
		
		Mobile = new JTextField();
		Mobile.setColumns(10);
		Mobile.setBounds(560, 281, 214, 29);
		contentPane.add(Mobile);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Gender:");
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_1.setBounds(78, 349, 91, 29);
		contentPane.add(lblNewLabel_4_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "Male";
				
			}
		});
		bg.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(51, 204, 153));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setBounds(199, 354, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "Female";
				
			}
		});
		bg.add(rdbtnFemale);
		rdbtnFemale.setBackground(new Color(51, 204, 153));
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFemale.setBounds(314, 354, 103, 21);
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("District:");
		lblNewLabel_4_1_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2.setBounds(450, 349, 91, 29);
		contentPane.add(lblNewLabel_4_1_2);
		
		JComboBox dis = new JComboBox();
		dis.setBounds(560, 352, 214, 29);
		contentPane.add(dis);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Sub-District:");
		lblNewLabel_4_1_2_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2_1.setBounds(78, 418, 122, 29);
		contentPane.add(lblNewLabel_4_1_2_1);
		
		JComboBox sdis = new JComboBox();
		sdis.setBounds(221, 421, 187, 29);
		contentPane.add(sdis);
		
		JLabel lblNewLabel_4_1_2_1_1 = new JLabel("Village:");
		lblNewLabel_4_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2_1_1.setBounds(450, 418, 122, 29);
		contentPane.add(lblNewLabel_4_1_2_1_1);
		
		JComboBox vill = new JComboBox();
		vill.setBounds(560, 421, 214, 29);
		contentPane.add(vill);
		
		JLabel lblNewLabel_4_1_2_1_2 = new JLabel("Email-Id:");
		lblNewLabel_4_1_2_1_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2_1_2.setBounds(78, 492, 84, 29);
		contentPane.add(lblNewLabel_4_1_2_1_2);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(161, 495, 247, 29);
		contentPane.add(Email);
		
		JLabel lblNewLabel_4_1_2_1_1_1 = new JLabel("Password:");
		lblNewLabel_4_1_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2_1_1_1.setBounds(450, 492, 103, 29);
		contentPane.add(lblNewLabel_4_1_2_1_1_1);
		
		pass = new JPasswordField();
		pass.setBounds(560, 497, 214, 26);
		contentPane.add(pass);
		
		JLabel lblNewLabel_4_1_2_1_1_1_1 = new JLabel("Address:");
		lblNewLabel_4_1_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4_1_2_1_1_1_1.setBounds(78, 568, 91, 29);
		contentPane.add(lblNewLabel_4_1_2_1_1_1_1);
		
		JTextArea Address = new JTextArea();
		Address.setBounds(179, 573, 595, 75);
		contentPane.add(Address);
		
		JLabel req1 = new JLabel("");
		req1.setFont(new Font("Tahoma", Font.BOLD, 12));
		req1.setForeground(Color.RED);
		req1.setBounds(333, 180, 122, 13);
		contentPane.add(req1);
		
		JLabel req2 = new JLabel("");
		req2.setForeground(Color.RED);
		req2.setFont(new Font("Tahoma", Font.BOLD, 12));
		req2.setBounds(750, 183, 122, 13);
		contentPane.add(req2);
		
		JLabel req3 = new JLabel("");
		req3.setForeground(Color.RED);
		req3.setFont(new Font("Tahoma", Font.BOLD, 12));
		req3.setBounds(715, 260, 122, 13);
		contentPane.add(req3);
		
		JLabel req4 = new JLabel("");
		req4.setForeground(Color.RED);
		req4.setFont(new Font("Tahoma", Font.BOLD, 12));
		req4.setBounds(333, 332, 122, 13);
		contentPane.add(req4);
		
		JLabel req6 = new JLabel("");
		req6.setForeground(Color.RED);
		req6.setFont(new Font("Tahoma", Font.BOLD, 12));
		req6.setBounds(333, 472, 122, 13);
		contentPane.add(req6);
		
		JLabel req10 = new JLabel("");
		req10.setForeground(Color.RED);
		req10.setFont(new Font("Tahoma", Font.BOLD, 12));
		req10.setBounds(715, 547, 122, 13);
		contentPane.add(req10);
		
		JLabel req7 = new JLabel("");
		req7.setForeground(Color.RED);
		req7.setFont(new Font("Tahoma", Font.BOLD, 12));
		req7.setBounds(687, 474, 122, 13);
		contentPane.add(req7);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			boolean valName, valSName,valgender, valMobileNo, valEmail, valGender, valAddress, valPass,valDistrict, valSdistrict, valvillage;
				boolean validate = true;
				Pattern ptr;
				Matcher match;
				valName = fname.getText().equals("");
				if (valName) {
					req1.setText("* Required");
					req1.setVisible(true);
				valName=false;
				validate = false;
				} else {
					req1.setVisible(false);
				valName=true;
				}
				
				valSName = SName.getText().equals("");
				if (valSName) {
					req2.setText("* Required");
					req2.setVisible(true);
				valSName=false;
				validate = false;
				} else {
					req1.setVisible(false);
				valSName=true;
				}
				
				valgender = bg.isSelected(null);
				if (valgender ) {
					req4.setText("* Required");
					req4.setVisible(true);
				valgender=false;
				validate = false;
				} else {
					req1.setVisible(false);
				valgender =true;
				}
				
				valAddress = Address.getText().equals("");
				if (valAddress) {
					req10.setText("* Required");
					req10.setVisible(true);
				valAddress=false;
				validate = false;
				} else {
					req10.setVisible(false);
					valAddress=true;
				}
				
				valPass = pass.getPassword().equals("");
				if (valPass) {
					req7.setText("* Invalid Password!");
					req7.setVisible(true);
					valPass=false;
					validate = false;
				} else {
					req7.setVisible(false);
					valPass=true;
				}
				
				valMobileNo = Mobile.getText().equals("");
				ptr = Pattern.compile("(0/91)?[6-9][0-9]{9}");
				match = ptr.matcher(Mobile.getText());
				if (!(match.find() && match.group().equals(Mobile.getText()))) {
					req3.setText("* Incorrect Number");
					req3.setVisible(true);
					valMobileNo=false;
					validate = false;
				} else {
					
					req3.setVisible(false);
					valMobileNo=true;
				}
				
				valEmail = Email.getText().equals("");
				ptr = Pattern.compile("[a-zA-Z0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
				match = ptr.matcher(Email.getText());
				
				if (!(match.find() && match.group().equals(Email.getText()))) {
				
					req6.setText("* Incorrect email");
					req6.setVisible(true);
					valEmail=false;
					validate = false;
				} else {
					req6.setVisible(false);
					valEmail=true;
				}
				if(validate==true)
				{
					/*
					Login lp = new Login();
					lp.setVisible(true);
					setVisible(false);*/
					JOptionPane.showMessageDialog(null,"Registered Successfully!");
					String fName=fullname.getText();
					String SName=lname.getText();
					String dob = dob.getDate().toString();
					String mobileNo=Mnumber.getText();
					String Gender = gender;
					String eMail=emailId.getText();
					String password=new String(pw.getPassword());
					
					String address1  = address.getText();
					String dob1 = dob.getDate().toString();
					DatabaseOperations db = new DatabaseOperations();
					db.Jdbc(fName, lName,mobileNo, eMail, password, Gender,address1,dob1) ;
				}
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 250, 240));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton.setBounds(246, 683, 187, 35);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage hm = new Homepage();
				hm.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(176, 224, 230));
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnBack.setBounds(512, 683, 187, 35);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		Image img1 = new ImageIcon(this.getClass().getResource("/plant.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img1));
		lblNewLabel_5.setBounds(877, 482, 187, 268);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Cplant.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img2));
		lblNewLabel_6.setBounds(822, 675, 103, 75);
		contentPane.add(lblNewLabel_6);
		setUndecorated(true);

	}
}
