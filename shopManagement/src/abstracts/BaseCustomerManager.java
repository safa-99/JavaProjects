package abstracts;

import entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		
		System.out.println(customer.getFirstName() + " db kaydedildi.");
		
		
	}

}
