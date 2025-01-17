package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void averageTest(){
        // : Given
        Double[] s1Scores = { 50.0, 150.0 };
        Double[] s2Scores = { 1225.0, 50.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageClassExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentAndAverage(){
        // : Given
        Double[] s1Scores = { 100.0, 3150.0 };   //1625
        Double[] s2Scores = { 225.0, 25.0 };    //125
        Double[] s3Scores = { 1000.0, 100.0 };    //550            //{  50.0, 23.5};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("Ryan", "Howard", s3Scores);

        Student[] students = {s1,s2,null};
        Classroom classroom = new Classroom(students);
        classroom.addStudent(s3);


        // When
        double output = classroom.getAverageClassExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest(){

        // : Given
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student1 = new Student("Leon", "Hunter");
        Double[] examScores2 = { 100.0, 150.0, 250.0, 0.0 };
        Student student2 = new Student("Tiger", "Hunter");

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        Student[] postEnrollment = classroom.getStudents();

        // Then
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);


        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void removeStudentTest(){
        Classroom classroom = new Classroom(5);

        Student s1 = new Student("student", "one");
        Student s2 = new Student("student", "two");
        Student s3 = new Student("Ryan", "Howard");

        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        System.out.println();

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);

        classroom.removeStudent("student", "one");

        Student[] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        System.out.println(postEnrollmentAsString);


    }

    @Test
    public void studentScoreTest(){
        Classroom classroom = new Classroom(5);

        Double[] score1 = {40.0, 50.0, 60.0};
        Double[] score2 = {20.0, 30.0, 40.0};
        Double[] score3 = {10.0, 20.0, 30.0};
        Double[] score4 = {70.0, 80.0, 90.0};
        Double[] score5 = {90.0, 100.0, 110.0};

        Student s1 = new Student("Albert", "Ainstein", score4);
        Student s2 = new Student("Berry", "Birchwood", score3);
        Student s3 = new Student("Charlie", "Chapel", score5);
        Student s4 = new Student("Darryl", "Dover", score2);
        Student s5 = new Student("Earl", "Elastic", score1);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);
        classroom.addStudent(s5);

        Student[] gradesFirst = classroom.getStudentsByScore();
        String gradeOrder = Arrays.toString(gradesFirst);
        System.out.println(gradeOrder);


    }

    @Test
    public void studentScoreTest2(){
        Classroom classroom = new Classroom(5);

        Double[] score1 = {40.0, 50.0, 60.0};
        Double[] score2 = {20.0, 30.0, 40.0};
        Double[] score3 = {10.0, 20.0, 30.0};
        Double[] score4 = {70.0, 80.0, 90.0};
        Double[] score5 = {90.0, 100.0, 110.0};

        Student s2 = new Student("Berry", "Birchwood", score3);
        Student s3 = new Student("Charlie", "Chapel", score5);
        Student s4 = new Student("Darryl", "Dover", score3);
        Student s1 = new Student("Albert", "Ainstein", score4);
        Student s5 = new Student("Earl", "Elastic", score1);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);
        classroom.addStudent(s5);

        Student[] gradesFirst = classroom.getStudentsByScore();
        String gradeOrder = Arrays.toString(gradesFirst);
        System.out.println(gradeOrder);


    }

    @Test
    public void getGradeBookTest(){
        Classroom classroom = new Classroom(10);

        Double[] score1 = {40.0, 50.0, 60.0};
        Double[] score2 = {20.0, 30.0, 40.0};
        Double[] score3 = {10.0, 20.0, 30.0};
        Double[] score4 = {70.0, 80.0, 90.0};
        Double[] score5 = {90.0, 100.0, 110.0};

        Student s2 = new Student("Berry", "Birchwood", score3);
        Student s3 = new Student("Charlie", "Chapel", score5);
        Student s4 = new Student("Darryl", "Dover", score3);
        Student s1 = new Student("Albert", "Ainstein", score4);
        Student s5 = new Student("Earl", "Elastic", score1);
        Student s6 = new Student("Frankie", "Furnace", score3);
        Student s7 = new Student("Gary", "Galapogus", score5);
        Student s8 = new Student("Henry", "Horse", score3);
        Student s9 = new Student("Isac", "Igloo", score4);
        Student s10 = new Student("Jerry", "Jester", score1);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);
        classroom.addStudent(s5);
        classroom.addStudent(s6);
        classroom.addStudent(s7);
        classroom.addStudent(s8);
        classroom.addStudent(s9);
        classroom.addStudent(s10);

        //Assert.assertEquals(s3, classroom.getGradeBook().get("A"));
        Assert.assertEquals(s4, classroom.getGradeBook().get("B"));
        //Assert.assertEquals(classroom.getGradeBook().get("A"), s3);

    }


}
