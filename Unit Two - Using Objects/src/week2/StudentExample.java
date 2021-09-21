package week2;

public class StudentExample {
  public static void main(String[] args) {
    // ritchie is a vcraiable to an instantce of the class Student
    // ritchie is an Object (instances of a class)
    Student ritchie = new Student("Ritchie", "45646", 10);
    Student yola = new Student("Yola", "123456", 10);

    // ritchie and yola are references to 2 different students

    Student rastin = ritchie;

    // because rastin and ritche refer to the same Studnet object it increases teh
    // grade for both (still its only 1 Object)
    rastin.increaseGrade();

    ritchie = null;
    // Student tristan; tristan is currently the null reference

    // ritchie.increaseGrade(); // throws java.lang.NullPointerException because
    // ritchie is null

    yola.addTest(87);
    yola.displayAverage();
    yola.addTest(91);
    yola.displayAverage();
    yola.addTest(97);
    yola.displayAverage();
    yola.addTest(67);
    yola.displayAverage();

    Student harrison = new Student("Harrison", "547235");

    double yolaAverage = yola.getAverage();
    System.out.println(yola.getName() + " has an average of " + yolaAverage);

  }
}
