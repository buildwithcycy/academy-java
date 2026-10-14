package com.bptn.course._try_catch_debugging;

public class Main {
   
	  // Method to demonstrate nested Try-Catch
	     public void method() {
	        try {
	              try {
	              int [] arr = { 1, 2, 3, 4};
	              System.out.println("Index 0: " + arr[0]);
	              System.out.println("Index 5: " + arr[5]);
	              }//end of inner try block

	               catch (ArithmeticException e )
	               {
	              System.out.println("ArithmeticException occurred");
	              }//end of inner catch block
	            }//end of outer try block
	        catch (ArrayIndexOutOfBoundsException e )
	        {
	          System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
	            }
	    }

	    /*
	    // Method to demonstrate exception propagation
	     public static void method1() {
	        int [] arr = { 1, 2, 3, 4};
	        System.out.println(arr[4]);

	    }
	    // Method to handle exception and demonstrate propagation
	    public static void method2() {
	        try {
	              method1();
	            }
	        catch (ArrayIndexOutOfBoundsException e )
	        {
	          System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
	            }
	    }
	    */

	    // main() method to run the program
	    public static void main(String args[]) {
	        Main exceptionSolutionObject = new Main();
	       // exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
	        exceptionSolutionObject.method(); // Calling method to demonstrate nested try catch blocks
	    }

	}

