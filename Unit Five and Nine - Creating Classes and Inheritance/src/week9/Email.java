package week9;

public class Email

{

   private String username;

   public Email(String u)

   {

      username = u;

   }

   public void printThis()

   {

      System.out.println(this);

   }

   public String toString()

   {

      return username + "@example.com";

   }

}
