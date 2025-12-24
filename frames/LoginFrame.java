package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class LoginFrame extends JFrame implements ActionListener
{
	private JLabel userIdLabel, passLabel,imageLabel;
	private JTextField userTF;
	private JPasswordField passPF;
	private JButton loginBtn, exitBtn, signUpBtn, forgetPassBtn;
	private JPanel panel;
	private User u;
	
	public LoginFrame()
	{
		super("Login Frame");
		this.setSize(800,533);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font1=new Font("Arial",Font.BOLD,22);
		Font font2=new Font("Arial",Font.PLAIN,15);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
	    
		this.userIdLabel=new JLabel("User Id  :");
		this.userIdLabel.setBounds(300,80,100,30);
		userIdLabel.setFont(font1);
		userIdLabel.setForeground(Color.WHITE);
		this.panel.add(userIdLabel);
		
		
		this.userTF=new JTextField();
		this.userTF.setBounds(430,80,100,30);
		userTF.setFont(font1);
		this.panel.add(userTF);
		
		this.passLabel=new JLabel("Password:");
		this.passLabel.setBounds(300,130,120,30);
		passLabel.setFont(font1);
		passLabel.setForeground(Color.WHITE);
		this.panel.add(passLabel);
		
		this.passPF=new JPasswordField();
		this.passPF.setBounds(430,130,100,30);
		passPF.setFont(font1);
		this.panel.add(passPF);
		
		this.loginBtn=new JButton("Login");
		this.loginBtn.setBounds(350,300,120,35);
		loginBtn.setFont(font2);
		this.loginBtn.addActionListener(this);
		this.panel.add(loginBtn);
		
		this.exitBtn=new JButton("Exit");
		this.exitBtn.setBounds(350,340,120,35);
		exitBtn.setFont(font2);
		this.exitBtn.addActionListener(this);
		this.panel.add(exitBtn);
		
		this.signUpBtn=new JButton("Sign Up");
		this.signUpBtn.setBounds(350,380,120,35);
		signUpBtn.setFont(font2);
		this.signUpBtn.addActionListener(this);
		this.panel.add(signUpBtn);
		
		this.forgetPassBtn=new JButton("Forget Pass");
		this.forgetPassBtn.setBounds(350,420,120,35);
		forgetPassBtn.setFont(font2);
		this.forgetPassBtn.addActionListener(this);
		this.panel.add(forgetPassBtn);
		
		ImageIcon icon = new ImageIcon("pic.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0, 800,533);
        panel.add(imageLabel);
		
		this.add(panel);
		
	}
	
	public LoginFrame(User u)
	{
        this.u = u;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command= ae.getActionCommand();
		
		if(command.equals(loginBtn.getText()))
		{
			String uId=userTF.getText();
			String pass=passPF.getText();
			UserRepo urp=new UserRepo();
			User user=urp.searchUserByUserId(uId);
			if(user!=null)
			{
				if(user.getUserId().equals(uId)&&user.getPassword().equals(pass)&&user.getRole()==1)
				{
					OwnerHomeFrame ahf=new OwnerHomeFrame(user);
					this.setVisible(false);
					ahf.setVisible(true);
				}
				
				else if(user.getUserId().equals(uId)&&user.getPassword().equals(pass)&&user.getRole()==2)
				{
					EmployeeHomeFrame ahf=new EmployeeHomeFrame(u);
					this.setVisible(false);
					ahf.setVisible(true);
				}
				
				else if(user.getUserId().equals(uId)&&user.getPassword().equals(pass)&&user.getRole()==3)
				{
					CustomerHomeFrame ahf=new CustomerHomeFrame(u);
					this.setVisible(false);
					ahf.setVisible(true);
				}
				
				
				
				else
				{
					JOptionPane.showMessageDialog(this, "Wrong user Id or Password!");
				}
				
				
			}
			
			else
			{
				JOptionPane.showMessageDialog(this, "Wrong user Id or Password!");
			}
		}
		
		if(command.equals(signUpBtn.getText()))
		{
			SignUpFrame sf=new SignUpFrame();
			this.setVisible(false);
			sf.setVisible(true);
		}
		
		if(command.equals(forgetPassBtn.getText()))
		{
			ForgetPassFrame fpf=new ForgetPassFrame();
			this.setVisible(false);
			fpf.setVisible(true);
		}
		
		if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
	}
	
}
