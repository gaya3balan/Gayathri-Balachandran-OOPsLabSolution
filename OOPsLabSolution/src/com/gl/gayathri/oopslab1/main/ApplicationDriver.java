package com.gl.gayathri.oopslab1.main;

import java.util.Scanner;
import com.gl.gayathri.oopslab1.businessobject.*;
import com.gl.gayathri.oopslab1.service.CredentialService;

public class ApplicationDriver{
	
	final static String applicantFirstName="Gayathri";    // set the firstname 
	final static String applicantLastName="Balachandran"; //set the lastname
	
	//implementing as static as used to call run method recursively for invalid options 
	//entered by user to give chance to user to enter correct option 1 to 4 again.
	                       
	
    static char[] applicantPassword ; //implementing as static as used to call run method recursively for invalid options by user
                                      //to give chance to user to enter correct option 1 to 4 again.
    static String applicantEmail ; //implementing as static as used to call run method recursively for invalid options by user
                                   //to give chance to user to enter correct option 1 to 4 again.
    static Employee employeeName ; //implementing as static as used to call run method recursively for invalid options by user
                                   //to give chance to user to enter correct option 1 to 4 again.
    static CredentialService ob; //implementing as static as used to call run method recursively for invalid options by user
                                  //to give chance to user to enter correct option 1 to 4 again.
    static Scanner sc;//implementing as static as used to call run method recursively for invalid options by user
                     //to give chance to user to enter correct option 1 to 4 again.

    //Main Method
    public static void main(String[] args) {
        
    	employeeName = new Employee(applicantFirstName,applicantLastName); // parameterized constructor of Employee class 
    	 ob = new CredentialService();  //create object to instantiate CredentialService class 
    	 sc = new Scanner(System.in);        //instantiate Scanner class by created object sc
        run();
        
    }
       
    //Run Method implemented so that this logic can called in recursion when user enters invalid choice and give a chance
    //enter the correct option. 
    private static void run() {
    		
	    System.out.println("Please enter the department from the following"  );  //give options to users to choose from 
	    System.out.println("1. Technical ");
	    System.out.println("2. Admin ");
	    System.out.println("3. Human Resource ");
	    System.out.println("4. Legal ");
	        
	 
	    int option = sc.nextInt();                  // read option as type integer from user 
	   
	    switch (option){
	        case 1:
	            applicantEmail = ob.generateEmailAddress(employeeName.getApplicantFirstName(),employeeName.getApplicantLastName(),"tech");
	            applicantPassword = ob.generatePassword();
	            ob.showCredential(employeeName, applicantEmail,applicantPassword);  //pass the Employee object, applicant name and applicant password
	            sc.close();
	            break;
	
	        case 2:
	            applicantEmail = ob.generateEmailAddress(employeeName.getApplicantFirstName(),employeeName.getApplicantLastName(),"admin");
	            applicantPassword = ob.generatePassword();
	            ob.showCredential(employeeName, applicantEmail,applicantPassword);  //pass the Employee object, applicant name and applicant password
	            sc.close();
	            break;
	        case 3:
	            applicantEmail = ob.generateEmailAddress(employeeName.getApplicantFirstName(),employeeName.getApplicantLastName(),"humanresource");
	            applicantPassword = ob.generatePassword();
	            ob.showCredential(employeeName, applicantEmail,applicantPassword);  //pass the Employee object, applicant name and applicant password
	            sc.close();
	            break;
	        case 4:
	            applicantEmail = ob.generateEmailAddress(employeeName.getApplicantFirstName(),employeeName.getApplicantLastName(),"legal");
	            applicantPassword = ob.generatePassword();
	            ob.showCredential(employeeName, applicantEmail,applicantPassword);  //pass the Employee object, applicant name and applicant password
	            sc.close();
	            break;
	        default:  System.out.println("Invalid Entry");
	        	System.out.println();
	        	run(); //using concept of recursion to prompt user to enter correct option from 1 to 4 . 
	    }               //Recursively call this method run until user enters the correct choice. 
    }                    // if user makes a mistake first time- lets give user other chance to select the correct option by using recursion.
    
}




