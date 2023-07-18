package com.ranjan.repository;


import com.ranjan.model.StudentDetails;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDetailsRepository {


    public List<StudentDetails> getStudentDetails(){
        List<StudentDetails> lst = new ArrayList<>();
        StudentDetails sd1 = new StudentDetails(BigInteger.valueOf(1)
                , "Ashis" ,"Ranjan","Karnataka","ash.ranjan.28@gmail.com");
        StudentDetails sd2 = new StudentDetails(BigInteger.valueOf(2) , "Preeti" ,"Yadav" , "Rajasthan" ,"preeti.ipi@gmail.com");
        lst.add(sd1);
        lst.add(sd2);
        lst.add(new StudentDetails(BigInteger.valueOf(3),"Abhishek" ,"Ranjan","Bihar","Abhsk@gmail.com"));
        lst.add(new StudentDetails(BigInteger.valueOf(4),"Rahul" ,"Gupta","Jharkhand","rahulgupta@gmail.com"));
        lst.add(new StudentDetails(BigInteger.valueOf(5),"Shivam" ,"Yadav","Rajasthan","shivam@gmail.com"));
        return lst;
    }
}
