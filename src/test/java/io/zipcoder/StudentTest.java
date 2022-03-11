package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    @Test
    public void getFirstNameTest(){

        //Given
        String nameFirst1 = "Dwight";
        String nameLast1 = "Howard";
        Double[] score = {0.0};

        //When
        Student s1 = new Student(nameFirst1, nameLast1, score);
        String actual = s1.getFirstName();

        //Then
        Assert.assertEquals(nameFirst1, actual);

    }

    @Test
    public void getLastNameTest(){

        //Given
        String nameFirst1 = "Dwight";
        String nameLast1 = "Howard";
        Double[] score = {0.0};

        //When
        Student s1 = new Student(nameFirst1, nameLast1, score);
        String actual = s1.getFirstName();

        //Then
        Assert.assertEquals(nameFirst1, actual);

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