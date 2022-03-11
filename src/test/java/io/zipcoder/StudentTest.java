package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void ConstructorTrueTest() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores ={100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, testScores);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualTestScores = student.getExamScores();

        String expectedFirstName = student.getFirstName();
        String expectedLastName = student.getLastName();
        String expectedTestScores = "Exam 1 -> 100.0" + "\n" +
            "Exam 2 -> 95.0" + "\n" +
            "Exam 3 -> 123.0" + "\n" +
            "Exam 4 -> 96.0" + "\n";

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedTestScores,actualTestScores);

}
    @Test
    public void ConstructorFalseTest() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores ={100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, testScores);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualTestScores = student.getExamScores();

        String expectedFirstName = "qwdoub";
        String expectedLastName = "wquodb";
        String expectedTestScores = "Exam 1 -> 100.1" + "\n" +
            "Exam 2 -> 95.1" + "\n" +
            "Exam 3 -> 123.1" + "\n" +
            "Exam 4 -> 96.0" + "\n";

        Assert.assertFalse(expectedFirstName.equals(actualFirstName));
        Assert.assertFalse(expectedLastName.equals(actualLastName));
        Assert.assertFalse(expectedTestScores.equals(actualTestScores));
}

    @Test
    public void getFirstName() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores ={100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName,lastName,testScores);
        student.setFirstName("Bill");
        String actualFirstName = student.getFirstName();
        String expectedFirstName = "Bill";
        Assert.assertEquals(expectedFirstName,actualFirstName);
}
    @Test
    public void getFirstNameFalseTest() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.setFirstName("Bill");
        String actualFirstName = student.getFirstName();
        String expectedFirstName = "Frank";
        Assert.assertFalse(expectedFirstName.equals(actualFirstName));
    }

    @Test
        public void getLastName() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.setLastName("Bill");
        String actualLastName = student.getLastName();
        String expectedLastName = "Bill";
        Assert.assertEquals(expectedLastName, actualLastName);
    }
    @Test
    public void getLastNameFalseTest() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.setLastName("Bill");
        String actualLastName = student.getLastName();
        String expectedLastName = "knou";
        Assert.assertFalse(expectedLastName.equals(actualLastName));
    }

    @Test
    public void getExamScores() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores = {101.0, 93.0, 121.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        String actual = student.getExamScores();
        String expected = "Exam 1 -> 101.0" + "\n" +
                "Exam 2 -> 93.0" + "\n" +
                "Exam 3 -> 121.0" + "\n" +
                "Exam 4 -> 96.0" + "\n";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getExamScoresFalseTest() {
        String firstName = "Bob";
        String lastName = "Smith";
        Double[] testScores = {101.0, 93.0, 121.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        String actual = student.getExamScores();
        String expected = "Exam 1 -> 10.0" + "\n" +
                "Exam 2 -> 9.0" + "\n" +
                "Exam 3 -> 11.0" + "\n" +
                "Exam 4 -> 6.0" + "\n";
        Assert.assertFalse(expected.equals(actual));
    }
    @Test
    public void addExamScore() {
        String firstName = "Rick";
        String lastName = "Man";
        Double[] testScores = {99.0, 92.0, 111.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.addExamScore(39.0);
        String actual = student.getExamScores();
        String expectedTestScores = "Exam 1 -> 99.0" + "\n" +
                "Exam 2 -> 92.0" + "\n" +
                "Exam 3 -> 111.0" + "\n" +
                "Exam 4 -> 96.0" + "\n" +
                "Exam 5 -> 39.0" + "\n";
        Assert.assertEquals(expectedTestScores,actual);

    }
    @Test
    public void addExamScoreFalse() {
        String firstName = "Rick";
        String lastName = "Man";
        Double[] testScores = {99.0, 92.0, 111.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.addExamScore(39.0);
        String actual = student.getExamScores();
        String expectedTestScores = "Exam 1 -> 99.0" + "\n" +
                "Exam 2 -> 92.0" + "\n" +
                "Exam 3 -> 111.0" + "\n" +
                "Exam 4 -> 39.0" + "\n" +
                "Exam 5 -> 96.0" + "\n";
        Assert.assertFalse(expectedTestScores.equals(actual));

    }
    @Test
    public void setExamScore() {
        String firstName = "Rick";
        String lastName = "Man";
        Double[] testScores = {99.0, 92.0, 111.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.setExamScores(1, 25.0);
        String actual = student.getExamScores();
        String expectedTestScores = "Exam 1 -> 25.0" + "\n" +
                "Exam 2 -> 92.0" + "\n" +
                "Exam 3 -> 111.0" + "\n" +
                "Exam 4 -> 96.0" + "\n";
        Assert.assertEquals(expectedTestScores, actual);
    }
    @Test
    public void setExamScoreFalse() {
        String firstName = "Rick";
        String lastName = "Man";
        Double[] testScores = {99.0, 92.0, 111.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        student.setExamScores(1, 25.0);
        String actual = student.getExamScores();
        String expectedTestScores = "Exam 1 -> 22.0" + "\n" +
                "Exam 2 -> 92.0" + "\n" +
                "Exam 3 -> 111.0" + "\n" +
                "Exam 4 -> 96.0" + "\n";
        Assert.assertFalse(expectedTestScores.equals(actual));
    }
    @Test
    public void getAverageExamScore() {
        String firstName = "Yun";
        String lastName = "Cho";
        Double[] testScores = {99.0, 92.0, 113.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        Double actual = student.getAverageExamScore();
        Double expectedTestScores = 100.00;
        Assert.assertEquals(expectedTestScores, actual);
    }
    @Test
    public void getAverageExamScoreFalseTest() {
        String firstName = "Yun";
        String lastName = "Cho";
        Double[] testScores = {99.0, 92.0, 113.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        Double actual = student.getAverageExamScore();
        Double expectedTestScores = 90.00;
        Assert.assertFalse(expectedTestScores.equals(actual));
    }

    @Test
    public void toStringtest(){
        String firstName = "Jim";
        String lastName = "Lim";
        Double[] testScores = {99.0, 92.0, 113.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);
        String actual = student.toString();

        String expected= "Student name: Jim Lim" +"\n" +
                "Test scores: Exam 1 -> 99.0" + "\n" +
                "Exam 2 -> 92.0" + "\n" +
                "Exam 3 -> 113.0" + "\n" +
                "Exam 4 -> 96.0" + "\n" + "Average test scores: 100.0";
        Assert.assertEquals(expected,actual);
    }
}