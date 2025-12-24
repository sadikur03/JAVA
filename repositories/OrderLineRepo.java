package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;

public class OrderLineRepo implements IOrderLineRepo {
	public void addOrderLine(OrderLine u) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]==null)
			{
				orderLineList[i]=u;
				break;
			}
		}
		
		this.write(orderLineList);
	}
	public void removeOrderLine(String u) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLineList[i].getOrderLineId().equals(u))
				{
					orderLineList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(orderLineList);
	}
	public void updateOrderLine(OrderLine u) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLineList[i].getOrderLineId().equals(u.getOrderLineId()))
				{
					orderLineList[i]=u;
					break;
				}
			}
			
		}
		
		this.write(orderLineList);
	}
	public OrderLine searchOrderLineByOrderLineId(String id) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLineList[i].getOrderLineId().equals(id))
				{
					return orderLineList[i];
				}
			}
			
		}

		return null;
	}
	public OrderLine[] searchOrderLineByOrderId(String id) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLine[i].getOrderId().equals(id))
				{
					return orderLineList[i];
				}
			}
			
		}

		return null;
	}
	public OrderLine[] searchOrderLineByFoodId(String id) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLine[i].getFoodId().equals(id))
				{
					return orderLineList[i];
				}
			}
			
		}

		return null;
	}
	public OrderLine[] searchOrderLineByUserId(String id) {
		OrderLine[] orderLineList=this.getAllOrderLine();
		OrderLine[] foundOrderLine=new OrderLine[100];
		
		for(int i=0;i<orderLineList.length;i++)
		{
			if(orderLineList[i]!=null)
			{
				if(orderLineList[i].getUserId().equals(id))
				{
					foundOrderLine[i]=OrderLineList[i];
				}
			}
			
		}

		return foundOrderLine;
	}
	public OrderLine[] getAllOrderLine() {
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/orderLine.txt");
		
		
		OrderLine r=new OrderLine();
		OrderLine[] orderLineList=new OrderLine[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				orderLineList[i]=r.formOrderLine(str);
				
			}
			
			i++;
		}
		
		return orderLineList;
	}
	
	public void write(OrderLine[] orderLineList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(orderLineList[i]!=null)
			{
				data[i]=orderLineList[i].toStringOrderLine();
			}
			
		}
		
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/orderLine.txt");
	}
	
}