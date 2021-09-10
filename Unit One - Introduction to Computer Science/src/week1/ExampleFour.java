package week1;

/**
 * Variables - used to store data Primitive Data Types - (int / double / char /
 * boolean) Assignment / Assignment Operator - used to store values/data in
 * variables
 */
public class ExampleFour {
  public static void main(String[] args) {
    int markOne, markTwo, markThree; // declared 3 integer variables

    markOne = 75; // markOne is assigned 75
    markTwo = 80;
    markThree = 87;

    int average = (markOne + markTwo + markThree) / 3;

    System.out.println(average);
    System.out.println("The average is: " + average); // string concatanation - joined the string with something else

  }
}
