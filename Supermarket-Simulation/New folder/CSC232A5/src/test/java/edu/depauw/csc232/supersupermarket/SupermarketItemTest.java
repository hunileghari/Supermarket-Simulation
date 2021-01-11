package edu.depauw.csc232.supersupermarket;
////////////////////////////////////////////////////////////////////////////////
//File:            SupermarketItemTest.java
//Course:           CSC232A, Fall 2018
//Authors:          Syed Mustafa, Hunzala
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////package edu.depauw.csc232;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.depauw.csc232.supermarketgeneral.SupermarketItem;
/**
 * A simple JUnit test of the <code>SuperMarketItem</code> class.
 * 
 * @ authors Syed Mustafa and Hunzala
 */
public class SupermarketItemTest {

   SupermarketItem item1 = new SupermarketItem("soap", 2, 12485, 5, 10, 0  );
   SupermarketItem item2 = new SupermarketItem("soap", 100, 12485, 1, 10, 0.4  );
   SupermarketItem item3 = new SupermarketItem("tape", 1000, -545, 2, 5, 1 );
   
   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.SupermarketItem#checkout()}.
    */
   @Test
   public void testCheckout() {
     item1.checkout();
     assertEquals(5, item1.getItemsInStock());
   }

   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.SupermarketItem#checkoutPrice()}.
    */
   @Test
   public void testCheckoutPrice() {
      assertTrue(item1.checkoutPrice()== 10.00);
                   
   }

   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.SupermarketItem#priceAfterDiscount()}.
    */
   @Test
   public void testPriceAfterDiscount1() {
      assertTrue(item2.priceAfterDiscount() == 60);
   }
   
   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.SupermarketItem#priceAfterDiscount()}.
    */
   @Test
   public void testPriceAfterDiscount2() {
      assertTrue(item3.priceAfterDiscount() == 0);
   }
}
