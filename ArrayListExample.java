package com.example.hr;


	import java.util.ArrayList;

	public class ArrayListExample {
	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Adding elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");
	        arrayList.add("Mango");

	        // Displaying elements before removal
	        System.out.println("ArrayList before removal: " + arrayList);

	        // Removing all elements from the ArrayList
	        arrayList.clear();

	        // Displaying elements after removal
	        System.out.println("ArrayList after removal: " + arrayList);
	    }
	}

