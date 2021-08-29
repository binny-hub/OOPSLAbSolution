/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatlearning.model;

/**
 *
 * @author Dell
 */
public class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName, String lastName)
    { this.firstName = firstName;
      this.lastName = lastName;
    }
    
    public String get_firstName(){
    return firstName;
    }
    public String get_lastName(){
        return lastName;
    }
    public void  setFirstName(String firstName)
    {this.firstName = firstName;
    }
    public void  setLastName(String lastName)
    {this.lastName = lastName;
    }
}
