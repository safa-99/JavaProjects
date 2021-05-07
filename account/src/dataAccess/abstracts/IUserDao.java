package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface IUserDao {

		public void save(User user);
		public void delete(User user);
		public void update(User user);
		public void saveWithGoogle(User user);
		public void login(User user);
		User getUser(int id);
		List<User> getAll();
}
