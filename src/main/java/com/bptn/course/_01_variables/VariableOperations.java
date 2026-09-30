package com.bptn.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {
		
	/* 1. Declare two integer variables and assign them values*/
		int a = 12; //an integer variable to hold the value 12
		int b = 18; //an integer variable to hold the value 18
		
	/*	2. Perform arithmetic operations using these variables and 
	 * store the results in new variables.*/
		int result;
		result = a + b; //performing addition on a and b
		
		/*3.Print the original variables and the results of the arithmetic operations.*/
		System.out.println ("Variable a is = " + a);
		System.out.println ("Variable b is = " + b);
		System.out.println ("The sum of a and b is = " + result);
		
		/*4. Reassign new values to the original integer variables and print them to show the changes.*/
		a = 13; // reassigning a new value to a 
		b = 27; //reassigning a new value to b
		System.out.println ("The new value of a is = " + a);
		System.out.println ("The new value of b is = " + b);

		/*5. Declare a character variable and a string variable and print them. */
		char letter='C';
		String sentence = "Hello, I love math!";
		System.out.println ("The value of letter is = " + letter);
		System.out.println ("The value of sentence is = " + sentence);
		
		
	 

	}

}
