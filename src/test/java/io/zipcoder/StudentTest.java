package io.zipcoder;

import org.junit.Test;

public class StudentTest {


    @Test
    public void createStudent(){

        //When
        String nameFirst1 = "Dwight";
        String nameLast1 = "Howard";

        //Then

    }

    @Test
    public void getAllTestScores(){

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);

    }

    @Test
    public void getAddTest(){

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addScore(23);
        String output = student.getExamScores();

        // Then
        System.out.println(output);

    }

    @Test
    public void setExamScoreTest(){

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        System.out.println(student.getExamScores());

// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }

    @Test
    public void getAverageTest(){

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void toStringTest(){

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);

    }
}