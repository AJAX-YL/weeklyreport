package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class thisWeek {

    @Id
    @GeneratedValue
    private  Integer id;
    private  String thisPlan;
    private  String problem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThisPlan() {
        return thisPlan;
    }

    public void setThisPlan(String thisPlan) {
        this.thisPlan = thisPlan;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
