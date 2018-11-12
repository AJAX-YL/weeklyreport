package com.example.demo.dao;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class teacher {
    @Id
    @GeneratedValue
    private Integer id;
    private String tname;
    private String password;

    public teacher() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
