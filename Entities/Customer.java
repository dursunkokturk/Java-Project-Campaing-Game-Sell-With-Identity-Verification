package Entities;

import Abstracts.IEntity;

public class Customer implements IEntity {
    private int id;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private int birthDay;

    public Customer(){

    }
    public Customer(int id,String nationalityId,String firstName,String lastName,int birthDay){
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(String nationalityId){
        this.nationalityId = nationalityId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }
}