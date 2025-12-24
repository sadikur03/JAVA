package entities;
import java.lang.*;

public class Employee extends User {
	private String designation;
	private String salary;
	
	public Employee() {}
	
	public Employee(String userId,String name,String gender,String email,String phoneNo,String address,String securityAns,String password,int age,int role,String designation,String salary) {   
	      super(userId,name,gender,email,phoneNo,address,securityAns,password,age,role);
		  this.designation=designation;
		  this.salary=salary;
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public void setSalary(String salary) {
		this.salary=salary;
	}
	public String getDesignation() {
		return this.designation;
	}
	public String getSalary() {
		return this.salary;
	}
	public String toStringEmployee() {
		String str=this.userId+","+this.name+","+this.gender+","+this.email+","+this.phoneNo+","+this.address+","+this.age+","+this.designation+","+this.salary+"\n";
		    return str;	
	}
	
	public Employee formEmployee(String str) {
           String[] info=str.split(",");
           Employee a=new Employee();
           a.setUserId(info[0]);
           a.setName(info[1]);
           a.setGender(info[2]);
           a.setEmail(info[3]);
           a.setPhoneNo(info[4]);
           a.setAddress(info[5]);
           a.setAge(Integer.parseInt(info[6]));
           a.setDesignation(info[7]);
		   a.setSalary(info[8]);
		   
		   return a;
	}
	
}
		