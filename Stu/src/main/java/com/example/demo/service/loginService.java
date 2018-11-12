package com.example.demo.service;

import com.example.demo.dao.admin;
import com.example.demo.dao.student;
import com.example.demo.dao.teacher;
import com.example.demo.dao.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class loginService {
    student student = new student();
    admin admin = new admin();
    teacher teacher = new teacher();
    user user=new user();
    String result;
    @Autowired
    private studentApplication studentApplication;
    @Autowired
    private adminApplication adminApplication;
    @Autowired
    private teacherApplication teacherApplication;


    public user islogin(String type, String name, String password) {
        user user=new user();
        if (type.equals("student")) {
            student = studentApplication.findBySnameAndPassword(name, password);
            if (student != null) {
                result = "登录成功";
                user.setName(name);
                user.setPassword(password);
                user.setType(type);
                user.setResult(result);
            } else {
                result = "账号或密码错误";
                user.setResult(result);
            }


        }
        else if (type.equals("admin")) {
            admin = adminApplication.findByAnameAndPassword(name, password);
            if (admin != null) {
                result = "登录成功";
                user.setName(name);
                user.setPassword(password);
                user.setType(type);
                user.setResult(result);
            } else {
                result = "账号或密码错误";
                user.setResult(result);
            }

        }
        else if(type.equals("teacher")) {
            teacher =teacherApplication.findByTnameAndPassword(name,password);
            if (teacher != null) {


                result = "登录成功";
                user.setName(name);
                user.setPassword(password);
                user.setType(type);
                user.setResult(result);
            } else {
                result = "账号或密码错误";
                user.setResult(result);
            }

        }
        return user;

    }
}
