package week9;

public class Gadget {
   private static int status = 0;

   public Gadget() {
      status = 10;
   }

   public static void setStatus(int s) {
      status = s;
   }
}