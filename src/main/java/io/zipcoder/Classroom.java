package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        students = student;
    }

    public Classroom(){
        this(30);
    }

    public Student[] getStudents() {
        return getStudents();
    }

    public Double getAverageExamScore() {
        double averageScore = 0.0;
        double sum = 0.0;
        for(int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();

        }
        return sum / students.length;
    }

    public void addStudent(Student student) {
        Arrays.fill(students, student);
    }
    //for (int i =0; i< student.length; i++) {
//    student[i] = student);
    public void removeStudent(String firstName, String lastName ) {

    }

}

