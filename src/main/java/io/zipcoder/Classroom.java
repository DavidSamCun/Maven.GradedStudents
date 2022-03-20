package io.zipcoder;

import java.util.ArrayList;
import java.lang.NullPointerException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Classroom {

    private Student[] students;
    //private int classSize;

    public Classroom(){
        this.students = new Student[30];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(int max){
        //this.classSize = max;
        this.students = new Student[max];
    }

   public Student[] getStudents(){
//        Student[] students = this.students;
//        return students;
//       try{
//           return students;
//       }
//       catch(NullPointerException e){
//           System.out.println("NullPointerException thrown!");
//       }

//       if(students[0] == (null)){                 //Didn't work
//           Student blank = new Student("", "");
//           students[0] = blank;
//       }

       return students;
    }

   public Double getAverageClassExamScore() {
       Double total = 0.0;
       int amountOfStudents = 0;
//       for (int i = 0; i < students.length; i++) {
//           if (students[i] != null) {
//               total += students[i].getAverageExamScore();
//               amountOfStudents++;
//           }
//
//       }
       for (Student a : students) {
           if (a != null) {
               total += a.getAverageExamScore();
               amountOfStudents++;
           }

       }
       return total/amountOfStudents;
   }

   public void addStudent(Student newStudent){

//        if (students[0] == null){
//            students[0] = newStudent;
//        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = newStudent;
                    break;
                } else if (students[students.length - 1] != null) {
                    System.out.println("Sorry, class is full");
                    break;
                }
            }
//        }
//       int last = students.length;
//       int i = 0;
//       for(Student a : students){
//           if(a == null){
//               a = newStudent;
//           } else if (i == students.length -1){
//               System.out.println("We're full");
//           }
//           i++;
//       }

   }

   public Student[] getStudentsByScore(){

        List<Student> studentList = new ArrayList<Student>();
       Collections.sort(studentList, new Comparator<Student>() {

           public int compare(Student o1, Student o2) {

               return 0;
           }
       });
        return null;
   }
 /*   The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
    If two students have the same class average, order them lexigraphically.*/


    public void removeStudent(String firstName, String lastName){
        List<Student> studentList = new ArrayList<>();
        int removeIndex =  0;
            for(int i = 0; i<students.length; i++){
                if(students[i]==null){
                    break;
                }
                studentList.add(students[i]);
                if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                    removeIndex = i;
            }
        }
        studentList.remove(removeIndex);
        studentList.toArray(students);
    }

}
