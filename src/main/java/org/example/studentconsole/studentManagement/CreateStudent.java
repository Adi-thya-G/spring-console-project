package org.example.studentconsole.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CreateStudent {

    final  StudentStore studentStore;
    final  FindStudent  findStudent;
    @Autowired
    public  CreateStudent(StudentStore studentStore,FindStudent findStudent){
        this.findStudent=findStudent;
        this.studentStore=studentStore;
    }

    public boolean AddStudnet(StudentModel student){


        StudentModel studentFind=findStudent.findStudent(student.getId());
        if(studentFind==null){
            ArrayList<StudentModel> listStudent=new ArrayList<>(studentStore.getStudentList());
            listStudent.add(student);
            studentStore.setStudentList(listStudent);
            System.out.println("stduent added successfuly");
            return  true;

        }
        else{
            System.out.println("student already exist with this id");
            return  false;

        }

    }

    public boolean DeleteStudent(StudentModel student){
        ArrayList<StudentModel> listStudent=new ArrayList<>(studentStore.getStudentList());
        if(listStudent.contains(student))
        {
            listStudent.remove(student);
            studentStore.setStudentList(listStudent);
            return true;
        }
        return false;
    }

}
