package entities;
import java.lang.*;

public Food {
	private int foodId,pricePerUnit;
	private String name,category,details;
	
	public Food() {}
	
	public Food(int foodId,String name,String category,int pricePerUnit,String details) {     
	      this.foodId=foodId;
		  this.name=name;
		  this.category=category;
		  this.pricePerUnit=pricePerUnit;
		  this.details;
	}
	
	public void setFoodId(int foodId) {
		this.foodId=foodId;
	}
	public void setName(String name) {
		this.name;
	}
	public void setCategory(String Category) {
		this.category=category;
	}
	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit;
	}
	public void setDetails(String details) {
		this.details=details;
	}
	public int getFoodId() {
		return this.foodId;
	}
	public String getName() {
		return this.name;
	}
	public String getCategory() {
		return this.category;
	}
	public int getPricePerUnit() {
		return this.pricePerUnit;
	}
	public String getDetails() {
		return this.details;
	}
	
	public String toStringFood() {
		String str=this.foodIdId+","+this.name+","+this.category+","+this.pricePerUnit+","+this.details+"\n";
		    return str;	
	}
	
	public Food formFood(String str) {
		String[] info=str.split(",");
		
		Food u=new Food();
		u.setFoodId(Integer.parseInt(info[0]));
		u.setName(info[1]);
		u.setPricePerUnit(Integer.parseInt(info[2]));
		u.setDetails(info[3]);
		
	}
	
}
	