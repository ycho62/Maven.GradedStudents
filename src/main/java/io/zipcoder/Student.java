package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
        return lastName;
        }


        public void setFirstName(String firstName) {
        this.firstName = firstName;
        }

        public void setLastName(String lastName) {
        this.lastName = lastName;
        }

        public Integer getNumberOfExamsTaken(){
        return examScores.size();
        }

        public String getExamScores() {
        String scores ="";
        for (int i = 0; i < getNumberOfExamsTaken(); i++){
            scores+= (i+1) + "Exam " + "score was"+ examScores.get(i) +"\n";
        }
        return scores;
        }

        public void addExamScore(double examScore) {
        examScores.add(examScore);

        }

        public void setExamScores(int examNumber, double newScore) {
        examScores.set(examNumber-1, newScore);
        }

        public Double getAverageExamScore() {
        double sum = 0;
        double output;
        for (int i = 0; i< getNumberOfExamsTaken(); i++) {
            sum += examScores.get(i);


        }return output = sum/getNumberOfExamsTaken();

        }

        public String toString() {
        String student = "Student name: " + getFirstName() + getLastName() +"\n" +
                "Test score: " + getExamScores() + "\n" + "Average test scores: " +
                getAverageExamScore();


            return student;
    }
    }

