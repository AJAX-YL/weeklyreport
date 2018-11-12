package com.example.demo.service;

import com.example.demo.dao.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface studentApplication extends JpaRepository<student,Integer> {
    public student findBySnameAndPassword(String sname,String password);

}
