package week5;

import java.util.Scanner;

public class CrossCountry {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      processRunner(in);
      processRunner(in);
      processRunner(in);
      in.close();
   }

   /**
    * 
    * @param in
    */
   private static void processRunner(Scanner in) {
      String firstname, lastName;
      String mileOne, mileTwo, finishTime;
      String splitTwo, splitThree;

      /**
       * get the name and mleOne, mileTwo, finishTime from the user
       */

      splitTwo = subtractTimes(mileTwo, mileOne);
      splitThree = subtractTimes(finishTime, mileTwo);

      /**
       * Display a summary for the runner
       */
   }

   private static String subtractTimes(String endTime, String startTime) {
      double endInSeconds = convertToSeconds(endTime);
      double startInSeconds = convertToSeconds(startTime);

      double diffInSeconds = endInSeconds - startInSeconds;

      return convertToTime(diffInSeconds);
   }

   private static String convertToTime(double diffInSeconds) {
      return null;

      // create getMinutes and getSeconds functions to use
   }

   private static double convertToSeconds(String endTime) {
      return 0;
   }
