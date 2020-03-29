package buisness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import models.User;

@Service
public class UserServiceImp implements UserService{
	@Autowired
    private UserDao userDao;
	
	
	
	@Override
    @Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	@Override
	@Transactional
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUser(userName);
	}

	@Override
	@Transactional
	public void saveUser(User u) {
		// TODO Auto-generated method stub
		userDao.saveUser(u);
	}

	@Override
	@Transactional
	public void delete(String userName) {
		// TODO Auto-generated method stub
		userDao.delete(userName);
	}
	
}
