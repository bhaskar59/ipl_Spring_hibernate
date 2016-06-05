package com.ipl.springhibernate.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author muni
 *
 */
@Entity
@Table(name="ApplicationUser")
@ManagedBean(name="application_user")
public class ApplicationUser {
	@Id
    @Column(name="user_identifier")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userIdentifier;
	@Column(name = "user_email_identifier")
    private String userEmailidentifier;
	
	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "last_name")
    private String lastName;
	
	@Column(name = "last_modified_by")
    private int lastModifiedBy;
	
	@Column(name = "last_modified_date")
    private Date lastmodifieddate;
	
	
	public int getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(int userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

	public String getUserEmailidentifier() {
		return userEmailidentifier;
	}

	public void setUserEmailidentifier(String userEmailidentifier) {
		this.userEmailidentifier = userEmailidentifier;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(int lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}

	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}


}