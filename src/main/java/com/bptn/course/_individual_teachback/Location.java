package com.bptn.course._individual_teachback;

abstract class Location {

	    private String city; //declare a private variable called city

	    public Location (String city) {
	        this.city = city;
	    }//end of the constructor

	    public String getLocation() {
	        return city;
	    }//end of the method getLocation

	    // Abstract method that must be implemented by subclasses
	    public abstract void displayLocation();


}//end of the class Location
