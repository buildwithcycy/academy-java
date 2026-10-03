package com.bptn.course._Challenges;

class Solution {
	/**
	 * Parameter: nums which is an array of integers
	 * Parameter: target which is an integer representing the sum
	 * Return: an array of two integers representing the indices 
	 * of the two numbers that add up to the sum
	 */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];// Initialize an array to hold the indices of the result

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                //check if the sum of the two numbers at indices i and j is equal to the target
                {
                    result[0] = i; //This stores the index of the first number in the result array
                    result[1] = j; //This stores the index of the second number in the result array
                    return result;
                }//end of the if-statement
            }//end of the second for-loop
        }//end of the first for-loop

        return result;
    }//end of the twoSum method

}//end of the Solution class
/**
 * Summary:
In this code, we declare a method called twoSum. The twoSum method
 takes an array of integers (nums) and a target integer as input.
 The method searches for two pairs of numbers that add up to the target.
  If a pair is found, it returns  an array containing the indices of those two numbers. 
  If there is no pair found, it returns an empty array. 
  
  What was new to me in this code was the use of two for-loops to run through the array and 
  check for pairs of numbers that add up to the target.
   
 */
