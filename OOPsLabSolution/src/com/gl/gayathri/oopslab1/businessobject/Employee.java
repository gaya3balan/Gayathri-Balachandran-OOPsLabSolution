package com.gl.gayathri.oopslab1.businessobject;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String fs, String ls){
        firstName = fs;
        lastName = ls;
    }

    public String getApplicantFirstName() {
        return firstName;
    }

    public void setApplicantFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getApplicantLastName() {
        return lastName;
    }

    public void setApplicantLastName(String lastName) {
        this.lastName = lastName;
    }


}