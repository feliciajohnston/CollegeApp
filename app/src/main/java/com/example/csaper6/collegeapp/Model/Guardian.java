package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Guardian extends Person{

    private String occupation;

    public Guardian() {
        fName = "Sally";
        lName = "Smith";
        occupation = "NA";
        age = 0;
        relationship = "Step-Mother";
    }
    public Guardian(int age, String occ, String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        occupation = occ;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
