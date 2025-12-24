package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class EmployeeUpdatePasswordFrame extends JFrame implements ActionListener
{
	private JLabel userIdLabel,currentPassLabel, newPassLabel,imageLabel;
	private JTextField userTF;
	private JPasswordField currentPassPF,newPassPF;
	private JButton updateBtn, backBtn;
	private JPanel panel;
	private User u;
	
	
	
	public EmployeeUpdatePasswordFrame(User u)
	{
		super("Employee Update Password Frame");
		this.setSize(646,646);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.userIdLabel=new JLabel("User Id:");
		this.userIdLabel.setBounds(210,140,80,30);
		this.panel.add(userIdLabel);
		
		this.userTF=new JTextField();
		this.userTF.setBounds(330,140,100,30);
		this.userTF.setText(u.getUserId());
		this.userTF.setEditable(false);
		this.panel.add(userTF);
		
		this.currentPassLabel=new JLabel("Current Password:");
		this.currentPassLabel.setBounds(210,190,110,30);
		this.panel.add(currentPassLabel);
		
		this.currentPassPF=new JPasswordField();
		this.currentPassPF.setBounds(330,190,100,30);
		this.panel.add(currentPassPF);
		
		this.newPassLabel=new JLabel("New Password:");
		this.newPassLabel.setBounds(210,240,100,30);
		this.panel.add(newPassLabel);
		
		this.newPassPF=new JPasswordField();
		this.newPassPF.setBounds(330,240,100,30);
		this.panel.add(newPassPF);
		
		
		
		
		this.updateBtn=new JButton("update");
		this.updateBtn.setBounds(210,320,100,30);
		this.updateBtn.addActionListener(this);
		this.panel.add(updateBtn);
		
		
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(330,320,100,30);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		ImageIcon icon = new ImageIcon("oupf.jpg"); 
		imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0, 626,626);
        panel.add(imageLabel);
		
		this.add(panel);
		
		this.u=u;
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		
		
		if(command.equals(updateBtn.getText()))
		{
			
			if((!currentPassPF.getText().isEmpty()) && (!newPassPF.getText().isEmpty()))
			{
				
				if(currentPassPF.getText().equals(u.getPassword()))
				{
					
					u.setPassword(newPassPF.getText());
					
					UserRepo urp=new UserRepo();
					urp.updateUser(u);
					
					JOptionPane.showMessageDialog(this,"Password updated Successfully");
				}
				
				else
				{
					JOptionPane.showMessageDialog(this,"Current Password didn't match");
				}
		
			}
			else
			{
				
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
		}
		
		
		if(command.equals(backBtn.getText()))
		{
			
			EmployeeHomeFrame adf=new EmployeeHomeFrame(this.u);
			this.setVisible(false);
			adf.setVisible(true);
		}
	}
	
}