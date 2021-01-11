package edu.depauw.csc232.supermarketgeneral;
////////////////////////////////////////////////////////////////////////////////
//File:            SupermarketItem.java
//Course:           CSC232A, Fall 2018
//Authors:          Syed Mustafa, Hunzala
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////
/**
 * The <code>SupermarketItem</code> class models a supermarket item based on an
 * online supermarket simulation
 *
 * @author Syed Mustafa <smustafa_2021@depauw.edu>
 * @author Hunzala leghari <mleghari_2021@depauw.edu>
 */
public class SupermarketItem {
	private String itemName;
	private double itemPrice;
	private int itemNumber;
	private int quantitySold;
	private int itemsInStock;
	private double percentDiscount;
	protected boolean isPerishable;
	protected boolean isGarment;
	
	Account account;

	/**
	 * Construct a Supermarket item given a name, price, item number, number of items sold, number of items in stock, and discount on an item.
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
	 *	      The discount available to the customer for a particular item
	 */
	public SupermarketItem() {
	   this.itemName = "NULL";
      this.itemPrice = 0;
      this.itemNumber = 0;
      this.quantitySold = 0;
      this.itemsInStock = 0;
      this.percentDiscount = 0;
	}
	
	public SupermarketItem(String ItemName, double ItemPrice, int ItemNumber, int QuantitySold, int ItemsInStock, double PercentDiscount) {

		this.itemName = ItemName;
		this.itemPrice = ItemPrice;
		this.itemNumber = ItemNumber;
		this.quantitySold = QuantitySold;
		this.itemsInStock = ItemsInStock;
      this.percentDiscount = PercentDiscount;
	}

	/**
	 * Returns the number of items present in the inventory
	 * @return itemsInStock
	 */
	public int getItemsInStock () {
	   return itemsInStock;
	}
	
   /**
    * updates the inventory by subtracting the number of items sold
    */
	public void checkout() {
		itemsInStock -= quantitySold;
	}

	/**
	 * Calculates and returns the price of the item(s) bought
	 * @return itemPrice *  quantitySold
	 */
	public double checkoutPrice() {
	   return itemPrice *  quantitySold;
		
	}
	
	/**
	 * Calculates and returns the price after discount is applied
	 * @return itemPrice
	 */
	public double priceAfterDiscount() {
		if(percentDiscount>0) {
		   itemPrice = itemPrice*(1-percentDiscount);
		}
	return itemPrice;
	}

   public double getprice() {
      // TODO Auto-generated method stub
      return 0;
   }
}
