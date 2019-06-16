// My name is Coding Dojo
// I am 100 years old
// My hometown is Burbank, CA




import java.util.Scanner;

public class YourOwnJavaProgram{
	public static void main(String[] args){

		Scanner takeIn = new Scanner(System.in);

		System.out.println("Enter Your Name?");
		String userName = takeIn.nextLine();

		System.out.println("Enter Your Age?");
		String userAge = takeIn.nextLine();

		System.out.println("Where Is Your Hometown?");
		String userHomeTown = takeIn.nextLine();

		printAll(userName,userAge,userHomeTown);

	}

	public static void printAll(String userName,String userAge, String userHomeTown){

		
		System.out.println("\nMy name is " + userName);
		System.out.println("I am "+ userAge +" years old");
		System.out.println("My hometown is " +  userHomeTown);

	}
}
