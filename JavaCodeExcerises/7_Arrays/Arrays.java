import java.util.ArrayList;


public class Arrays{

// The most used methods are: 
//	add, clear, clone, contains, get, indexOf, isEmpty, remove, size.
// Try them out and see what you can do with the ArrayList class.
// Note: The <> are informally referred to as the "diamond."

	public static void main(String[] args){

		int[] myArray;
		myArray = new int[5];    // Initialization
		myArray[0] = 4;
		myArray[1] = 8;
		myArray[2] = 8;
		myArray[3] = 5;
		myArray[4] = 9;

		int[] myArrayTwo = {4, 8, 8, 5, 9};

// <Integer> business? This is part of what we call generics, and what you 
// need to know is that it tells our ArrayList of the acceptable types it can hold.
//  If we did not include this (always include it!), then we could add 
//  anything to our ArrayList - strings, integers, and all manner of things. 

		ArrayList<Integer> myArray = new ArrayList<Integer>();


		myArray.add(10);
		int num = myArray.get(0);


		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("Hello");
		list.add(new ArrayList<Integer>());
		list.add(new Double(12.0)); // adding a Double of value 12.0
		        
		System.out.println(list); // [10, "Hello", [], 12.0]

	}
}