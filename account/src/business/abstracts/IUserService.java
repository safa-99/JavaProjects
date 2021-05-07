package business.abstracts;

import entities.concretes.User;

public interface IUserService {
	
	public void save(User user);
	public void saveWithGoogle(User user);
	public void login(User user);
}
