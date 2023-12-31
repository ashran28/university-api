package com.ranjan.service;


import com.ranjan.model.StudentDetails;
import com.ranjan.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public List<StudentDetails> getStudentDetails(){
        return studentDetailsRepository.getStudentDetails();
    }

}
