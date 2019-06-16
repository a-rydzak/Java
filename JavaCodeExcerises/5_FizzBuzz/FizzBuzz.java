// Write a program that will take an integer and print Fizz if the 
// number is divisible by 3, Buzz if the number is divisible by 5, 
// FizzBuzz if the number is divisible by 3 and 5, and the number itself for all 
// other cases.
import java.util.Scanner;

public class FizzBuzz{

	public static void main(String[] args){

		Scanner takeIn = new Scanner(System.in);

		System.out.println("Enter A Number");
		int number = Integer.parseInt(takeIn.nextLine());

		fizzBuzz(number);
		
	}

    public static void fizzBuzz(int number) {

    	Boolean three = (number % 3 == 0);
    	Boolean five = (number % 5 == 0);

        if(three && !five){
        	System.out.println("Fizz");
        }
        else if(!three && five){
        	System.out.println("Buzz");
        }
        else if(three && five){
        	System.out.println("FizzBuzz");
        }
        else{
        	System.out.println(number);
        }
    }

}
