////////////////////////////////////////////////////////////////////////////////
//File:             Garment.java
//Course:           CSC232A, Fall 2018
//Authors:          Yuanming Wang
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////

package edu.depauw.csc232.supermarketgeneral;

/**
* The <code>Nonperishable</code> class model the nonperishable item in a simulation of supermarket.
* subclass of SupermaraketItem
* @author Yuanming Wang <yuanmingwang_2020@depauw.edu> 
*/

public class Garment extends SupermarketItem {
   
   private int size;
   protected boolean isMan;
   protected boolean isTop;
   protected boolean isBottom;
   protected boolean isShoes;

   /**
    * Construct a Nonperishable item given a name, price, item number, number of items sold, number of items in stock, and discount on an item.
    * by calling the constructor in SupermarketItem class
    * 
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
    * @param Size
    *       The size available to the customer for this garment
    */
   
   public Garment() {
      super();
      this.size = 0;
      this.isGarment = true;
   }
   
   public Garment(String ItemName, double ItemPrice, int ItemNumber, int QuantitySold, int ItemsInStock, double PercentDiscount, int Size, boolean IsMan) {
      super( ItemName,  ItemPrice,  ItemNumber,  QuantitySold,  ItemsInStock,  PercentDiscount);
      this.size = Size;
      this.isMan = IsMan;
      this.isGarment = true;
   }
   
   public int getSize() {
      return size;
   }
   
   public Garment getType(Garment i) {
      return i;
   }
   
}
