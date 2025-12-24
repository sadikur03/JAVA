package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class OwnerOperationFrame extends JFrame implements ActionListener
{
	private JLabel userIdLabel,nameLabel, emailLabel, phoneNoLabel, genderLabel, ageLabel, addressLabel, securityQuesLabel, securityAnsLabel, passLabel, companySharePercentageLabel,imageLabel;
	private JTextField userTF, nameTF, emailTF, phoneNoTF, ageTF, addressTF, securityAnsTF;
	private JPasswordField passPF;
	private JRadioButton maleRB, femaleRB;
	private ButtonGroup bg;
	private JComboBox companySharePercentageCMB;
	private JButton addBtn, removeBtn, updateBtn, resetBtn,searchBtn, backBtn;
	private JTable ownerTable;
	private JScrollPane ownerTableSP;
	private JPanel panel;
	private User u;
	
	
	
	public OwnerOperationFrame(User u)
	{
		super("Owner Operation Frame");
		this.setSize(800,628);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font=new Font("Arial",Font.BOLD,13);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		this.userIdLabel=new JLabel("User Id:");
		this.userIdLabel.setBounds(50,50,60,30);
		userIdLabel.setForeground(Color.WHITE);
		userIdLabel.setFont(font);
		this.panel.add(userIdLabel);
		
		this.userTF=new JTextField();
		this.userTF.setBounds(130,50,100,30);
		this.panel.add(userTF);
		
		this.nameLabel=new JLabel("Name:");
		this.nameLabel.setBounds(50,100,60,30);
		nameLabel.setFont(font);
		nameLabel.setForeground(Color.WHITE);
		this.panel.add(nameLabel);
		
		this.nameTF=new JTextField();
		this.nameTF.setBounds(130,100,100,30);
		this.panel.add(nameTF);
		
		this.emailLabel=new JLabel("email:");
		this.emailLabel.setBounds(50,150,60,30);
		emailLabel.setFont(font);
		emailLabel.setForeground(Color.WHITE);
		this.panel.add(emailLabel);
		
		this.emailTF=new JTextField();
		this.emailTF.setBounds(130,150,100,30);
		this.panel.add(emailTF);
		
		this.phoneNoLabel=new JLabel("phone No:");
		this.phoneNoLabel.setBounds(50,200,70,30);
		phoneNoLabel.setFont(font);
		phoneNoLabel.setForeground(Color.WHITE);
		this.panel.add(phoneNoLabel);
		
		this.phoneNoTF=new JTextField();
		this.phoneNoTF.setBounds(130,200,100,30);
		this.panel.add(phoneNoTF);
		
		this.genderLabel=new JLabel("Gender:");
		this.genderLabel.setBounds(50,250,60,30);
		genderLabel.setFont(font);
		genderLabel.setForeground(Color.WHITE);
		this.panel.add(genderLabel);
		
		this.maleRB=new JRadioButton("Male");
		this.maleRB.setBounds(120,250,60,30);
		maleRB.setBackground(Color.YELLOW);
		this.panel.add(maleRB);
		
		this.femaleRB=new JRadioButton("Female");
		this.femaleRB.setBounds(190,250,80,30);
		femaleRB.setBackground(Color.YELLOW);
		this.panel.add(femaleRB);
		
		this.bg=new ButtonGroup();
		bg.add(maleRB);
		bg.add(femaleRB);
		
		this.ageLabel=new JLabel("Age:");
		this.ageLabel.setBounds(50,300,60,30);
		ageLabel.setFont(font);
		ageLabel.setForeground(Color.WHITE);
		this.panel.add(ageLabel);
		
		this.ageTF=new JTextField();
		this.ageTF.setBounds(130,300,100,30);
		this.panel.add(ageTF);
		
		this.addressLabel=new JLabel("Address:");
		this.addressLabel.setBounds(280,50,60,30);
		addressLabel.setFont(font);
		addressLabel.setForeground(Color.WHITE);
		this.panel.add(addressLabel);
		
		this.addressTF=new JTextField();
		this.addressTF.setBounds(390,50,100,30);
		this.panel.add(addressTF);
		
		this.securityQuesLabel=new JLabel("Security Ques: What is your favorite food? :");
		this.securityQuesLabel.setBounds(280,100,300,30);
		securityQuesLabel.setFont(font);
		securityQuesLabel.setForeground(Color.WHITE);
		this.panel.add(securityQuesLabel);
		
		this.securityAnsLabel=new JLabel("Security Ans:");
		this.securityAnsLabel.setBounds(280,150,100,30);
		securityAnsLabel.setFont(font);
		securityAnsLabel.setForeground(Color.WHITE);
		this.panel.add(securityAnsLabel);
		
		this.securityAnsTF=new JTextField();
		this.securityAnsTF.setBounds(390,150,100,30);
		this.panel.add(securityAnsTF);
		
		this.passLabel=new JLabel("Password:");
		this.passLabel.setBounds(280,200,100,30);
		passLabel.setFont(font);
		passLabel.setForeground(Color.WHITE);
		this.panel.add(passLabel);
		
		this.passPF=new JPasswordField();
		this.passPF.setBounds(390,200,100,30);
		this.panel.add(passPF);
		
		this.companySharePercentageLabel=new JLabel("Company Share");
		this.companySharePercentageLabel.setBounds(280,250,100,30);
		companySharePercentageLabel.setFont(font);
		companySharePercentageLabel.setForeground(Color.WHITE);
		this.panel.add(companySharePercentageLabel);
		
		String[] item={"10%", "20%"};
		this.companySharePercentageCMB=new JComboBox(item);
		this.companySharePercentageCMB=new JComboBox(item);
		this.companySharePercentageCMB.setBounds(390,250,100,30);
		this.panel.add(companySharePercentageCMB);
		
		
		this.addBtn=new JButton("Add Owner");
		this.addBtn.setBounds(50,340,100,30);
		addBtn.setBackground(Color.RED);
		this.addBtn.addActionListener(this);
		this.panel.add(addBtn);
		
		this.updateBtn=new JButton("update Owner");
		this.updateBtn.setBounds(160,340,120,30);
		updateBtn.setBackground(Color.RED);
		this.updateBtn.addActionListener(this);
		this.panel.add(updateBtn);
		
		this.removeBtn=new JButton("remove Owner");
		this.removeBtn.setBounds(290,340,120,30);
		removeBtn.setBackground(Color.RED);
		this.removeBtn.addActionListener(this);
		this.panel.add(removeBtn);
		
		this.searchBtn=new JButton("search Owner");
		this.searchBtn.setBounds(420,340,120,30);
		searchBtn.setBackground(Color.RED);
		this.searchBtn.addActionListener(this);
		this.panel.add(searchBtn);
		
		this.resetBtn=new JButton("Reset");
		this.resetBtn.setBounds(550,340,100,30);
		resetBtn.setBackground(Color.RED);
		this.resetBtn.addActionListener(this);
		this.panel.add(resetBtn);
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(660,340,100,30);
		backBtn.setBackground(Color.RED);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		
		OwnerRepo arp=new OwnerRepo();
		Owner[] ownerList=arp.getAllOwner();
		
		String ownerData1[][]=new String[ownerList.length][8];
		for(int i=0;i<ownerList.length;i++)
		{
		
			if(ownerList[i]!=null)
			{
				System.out.println(ownerList[i].toStringOwner());
				ownerData1[i][0]=ownerList[i].getUserId();
				ownerData1[i][1]=ownerList[i].getName();
				ownerData1[i][2]=ownerList[i].getEmail();
				ownerData1[i][3]=ownerList[i].getPhoneNo();
				ownerData1[i][4]=ownerList[i].getGender();
				ownerData1[i][5]=String.valueOf(ownerList[i].getAge());
				ownerData1[i][6]=ownerList[i].getAddress();
				ownerData1[i][7]=ownerList[i].getCompanySharePercentage();
			}
			
			
			
		}
		
		String head1[]={"Id","Name","Email","PhoneNo","Gender","Age","Address","Company Share"};
		
		this.ownerTable=new JTable(ownerData1,head1);
		
		this.ownerTableSP=new JScrollPane(ownerTable);
		this.ownerTableSP.setBounds(50,380,700,200);
		this.ownerTable.setEnabled(false);
		this.panel.add(ownerTableSP);
		this.panel.revalidate();
		this.panel.repaint();
		
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
		
		if(command.equals(addBtn.getText()))
		{
			String userId,name,gender,email,phoneNo,address,securityAns,password,companySharePercentage;
			int age;
			
			
			if((!userTF.getText().isEmpty()) && (!nameTF.getText().isEmpty()) && (!emailTF.getText().isEmpty()) && (!phoneNoTF.getText().isEmpty()) &&((maleRB.isSelected()) || (femaleRB.isSelected())) && (!ageTF.getText().isEmpty()) && (!addressTF.getText().isEmpty())&& (!securityAnsTF.getText().isEmpty()) && (!passPF.getText().isEmpty()))
			{
				
				userId=userTF.getText();
				
				UserRepo urp=new UserRepo();
				
				User user=urp.searchUserByUserId(userId);
								
				if(user==null)
				{
					try
					{
						name=nameTF.getText();
						email=emailTF.getText();
						phoneNo=phoneNoTF.getText();
						if(maleRB.isSelected())
						{
							gender=maleRB.getText();
						}
				
						else if(femaleRB.isSelected())
						{
							gender=femaleRB.getText();
						}
				
						else
						{
							gender=maleRB.getText();
						}
						
						age=Integer.parseInt(ageTF.getText());
						
						address=addressTF.getText();
						
						
						int role=1;
						
						securityAns=securityAnsTF.getText();
						
						password=passPF.getText();
						
						companySharePercentage=companySharePercentageCMB.getSelectedItem().toString();
						
						Owner a=new Owner(userId,name,gender,email,phoneNo,address,securityAns,password,age,role,companySharePercentage);
						
						urp.addUser(a);
						
						OwnerRepo arp=new OwnerRepo();
					
						arp.addOwner(a);
						
						JOptionPane.showMessageDialog(this,"owner added Successfully");
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(this,"provide valid age");
					}
				}
				
				else
				{
					JOptionPane.showMessageDialog(this,"User Id already exists.");
				}
		
			}
			else
			{
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
			
		}
		
		if(command.equals(updateBtn.getText()))
		{
			
			String userId,name,email,phoneNo,gender,address,companySharePercentage;
			int age;
			if((!userTF.getText().isEmpty()) && (!nameTF.getText().isEmpty()) && (!emailTF.getText().isEmpty()) && (!phoneNoTF.getText().isEmpty()) &&((maleRB.isSelected()) || (femaleRB.isSelected())) && (!ageTF.getText().isEmpty()) && (!addressTF.getText().isEmpty()))
			{
				userId=userTF.getText();
				OwnerRepo arp=new OwnerRepo();
				Owner a=arp.searchOwnerByUserId(userId);
				if(a!=null)
				{
					try
					{
						name=nameTF.getText();
						email=emailTF.getText();
						phoneNo=phoneNoTF.getText();
						if(maleRB.isSelected())
						{
							gender=maleRB.getText();
						}
				
						else if(femaleRB.isSelected())
						{
							gender=femaleRB.getText();
						}
				
						else
						{
							gender=maleRB.getText();
						}
						age=Integer.parseInt(ageTF.getText());
						
						address=addressTF.getText();
						companySharePercentage=companySharePercentageCMB.getSelectedItem().toString();
					
						a.setName(name);
						a.setEmail(email);
						a.setPhoneNo(phoneNo);
						a.setGender(gender);
						a.setAge(age);
						a.setAddress(address);
						a.setCompanySharePercentage(companySharePercentage);
						arp.updateOwner(a);
						
						JOptionPane.showMessageDialog(this,"owner updated Successfully");
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(this,"provide valid age");
					}
				}
				
				else
				{
					
					JOptionPane.showMessageDialog(this,"provide Valid user ID");
				}
		
			}
			else
			{
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
		}
		
		if(command.equals(removeBtn.getText()))
		{
			String userId;
			if(!userTF.getText().isEmpty()) 
			{
				userId=userTF.getText();
				OwnerRepo arp=new OwnerRepo();
				
				Owner a=arp.searchOwnerByUserId(userId);
				if(a!=null)
				{
					UserRepo urp=new UserRepo();
					
					urp.removeUser(userId);
					arp.removeOwner(userId);
					
					JOptionPane.showMessageDialog(this,"Owner removed Successfully");
				}
				
				else
				{
					JOptionPane.showMessageDialog(this,"provide Valid user ID");
				}
		
			}
			else
			{
				JOptionPane.showMessageDialog(this,"please Provide a valid userId");
			}
		}
		
		if(command.equals(searchBtn.getText()))
		{
			String userId;
			if(!userTF.getText().isEmpty())
			{
				userId=userTF.getText();
				OwnerRepo urp=new OwnerRepo();
				
				Owner a=urp.searchOwnerByUserId(userId);
				
				if(a!=null)
				{
					
					userTF.setEditable(false);
					nameTF.setText(a.getName());

					emailTF.setText(a.getEmail());
					phoneNoTF.setText(a.getPhoneNo());
					if(a.getGender().equals("Male"))
					{
						maleRB.setSelected(true);
					}
					
					else
					{
						femaleRB.setSelected(true);
					}
					if(a.getCompanySharePercentage().equals("10%"))
                    {
                        companySharePercentageCMB.setSelectedItem("10%");
                    }
                    else
                    {
                        companySharePercentageCMB.setSelectedItem("20%");
                    }
					
					ageTF.setText(String.valueOf(a.getAge()));
					
					addressTF.setText(a.getAddress());

					JOptionPane.showMessageDialog(this,"owner found");
				}
				
				else
				{

					JOptionPane.showMessageDialog(this,"owner not found");
				}
			}
			
			else
			{

				JOptionPane.showMessageDialog(this,"Please provide userId to search owner.");
			}
			
		}
		
		if(command.equals(resetBtn.getText()))
		{
			
			userTF.setEditable(true);
			userTF.setText("");
			nameTF.setText("");
			emailTF.setText("");
			phoneNoTF.setText("");
			ageTF.setText("");
			addressTF.setText("");
			securityAnsTF.setText("");
			passPF.setText("");
			JOptionPane.showMessageDialog(this,"reset successfully");
		}
		
		if(command.equals(backBtn.getText()))
		{
			OwnerHomeFrame adf=new OwnerHomeFrame(this.u);
			this.setVisible(false);
			adf.setVisible(true);
		}
	}
	
}