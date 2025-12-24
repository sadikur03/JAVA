package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class OrderFrame extends JFrame implements ActionListener
{

	private JPanel panel;
	private JButton backBtn;
	private JLabel imageLabel7,imageLabel1,imageLabel2,imageLabel3,imageLabel4,imageLabel5,imageLabel6 , menuLabel,burgerLabel, pastaLabel,chowmeinLabel,lasagnaLabel, friedriceLabel,pizzaLabel;
	private User u;
	
	public OrderFrame(User u)
	{
		super("Order Frame");
		this.setSize(1100,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		Font font =new Font("Arial",Font.BOLD,22);
		
		this.burgerLabel=new JLabel("Burger:390tk");
		this.burgerLabel.setBounds(73,480,230,50);
		burgerLabel.setForeground(Color.WHITE);
		burgerLabel.setFont(font);
		this.panel.add(burgerLabel);
		
		this.pizzaLabel=new JLabel("Pizza:1340tk");
		this.pizzaLabel.setBounds(442,480,150,50);
		pizzaLabel.setForeground(Color.WHITE);
		pizzaLabel.setFont(font);
		this.panel.add(pizzaLabel);
		
		this.pastaLabel=new JLabel("Pasta:180tk");
		this.pastaLabel.setBounds(796,480,150,50);
		pastaLabel.setForeground(Color.WHITE);
		pastaLabel.setFont(font);
		this.panel.add(pastaLabel);
		
		this.lasagnaLabel=new JLabel("Lasagna:560tk");
		this.lasagnaLabel.setBounds(73,840,210,50);
		lasagnaLabel.setForeground(Color.WHITE);
		lasagnaLabel.setFont(font);
		this.panel.add(lasagnaLabel);
		
		this.chowmeinLabel=new JLabel("Chowmein:480tk");
		this.chowmeinLabel.setBounds(442,840,250,50);
		chowmeinLabel.setForeground(Color.WHITE);
		chowmeinLabel.setFont(font);
		this.panel.add(chowmeinLabel);
		
		this.friedriceLabel=new JLabel("Fried-Rice:500tk");
		this.friedriceLabel.setBounds(796,840,200,50);
		friedriceLabel.setForeground(Color.WHITE);
		friedriceLabel.setFont(font);
		this.panel.add(friedriceLabel);
		
		/*this.menuLabel=new JLabel("MENU");
		this.menuLabel.setBounds(115,90,150,40);
		this.panel.add(menuLabel);*/

		this.backBtn=new JButton("back");
		this.backBtn.setBounds(0,0,100,30);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		
		
		
		ImageIcon icon1 = new ImageIcon("burger.jpg"); 
		imageLabel1 = new JLabel(icon1);
        imageLabel1.setBounds(73,230,230,230);
        panel.add(imageLabel1);
		
		ImageIcon icon2 = new ImageIcon("pizza.jpg"); 
		imageLabel2 = new JLabel(icon2);
        imageLabel2.setBounds(442,230,230,230);
        panel.add(imageLabel2);
		
		ImageIcon icon3 = new ImageIcon("pasta.jpg"); 
		imageLabel3 = new JLabel(icon3);
        imageLabel3.setBounds(796,230,230,230);
        panel.add(imageLabel3);
		
		ImageIcon icon4 = new ImageIcon("lasagna.jpg"); 
		imageLabel4 = new JLabel(icon4);
        imageLabel4.setBounds(73,580,230,230);
        panel.add(imageLabel4);
		
		ImageIcon icon5 = new ImageIcon("chowmein.jpg"); 
		imageLabel5 = new JLabel(icon5);
        imageLabel5.setBounds(442,580,230,230);
        panel.add(imageLabel5);
		
		ImageIcon icon6 = new ImageIcon("friedrice.jpg"); 
		imageLabel6 = new JLabel(icon6);
        imageLabel6.setBounds(796,580,230,230);
        panel.add(imageLabel6);
		
		ImageIcon icon7 = new ImageIcon("menu.jpg"); 
		imageLabel7 = new JLabel(icon7);
        imageLabel7.setBounds(0,0,1100,950);
        panel.add(imageLabel7);
		
		this.add(panel);
		this.u=u;
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		if(command.equals(backBtn.getText()))
		{
			
			CustomerHomeFrame ahf=new CustomerHomeFrame(this.u);
			this.setVisible(false);
			ahf.setVisible(true);
		}
		
	}
	
}