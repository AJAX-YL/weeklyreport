package com.example.demo.service;

import com.example.demo.dao.thisWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface thisWeekApplication extends JpaRepository<thisWeek,Integer> {
    public thisWeek findByThisPlanAndProblem(String thisPlan,String problem);
}
