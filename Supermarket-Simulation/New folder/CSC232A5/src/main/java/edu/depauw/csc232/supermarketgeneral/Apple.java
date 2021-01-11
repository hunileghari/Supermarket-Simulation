package edu.depauw.csc232.supermarketgeneral;

public class Apple extends Perishable {

	
   public Apple() {
      super();
      num=100;
   }
      
      public void displayInfo()
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

