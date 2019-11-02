package com.intercorp.retail.model.database;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "client")
public class Client {
	
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    
    private String name;
    
    private String lastName;
    
    private Integer age;
    
    private Date birthday;
    
	public Client() {
		super();
	}

	public Client(Long id, String name, String lastName, Integer age, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.birthday = birthday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
    
    
}
