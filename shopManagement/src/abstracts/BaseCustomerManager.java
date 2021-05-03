package abstracts;

import entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName() + " db kaydedildi.");
		
		
	}

}
