import javax.swing.*;
import javax.swing.table.*;
import java. awt.*;
import java.awt.event.*;
import java.util.*;

class ViewStudent extends JFrame{
	private JTable tblStudent;
	private DefaultTableModel dtm;
	private JButton btnReload;
	private JLabel lblTitle;
	private StudentCollection studentCollection;
	
	ViewStudent(StudentCollection studentCollection){
		this.studentCollection=studentCollection;
		setSize(400,300);
		setTitle("View Student Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitle=new JLabel("View Student Form");
		lblTitle.setFont(new Font("",1,30));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnReload=new JButton("Reload");
		btnReload.setFont(new Font("",1,18));
		btnReload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Student[] student=studentCollection.getStudentObjects();
				dtm.setRowCount(0);
				for(Student s1 : student){
					Object[] rowData={s1.getId(),s1.getName(),s1.getPhoneNumber(),s1.getEmail()};
					dtm.addRow(rowData);
					}
			}	
		});
			buttonPanel.add(btnReload);
			add("South",buttonPanel);
			
			String[] columnNames={"Id","Name","Phone Number","Email"};
			dtm=new DefaultTableModel(columnNames,0);
			tblStudent=new JTable(dtm);
			JScrollPane tablePane=new JScrollPane(tblStudent);
			add("Center",tablePane);
		}
	}
