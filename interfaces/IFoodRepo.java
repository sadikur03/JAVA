package interfaces;
import java.lang.*;
import entities.*; 

public interface IFoodRepo {
	void addFood(Food u);
	void removeFood(String u);
	void updateFood(Food u);
	Food searchFoodByFoodId(String Id);
	Food[] searchFoodByUserId(String Id);
	Food[] getAllFood();
	
}