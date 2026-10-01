package com.bptn.course._04_arrays;

import java.util.Scanner;
public class FactorialExample{  
 public static void main(String args[]){  
        Scanner scanner = new Scanner (System.in);
        int number;
        int fact = 1; //initialize factorial to 1 (this handles the case where factorial of zero equals 1)
        int input;
        
        //Prompt the user to enter a whole number
        System.out.print("Welcome! Please enter a whole number to calculate the factorial : "); 
        input = scanner.nextInt();
        
        //initialize the value of number to the original input of the user
        number = input;
        
        //Check if number is negative because the factorial of a negative number doesn't exist
        if (number <0)
        { 
        	System.out.println("Sorry the number you entered is negative");
        }
        
        //Check if the number is positive or equal to zero
        else if (number >0)
        { 
        	for (int i=input; i>1; i--) 
        	/*
        	 * This for-loop starts with index i being assigned the value of the user input
        	 * As long as index i is greater than 1, the loop will run
        	 * We decrement the value of index i to
        	 */
        	{ 
	          
	          fact = fact * i; 
	          /*
	           * We multiply fact by the value of index i. 
	           * index i is initially equal to the value of user input
	           * Since index i is decremented by one at each loop, we will get the result
	      
	           */
	          
	         } 
        } 

        System.out.println("Factorial of "+number+" is: "+fact); 
        scanner.close();
 }      
}