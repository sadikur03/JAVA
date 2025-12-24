package entities;
import java.lang.*;

public class Owner extends User {
	private String companySharePercentage;
	
	public Owner(){}
	
	public Owner(String userId,String name,String gender,String email,String phoneNo,String address,String securityAns,String password,int age,int role,String companySharePercentage) {  
		super(userId,name,gender,email,phoneNo,address,securityAns,password,age,role);
		this.companySharePercentage=companySharePercentage;
	}
	
	public void setCompanySharePercentage(String companySharePercentage) {
		 this.companySharePercentage=companySharePercentage;
	}
	public String getCompanySharePercentage() {
		return this.companySharePercentage;
	}
	
	public String toStringOwner() {
		String str=this.userId+","+this.name+","+this.gender+","+this.email+","+this.phoneNo+","+this.address+","+this.age+","+this.companySharePercentage+"\n";
            return str;	
	}

    public Owner formOwner(String str) {
           String[] info=str.split(",");
           Owner a=new Owner();
           a.setUserId(info[0]);
           a.setName(info[1]);
           a.setGender(info[2]);
           a.setEmail(info[3]);
           a.setPhoneNo(info[4]);
           a.setAddress(info[5]);
           a.setAge(Integer.parseInt(info[6]));
           a.setCompanySharePercentage(info[7]);
		   
		   return a;
	}

}	
		