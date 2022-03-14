package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void ClassroomTest1() {
        Classroom classroom = new Classroom();
        int size = classroom.getStudents().length;
        Assert.assertEquals(30, size);
    }

    @Test
    public void ClassroomTest1False() {
        Classroom classroom = new Classroom();
        int size = classroom.getStudents().length;
        Assert.assertFalse(32 == size);
    }

    @Test
    public void ClassroomTest2() {
        Classroom classroom = new Classroom(32);
        int size = classroom.getStudents().length;
        Assert.assertEquals(32, size);
    }

    @Test
    public void ClassroomTest2False() {
        Classroom classroom = new Classroom(32);
        int size = classroom.getStudents().length;
        Assert.assertFalse(30 == size);
    }

    @Test
    public void ClassroomTest3() {
        Classroom classroom = new Classroom();
        int size = classroom.getStudents().length;
        Assert.assertEquals(30, size);
    }
    @Test
    public void ClassroomTest3False() {
        Classroom classroom = new Classroom();
        int size = classroom.getStudents().length;
        Assert.assertFalse(31 == size);
    }
    @Test
    public void getStudentTest() {
        //Given
        Student student = new Student(null, null,
                new Double[]{100.0});
        Student student1 = new Student("first", "last",
                new Double[]{0.0});
        Student[] studentList = new Student[]{student, student1};
        Classroom classroom = new Classroom(studentList);
        //when
        int size = classroom.getStudents().length;
        Student[] expected = new Student[]{student, student1};
        Student[] actual = classroom.getStudents();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getStudentTestflase() {
        //Given
        Student student = new Student(null, null,
                new Double[]{100.0});
        Student student1 = new Student("first", "last",
                new Double[]{0.0});
        Student[] studentList = new Student[]{student};
        Classroom classroom = new Classroom(studentList);
        //when
        int size = classroom.getStudents().length;
        Student[] expected = new Student[]{student, student1};
        Student[] actual = classroom.getStudents();
        //then
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void getExamAverage() {
        //Given
        Student student = new Student(null, null,
                new Double[]{100.0});
        Student student1 = new Student("first", "last",
                new Double[]{0.0});
        Student[] studentList = new Student[]{student};
        Classroom classroom = new Classroom(studentList);

        //when
        Double actual = classroom.getAverageExamScore();
        Double expected =
        //then
        Assert.assertNotEquals(expected, actual);
    }
}
