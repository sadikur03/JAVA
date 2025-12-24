package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class CustomerHomeFrame extends JFrame implements ActionListener
{
	
	private JButton profileBtn, foodBtn, orderBtn, orderLineBtn, paymentBtn,backBtn;
	private JPanel panel;
	private JLabel imageLabel;
	private User u;
	
	
	public CustomerHomeFrame(User u)
	{
		super("Customer Home Frame");
		this.setSize(633,540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.profileBtn=new JButton("Profile");
		this.profileBtn.setBounds(115,90,150,40);
		profileBtn.setBackground(Color.RED);
		this.profileBtn.addActionListener(this);
		this.panel.add(profileBtn);
		
		this.foodBtn=new JButton("Customer Operation");
		this.foodBtn.setBounds(115,160,150,40);
		foodBtn.setBackground(Color.RED);
		this.foodBtn.addActionListener(this);
		this.panel.add(foodBtn);
		
		
		this.orderBtn=new JButton("Food List");
		this.orderBtn.setBounds(115,220,150,40);
		orderBtn.setBackground(Color.RED);
		this.orderBtn.addActionListener(this);
		this.panel.add(orderBtn);
		
		
	
		
		
		this.orderLineBtn=new JButton("Order");
		this.orderLineBtn.setBounds(315,90,150,40);
		orderLineBtn.setBackground(Color.RED);
		this.orderLineBtn.addActionListener(this);
		this.panel.add(orderLineBtn);
		
		this.paymentBtn=new JButton("Payment");
		this.paymentBtn.setBounds(315,160,150,40);
		paymentBtn.setBackground(Color.RED);
		this.paymentBtn.addActionListener(this);
		this.panel.add(paymentBtn);
		
		this.backBtn=new JButton(" font page ");
		this.backBtn.setBounds(315,220,150,40);
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
		if(command.equals(orderBtn.getText()))
		{
			OrderFrame of=new OrderFrame(this.u);
			this.setVisible(false);
			of.setVisible(true);
			
		}
		
		if(command.equals(paymentBtn.getText()))
		{
			CustomerAllPayment of=new CustomerAllPayment(this.u);
			this.setVisible(false);
			of.setVisible(true);
		}
		
		if(command.equals(orderLineBtn.getText()))
		{
			OrderFoodFrame of=new OrderFoodFrame(this.u);
			this.setVisible(false);
			of.setVisible(true);
			
		}
		if(command.equals(backBtn.getText()))
		{
			LoginFrame of=new LoginFrame();
			this.setVisible(false);
			of.setVisible(true);
			
		}
		
		if(command.equals(foodBtn.getText()))
		{
			CustomerOperationFrame of=new CustomerOperationFrame(this.u);
			this.setVisible(false);
			of.setVisible(true);
			
		}
		
		
		
		
	}
	
}
