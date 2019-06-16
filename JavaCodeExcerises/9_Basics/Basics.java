// Solve the below challenges. Use either an Array or ArrayList when an array 
// is necessary, depending on what you think is appropriate. The class name 
// should be BasicJava; you will need to create methods for each of the tasks 
// below and test them in the main method.

import java.util.ArrayList;
import java.util.Arrays;

public class Basics{
	public static void main(String[] args){

		// 1.  Print 1-255, Write a method that prints all the numbers from 1 to 255.
		//printNums(1,255);

		// 2.  Print odd numbers between 1-255 Write a method that prints all the odd numbers from 1 to 255.
		//printNumsCond(1,255, "odd");

		// 3.  Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
		
		// int[] testArray = {1,2,3,55,5,6,7};
		// maxOfArrayNums(testArray);

		// 4.  Get Average Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
		int[] testArray = {1,2,3,55,5,6,7};
		// avgOfArrayNums(testArray);

		// 5.  Array with Odd Numbers Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
		// makeAnnoyingArray(1,255);

		// Shifting the Values in the Array
		shiftThatArray(testArray);

	}

	public static void printNums(int from, int to){
		for(int i = from; i<=to; i++){
			System.out.println(i);
		}
	}

	public static void printNumsCond(int from, int to, String cond){
		if(cond == "even"){
			for(int i = from; i<=to; i++){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}
		else if(cond == "odd"){
			for(int i = from; i<=to; i++){
				if(i%2!=0){
					System.out.println(i);
				}
			}			
		}
		else{
			System.out.println("\nMust specifify \'even\' or \'odd\'.");
		}
	}

	public static void maxOfArrayNums(int[] arry){
		int maxValue = arry[0];
		for(int i = 0; i<arry.length; i++){
			if(arry[i]>maxValue){
				maxValue = arry[i];
			}
		}	
		System.out.println(maxValue);	
	}


	public static void avgOfArrayNums(int[] arry){
		int totalValue = 0;
		for(int i = 0; i<arry.length; i++){
			totalValue+= arry[i];
		}	

		totalValue = totalValue/arry.length;
		System.out.println(totalValue);	
	}

	public static void makeAnnoyingArray(int from, int to){

		ArrayList<Integer> annoyingArray = new ArrayList<Integer>();

		for(int i = from; i<=to; i++){
			annoyingArray.add(i);
		}

		System.out.println(annoyingArray);
	}

	public static void shiftThatArray(int[] arry){
		int firstNum = arry[0];

		// {1,2,3,55,5,6,7}
		for(int i = 0; i<arry.length-1; i++){

			arry[i]=arry[i+1];
		}
		arry[arry.length-1] = firstNum;

		System.out.println(Arrays.toString(arry));
	}
}