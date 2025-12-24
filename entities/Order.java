package entities;
import java.lang.*;

public class Order {
	private int orderId,userId,totalAmount,paidAmount,dueAmount;
	private String orderStatus,paymentStatus,orderDate;
	
	public Order() {}
	
	public Order(int orderId,int userId,int totalAmount,int paidAmount,int dueAmount,String orderStatus,String paymentStatus,String orderDate) {  
	      this.orderId=orderId;
		  this.userId=userId;
		  this.totalAmount=totalAmount;
		  this.paidAmount=paidAmount;
		  this.dueAmount=dueAmount;
		  this.orderStatus=orderStatus;
		  this.paymentStatus=paymentStatus;
		  this.orderDate=oderdate;
	}
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public void setUserId(int userId) {
		this.userId=userId;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount=totalAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount=paidAmount;
	}
	public void setDueAmount(int dueAmount) {
		this.dueAmount=dueAmount;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus=orderStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus=paymentStatus;
	}
	public void setOrderDate(String orderDate) {
		this.oderdate=orderDate;
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	public int getUserId() {
		return this.userId;
	}
	public int getTotalAmount() {
		return this.totalAmount;
	}
	public int getPaidAmount() {
		return this.paidAmount;
	}
	public int getDueAmount() {
		return this.dueAmount;
	}
	public String getOrderStatus() {
		return this.orderStatus;
	}
	public String getPaymentStatus() {
		return this.paymentStatus;
	}
	public String getOrderDate() {
		return this.oderdate;
	}
	
	public String toStringOrder() {
		String str=this.orderId+","+this.userId+","+this.totalAmount+","+this.paidAmount+","+this.dueAmount+","+this.orderStatus+","+this.paymentStatus+","+this.orderDate+"\n";
		    return str;	
	}
	
	public Order formOrder(String str) {
           String[] info=str.split(",");
           Order a=new Order();
           a.setOrderId(Integer.parseInt(info[0]));
           a.setUserId(Integer.parseInt(info[1]));
           a.setTotalAmount(Integer.parseInt(info[2]));
           a.setPaidAmount(Integer.parseInt(info[3]));
           a.setDueAmount(Integer.parseInt(info[4]));
           a.setOrderStatus(info[5]);
           a.setPaymentStatus(Integer.parseInt(info[6]);
           a.setOrderDate(info[7]);
		   
		   return a;
	}
	
}
	
	