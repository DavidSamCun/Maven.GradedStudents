package io.zipcoder;

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
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();

        classroom.addStudent(student);

        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }


}
