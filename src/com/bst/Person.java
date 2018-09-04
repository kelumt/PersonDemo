/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bst;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author kelumt
 */
public class Person {
    
    private int id;
    private String name;
    private Date birthDate;
    private int age;
    
    public Person(int id, String name, Date birthDate){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        Calendar nowCal = Calendar.getInstance();
        
        Calendar birthDateCal = Calendar.getInstance();
        birthDateCal.setTime(this.birthDate);
        this.age = (nowCal.get(Calendar.YEAR) - birthDateCal.get(Calendar.YEAR));
        
        return this.age;
    }
    
    /*
    public void setAge(int age) {
        this.age = age;
    }
    */
    
    public float calculateAllowance(){
        float allowance = this.getAge()*100;
        return allowance;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        return true;
    }
    
    
}
