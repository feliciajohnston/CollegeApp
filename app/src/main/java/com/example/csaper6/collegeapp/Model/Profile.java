package com.example.csaper6.collegeapp.Model;

import java.util.Date;

/**
 * Created by csaper6 on 12/7/16.
 */
public class Profile {
    private String fName, lName;
    private Date birthday;

    public Profile() {
        fName = "Jane";
        lName = "Doe";
    }

    public String getFirstName() {
        return fName;
    }
    public void setFirstName(String fName) {
        this.fName = fName;
    }
    public String getLastName() {
        return lName;
    }
    public void setLastName(String lName) {
        this.lName = lName;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
