package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();


    public Student(){

        this.firstName = "First Name";
        this.lastName = "Last Name";

    }

    public Student(String firstName, String lastName, Double[] scores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(scores));

        //examScores = Arrays.asList(scores);
//        for(int i = 0; i < scores.length; i++){ //add exam scores
//            examScores.add(scores[i]);
//        }
    }

//    Not needed because takeExam method?
    public void addScore(double score){
        examScores.add(score);
    }

    public String getExamScores(){

        String output ="Exam Scores: \n";
        int examNum = 1; //incase I need for exam numbering

        for (int i = 0; i < examScores.size(); i++){

           output += "        Exam " + (i+1) + " -> " + examScores.get(i) + "\n";

        }

        return output;
    }

    public int getNumberOfExamsTaken(){
        return examScores.size();   //Size of list is size of exams taken
    }


}
