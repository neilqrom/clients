package com.intercorp.retail.model;

public class ClientResponse {

	private String name;
	private String lastName;
	private Integer age;
    private String birthday;
    private String deathDate;
    
    
    
	public ClientResponse(String name, String lastName, Integer age, String birthday, String deathDate) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.birthday = birthday;
		this.deathDate = deathDate;
	}



	public ClientResponse() {
		super();
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



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public String getDeathDate() {
		return deathDate;
	}



	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}
    
    
	
}
