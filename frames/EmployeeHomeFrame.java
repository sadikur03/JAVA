package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class EmployeeHomeFrame extends JFrame implements ActionListener
{
	
	private JButton employeeBtn, orderBtn, orderLineBtn, designationBtn, salaryBtn, passBtn,backBtn,profileBtn;
	private JPanel panel;
	private JLabel imageLabel;
	private User u;
	
	public EmployeeHomeFrame(User u)
	{
		super("Employee Home Frame");
		this.setSize(630,540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.employeeBtn=new JButton("employee operation");
		this.employeeBtn.setBounds(115,90,150,40);
		employeeBtn.setBackground(Color.RED);
		this.employeeBtn.addActionListener(this);
		this.panel.add(employeeBtn);
		
		
		this.orderBtn=new JButton("Order");
		this.orderBtn.setBounds(115,160,150,40);
		orderBtn.setBackground(Color.RED);
		this.orderBtn.addActionListener(this);
		this.panel.add(orderBtn);
		
		
		this.orderLineBtn=new JButton("Order-Line");
		this.orderLineBtn.setBounds(115,220,150,40);
		orderLineBtn.setBackground(Color.RED);
		this.orderLineBtn.addActionListener(this);
		this.panel.add(orderLineBtn);
		
	
		
		this.designationBtn=new JButton("Designation");
		this.designationBtn.setBounds(315,90,150,40);
		designationBtn.setBackground(Color.RED);
		this.designationBtn.addActionListener(this);
		this.panel.add(designationBtn);
		
		
		this.profileBtn=new JButton("Profile");
		this.profileBtn.setBounds(315,160,150,40);
		profileBtn.setBackground(Color.RED);
		this.profileBtn.addActionListener(this);
		this.panel.add(profileBtn);
		
		this.passBtn=new JButton("Update Password");
		this.passBtn.setBounds(315,220,150,40);
		passBtn.setBackground(Color.RED);
		this.passBtn.addActionListener(this);
		this.panel.add(passBtn);
		
		this.backBtn=new JButton(" Back ");
		this.backBtn.setBounds(215,300,200,40);
		backBtn.setBackground(Color.RED);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		ImageIcon icon = new ImageIcon("emp.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0,626,538);
        panel.add(imageLabel);
		
		
		
		this.add(panel);
		this.u=u;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		 String command=ae.getActionCommand();
           if(command.equals(employeeBtn.getText()))
		{
			EmployeeOperationFrame aof=new EmployeeOperationFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(profileBtn.getText()))
		{
			EmployeeUpdateProfileFrame aof=new EmployeeUpdateProfileFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(passBtn.getText()))
		{
			EmployeeUpdatePasswordFrame aof=new EmployeeUpdatePasswordFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		
		if(command.equals(orderBtn.getText()))
		{
			OrderFoodFrame aof=new OrderFoodFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		if(command.equals(backBtn.getText()))
		{
			LoginFrame aof=new LoginFrame();
			this.setVisible(false);
			aof.setVisible(true);
		}
	}
	
}
