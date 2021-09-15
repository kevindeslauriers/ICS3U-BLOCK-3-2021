package week2;

/**
 * A class is a blue print for something that we can model and create variables
 * to use in our code.
 * 
 * This code (class) defines what a Student is
 */
public class Student {

  private String name;
  private String studentNumber;
  private int grade;

  public Student(String name, String studentNumber, int grade) {
    this.name = name;
    this.studentNumber = studentNumber;
    this.grade = grade;
  }

  public void displayName() {
    System.out.println(name);
  }

  public void displayStudentNumber() {
    System.out.println(studentNumber);
  }

  public void increaseGrade() {
    grade++;
  }

  public void displayGrade() {
    System.out.println(grade);
  }

}