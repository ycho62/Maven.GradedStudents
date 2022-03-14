package io.zipcoder;

import java.util.*;

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
        return students;
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
        Arrays.fill(students, student); //not sure if it is right
        System.out.println(students);
    }
    //for (int i =0; i< student.length; i++) {
//    student[i] = student);
    public void removeStudent(String firstName, String lastName ) {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName);
                students[i] = null;
        }
        for (int i = 0; i < students.length-1; i++) {
            if (students[i] == null) {
                students[i] = students[i+1];
            }
        }
    }

    public Student[] getStudentsByScore(){
//            Student temp = new Student(null,null,null);
//        for(int i = 0; i < students.length-1; i++) {
//            if(students[i].getAverageExamScore() < students[i + 1].getAverageExamScore()) {
//                temp = students[i+1];
//                students[i] = students[i+1];
//                students [i+1] = temp;
//            }
//        }
//        for (int i = 0; i < students.length-1; i++) {
//
//        }
        List<Student> studentSortedList = Arrays.asList(students);
        studentSortedList.removeAll(Collections.singleton(null));
        Comparator<Student> comparator = Comparator.comparingDouble((Student s) -> -s.getAverageExamScore())
                .thenComparing(s-> s.getLastName())
                .thenComparing(s-> s.getFirstName());
        Collections.sort(studentSortedList, comparator);
        return studentSortedList.toArray(new Student[students.length]);


    }
    public Map<Student, String>getGradeBook() {
        int count = 0;
        Double percentile;
        Student[] classroomSorted = this.getStudentsByScore();
        Map<Student, String> gradeboook = new HashMap<>();
       int studentCount = getStudentsByScore().length;
       for (int i=0; i<studentCount; i++) {
          percentile = ((studentCount-i-1.0)/studentCount)* 100;
            if(percentile >= 90) {
                gradeboook.put(classroomSorted[i], "A");
            }else if (percentile >= 71) {
                gradeboook.put(classroomSorted[i], "B");
            }else if (percentile >= 50) {
                gradeboook.put(classroomSorted[i], "C");
            }else if (percentile >= 11) {
                gradeboook.put(classroomSorted[i], "D");
            }else
                gradeboook.put(classroomSorted[i], "F");
        }return gradeboook;
}
}

