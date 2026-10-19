package org.example.studentconsole.studentManagement;

import org.springframework.stereotype.Component;

@Component
public class FindStudent {

    private final StudentStore studentStore;
    public  FindStudent(StudentStore studentStore){
        this.studentStore=studentStore;
    }

    public StudentModel findStudent(int id){

        for(StudentModel student:studentStore.getStudentList()){
            if(student.getId()==id)
                 return student;
        }
        return null;

    }
    public  void displayStudent(){
        studentStore.getStudentList().forEach((StudentModel stduent)->{
            System.out.println("student id:"+stduent.getId());
            System.out.println("student name:"+stduent.getName());
            System.out.println("student course:"+stduent.getCourse());
            System.out.println("student section "+stduent.getSection());
        });
    }

}
