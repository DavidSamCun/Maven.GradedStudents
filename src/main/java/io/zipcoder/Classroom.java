package io.zipcoder;

import java.util.ArrayList;

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

   public Student[] getStudents(){
        Student[] students = this.students;
        return students;
   }

   public Double getAverageClassExamScore() {
       Double studentScore = 0.0;
       Double total = 0.0;
       System.out.println(students.length);
       int amountOfStudents = 0;
       for (int i = 0; i < students.length; i++) {
           if (students[i] != null) {
               total += students[i].getAverageExamScore();
               amountOfStudents++;
           }

       }
       System.out.println(total/students.length);
       return total/amountOfStudents;
   }

   public void addStudent(Student newStudent){

        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = newStudent;
            } else {
                System.out.println("We're full");
            }
        }
   }

}
