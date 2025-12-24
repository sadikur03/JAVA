package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class OrderFoodFrame extends JFrame implements ActionListener
{
	private JLabel foodItemLabel,quantityLabel,imageLabel;
	
	private JComboBox foodItemCMB, quantityCMB;
	private JButton orderBtn,cancelBtn, backBtn;
	private JTable ownerTable;
	
	private JPanel panel;
	private User u;
	
	public OrderFoodFrame(User u)
	{
		super(" Order Food Frame ");
		this.setSize(800,628);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font=new Font("Arial",Font.BOLD,17);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.foodItemLabel=new JLabel(" Food Item : ");
		this.foodItemLabel.setBounds(100,50,100,50);
		foodItemLabel.setFont(font);
		foodItemLabel.setForeground(Color.WHITE);
		foodItemLabel.setFont(font);
		this.panel.add(foodItemLabel);
		
		
		this.quantityLabel=new JLabel(" Quantity : ");
		this.quantityLabel.setBounds(100,250,100,50);
		quantityLabel.setFont(font);
		quantityLabel.setForeground(Color.WHITE);
		quantityLabel.setFont(font);
		this.panel.add(quantityLabel);
		
		
		this.orderBtn=new JButton(" Order ");
		this.orderBtn.setBounds(100,400,100,50);
		this.orderBtn.addActionListener(this);
		this.panel.add(orderBtn);
		
		this.cancelBtn=new JButton(" Cancel ");
		this.cancelBtn.setBounds(250,400,100,50);
		this.cancelBtn.addActionListener(this);
		this.panel.add(cancelBtn);
	
	
	    String[] item={"Burger", "Pizza","Lasagna","Chowmein", "Pasta", "Fried Rice"};
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB=new JComboBox(item);
		this.foodItemCMB.setBounds(250,50,150,40);
		this.panel.add(foodItemCMB);
		
		String[] item2={"1","3","5","6","7","9"};
		
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB=new JComboBox(item2);
		this.quantityCMB.setBounds(250,250,100,40);
		this.panel.add(quantityCMB);
		
		
		this.backBtn=new JButton(" Back ");
		this.backBtn.setBounds(100,500,200,50);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		
		
		ImageIcon icon = new ImageIcon("pic3.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0,0,800,600);
        panel.add(imageLabel);
		
		
		
		
		
		this.add(panel);
		this.u=u;
	}
		
		
		public void actionPerformed(ActionEvent ae)
		{
		
		String command=ae.getActionCommand();
			if(command.equals(backBtn.getText()))
		{
			
			CustomerHomeFrame lf=new CustomerHomeFrame(this.u);
			this.setVisible(false);
			lf.setVisible(true);
		}
		}
	
	
}	