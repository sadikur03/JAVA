package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class EmployeeUpdateProfileFrame extends JFrame implements ActionListener
{
	private JLabel userIdLabel,nameLabel, emailLabel, phoneNoLabel, genderLabel, ageLabel, addressLabel,imageLabel;
	private JTextField userTF, nameTF, emailTF, phoneNoTF, genderTF, ageTF, addressTF;
	private JButton addBtn, removeBtn, updateBtn, resetBtn,searchBtn, backBtn;
	private JPanel panel;
	private User u;
	private Employee employee;
	
	
	
	public EmployeeUpdateProfileFrame(User u)
	{
		super("Employee update profile Frame");
		this.setSize(615,815);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font=new Font("Arial",Font.BOLD,15);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		EmployeeRepo arp=new EmployeeRepo();
		this.employee=arp.searchEmployeeByUserId(u.getUserId());
		
		this.userIdLabel=new JLabel("User Id:");
		this.userIdLabel.setBounds(100,50,60,30);
		userIdLabel.setFont(font);
		this.panel.add(userIdLabel);
		
		this.userTF=new JTextField();
		this.userTF.setBounds(250,50,100,30);
		userTF.setFont(font);
		this.userTF.setText(employee.getUserId());
		this.userTF.setEditable(false);
		this.panel.add(userTF);
		
		this.nameLabel=new JLabel("Name:");
		this.nameLabel.setBounds(100,100,60,30);
		nameLabel.setFont(font);
		this.panel.add(nameLabel);
		
		this.nameTF=new JTextField();
		this.nameTF.setBounds(250,100,100,30);
		nameTF.setFont(font);
		this.nameTF.setText(employee.getName());
		this.nameTF.setEditable(false);
		this.panel.add(nameTF);
		
		this.emailLabel=new JLabel("email:");
		this.emailLabel.setBounds(100,150,60,30);
		emailLabel.setFont(font);
		this.panel.add(emailLabel);
		
		this.emailTF=new JTextField();
		this.emailTF.setBounds(250,150,100,30);
		emailTF.setFont(font);
		this.emailTF.setText(employee.getEmail());
		this.panel.add(emailTF);
		
		this.phoneNoLabel=new JLabel("phone No:");
		this.phoneNoLabel.setBounds(100,200,80,30);
		phoneNoLabel.setFont(font);
		this.panel.add(phoneNoLabel);
		
		this.phoneNoTF=new JTextField();
		this.phoneNoTF.setBounds(250,200,100,30);
		phoneNoTF.setFont(font);
		this.phoneNoTF.setText(employee.getPhoneNo());
		this.panel.add(phoneNoTF);
		
		this.genderLabel=new JLabel("Gender:");
		this.genderLabel.setBounds(100,250,60,30);
		genderLabel.setFont(font);
		this.panel.add(genderLabel);
		
		this.genderTF=new JTextField();
		this.genderTF.setBounds(250,250,100,30);
		genderTF.setFont(font);
		this.genderTF.setText(employee.getGender());
		this.genderTF.setEditable(false);
		this.panel.add(genderTF);
		
		this.ageLabel=new JLabel("Age:");
		this.ageLabel.setBounds(100,300,60,30);
		ageLabel.setFont(font);
		this.panel.add(ageLabel);
		
		this.ageTF=new JTextField();
		this.ageTF.setBounds(250,300,100,30);
		ageTF.setFont(font);
		this.ageTF.setText(String.valueOf(employee.getAge()));
		this.ageTF.setEditable(false);
		this.panel.add(ageTF);
		
		this.addressLabel=new JLabel("Address:");
		this.addressLabel.setBounds(100,350,90,30);
		addressLabel.setFont(font);
		this.panel.add(addressLabel);
		
		this.addressTF=new JTextField();
		this.addressTF.setBounds(250,350,100,30);
		addressTF.setFont(font);
		this.addressTF.setText(employee.getAddress());
		this.panel.add(addressTF);
	
		this.updateBtn=new JButton("update");
		this.updateBtn.setBounds(100,450,120,30);
		updateBtn.setFont(font);
		updateBtn.setBackground(Color.YELLOW);
		this.updateBtn.addActionListener(this);
		this.panel.add(updateBtn);
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(250,450,100,30);
		backBtn.setFont(font);
		backBtn.setBackground(Color.RED);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		ImageIcon icon = new ImageIcon("ouppf.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0,600,800);
        panel.add(imageLabel);
		
		this.add(panel);
		
		this.u=u;
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		
		
		if(command.equals(updateBtn.getText()))
		{
			
			if((!emailTF.getText().isEmpty()) && (!phoneNoTF.getText().isEmpty()) && (!addressTF.getText().isEmpty()))
			{
				employee.setEmail(emailTF.getText());
				employee.setPhoneNo(phoneNoTF.getText());
				employee.setAddress(addressTF.getText());
				//doing update operation by AdminRepo's object arp.
				EmployeeRepo arp=new EmployeeRepo();
				arp.updateEmployee(employee);
				//updation confirmation message.
				JOptionPane.showMessageDialog(this,"Employee updated Successfully");
		
			}
			else
			{
				//if any of the field is empty, this message will be shown.
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
		}
		
		
		if(command.equals(backBtn.getText()))
		{
			//back button will take you to admin home page.
			EmployeeHomeFrame adf=new EmployeeHomeFrame(this.u);
			this.setVisible(false);
			adf.setVisible(true);
		}
	}
	
}