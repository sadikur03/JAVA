package entities;
import java.lang.*;

public class Payment {
	private String paymentId,orderId,userId,paymentDate;
	private int amount;
	
	public Payment() {}
	
	public Payment(String paymentId,String orderId,String userId,int amount,String paymentDate) {  
	      this.paymentId=paymentId;
		  this.orderId=orderId;
		  this.userId=userId;
		  this.amount=amount;
		  this.paymentDate=paymentDate;
	}
	
	public void setPaymentId(String paymentId) {
		this.paymentId=paymentId;
	}
	public void setOrderId(String orderId) {
		this.orderId=orderId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setPaidAmount(int amount) {
		this.amount=amount;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate=paymentDate;
	}
	
	public String getPaymentId() {
		return this.paymentId;
	}
	public String getOrderId() {
		return this.orderId;
	}
	public String getUserId() {
		return this.userId;
	}
	public int getPaidAmount() {
		return this.amount;
	}
	public String getPaymentDate() {
		return this.paymentDate;
	}
	
	public String toStringPayment() {
		String str=this.paymentId+","+this.orderId+","+this.userId+","+this.amount+","+this.paymentDate+"\n";
		    return str;	
	}
	
	public Payment formPayment(String str) {
           String[] info=str.split(",");
           Payment a=new Payment();
           a.setPaymentId(info[0]);
           a.setOrderId(info[1]);
           a.setUserId(info[2]);
           a.setPaidAmount(Integer.parseInt(info[3]));
           a.setPaymentDate(info[4]);
           
		   return a;
	}
	
}
	