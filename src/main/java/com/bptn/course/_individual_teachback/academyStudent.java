package com.bptn.course._individual_teachback;

public class academyStudent extends academyPerson  {
	 boolean isNotificationActivated; // A specific detail for having notifications snoozed or on

	 public academyStudent(String name) {
	     super(name); // Call the academyPerson constructor to set the name
	     this.isNotificationActivated = false; //start with notifications snoozed by default
	 }

	 
	 @Override 
	 public void activateOnlineStatus() {
	     isOnline = true;
	     isNotificationActivated = true; // notifications are on when the student is online
	     System.out.println("The student " + getName() + " is online. (Notifications are on)");
	 }

	 @Override
	 public void activateOfflineStatus() {
		 isOnline = false;
	     isNotificationActivated = false; // notifications are off when the student is offline
	     System.out.println("The student " + getName() + " is offline. (Notifications are off)");
	 }

	 
	}
