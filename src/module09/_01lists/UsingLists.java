package module09._01lists;

import java.util.ArrayList;
import java.util.List;

public class UsingLists {

	public static void main(String[] args) {
		
		//your code here!!
        List<String> myList = new ArrayList<>();
        // Add some values
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        System.out.println("After adding elements: " + myList);

        // Get an element
        String firstItem = myList.get(0);
        System.out.println("First item: " + firstItem);

        // Remove an element
        myList.remove("Banana");
        System.out.println("After removing 'Banana': " + myList);

        // Add another item
        myList.add("Date");
        System.out.println("After adding 'Date': " + myList);

        // Get size of list
        System.out.println("List size: " + myList.size());

        // Loop through the list
        System.out.println("Looping through list:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}