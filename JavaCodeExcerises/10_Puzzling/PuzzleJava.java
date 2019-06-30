import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class PuzzleJava{

	public static void main(String[] args){

		// int[] intArray = {3,5,1,2,7,9,8,13,25,32};
		// ArrayList<Integer> resultNumbers = firstFunct(intArray);
		// System.out.println(resultNumbers);

		
		// ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
		// ArrayList<String> resultNames = getNames(names);
		// System.out.println(resultNames);

		// ArrayList<String> alphaBet = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H"));
		// alphabetPrinter(alphaBet);

		// randomNumbers();

		// ArrayList<String> alphaBet = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H"));
		// randomString(alphaBet);

		ArrayList<String> alphaBet = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H"));
		getRandStrings(alphaBet);

	}


	// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
	// Print the sum of all numbers in the array. Also have the function return an array 
	// that only includes numbers that are greater than 10 (e.g. when you pass the array above, 
	// it should return an array with the values of 13,25,32)
	public static ArrayList<Integer> firstFunct(int[] arr){

		int sum = 0;
		ArrayList<Integer> returnList = new ArrayList<Integer>();

		for(int i=0; i < arr.length; i++){
			sum+= arr[i];
			if(arr[i] > 10){
				returnList.add(arr[i]);
			}
		}
		System.out.println(sum);
		return returnList;
	}

	// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	// Shuffle the array and print the name of each person. Have the method also return an array 
	// with names that are longer than 5 characters.
	public static ArrayList<String> getNames(ArrayList<String> names){

		ArrayList<String> longNames = new ArrayList<String>();
		Collections.shuffle(names);

		for(String str:names){
			System.out.println(str);

			if(str.length() > 5){
				longNames.add(str);
			}
		}

		return longNames;
	}

// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
// Shuffle the array and, after shuffling, display the last letter from the array. 
// Have it also display the first letter of the array. If the first letter in the array is a vowel, 
// have it display a message.

	public static void alphabetPrinter(ArrayList<String> alphaBet){
		Collections.shuffle(alphaBet);
		int lastItem = alphaBet.size()-1;

		System.out.println(alphaBet.get(lastItem));
		System.out.println(alphaBet.get(0));
		String[] vowles = {"A", "E", "I", "O", "U"};
		
		for(String str:vowles){
			if(str == alphaBet.get(0)){
				System.out.println("A vowel was found! " + alphaBet.get(0));
			}
		}
	}

// Generate and return an array with 10 random numbers between 55-100.
// To get a random integer, you can use the nextInt method of the Random 
// class. Random Class documentation

	public static int[] randomNumbers(){
		int[] tenNumbers = new int[10];
		Random rand = new Random();
		

		for(int i = 0; i<10 ;i++){
			int n = rand.nextInt(46)+55;
			tenNumbers[i] = n;
		}
		System.out.println(Arrays.toString(tenNumbers));
		return tenNumbers;
	}

	// Create a random string that is 5 characters long
	public static StringBuilder randomString(ArrayList alphaBet){

		StringBuilder sb = new StringBuilder();
		Random rand = new Random();

		for(int i =0; i<5; i++){
			int n = rand.nextInt(alphaBet.size());
			sb.append(alphaBet.get(n));
		}

		System.out.println(sb);
		return sb;
	}

	// Generate an array with 10 random strings that are each 5 characters long

	public static String[] getRandStrings(ArrayList alphaBet){
		String[] strings = new String[5];

		for(int i =0; i<5; i++){
			StringBuilder string = randomString(alphaBet);
			strings[i] = string.toString();
		}
		return strings;
	}
}