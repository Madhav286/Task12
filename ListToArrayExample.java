package com.example.hr;
import java.util.*;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Mango");

        // Convert the List to an Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the elements of the Array
        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
