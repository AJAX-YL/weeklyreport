package com.example.demo.service;
import com.example.demo.dao.teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface teacherApplication extends JpaRepository<teacher,Integer> {
    public teacher findByTnameAndPassword(String tname, String password);

}
