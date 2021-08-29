/* 1) Write Code in Driver Class to Display Options
"Please enter the department from the following
	"1. Technical"
	"2. Admin"
	"3. Human Resource"
	"4. Legal"
2)Manually write getter and setter of Employee POJO class
*/
package com.greatlearning.service;



import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int ch;
        System.out.println("Enter the department ( 1/2/3/4)");
        ch = sc.nextInt();
        String fnm ,lnm;
        
        System.out.println("Enter the first name");
        fnm = sc.next();
        System.out.println("Enter the Last name");
        lnm = sc.next();
        String email;
        Employee emp= new Employee( fnm,lnm);
        String department= new String();     
        CredentialService cs = new CredentialService();
        switch(ch){
            case 1: department ="tech";
                    break;
             case 2: department ="admn";
                    break; 
             case 3:  department ="hr";
                    break;       
             case 4: department ="legal";
                    break;           
             default : System.out.println("Enter a valid number");
        }
        email = cs.generateEmailAdress(emp, department);
        char [] Password ;
        Password = cs.generatePassword();
        cs.showCredentials(emp, email, Password);
            }
}
