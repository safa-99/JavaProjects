package business.concretes;

import business.abstracts.IUserService;
import dataAccess.abstracts.IUserDao;
import entities.concretes.User;
import javax.swing.JOptionPane;

public class UserManager implements IUserService {

	private IUserDao userdao;

	public UserManager(IUserDao userdao) {

		this.userdao = userdao;
	}

	@Override
	public void save(User user) {

		if (user.getFirstName().length() < 2) {

			System.out.println("Ýsminiz en az 2 karakterden oluþmalý");
			return;
		}

		if (user.getLastName().length() < 2) {

			System.out.println("Soyadýnýz en az 2 karakterden oluþmalý");
			return;
		}

		if (!user.getEmail().matches("(?simx)\\b[A-Z0-9._%+-]+" + "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")) {

			System.out.println("Geçerli bir e-posta giriniz");
			return;
		}

		if (user.getPassword().length() < 6) {

			System.out.println("Parolanýz en az 6 karakterden oluþmalý");
			return;
		}

		userdao.save(user);

	}

	@Override
	public void login(User user) {

		if (user.getEmail() == null || user.getPassword() == null) {

			System.out.println("Lütfen gerekli alanlarý doldurunuz");
			return;
		}

		

		userdao.login(user);
	}

	@Override
	public void saveWithGoogle(User user) {
		
		userdao.saveWithGoogle(user);
		
	}

}
