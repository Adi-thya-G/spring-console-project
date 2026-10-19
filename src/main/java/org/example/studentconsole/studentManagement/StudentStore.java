package org.example.studentconsole.studentManagement;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class StudentStore {
    private  ArrayList<StudentModel>  studentList;

    public StudentStore(){
        studentList=new ArrayList<>();
    }

    public ArrayList<StudentModel> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentModel> studentList) {
        this.studentList = studentList;
    }



}
