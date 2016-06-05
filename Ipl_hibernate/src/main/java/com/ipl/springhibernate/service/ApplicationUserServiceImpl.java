package com.ipl.springhibernate.service;

import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipl.springhibernate.dao.ApplicationUserDAO;
import com.ipl.springhibernate.model.ApplicationUser;

@Service
@ManagedBean(name="ApplicationUserService")
@SessionScoped
public class ApplicationUserServiceImpl implements ApplicationUserService {

	private ApplicationUserDAO userDAO;
	 
    public void setPersonDAO(ApplicationUserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
    @Override
    @Transactional
    public void addUser(ApplicationUser au) {
        this.userDAO.addUser(au);
    }
 
    @Override
    @Transactional
    public List<ApplicationUser> listUsers() {
        return this.userDAO.listUsers();
    }
 
}
