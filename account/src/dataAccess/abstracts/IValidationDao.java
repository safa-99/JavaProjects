package dataAccess.abstracts;

import entities.concretes.User;

public interface IValidationDao {
	
		public boolean validate(User user); //do�rulama e-postas�
}
