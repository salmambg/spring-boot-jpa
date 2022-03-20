package io.javabrains.courseapidata.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;
    private String name;
    private String description;
    private int studentNumber;

    public Course() {

    }
    public Course(Long id,String name,String description,int studentNumber){
        this.id = id;
        this.name= name;
        this.description= description;
        this.studentNumber= studentNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
