package com.example.demo.service;

import com.example.demo.dao.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface adminApplication extends JpaRepository<admin,Integer> {
    public admin findByAnameAndPassword(String aname, String password);

}
