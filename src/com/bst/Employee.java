/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bst;

import java.util.Date;

/**
 *
 * @author kelumt
 */
public class Employee extends Person{
    
    private String employeeNo;

    public Employee(String employeeNo, int id, String name, Date birthDate) {
        super(id, name, birthDate);
        this.employeeNo = employeeNo;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
    
    
    
}
