package edu.depauw.csc232.supermarketgeneral;
////////////////////////////////////////////////////////////////////////////////
//File:             Perishable.java
//Course:           CSC232A, Fall 2018
//Authors:          Shengkai Li
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////
/**
 * The <code>SupermarketItem</code> class models a supermarket item based on an
 * online supermarket simulation
 *
 * @author  <shengkaili_2020@depauw.edu>
 */

public class Perishable extends SupermarketItem{
   // private instance variable
   private int NumOfPerishedItem;
   private int DaysOfPerishedItem;
   
   /**
    * Construct a Supermarket item given a name, price, item number, number of items sold, number of items in stock, and discount on an item.
    * 
    * @param NumOfperishedItem;
    *            The number of perished item
    * @param ItemName
    *            The name of the product
    * @param ItemPrice
    *            The price of the item
    * @param ItemNumber
    *            The bar code of the item
    * @param ItemSold
    *            The quantity of the item being sold
    * @param ItemsInStock
    *            The number of the ordered item that are remaining in inventory
    * @param PercentDiscount
    *       The discount available to the customer for a particular item
    * @param isPerishable
    *            Return this item is perishable or not
    */
   public Perishable() {
      super();
      this.NumOfPerishedItem = 0;
      this.DaysOfPerishedItem = 0;
   }
   public Perishable(int PerishedItemNum, int DaysOfPerishedItemNum) {
      super();
      this.NumOfPerishedItem = PerishedItemNum;
      this.NumOfPerishedItem = DaysOfPerishedItemNum;
   }
   /**
    * Returns the number of perished items present in the inventory
    * @return itemsInStock
    */
   public int getPerishedItemsInStock() {
      return getItemsInStock();
   }
   /**
    * updates the inventory by subtracting the number of pershied items sold
    */
   public void PerishedCheckout() {
         checkout();
   }
   /**
    * Calculates and returns the price of the perished item(s) bought
    * @return itemPrice *  quantitySold
    */
   public double PerishedcheckoutPrice(){
         return checkoutPrice();
   }
   /**
    * Calculates and returns the price after discount is applied
    * @return itemPrice
    */
   public double PerpriceAfterDiscount() {
      return priceAfterDiscount();
   }
   /**
    * find out a item is perished
    * @return true or false
    */
   public boolean isPerished() {
      if(isPerishable)
         return true;
      else
         return false;
   }
   /**
    * give some advice to customer depends on the days of perished item
    * @return true or false
    */
   public void advice() {
      if(DaysOfPerishedItem >=7)
         System.out.println("it is perished, don't buy it.");
      else
         System.out.println("it is fresh, enjoy it!");
   }
}

   
