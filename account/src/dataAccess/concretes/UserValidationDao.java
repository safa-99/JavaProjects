package dataAccess.concretes;

import dataAccess.abstracts.IValidationDao;
import entities.concretes.User;

public class UserValidationDao implements IValidationDao {

	@Override
	public boolean validate(User user) { //kullan�c� do�rulamas�
		
		if(user.getConfirmation()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}

}
