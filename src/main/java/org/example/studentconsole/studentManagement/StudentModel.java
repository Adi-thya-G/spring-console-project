package org.example.studentconsole.studentManagement;

public class StudentModel {
    private  int id;
    private  String name;
    private  String  course;
    private  String section;

    public StudentModel(int id,String name,String course,String section){
        this.id=id;
        this.course=course;
        this.name=name;
        this.section=section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
