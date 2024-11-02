import javax.swing.*;
import java. awt.*;
import java.awt.event.*;
import java.util.*;

class AddStudent extends JFrame{
	private JLabel lblTitle;
	
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblPhoneNumber;
	private JLabel lblEmail;
	
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	
	private JButton btnAdd;
	private JButton btnCancel;
	
	private StudentCollection studentCollection;
	
	AddStudent(StudentCollection studentCollection){
		this.studentCollection=studentCollection;
		setSize(400,300);
		setTitle("Add Student Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitle=new JLabel("Add Student Form");
		lblTitle.setFont(new Font("",1,30));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAdd=new JButton("Add");
		btnAdd.setFont(new Font("",1,18));
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String id=txtId.getText();
				String name=txtName.getText();
				String phoneNumber=txtPhoneNumber.getText();
				String email=txtEmail.getText();
				
				Student s1=new Student(id,name,phoneNumber,email);
				studentCollection.addStudent(s1);
				txtId.setText(studentCollection.generateId());
				txtName.setText("");
				txtPhoneNumber.setText("");
				txtEmail.setText("");
				}	
			});
			buttonPanel.add(btnAdd);
			
			btnCancel=new JButton("Cancel");
			btnCancel.setFont(new Font("",1,18));
			btnCancel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					dispose();
					}
				});
			buttonPanel.add(btnCancel);
			
			add("South",buttonPanel);
			
			
			
		JPanel labelPanel = new JPanel(new GridLayout(4, 1, 4, 4));
		lblId=new JLabel("Id");
		lblId.setFont(new Font("",1,18));
		labelPanel.add(lblId);
		
		lblName=new JLabel("Name");
		lblName.setFont(new Font("",1,18));
		labelPanel.add(lblName);
		
		lblPhoneNumber=new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("",1,18));
		labelPanel.add(lblPhoneNumber);
		
		lblEmail=new JLabel("Email");
		lblEmail.setFont(new Font("",1,18));
		labelPanel.add(lblEmail);
		
		add("West",labelPanel);
		
		JPanel textPanel=new JPanel(new GridLayout(4,1,4,4));
		txtId=new JTextField(5);
		txtId.setFont(new Font("",1,18));
		JPanel idTextPanel =new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanel.add(txtId);
		txtId.setText(studentCollection.generateId());
		textPanel.add(idTextPanel);
		
		txtName=new JTextField(10);
		txtName.setFont(new Font("",1,18));
		JPanel nameTextPanel =new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(txtName);
		textPanel.add(nameTextPanel);
		
		txtPhoneNumber=new JTextField(12);
		txtPhoneNumber.setFont(new Font("",1,18));
		JPanel phoneNumberTextPanel =new JPanel(new FlowLayout(FlowLayout.LEFT));
		phoneNumberTextPanel.add(txtPhoneNumber);
		textPanel.add(phoneNumberTextPanel);
		
		txtEmail=new JTextField(15);
		txtEmail.setFont(new Font("",1,18));
		JPanel emailTextPanel =new JPanel(new FlowLayout(FlowLayout.LEFT));
		emailTextPanel.add(txtEmail);
		textPanel.add(emailTextPanel);
		
		add("Center",textPanel);
		}
	}
