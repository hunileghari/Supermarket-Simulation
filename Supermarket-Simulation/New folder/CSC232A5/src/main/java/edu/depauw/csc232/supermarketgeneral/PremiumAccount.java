package edu.depauw.csc232.supermarketgeneral;

public class PremiumAccount extends Account {

   public PremiumAccount(String theUsername, String thePassword,
            String theEmail, String theAddress) {
      super(theUsername, thePassword, theEmail, theAddress);
      // TODO Auto-generated constructor stub
   }

   @Override
   public double discountAllocated() {
      return 0.1;
   }
}
