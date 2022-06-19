package com.gl.gayathri.oopslab1.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import com.gl.gayathri.oopslab1.businessobject.*;


public class CredentialService {

    public char[] generatePassword(){
        final String lettersCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // all capital characters 
        final String lettersSmall = "abcdefghijklmnopqrstuvwxyz";  // all small characters 
        final String numbers = "123456789";                        // all numbers 
        final String specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_'{|}~";       // https://en.wikipedia.org/wiki/List_of_Special_Characters_for_Passwords 
        String characterSet = lettersCaps + lettersSmall + numbers + specialCharacters; // concatenate all strings into 1 master string
        
        Random obj = new Random();
        
        char[] psswrdChar = new char[8]; // as per required output- setting password as 8 characters 
        
        List<Character> psswrd = new ArrayList<Character>(); //create an array list to leverage shuffle method of Collection class 
        
        int i=0;
        while( i < 8) {   
            if(i==0) {   // for elements 0 to 3 positions of password array- initially set required criteria 
	            psswrd.add(lettersCaps.charAt(obj.nextInt(lettersCaps.length()))); //password should contain atleast 1 capital letter
	            i++;
	            psswrd.add(lettersSmall.charAt(obj.nextInt(lettersSmall.length()))); //password should contain atleast 1 small letter
	            i++;
	            psswrd.add(numbers.charAt(obj.nextInt(numbers.length())));  // password should contain atleast 1 number 
	            i++;
	            psswrd.add(specialCharacters.charAt(obj.nextInt(specialCharacters.length()))); //password should contain atleast 1 special character
	            i++;
            }
            else {
            	psswrd.add(characterSet.charAt(obj.nextInt(characterSet.length()))); // remaining 4 positions can have any value based on random index generated from the master string 
            	i++;
            }
        }
        
        
        // Shuffle the psswrd Array List so that any positions can have small/ capitals/ numbers/ special characters  
        Collections.shuffle(psswrd);
        
        
        for(int j = 0; j<8 ; j++){
        	psswrdChar[j]=psswrd.get(j);  // copy array list to array as we need array for display purpose 
        			
	       }
        return psswrdChar;  //return psswrdChar array to calling method
    }

    public String generateEmailAddress(String firstName, String lastName, String department){

        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";


    }

    public void showCredential(Employee employee,String email, char[] generatedPassword){ // output is generated as below 
        System.out.println("Dear " + employee.getApplicantFirstName() + " your generated credentials are as follows" );
        System.out.println("Email    ---> " + email);
        System.out.print("Password ---> " );
        System.out.print(new String(generatedPassword));

    }

	
	
}