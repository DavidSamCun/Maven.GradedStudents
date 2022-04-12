package io.zipcoder;

import java.util.*;
import java.lang.NullPointerException;


public class Classroom {

    private Student[] students;

    public Classroom(){
        this.students = new Student[30];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(int max){
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

       Student temp;
       for(int i = 0; i<students.length-1; i++){
           if(students[i]==null){
               break;
           }
           if(students[i].getAverageExamScore().compareTo(students[i+1].getAverageExamScore()) == 0){
               if(students[i].getLastName().compareTo(students[i+1].getLastName()) > 0){
                   temp = students[i + 1];
                   students[i+1] = students[i];
                   students[i] = temp;
                   i=-1;
               }
           } else if(students[i].getAverageExamScore().compareTo(students[i+1].getAverageExamScore()) < 0){
               temp = students[i + 1];
               students[i+1] = students[i];
               students[i] = temp;
               i=-1;
           }
       }
       return students;
       //return studentList.toArray(students);


//        List<Student> studentList = new ArrayList<Student>();
//       Collections.sort(studentList, new Comparator<Student>() {
//
//           public int compare(Student o1, Student o2) {
//
//               return 0;
//           }
//       });
//        return null;
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

    public TreeMap<String, List<Student>> getGradeBook(){

        TreeMap<String, List<Student>> gradebook = createGradeBook();

        Student[] orderedList = getStudentsByScore();
        int amntStdnt = studentCount();

        for (int i = 0; i < studentCount(); i++){
            if( (float) i/amntStdnt <= .10){
                gradebook.get("A").add(orderedList[i]);
            }
            if( (float) i/amntStdnt <= .29){
                gradebook.get("B").add(orderedList[i]);
            }
            if( (float) i/amntStdnt <= .50){
                gradebook.get("C").add(orderedList[i]);
            }
            if( (float) i/amntStdnt <= .89){
                gradebook.get("D").add(orderedList[i]);
            }
            if( (float) i/amntStdnt <= 1.00){
                gradebook.get("F").add(orderedList[i]);
            }
        }
        return gradebook;
    }

    public TreeMap<String, List<Student>> createGradeBook(){
        TreeMap<String, List<Student>> gradebook = new TreeMap<>();

        String[] grade ={"A", "B", "C", "D", "F"};

        for(String a: grade){
            gradebook.put(a, new ArrayList<>());
        }

        return gradebook;
    }

    public int studentCount(){
        int count = 0;
        for(Student a: students){
            if(a != null){
                count++;
            }
        }

        return count;
    }
}
