package edu.depauw.csc232;

public class PremiumCustomer extends Customer {

   public PremiumCustomer(String name, String age, String arrival_time) {
      super(name, age, arrival_time);
      
   }

   @Override
   public double discountAllocated() {
      return 0.1;
      
      
      
   }
}
