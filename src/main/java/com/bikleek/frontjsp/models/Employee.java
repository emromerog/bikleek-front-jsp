package com.bikleek.frontjsp.models;

public class Employee {
	
	private long id;

    private String firstName;

    private String lastName;

    private String email;
    
    private String identification;
    
    public Employee() {

    }

    public Employee(String firstName, String lastName, String email, String identification) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
    }
    public long getId() {
        return id;
    }
    
    
    public void setId(long id) {
        this.id = id;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getIdentification() {
        return identification;
    }
    
    public void setIdentification(String identification) {
        this.identification = identification;
    }

}
