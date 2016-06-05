package com.ipl.springhibernate.dao;

import java.util.List;

import com.ipl.springhibernate.model.ApplicationUser;
 
public interface ApplicationUserDAO {
 
    public void addUser(ApplicationUser au);
    public List<ApplicationUser> listUsers();
}