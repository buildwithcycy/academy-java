package com.bptn.course._06_Triangle;

public class Triangle {

	public static void main(String[] args) {
		
		System.out.println("The area of the triangle is: " + area(4, 4, 5));
		
		if (isValid(4, 4, 5)) {
			System.out.println("The triangle is valid.");
		} else {
			System.out.println("The triangle is not valid.");
		}
		
	}	
		/*
		 * The isValid method checks if the three sides of a triangle are valid.
		 * Parameter: side1, side2, side3 
		 * Returns: true, false otherwise
		 */
		public static boolean isValid(double side1, double side2, double side3) 
		{
			if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
				return true; //if the sides are valid
			} else {
				return false; //false if the sides aren't valid 
			}
		}//end of the boolean method isValid
		
		/*
		 * The area method calculates the area of a triangle
		 * It takes three sides of the triangle as input and returns the area.
		 * Parameter: side1, side2, side3 
		 * Returns: area the area of the triangle
		 */
	
		public static double area(double side1, double side2, double side3)
		{
			double s = (side1 + side2 + side3) / 2;
			double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			return area;
		}//end of the double method area


}