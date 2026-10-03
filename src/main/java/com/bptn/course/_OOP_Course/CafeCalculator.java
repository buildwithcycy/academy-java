package com.bptn.course._OOP_Course;


public class CafeCalculator {
	
	static double priceByName (String name) {
		double price =0;
		
		if (name.toLowerCase().trim().equals("pastry")) {
			
			price = 13;
		}
		
		else if(name.toLowerCase().trim().equals("coffee")) {
			
			price = 7.5;
		}
		
		return price;
	
	}
	
	static double calculateItemRevenue(String itemName, int numberOfItemsSold) {
		
		
		return priceByName(itemName) * numberOfItemsSold;
	}
	
	static double calculateDailyTotalRevenue(double coffeeRevenue, double pastryRevenue) {
		return coffeeRevenue + pastryRevenue;
	}

    public static void main(String[] args) {

        // --- Step 1: Calculate revenue for each item type using our custom method ---
    	double coffeeRevenue = calculateItemRevenue("coffee", 100);
    	double pastryRevenue = calculateItemRevenue("pastry", 10);

        // --- Step 2: Calculate the total daily revenue using another custom method ---
    	double totalDailyRevenue = calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue);

        // --- Step 3: Print out the results ---
    	System.out.println("Daily Coffee Revenue: $"+coffeeRevenue);
    	System.out.println("Daily Pastry Revenue: $"+pastryRevenue);
    	System.out.println("Total Daily Revenue: $"+totalDailyRevenue);

    }
}