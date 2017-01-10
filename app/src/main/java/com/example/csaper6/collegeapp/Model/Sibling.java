package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Sibling extends Person{

    private int age;

    public Sibling() {
        fName = "John";
        lName = "Smith";
        age = 0;
        relationship = "Brother";
    }
    public Sibling(String fName, String lName, int age, String relationship) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.relationship = relationship;
    }

}
