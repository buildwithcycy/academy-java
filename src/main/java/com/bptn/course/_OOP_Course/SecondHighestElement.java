package com.bptn.course._OOP_Course;

public class SecondHighestElement {
	
	public static int secondHighest(int[] array) {
		int highest = -1; //initializing the highest variable to -1
		int second = -1; //initializing the second highest variable to -1
		
		for(int i=0; i < array.length; i++) 
		{
			int temp = -1; //initializing the temp variable to -1
			System.out.println("Array i: " + array[i]); //printing the array variable

			
			if(array[i] >= highest) //checking if the current element in the array is greater than the highest variable
			{
				highest = array[i]; //updating the highest variable to the current element in the array
				temp = highest; //updating the temp variable to the highest variable
				System.out.println("Highest: " + highest); //printing the highest variable
				System.out.println("Array i: " + array[i]); //printing the temp variable
			} 
			
			if (temp > second) {
				second = temp; 
				System.out.println("Second Highest: " + second); //printing the second highest variable
			}
		
		}
		return second; //returning the second highest variable
	}

	public static void main(String args[])
	{
		int[] array = {12, 35, 1, 10, 34, 1}; //initializing the array
		int output = secondHighest(array); //initializing the output variable and calling the secondHighest method
		System.out.println(output);//printing the second highest element, it should print 34
	}
	
}

/**
 * Improvements:
 * 1. The secondHighest method should be placed at the top, before the main method 
 * for better readability and organization.
 * 
 * 
 */