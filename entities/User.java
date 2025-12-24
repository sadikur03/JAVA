package entities;
import java.lang.*;

public class User {
     protected String userId,name,gender,email,phoneNo,address,securityAns,password;
	 protected int age,role;
	 
	 public User() {}
	 
	 public User(String userId,String name,String gender,String email,String phoneNo,String address,String securityAns,String password,int age,int role) {
	      this.userId=userId;
		  this.name=name;
		  this.gender=gender;
		  this.email=email;
		  this.phoneNo=phoneNo;
		  this.address=address;
		  this.securityAns=securityAns;
		  this.password=password;
		  this.age=age;
		  this.role=role;
		  }
		  
	public void setUserId(String userId) {
	    this.userId=userId;
		}
	public void setName(String name) {
	    this.name=name;
		}
	public void setGender(String gender) {
	   this.gender=gender;
	   }
	public void setEmail(String email) {
        this.email=email;
       }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo=phoneNo;
       }
    public void setAddress(String address) {
        this.address=address;
       }
    public void setSecurityAns(String securityAns) {
        this.securityAns=securityAns;
       }
    public void setPassword(String password) {
        this.password=password;
       }
    public void setAge(int age) {
        this.age=age;
       }
    public void setRole(int role) {
        this.role=role;
       }
	   
	   
	   
	   
	   
	public String getUserId() {
	     return this.userId;
		}
	public String getName() {
	    return this.name;
		}
	public String getGender() {
	   return this.gender;
	   }
	public String getEmail() {
        return this.email;
       }
    public String getPhoneNo() {
        return this.phoneNo;
       }
    public String getAddress() {
        return this.address;
       }
    public String getSecurityAns() {
        return this.securityAns;
       }
    public String getPassword() {
        return this.password;
       }
    public int getAge() {
        return this.age;
       }
    public int getRole() {
        return  this.role;
       }
	   
	   
	public String toStringUser() {
           String str=this.userId+","+this.role+","+this.securityAns+","+this.password+"\n";
               return str;
	}			   
	   
	   
	public User formUser(String str) {
		String[] info=str.split(",");
		
		User u=new User();
		u.setUserId(info[0]);
		u.setRole(Integer.parseInt(info[1]));
		u.setSecurityAns(info[2]);
		u.setPassword(info[3]);
		return u;
	}
	
}