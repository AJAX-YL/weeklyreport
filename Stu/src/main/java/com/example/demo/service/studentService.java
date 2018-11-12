package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.*;

@Service
public class studentService {
    student student=new student();
    thisWeek thisWeek=new thisWeek();
    String result;

    @Autowired
    private studentApplication studentApplication;
    @Autowired
    private  thisWeekApplication thisWeekApplication;


}
