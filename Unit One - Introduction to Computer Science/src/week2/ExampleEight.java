package week2;

/**
 * Type Casting
 */
public class ExampleEight {
  public static void main(String[] args) {
    final int NUM_MARKS = 5;

    int markOne = 78, markTwo = 98, markThree = 64, markFour = 96, markFive = 62;

    double average = (markOne + markTwo + markThree + markFour + markFive) / (double) NUM_MARKS;

    System.out.println("The average is: " + average);

    int x = (int) 3.7; // narrowing conversion (losing presision) // becomes 3 - truncates the decimal

    double y = (double) 3;
    double z = 3; // does the same as above

  }
}
