package entities;
import java.lang.*;

public class OrderLine {
	private int orderLineId,orderId,foodId;
	private String quantity,amount;
	
	public OrderLine() {}
	
	public OrderLine(int orderLineId,int orderId,int foodId,String quantity,String amount) { 
	    this.orderLineId=orderLineId;
		this.orderId=orderId;
		this.foodId=foodId;
		this.quantity=quantity;
		this.amount=amount;
	}
	
	public void setOrderLineId(int orderLineId) {
		this.orderLineId=orderLineId;
	}
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public void setFoodId(int foodId) {
		this.foodId=foodId;
	}
	public void setQuantity(String quantity) {
		this.quantity=quantity;
	}
	public void setAmount(String amount) {
		this.amount=amount;
	}
	
	public int getOrderLineId() {
		return this.orderLineId;
	}
	public int getOrderId() {
		return this.orderId;
	}
	public int getFoodId() {
		return this.foodId;
	}
	public String getQuantity() {
		return this.quantity;
	}
	public String getAmount() {
		return this.amount;
	}
	
	public String toStringOrderLine() {
		String str=this.orderLineId+","+this.orderId+","+this.foodId+","+this.quantity+","+this.amount+"\n";
		    return str;	
	}
	
	public OrderLine formOrderLine(String str) {
           String[] info=str.split(",");
           OrderLine a=new OrderLine();
           a.setOrderLineId(Integer.parseInt(info[0]));
           a.setOrderId(Integer.parseInt(info[1]));
           a.setFoodId(Integer.parseInt(info[2]));
           a.setQuantity((info[3]);
           a.setAmount(info[4]);
           
		   return a;
	}
	
	
}
