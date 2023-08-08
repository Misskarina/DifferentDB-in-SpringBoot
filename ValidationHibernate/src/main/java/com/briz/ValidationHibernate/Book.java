package com.briz.ValidationHibernate;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@NotEmpty(message="Book name is not be empty")
	String bkname;
	
	@Email(message="Please enter a valid email",regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	String email;
	
	@NotNull(message="please enter publication details")
	String Publication;
	
	@Temporal(value=TemporalType.TIMESTAMP)
    Date createdTime=new Date();
	
	@Temporal(value=TemporalType.TIMESTAMP)
	Date updatedTime =new Date() ;
	
	@Past
	@Temporal(value=TemporalType.DATE)
	@JsonFormat(pattern="yy-MM-dd")
	 Date Dateofbirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBkname() {
		return bkname;
	}

	public void setBkname(String bkname) {
		this.bkname = bkname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPublication() {
		return Publication;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}

	public Date getDateofbirth() {
		return Dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	
	
	
}
