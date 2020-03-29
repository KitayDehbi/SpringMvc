package dao;

import java.util.List;

import models.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUser(String userName);
	public void saveUser(User u);
	public void delete(String userName);
}
