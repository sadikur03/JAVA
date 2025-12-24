package interfaces;
import java.lang.*;
import entities.*;

public interface IPaymentRepo {
	void addPayment(Payment u);
	void removePayment(String u);
	void updatePayment(Payment u);
	Payment searchPaymentByPaymentId(String Id);
	Payment[] searchPaymentByOrderId(String Id);
	Payment[] searchPaymentByUserId(String Id);
	Payment[] getAllPayment();
	
}