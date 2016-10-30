package com.SpringBootTest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lich on 10/24/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer userid;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password; //change it to char[]

    @Column()
    private String phonenumber;

    @Column(nullable = false, columnDefinition = "TINYINT", length = 1)
    private Boolean isadmin;

    @Column(nullable = false, columnDefinition = "TINYINT", length = 1)
    private Boolean isdelete;

    public User(){}

    public User(String email, String username, String password, String phonenumber, Boolean isadmin, Boolean isdelete) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.isadmin = isadmin;
        this.isdelete = isdelete;
    }

    public User(String email, String username, String password, Boolean isadmin, Boolean isdelete) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
        this.isdelete = isdelete;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}

