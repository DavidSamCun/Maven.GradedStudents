package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();


    public Student(){

        this.firstName = "First Name";
        this.lastName = "Last Name";

    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addScore(Double score){

        examScores.add(score);
    }



}
