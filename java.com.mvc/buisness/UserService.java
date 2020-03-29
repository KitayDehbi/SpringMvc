package buisness;

import java.util.List;

import models.User;

public interface UserService {
	public List<User> getUsers();
	public User getUser(String userName);
	public void saveUser(User u);
	public void delete(String userName);
}
