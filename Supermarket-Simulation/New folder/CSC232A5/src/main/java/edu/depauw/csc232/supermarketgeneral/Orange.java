package edu.depauw.csc232.supermarketgeneral;

public class Orange extends Perishable {

   public Orange() {
      
   }

   public Orange(int PerishedItemNum, int DaysOfPerishedItemNum) {
      super(PerishedItemNum, DaysOfPerishedItemNum);
      num=200;
      
   }

 
   
   public static void displayInfo()
   {
      System.out.println("Apple price: $2/kg");
   }
   
   public void updatenum(int sold)
   {
 	  num = num-sold;
   }
   public int getnum()
   {
 	 return num; 
   }
   
   
   private int num;
   
}
