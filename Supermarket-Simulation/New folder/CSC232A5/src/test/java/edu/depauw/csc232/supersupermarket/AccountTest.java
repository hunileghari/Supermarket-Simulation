package edu.depauw.csc232.supersupermarket;
////////////////////////////////////////////////////////////////////////////////
//File:             AccountTest.java
//Course:           CSC232A, Fall 2018
//Authors:          Yuanming Wang
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////


import static org.junit.Assert.*;

import org.junit.Test;

import edu.depauw.csc232.supermarketgeneral.Account;

public class AccountTest {

    Account a = new Account("yuanming","123","yuanmingwang_2020@depauw.edu","46136 Greencastle");
    Account b = new Account("balabala","321","balabala@balabala.com","balabala");
    Account c = new Account("-294=5", "-99999999999999", "9999999999.99","-99999999");
   
    /**
     * Test method for {@link edu.depauw.csc232.supermarketgeneral.Account#spend()}.
     */
   @Test
   public void testSpend() {
      
      a.setBalance(100);
      b.setBalance(100);
      a.spend(50);
      b.spend(200);
      
      c.setBalance(100);
      c.spend(1000000);
      
      assertEquals(50,a.getBalance());
      assertEquals(100,b.getBalance());
      assertEquals(100,c.getBalance());
   }
   
   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.Account#deposit()}.
    */
   @Test
   public void testDeposit() {
      
      a.deposit(400);
      b.deposit(123);
      c.deposit(-123);
      
      assertEquals(400,a.getBalance());
      assertEquals(123,b.getBalance());
      assertEquals(0,c.getBalance());
   }
   
   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.Account#withdraw()}.
    */
   @Test
   public void testWithdraw() {
      
      a.setBalance(500);
      b.setBalance(100);
      c.setBalance(100);
      a.withdraw(400);
      b.withdraw(123);
      c.withdraw(-30000);
      
      assertEquals(100,a.getBalance());
      assertEquals(100,b.getBalance());
      assertEquals(100,c.getBalance());
   }
   
   /**
    * Test method for {@link edu.depauw.csc232.supermarketgeneral.Account#changePassword()}.
    */
   @Test
   public void testChangePassword() {
      
      a.changePassword("123","0000");
      b.changePassword("123", "0000");
      
      assertEquals("0000",a.getPassword());
      assertEquals("321",b.getPassword());
   }

}
