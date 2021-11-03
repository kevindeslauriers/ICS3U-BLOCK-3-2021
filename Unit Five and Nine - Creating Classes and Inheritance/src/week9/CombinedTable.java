package week9;

/**
 * CombinedTable
 */
public class CombinedTable {
   private SingleTable table1;
   private SingleTable table2;

   public CombinedTable(SingleTable t1, SingleTable t2) {
      table1 = t1;
      table2 = t2;
   }

   public double getDesirability() {
      if (table1.getHeight() != table2.getHeight()) {
         return (table1.getViewQuality() + table2.getViewQuality() / 2) - 10;
      }

      return (table1.getViewQuality() + table2.getViewQuality()) / 2;

   }

   public boolean canSeat(int seats) {
      return seats <= (table1.getNumSeats() + table2.getNumSeats() - 2);
   }

}