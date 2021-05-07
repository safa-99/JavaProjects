package dataAccess.concretes;

import dataAccess.abstracts.IValidationDao;
import entities.concretes.User;

public class UserValidationDao implements IValidationDao {

	@Override
	public boolean validate(User user) { //kullanýcý doðrulamasý
		
		if(user.getConfirmation()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}

}
