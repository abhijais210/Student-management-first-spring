package com.example.studentmanagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    HashMap<Integer,Student> hm = new HashMap<>();
    //here my rollno works as a primary key for DataBase
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        int key = student.getRollNo();
        hm.put(key,student);
    }
    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){
        Student student = hm.get(rollNo);

        return student;
    }
}
