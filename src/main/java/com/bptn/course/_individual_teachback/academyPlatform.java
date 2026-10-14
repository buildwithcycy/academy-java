package com.bptn.course._individual_teachback;

// Our main program to run the online platform
public class academyPlatform 
{
public static void main(String[] args) {
   System.out.println("--- Welcome to the Academy Online Platform! ---");

  
   academyStudent studentAlisha = new academyStudent("Alisha");
   studentAlisha.displayOnlineStatus(); // Inherited from academyPerson
   
   studentAlisha.activateOnlineStatus();// Implemented from academyStudent abstract method
   
   studentAlisha.displayOnlineStatus();
   
   studentAlisha.activateOfflineStatus();
   
   studentAlisha.displayOnlineStatus();

   studentAlisha.setName("");
   
   //studentAlisha.name = "Cynthia";  // error
   //System.out.println(studentAlisha.name); // error
   
   System.out.println("\n------------------------------------");

   
}
}