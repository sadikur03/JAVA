package entities;
import java.lang.*;

public class Customer extends User {
	private String discountPercentage;
	private String membershipType;
	
	public Customer() {}
	
	public Customer(String userId,String name,String gender,String email,String phoneNo,String address,String securityAns,String password,int age,int role,String discountPercentage,String membershipType) {        
		super(userId,name,gender,email,phoneNo,address,securityAns,password,age,role);
		this.discountPercentage=discountPercentage;
		this.membershipType=membershipType;
	}
	
	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage=discountPercentage;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType=membershipType;
	}
	public String getDiscountPercentage() {
		return this.discountPercentage;
	}
	public String getMembershipType() {
		return this.membershipType;
	}
	
	public String toStringCustomer() {
		String str=this.userId+","+this.name+","+this.gender+","+this.email+","+this.phoneNo+","+this.address+","+this.age+","+this.discountPercentage+","+this.membershipType+"\n";
		    return str;	
	}
	
	public Customer formCustomer(String str) {
           String[] info=str.split(",");
           Customer a=new Customer();
           a.setUserId(info[0]);
           a.setName(info[1]);
           a.setGender(info[2]);
           a.setEmail(info[3]);
           a.setPhoneNo(info[4]);
           a.setAddress(info[5]);
           a.setAge(Integer.parseInt(info[6]));
           a.setDiscountPercentage(info[7]);
		   a.setMembershipType(info[8]);
		   
		   return a;
	}
	
}