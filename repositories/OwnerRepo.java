package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;

public class OwnerRepo implements IOwnerRepo {
	
	public void addOwner(Owner u) {
	
		Owner[] ownerList=this.getAllOwner();
		
		for(int i=0;i<ownerList.length;i++)
		{
			if(ownerList[i]==null)
			{
				ownerList[i]=u;
				break;
			}
		}
		
		this.write(ownerList);
	
	}
	
	public void removeOwner(String u) {
		Owner[] ownerList=this.getAllOwner();
		
		for(int i=0;i<ownerList.length;i++)
		{
			if(ownerList[i]!=null)
			{
				if(ownerList[i].getUserId().equals(u))
				{
					ownerList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(ownerList);
	}
	
	public void updateOwner(Owner u) {
		Owner[] ownerList=this.getAllOwner();
		
		for(int i=0;i<ownerList.length;i++)
		{
			if(ownerList[i]!=null)
			{
				if(ownerList[i].getUserId().equals(u.getUserId()))
				{
					ownerList[i]=u;
					break;
				}
			}
			
		}
		
		this.write(ownerList);
	}
	
	public Owner searchOwnerByUserId(String id) {
		Owner[] ownerList=this.getAllOwner();
		
		for(int i=0;i<ownerList.length;i++)
		{
			if(ownerList[i]!=null)
			{
				if(ownerList[i].getUserId().equals(id))
				{
					return ownerList[i];
				}
			}
			
		}

		return null;
	}
	
	public Owner[] getAllOwner() {
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/owner.txt");
		
		
		Owner a=new Owner();
		Owner[] ownerList=new Owner[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				ownerList[i]=a.formOwner(str);
				
			}
			
			i++;
		}
		
		return ownerList;
	}
	
	public void write(Owner[] ownerList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(ownerList[i]!=null)
			{
				data[i]=ownerList[i].toStringOwner();
			}
			
		}
		
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/owner.txt");
	}
	
}