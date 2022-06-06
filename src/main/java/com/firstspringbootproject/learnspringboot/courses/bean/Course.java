package com.firstspringbootproject.learnspringboot.courses.bean;

public class Course {
    private int id;
    private String courseName;
    private String author;

    public Course(int id, String courseName, String author) {
        super();
        this.id=id;
        this.courseName=courseName;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}
