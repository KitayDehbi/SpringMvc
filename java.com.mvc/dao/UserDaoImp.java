package dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import models.User;
@Repository
public class UserDaoImp implements UserDao{
	@Autowired
    private SessionFactory sessionFactory;
	@Override
	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root< User > root = cq.from(User.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
	}

	@Override
	public User getUser(String userName) {
		 Session currentSession = sessionFactory.getCurrentSession();
	        User u = currentSession.get(User.class, userName);
	        return u;
	}

	@Override
	public void saveUser(User u) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(u);
	}

	@Override
	public void delete(String userName) {
		Session session = sessionFactory.getCurrentSession();
        User catalogue = session.byId(User.class).load(userName);
        session.delete(catalogue);	
		
	}

}
