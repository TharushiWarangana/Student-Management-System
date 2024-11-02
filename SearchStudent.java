import javax.swing.*;
import java. awt.*;
import java.awt.event.*;
import java.util.*;

class SearchStudent extends JFrame{
	private JLabel lblTitle;
	
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblPhoneNumber;
	private JLabel lblEmail;
	
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	
	private JButton btnSearch;
	private JButton btnCancel;
	
	private StudentCollection studentCollection;
	
	SearchStudent(StudentCollection studentCollection){
		this.studentCollection=studentCollection;
		setSize(400,300);
		setTitle("Search Student Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitle=new JLabel("Search Student Form");
		lblTitle.setFont(new Font("",1,30));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnSearch=new JButton("Search");
		btnSearch.setFont(new Font("",1,18));
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Student s1=studentCollection.searchStudent(txtId.getText());
				if(s1!=null){
					txtName.setText(s1.getName());
					txtPhoneNumber.setText(s1.getPhoneNumber());
					txtEmail.setText(s1.getEmail());	
					
				}else{
					JOptionPane.showMessageDialog(null,"Customer is not found");
				}
			}	
		});
			buttonPanel.add(btnSearch);
			
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
		txtId.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Student s1=studentCollection.searchStudent(txtId.getText());
				if(s1!=null){
					txtName.setText(s1.getName());
					txtPhoneNumber.setText(s1.getPhoneNumber());
					txtEmail.setText(s1.getEmail());	
					
				}else{
					JOptionPane.showMessageDialog(null,"Customer is not found");
				}
			}	
		});
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

