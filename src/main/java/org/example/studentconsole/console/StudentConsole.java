package org.example.studentconsole.console;

import org.example.studentconsole.studentManagement.CreateStudent;
import org.example.studentconsole.studentManagement.FindStudent;
import org.example.studentconsole.studentManagement.StudentModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class StudentConsole implements CommandLineRunner {

    int choice;
    Scanner sc=new Scanner(System.in);
    final  private    CreateStudent createStudent;
    final  private FindStudent findStudent;
    public  StudentConsole(CreateStudent createStudent,FindStudent findStudent)

    {
        this.findStudent=findStudent;
        this.createStudent=createStudent;
    }
    public void DisplayMenu(){
        System.out.println("________________________________");
        System.out.println("1.Add student");
        System.out.println("2.view all student");
        System.out.println("3.find student");
        System.out.println("4.update student");
        System.out.println("5.Remove student");
        System.out.println("6.exit");
        System.out.println("Enter your choice");
    }

    public void run(String ...args){

        do{
            DisplayMenu();
            choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the id");
                    int id = sc.nextInt();

                    System.out.println("Enter the name");
                    String name = sc.next();

                    System.out.println("Enter the course");
                    String course = sc.next();

                    System.out.println("Enter the section");
                    String section = sc.next();

                    StudentModel student = new StudentModel(id, name, course, section);

                    createStudent.AddStudnet(student);

                    break;
                }
                case 2:{
                    findStudent.displayStudent();
                    break;
                }
                case 3:{
                    System.out.println("enter student id");
                    int id=sc.nextInt();
                    StudentModel student=findStudent.findStudent(id);
                    if(student==null){
                        System.out.println("student not found");
                    }
                    else{
                        System.out.println("enter id:"+student.getId());
                        System.out.println("student name:"+student.getName());
                        System.out.println("student course:"+student.getCourse());
                        System.out.println("student section :"+student.getSection());
                    }
                    break;
                }
                case 4:{
                    System.out.println("enter the student id");
                    int id=sc.nextInt();
                    StudentModel student=findStudent.findStudent(id);
                    if(student==null){
                        System.out.println("student with give id not found");
                    }
                    else{
                        System.out.println("enter the name");
                        student.setName(sc.next());
                        System.out.println("enter the course");
                        student.setCourse(sc.next());
                        System.out.println("enter the section");
                        student.setSection(sc.next());

                        System.out.println("student record updated successfuly");

                    }
                    break;
                }
                case 5:{
                    System.out.println("enter the student id");
                    int id=sc.nextInt();
                    StudentModel student=findStudent.findStudent(id);
                    if(student==null){
                        System.out.println("give student id not found");
                    }
                    else{
                        boolean result=createStudent.DeleteStudent(student);
                        if(result){
                            System.out.println("student is successfuly removed");
                        }
                        else{
                            System.out.println("student remove not happend");
                        }
                    }
                    break;
                }


            }

        }while(choice<6);

    }
}
