package io.zipcoder;

public class Classroom {

    private Student[] students;

    public Classroom(){
        Student[] students = new Student[30];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(int max){
        Student[] student = new Student[max];
    }

//    public Student getStudents(){
//
//        return Student;
//    }



}
