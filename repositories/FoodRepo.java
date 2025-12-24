package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;

public class FoodRepo implements IFoodRepo {
	public void addFood(Food u) {
		Food[] foodList=this.getAllFood();
		
		for(int i=0;i<foodList.length;i++)
		{
			if(foodList[i]==null)
			{
				foodList[i]=u;
				break;
			}
		}
		
		this.write(foodList);
	}
	public void removeFood(String u) {
		Food[] foodList=this.getAllFood();
		
		for(int i=0;i<foodList.length;i++)
		{
			if(foodList[i]!=null)
			{
				if(foodList[i].getUserId().equals(u))
				{
					foodList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(foodList);
	}
	public void updateFood(Food u) {
		Food[] foodList=this.getAllFood();
		
		for(int i=0;i<foodList.length;i++)
		{
			if(foodList[i]!=null)
			{
				if(foodList[i].getUserId().equals(u.getUserId()))
				{
					foodList[i]=u;
					break;
				}
			}
			
		}
		
		this.write(foodList);
	}
	public Food searchFoodByFoodId(String id) {
		Food[] foodList=this.getAllFood();
		
		for(int i=0;i<foodList.length;i++)
		{
			if(foodList[i]!=null)
			{
				if(foodList[i].getFoodId().equals(id))
				{
					return foodList[i];
				}
			}
			
		}

		return null;
	}
	public Food[] searchFoodByUserId(String id) {
		Food[] foodList=this.getAllFood();
		Food[] foundFood=new Food[100];
		
		for(int i=0;i<foodList.length;i++)
		{
			if(foodList[i]!=null)
			{
				if(foodList[i].getUserId().equals(id))
				{
					foundFood[i]=foodList[i];
				}
			}
			
		}

		return foundFood;
	}
	public Food[] getAllFood() {
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/food.txt");
		
		
		Food r=new Food();
		Food[] foodList=new Food[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				foodList[i]=r.formFood(str);
				
			}
			
			i++;
		}
		
		return foodList;
	}
	
	public void write(Food[] foodList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(foodList[i]!=null)
			{
				data[i]=foodList[i].toStringFood();
			}
			
		}
		
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/food.txt");
	}
	
}