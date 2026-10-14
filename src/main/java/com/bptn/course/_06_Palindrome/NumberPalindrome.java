package com.bptn.course._06_Palindrome;

import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		
		
		if(isPalindrome(number))
			System.out.println(number + " is a palindrome.");
		else 
			System.out.println(number + " is not a palindrome.");

    input.close();
	}
	
	
	/*
	 * The method reverse takes an integer as input and returns the reversed integer.
	 * Parameter: number, an integer to be reversed
	 * Returns: reversed, an integer
	 */
	
	public static int reverse(int number) {
		int reversed = 0;
		
		while(number > 0) {
			int mod = number % 10; //use modulo operator to obtain the last digit of the number
			reversed = reversed*10+mod; //add the last digit to the reversed number
			number /= 10; //we divide the number by 10 to remove the last digit 
		}
		return reversed;
	}
	
	
	
	/*
	 * This method checks if a number is a palindrome by comparing it to its reverse.
	 * If the number is equal to its reverse, it is a palindrome and the method returns true.
	 * Otherwise, it returns false.
	 * Parameter: number the integer to be checked
	 * Returns: true if the number is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(int number) {
		if( number == reverse(number))
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}

/*
 * Summary of the modifications made to the original code:
 * 1. The return type of the isPalindrome method was changed from int to boolean 
 * 2. The isPalindrome method now returns true if the number is a palindrome and false otherwise
 * 3. The method isPalindrome was changed to static so that we can call it without creating an object
 * 4. The method reverse was changed to static so that we can we can call it without creating a new object
 * 5. The return type of the reverse method was changed from String to int to match the return of integer reversed
 * 6. Closed the scanner input inside the main method
 * The new aspect of this code was the logic used to reverse the integer
 */
