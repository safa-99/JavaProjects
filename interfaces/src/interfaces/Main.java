package interfaces;

public class Main {
	
	public static void main(String args[]) {
		
		Logger [] loggers = {new EmailLogger(),new SmsLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer = new Customer(1,"Engin","Demiroð");
		
		
		customerManager.add(customer);
		
		
		
	}

}
