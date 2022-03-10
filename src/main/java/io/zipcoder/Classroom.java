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

   public Student[] getStudents(){
        Student[] students = this.students;
        return students;
   }

   public Double getAverageExamScore(){
        Double average = 0.0;
        for(int i = 0; i <students.length; i++){
        average+= students[i].getAverageExamScore();
        }
        average /= students.length;
        return average;
   }

}
