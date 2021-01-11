package edu.depauw.csc232;
import static org.junit.Assert.*;


////////////////////////////////////////////////////////////////////////////////
//File:             CustomerTest.java
//Course:           CSC232A, Fall 2018
//Authors:          Yuanming Wang
//
//Acknowledgements: Professor Brian Howard 
//
//Online sources:   None
////////////////////////////////////////////////////////////////////////////////

import org.junit.Test;
/**
 * A class to test <code>Customer</code> objects. Creates two Customers and
 * prints them out.
 * 
 * @author Yuanming Wang <yuanmingwang_2020@depauw.edu> 
 */
public class CustomerTest {

	public static void main(String[] args) {
	      Customer a1 = new Customer("a","12","1200");
	      Customer a2 = new Customer("b","13","1300");

	      System.out.println(a1);
	      System.out.println();
	      System.out.println(a2);
	   }
}
