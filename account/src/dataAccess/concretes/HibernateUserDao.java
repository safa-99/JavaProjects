package dataAccess.concretes;

import java.util.List;

import core.RegisterService;
import dataAccess.abstracts.IUserDao;
import dataAccess.abstracts.IValidationDao;
import entities.concretes.User;

public class HibernateUserDao implements IUserDao {

	private IValidationDao validationdao;
	private RegisterService registerservice;

	public HibernateUserDao(IValidationDao validationdao, RegisterService registerservice) {
		super();
		this.validationdao = validationdao;
		this.registerservice = registerservice;
	}

	@Override
	public void save(User user) {

		if (validationdao.validate(user)) {
			System.out.println("Üyelik iþlemleri tamamlandý");
		} else {

			System.out.println("Üyelik gerçekleþtirilemedi");
		}

	}

	@Override
	public void saveWithGoogle(User user) {

		registerservice.register(user.getEmail(), user.getPassword());

	}

	@Override
	public void login(User user) {

		System.out.println(user.getFirstName() + " sisteme giriþ yaptýnýz");

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
