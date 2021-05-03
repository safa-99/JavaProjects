package concrete;

import abstracts.BaseCustomerManager;
import abstracts.IValidationService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private IValidationService validationService;
	

	public StarbucksCustomerManager(IValidationService validationService) {

		this.validationService = validationService;
	}

	
	@Override
	public void save(Customer customer) {
         
			if(validationService.validate(customer)) {
				
				System.out.println(customer.getFirstName() + " db kaydedildi");
			}
			else {
				
				System.out.println("Kimlik Doðrulanamadý!");
			}
	}
}
