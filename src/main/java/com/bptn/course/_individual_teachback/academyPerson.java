package com.bptn.course._individual_teachback;

public abstract class academyPerson {
	
	 private String name;    // Every person has a name
	 protected boolean isOnline;   // Every person knows if they are online or not

	 // Constructor: How we create a person object
	 public academyPerson(String name) {
	     this.name = name;
	     this.isOnline = false; // By default, every person is offline when created
	     }
	
	 
	 //All academyPerson objects can use this method to display their status
	 public void displayOnlineStatus() {
	     System.out.println(name + " is " + (isOnline ? "online" : "offline"));
	 }

	 // Abstract methods
	 public abstract void activateOnlineStatus();
	 public abstract void activateOfflineStatus();
	 
	 public String getName() {
			return name;
		}

		public void setName(String personName) {
			if(personName.isBlank()) {
				System.out.print("Person Name cannot be empty!");
			} else {
				this.name = personName;
			}
		}
	}
	
	
	
	
	
	
	/*
	    private String name; //declare a private variable called name
	    private int grade; //declare a private variable called grade

	    public String getName() {
	        return name;
	    }//end of the method getName

	    public void setName(String name) {
	        this.name = name;
	    }//end of the method setName

	    public int getGrade() {
	        return grade;
	    }//end of the method getGrade

	    public void setGrade(int grade) {
	        if (grade > 0) {
	            this.grade = grade;
	        }
	    }//
	*/

//end of the class Student
