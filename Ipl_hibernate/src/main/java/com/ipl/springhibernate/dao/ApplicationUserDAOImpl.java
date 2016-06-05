package com.ipl.springhibernate.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ipl.springhibernate.model.ApplicationUser;

@Repository
public class ApplicationUserDAOImpl implements ApplicationUserDAO{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationUserDAO.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addUser(ApplicationUser au) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(au);
		logger.info("user created"+au);
		
	}

	@Override
	public List<ApplicationUser> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ApplicationUser> applicationUserList = session.createQuery("from ApplicationUser").list();
        for(ApplicationUser au : applicationUserList){
            logger.info("Person List::"+au);
        }
        return applicationUserList;
	}

 
}
