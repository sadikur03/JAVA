package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class OwnerHomeFrame extends JFrame implements ActionListener
{
	
	private JButton ownerBtn, customerBtn, employeeBtn,  offerMenuBtn, orderBtn, orderLineBtn, paymentBtn, profileBtn, passBtn,backBtn;
	private JPanel panel;
	private User u;
	private JLabel imageLabel;
	
	public OwnerHomeFrame(User u)
	{
		
		super("Owner Home Frame");
		this.setSize(800,955);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.ownerBtn=new JButton("Owner operation");
		this.ownerBtn.setBounds(145,130,200,50);
		this.ownerBtn.addActionListener(this);
		this.panel.add(ownerBtn);
		
		this.customerBtn=new JButton("Customer operation");
		this.customerBtn.setBounds(145,270,200,50);
		this.customerBtn.addActionListener(this);
		this.panel.add(customerBtn);
		
		this.employeeBtn=new JButton("Employee operation");
		this.employeeBtn.setBounds(145,410,200,50);
		this.employeeBtn.addActionListener(this);
		this.panel.add(employeeBtn);
		
		
		this.offerMenuBtn=new JButton("Offer-Menu operation");
		this.offerMenuBtn.setBounds(145,550,200,50);
		this.offerMenuBtn.addActionListener(this);
		this.panel.add(offerMenuBtn);
		
		this.orderBtn=new JButton("view all order");
		this.orderBtn.setBounds(400,130,200,50);
		this.orderBtn.addActionListener(this);
		this.panel.add(orderBtn);
		
		this.orderLineBtn=new JButton("Order");
		this.orderLineBtn.setBounds(400,270,200,50);
		this.orderLineBtn.addActionListener(this);
		this.panel.add(orderLineBtn);
		
		
		
		this.paymentBtn=new JButton("view all Payment");
		this.paymentBtn.setBounds(400,410,200,50);
		this.paymentBtn.addActionListener(this);
		this.panel.add(paymentBtn);
		
		this.profileBtn=new JButton("Update Profile");
		this.profileBtn.setBounds(400,550,200,50);
		this.profileBtn.addActionListener(this);
		this.panel.add(profileBtn);
		
		this.passBtn=new JButton("Update Password");
		this.passBtn.setBounds(145,690,200,50);
		this.passBtn.addActionListener(this);
		this.panel.add(passBtn);
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(400,690,200,50);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		ImageIcon icon = new ImageIcon("owho.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0,800,950);
        panel.add(imageLabel);
		
		this.add(panel);
		this.u=u;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		if(command.equals(ownerBtn.getText()))
		{
			OwnerOperationFrame aof=new OwnerOperationFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(paymentBtn.getText()))
		{
			OwnerAllPayment aof=new OwnerAllPayment(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(profileBtn.getText()))
		{
			OwnerUpdateProfileFrame aof=new OwnerUpdateProfileFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(passBtn.getText()))
		{
			OwnerUpdatePasswordFrame aof=new OwnerUpdatePasswordFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		if(command.equals(backBtn.getText()))
		{
			
			LoginFrame lf=new LoginFrame();
			this.setVisible(false);
			lf.setVisible(true);
		}
		if(command.equals(orderLineBtn.getText()))
		{
			OrderFoodFrame aof=new OrderFoodFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		
		if(command.equals(orderBtn.getText()))
		{
			OwnerViewAllOder aof=new OwnerViewAllOder(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(employeeBtn.getText()))
		{
			EmployeeOperationFrame aof=new EmployeeOperationFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(customerBtn.getText()))
		{
			CustomerOperationFrame aof=new CustomerOperationFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
	}
	
}
