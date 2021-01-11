package edu.depauw.csc232.supermarketgeneral;
////////////////////////////////////////////////////////////////////////////////
//File:             Account.java
//Course:           CSC232A, Fall 2018
//Authors:          Yuanming Wang
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////

/**
* The <code>Account</code> class model an account in a simulation of supermarket.
*
* @author Yuanming Wang <yuanmingwang_2020@depauw.edu> 
*/

public class Account {
   
   private String username;
   private String password;
   private String email;
   private int balance=0;
   private String address;

/**
* Construct an Customer object given a username, password email and adress.
* 
* @param username
*            The username of the account
* @param password
*            The password of the account as String
* @param email
*            The email of the account as String
* @param address
*            The address of the account as String
* 
*/


public Account(String theUsername, String thePassword, String theEmail, String theAddress) {
   this.setUsername(theUsername);
   this.password = thePassword;
   this.setEmail(theEmail);
   this.setAddress(theAddress);
   this.balance = 0; // initial balance is 0
}

/**
 * set balance to this amount
 * 
 * @param amount 
 *          
 *          
 */
public void setBalance(int amount) {
   if(amount >= 0) {
      balance = amount;
   }
}

/**
 * 
 * @return balance
 */
public int getBalance() {
   return balance;
}

/**
 * 
 * @return password
 */
public String getPassword() {
   return password;
}

/**
 * updates the balance after user makes a purchase
 * @param amount
 */
public void spend(int amount) {
   if(balance > amount && balance > 0) {
      balance = balance - amount;
   }
   else {
      System.out.println("Not enough money in your account");
   }
}

/**
 * updates the balance after user makes a deposit
 * @param amount
 */
public void deposit(double amount) {
   if(amount > 0) {
      balance+=amount;
   }
}

/**
 * updates the balance after user makes a withdrawal
 * @param amount
 */
public void withdraw(double amount) {
   if(balance > amount && amount > 0) {
      balance-=amount;
   }
   else {
      System.out.println("Not enough money in your account");
   }
}

/**
 * allows user to change the password
 * @param oldPassword
 * @param newPassword
 * @return boolean
 */
public boolean changePassword(String oldPassword, String newPassword) {
   if(oldPassword.equals(password)) {
      this.password = newPassword;
      return true;
   }
   else {
      System.out.println("Wrong password");
      return false;
   }
}

public double discountAllocated() {

   return 0;
}

public String getUsername() {
   return username;
}

public void setUsername(String username) {
   this.username = username;
}

public String getEmail() {
   return email;
}

public void setEmail(String email) {
   this.email = email;
}

public String getAddress() {
   return address;
}

public void setAddress(String address) {
   this.address = address;
}



}
