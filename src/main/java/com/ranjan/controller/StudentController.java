package com.ranjan.controller;


import com.ranjan.model.StudentDetails;
import com.ranjan.model.StudentRequest;
import com.ranjan.model.StudentResponse;
import com.ranjan.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/student")
public class StudentController {


    @Autowired
    public StudentDetailsService studentDetailsService;

    @GetMapping
    public ResponseEntity<List<StudentDetails>> getAllStudent() {

        return new ResponseEntity<>(studentDetailsService.getStudentDetails(), HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest studentRequest) {
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setFirstName(studentRequest.getFirstName());
        studentResponse.setLastName(studentRequest.getLastName());
        return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentId(@PathVariable("id") Integer id) {
        System.out.println(id);
        return new ResponseEntity<>(new StudentResponse("Pharti" ,"Yadav"), HttpStatus.OK);

    }


    @GetMapping("/search")
    public ResponseEntity<StudentResponse> getStudentIdParmater(@RequestParam(value = "city", required = false) String city) {
        System.out.println(city);
        return new ResponseEntity<>(new StudentResponse(city ,"Yadav"), HttpStatus.OK);

    }

}
