/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bst;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kelumt
 */
public class PersonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //We should not allow this. id, name and birthdate should be mandatory
        //Person person = new Person();
        int id = 1;
        String name = "John Snow";
        
        try{
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date birthDate = df.parse("1975-03-29");

            Person snow1 = new Person(id, name, birthDate);
            
            System.out.println(snow1);
            
            System.out.println("Person's Age = " + snow1.getAge());
            
            Person snow2 = new Person(id, name, birthDate);
            
            if(snow1 == snow2){
                System.out.println("Persons snow1 and snow2 are same");
            }else{
                System.out.println("Persons snow1 and snow2 are not same");
            }
            
            if(snow1.equals(snow2)){
                System.out.println("Persons snow1 and snow2 are same");
            }else{
                System.out.println("Persons snow1 and snow2 are not same");
            }
            
            Student student = new Student("S001", 2, "Mark Taylor", birthDate);
            
            System.out.println("Student's Age = " + student.getAge());
            System.out.println("Student's Allowance = " + student.calculateAllowance());
            
            Employee employee = new Employee("E001", 3, "David Boon", birthDate);
            
            System.out.println("Employee's Age = " + employee.getAge());
            System.out.println("Employee's Allowance = " + employee.calculateAllowance());
            
        }catch(ParseException prEx){
            prEx.printStackTrace();
        }
    }
    
}
