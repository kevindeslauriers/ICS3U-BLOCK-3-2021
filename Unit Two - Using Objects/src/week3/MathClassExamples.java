package week3;

public class MathClassExamples {
   public static void main(String[] args) {
      double radius = 4.5;
      double areaOfCircle = Math.PI * Math.pow(radius, 2);
      System.out.println(areaOfCircle);

      System.out.println(Math.pow(2, 3));

      int x = -7;
      double y = -5.4;

      System.out.println(Math.abs(x));
      System.out.println(Math.abs(y));

      int y1 = 3;
      int x1 = 4;
      int y2 = 5;
      int x2 = 8;

      double lengthOfLineSegment = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

      System.out.println(lengthOfLineSegment);

   }
}
