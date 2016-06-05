package com.ipl.springhibernate.service;

import java.util.List;

import com.ipl.springhibernate.model.ApplicationUser;
 
public interface ApplicationUserService {
 
    public void addUser(ApplicationUser au);
    public List<ApplicationUser> listUsers();
     
}