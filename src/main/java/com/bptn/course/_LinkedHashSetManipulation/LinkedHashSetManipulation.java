package com.bptn.course._LinkedHashSetManipulation;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");

		// Print the size of the set
		System.out.println("Size of the set: " + linkedHashSet.size());
		
		// Use for each loop to print the elements in the set
		for (String item : linkedHashSet)
		{
			System.out.println("Element: " + item );
		}

		// Use iterator to print the elements in the set
		
		Iterator < String > iterator =  linkedHashSet.iterator ();
		
		while(iterator.hasNext()) {
			
			System.out.println("Element: " + iterator.next() );
		
		}
		
		// Use remove() method to remove the element A from the set
		linkedHashSet.remove("A");
        
		// Use contains() method to check if the element B exists in the set
		linkedHashSet.contains("B");

		// Use clear() method to remove all elements from the set
		linkedHashSet.clear();

        // Print the set to show that it is empty.
		
		
		System.out.println(linkedHashSet);
	
        
	}
}


