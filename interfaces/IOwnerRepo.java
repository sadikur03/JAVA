package interfaces;
import java.lang.*;
import entities.*;

public interface IOwnerRepo {
	void addOwner(Owner u);
	void removeOwner(String u);
	void updateOwner(Owner u);
	Owner searchOwnerByUserId(String Id);
	Owner[] getAllOwner();
	
}