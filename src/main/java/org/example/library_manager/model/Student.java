package org.example.library_manager.model;

public class Student {
    private int id;
    private String name;
    private String classroom;

    public Student() {
    }

    public Student(int id, String name, String classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
