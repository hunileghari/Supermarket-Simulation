package edu.depauw.csc232;
////////////////////////////////////////////////////////////////////////////////
// File:             Customer.java
// Course:           CSC232A, Fall 2018
// Authors:          Yuanming Wang
//
// Acknowledgements: Professor Brian Howard 
//
// Online sources:   None
////////////////////////////////////////////////////////////////////////////////

/**
 * The <code>Customer</code> class model a customer in a simulation of business.
 *
 * @author Yuanming Wang <yuanmingwang_2020@depauw.edu> 
 */
public class Customer {
	/**
	 * Construct an Customer object given a name, age and arrival time.
	 * 
	 * @param name
	 *            The name of the customer
	 * @param age
	 *            The age of the customer as String
	 * @param arrival time
	 *            The arrival time of the customer as String
	 */
	public Customer(String name, String age, String arrival_time) {
		this.name = name;
		this.age = age;
		this.arrival_time = arrival_time;
	}
	/**
	 * Override the default <code>toString</code> method to return the Customer
	 * formatted into four lines.
	 */
	public String toString() {
		return "Customer:\n\tname: " + name + "\n\tage: " + age + "\n\tarrival time: " + arrival_time;
	}
	
	/**
	 * Get the name of this customer.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the age of this customer.
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * Get the arrival time of this customer.
	 */
	public String getArrivalTime() {
		return arrival_time;
	}
	
	/**
	 * Set the name of the customer.
	 */
	public void setName(String a) {
		this.name = a;
	}
	
	/**
	 * Set the age of the customer.
	 */
	public void setAge(String a) {
		this.age = a;
	}
	

	/**
	 * Set the arrival time of the customer.
	 */
	public void setArrivalTime(String a) {
		this.arrival_time = a;
	}
	
	private String name;
	private String age;
	private String arrival_time;
   
	
}
