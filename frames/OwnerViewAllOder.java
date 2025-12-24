package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class OwnerViewAllOder extends JFrame implements ActionListener
{
	
	private JButton backBtn;
	private JTable paymentTable;
	private JScrollPane paymentTableSP;
	private JPanel panel;
	private User u;
	private JLabel imageLabel,imageLabel2;
	
	
	
	public OwnerViewAllOder(User u)
	{
		super("Owner All Payment Frame");
		this.setSize(806,618);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font=new Font("Arial",Font.BOLD,22);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(666,531,100,40);
		backBtn.setFont(font);
		backBtn.setBackground(Color.RED);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		PaymentRepo prp=new PaymentRepo();
		Payment[] paymentList=prp.getAllPayment();
		
		String paymentData1[][]=new String[paymentList.length][5];
		for(int i=0;i<paymentList.length;i++)
		{
		
			if(paymentList[i]!=null)
			{
				paymentData1[i][0]=paymentList[i].getPaymentId();
				paymentData1[i][1]=paymentList[i].getOrderId();
				paymentData1[i][2]=paymentList[i].getUserId();
				paymentData1[i][3]=String.valueOf(paymentList[i].getPaidAmount());
				paymentData1[i][4]=paymentList[i].getPaymentDate();
			}
			
			
			
		}
		
		String head1[]={"Food Item","Quantity","Price per unit","Total Amount","Date"};
		
		this.paymentTable=new JTable(paymentData1,head1);
		
		this.paymentTableSP=new JScrollPane(paymentTable);
		this.paymentTableSP.setBounds(50,65,430,450);
		this.paymentTable.setEnabled(false);
		this.panel.add(paymentTableSP);
		
		this.panel.revalidate();
		this.panel.repaint();
		
		ImageIcon icon2 = new ImageIcon("back.jpg"); 
		imageLabel2 = new JLabel(icon2);
        imageLabel2.setBounds(600,450,200,200);
        panel.add(imageLabel2);
		
		ImageIcon icon = new ImageIcon("pic4.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0,800,600);
        panel.add(imageLabel);
		
		this.add(panel);
		
		this.u=u;
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		
		if(command.equals(backBtn.getText()))
		{
			
			OwnerHomeFrame adf=new OwnerHomeFrame(this.u);
			this.setVisible(false);
			adf.setVisible(true);
		}
	}
	
}