package interfaces;
import java.lang.*;
import entities.*;

public interface ICustomerRepo {
	void addCustomer(Customer u);
	void removeCustomer(String u);
	void updateCustomer(Customer u);
	Customer searchCustomerByUserId(String Id);
	Customer[] getAllCustomer();
	
}