/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.Employee;
/**
 *
 * @author Dell
 */
public class CredentialService {
    public char[] generatePassword()
    { Random rn = new Random(); 
        String st = "!@#$%^&*_+=-?/<>)";
        int L = st.length();
        int j=0;
        char Capital, Small, number,special;
         char [] password = new char[8];
         for(int i =0 ; i <2; i++){
         password[j++] = (char)((int)rn.nextInt(26)+65);
         password[j++] = (char)((int)rn.nextInt(26)+97);
         password[j++] = (char)((int)rn.nextInt(48)+9);
         if (i==0)
         password[j++] = st.charAt(rn.nextInt(L));
         else
           password[j] = st.charAt(rn.nextInt(L));  
         }
         return password;
    }
     
public String generateEmailAdress(Employee emp, String Department)
{
    return emp.get_firstName().toLowerCase()+emp.get_lastName().toLowerCase()+'@'+Department+".abc.com";
    }
 
public void showCredentials(Employee emp, String email, char [] pwd )
{
System.out.println("Dear "+ emp.get_firstName()+ "Your Credentials are -->");
System.out.println("Email id ----->" + email);
System.out.print("Password is ----->" );
System.out.println(pwd);
}
    }
    
