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

			System.out.println("�sminiz en az 2 karakterden olu�mal�");
			return;
		}

		if (user.getLastName().length() < 2) {

			System.out.println("Soyad�n�z en az 2 karakterden olu�mal�");
			return;
		}

		if (!user.getEmail().matches("(?simx)\\b[A-Z0-9._%+-]+" + "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")) {

			System.out.println("Ge�erli bir e-posta giriniz");
			return;
		}

		if (user.getPassword().length() < 6) {

			System.out.println("Parolan�z en az 6 karakterden olu�mal�");
			return;
		}

		userdao.save(user);

	}

	@Override
	public void login(User user) {

		if (user.getEmail() == null || user.getPassword() == null) {

			System.out.println("L�tfen gerekli alanlar� doldurunuz");
			return;
		}

		

		userdao.login(user);
	}

	@Override
	public void saveWithGoogle(User user) {
		
		userdao.saveWithGoogle(user);
		
	}

}
