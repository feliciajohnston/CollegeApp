package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public abstract class Person  {

    protected String fName, lName, relationship;
    protected int age;

    Person() {
        fName = "XXXX";
        lName = "XXXX";
        relationship = "XXXX";
        age = 0;
    }
    Person(String fName, String lName, String relationship, int age) {
        this.fName = fName;
        this.lName = lName;
        this.relationship = relationship;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String gelNname() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getRelationship() {
        return relationship;
    }
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
