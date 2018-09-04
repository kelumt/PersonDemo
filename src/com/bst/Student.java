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
public class Student extends Person{
    
    private String studentId;

    public Student(String studentId, int id, String name, Date birthDate) {
        super(id, name, birthDate);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public float calculateAllowance() {
        float basicAllowance = super.calculateAllowance();
        return  (basicAllowance + 5000);
    }
    
    
    
}
