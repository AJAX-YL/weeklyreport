package com.example.demo.controller;



import com.example.demo.dao.teacher;
import com.example.demo.dao.time;
import com.example.demo.dao.user;
import com.example.demo.service.loginService;

import com.example.demo.service.timeApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class logincontroller {
    @Autowired
    private timeApplication timeApplication;
    @Autowired
    private loginService loginService;
    @PostMapping(value = "/login")
    public user login(@RequestParam("type") String type,@RequestParam("name") String name,@RequestParam("password") String password){

          return loginService.islogin(type, name, password);
    }
    @GetMapping("/main")
    public String main(){
        teacher t=new teacher();
        return t.getTname();
    }
   // @PutMapping(value = "/time")
   // public time deadline(//@RequestParam("deadline" ) Date deadline
            //@RequestParam("year") Date year
           // ,@RequestParam("month") Date month,@RequestParam("day") Date day,@RequestParam("hour") Date hour
   // ){
    //   SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");

    // String str= "2011-07-09";
    //  Date date = formatter.parse();
     //   time time =new time();
     //   time.setTime(date);
     //  return timeApplication.save(time);
   // }

}
