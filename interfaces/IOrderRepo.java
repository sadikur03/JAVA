package interfaces;
import java.lang.*;
import entities.*;

public interface IOrderRepo {
	void addOrder(Order u);
	void removeOrder(String u);
	void updateOrder(Order u);
	Order searchOrderByOrderId(String Id);
	Order[] searchOrderByUserId(String Id);
	Order[] getAllOrder();
	
}