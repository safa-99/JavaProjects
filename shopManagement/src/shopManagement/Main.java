package shopManagement;

import abstracts.BaseCustomerManager;
import adapters.MernisServisAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		baseCustomerManager.save(new Customer(1,"Safa","G�n",1999,"11122233344"));
		
		
		
		
		
	}

}
