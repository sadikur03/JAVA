package interfaces;
import java.lang.*;
import entities.*;

public interface IEmployeeRepo {
	void addEmployee(Employee u);
	void removeEmployee(String u);
	void updateEmployee(Employee u);
	Employee searchEmployeeByUserId(String Id);
	Employee[] getAllEmployee();
	
}