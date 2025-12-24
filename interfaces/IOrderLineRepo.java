package interfaces;
import java.lang.*;
import entities.*;

public interface IOrderLineRepo {
	void addOrderLine(OrderLine u);
	void removeOrderLine(String u);
	void updateOrderLine(OrderLine u);
	OrderLine searchOrderLineByOrderLineId(String Id);
	OrderLine[] searchOrderLineByOrderId(String Id);
	OrderLine[] searchOrderLineByFoodId(String Id);
	OrderLine[] searchOrderLineByUserId(String Id);
	OrderLine[] getAllOrderLine();
	
}