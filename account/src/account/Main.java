package account;

import business.concretes.UserManager;
import core.JGoogleRegisterManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.UserValidationDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(new UserValidationDao(),new JGoogleRegisterManagerAdapter()));
		userManager.save(new User(1,"sa","gn","safagun@gmail.com","123456",true));
		
		userManager.login(new User(2,"cemil","gün",null,"abcklm",true));
		
		userManager.saveWithGoogle(new User(3,"mrv","gn","mrv@gmail.com","xyz123",true));
	}

}
