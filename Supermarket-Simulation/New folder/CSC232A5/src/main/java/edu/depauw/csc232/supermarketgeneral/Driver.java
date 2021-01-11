////////////////////////////////////////////////////////////////////////////////
//File:             Driver.java
//Course:           CSC232A, Fall 2018
//Authors:          Yuanming Wang
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////

package edu.depauw.csc232.supermarketgeneral;

import java.util.Scanner;

public class Driver {
   
   

  /* public static void main(String[] args) {
      Account a = new Account("yuanming","123","yuanmingwang_2020@depauw.edu","46136 Greencastle");
      Account b = new Account("balabala","321","balabala@balabala.com","balabala");
      
      a.setBalance(100);
      b.setBalance(100);
      a.spend(50);
      b.spend(200);
      System.out.println("Test for spend, should be 50,100: " + a.getBalance() + "," + b.getBalance());
      
      a.setBalance(0);
      b.setBalance(0);
      
      a.withdraw(400);
      b.withdraw(123);
      System.out.println("Test for withdraw, should be 400,123: " + a.getBalance() + "," + b.getBalance());
      
      a.setBalance(500);
      b.setBalance(100);
      a.withdraw(400);
      b.withdraw(123);
      System.out.println("Test for withdraw, should be 100,100: " + a.getBalance() + "," + b.getBalance());
      
      a.changePassword("123","0000");
      b.changePassword("123", "0000");
      System.out.println("Test for changePassword, should be 0000,321: " + a.getPassword() + "," + b.getPassword());
      
      
      SupermarketItem item1 = new SupermarketItem("soap", 2.00, 12485, 5, 10, 0  );
      SupermarketItem item2 = new SupermarketItem("soap", 100, 12485, 1, 10, 0.4  );
      
      System.out.println("Test for getItemInStock, should be 10: "+ item1.getItemsInStock());
      
      item1.checkout();
      System.out.println("Test for checkout, should be 5: "+ item1.getItemsInStock());
      
      System.out.println("Test for checkoutPrice, should be 10.0: "+ item1.checkoutPrice());
      
      System.out.println("Test for priceAfterDiscount, should be 60.0: "+ item2.priceAfterDiscount());
      
   }
   */
   public static void main (String[] args) {
      Inventory inventory = new Inventory();
      String username;
      String password1;
     
      
      Scanner sc = new Scanner(System.in);
      int counter=0;
      System.out.println("Please enter a username");
       username = sc.next();
      
      while(counter==0) {
      System.out.println("Please enter your password");
      password1 = sc.next();
      
      System.out.println("Please re-enter your password");
      String password2 = sc.next();
      
      if(!password1.equals(password2)) { 
         System.out.println("Passwords did not match");
        
      }
      else 
      {
         counter++;
      }
      System.out.println("Please enter your email");
      String email = sc.next();
      System.out.println("Please enter your address");
      String address = sc.next();
      
      }
      Account account = new Account(username, password1, email, address);
      int c2 = 0;
      String item="amazing";
      SupermarketItem object=null;
      while(c2==0) {
         
      System.out.println("Here is a list of all the items we sell\n 1. Apples\n 2. Oranges\n 3. Shoes\n 4. Tops" );
      System.out.println("Please enter the type of item you want to purchase");
      String typeOfItem = sc.next();
       item = typeOfItem;
      
      if(typeOfItem.equals("apples")) {
         object = new Apple();
         apple.displayInfo();
         c2++;//printinfo
      }
      else if(typeOfItem.equals("oranges")) {
         object = new Orange();
         orange.displayInfo();
       c2++;//printinfo
      }
      else if(typeOfItem.equals("shoes")) {
         object = new Shoes();
         shoes.displayInfo();
       //printinfo
         c2++;
      }
      else if(typeOfItem.equals("tops"))
      {
         object = new Top();
         top.displayInfo();
       //printinfo
         c2++;
      }
      
      else {
         System.out.println("Item not available. Please choose an item from the list");
         ;
      }
      }
      
      System.out.println("Enter the quantity you wish to purchase. (Maximum:" + inventory.numitems(item) + ")");
      double typeOfItem = sc.nextDouble();
      double sum = typeOfItem*(object.getprice());
      System.out.println("The total price is: $"+ sum);
      
  
      System.out.println("Do you wish to proceed?(y/n)");
      String proceed = sc.next();
      if(proceed.equals("y"))
      {
         account.withdraw(sum);
         System.out.println("The amount was deducted from your account.");
      }
         
         System.out.println("Thank you for visiting Supermarket General");
     
      String end = sc.next();
         
      
   }

}
