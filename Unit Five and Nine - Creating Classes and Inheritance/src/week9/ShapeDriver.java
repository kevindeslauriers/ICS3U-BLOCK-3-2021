package week9;

public class ShapeDriver {
   public static void main(String[] args) {
      Rectangle rect1 = new Rectangle(4, 5);
      Rectangle rect2 = new Rectangle(7.5);

      Box b1 = new Box(5, 6, 7);

      Rectangle shape = new Box(5,6,7);

      if (rect1.isSquare())
         System.out.println("Rect 1 is a square.");
      else
         System.out.println("Rect 1 is not a square.");

      if (rect2.isSquare())
         System.out.println("Rect 2 is a square.");
      else
         System.out.println("Rect 2 is not a square.");

      if (rect1.equals(rect2))
         System.out.println("They are equal.");
      else
         System.out.println("They are not equal.");

      System.out.println("Area of Rect1: " + rect1.getArea());
      System.out.println("Area of Rect2: " + rect2.getArea());

      System.out.println("Perimeter of Rect1: " + rect1.getPerimeter());
      System.out.println("Perimeter of Rect2: " + rect2.getPerimeter());

      System.out.println(rect1);
      System.out.println(rect2);
   }
}
