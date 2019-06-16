import java.util.Scanner;

public class HelloPythagorean{
	public static void main(String[] args){

		Pythagorean hypo = new Pythagorean();
		Scanner takeIn = new Scanner(System.in);

		System.out.println("Enter leg 1");
		int legOne = Integer.parseInt(takeIn.nextLine());

		System.out.println("Enter leg 2");
		int legTwo = Integer.parseInt(takeIn.nextLine());

		System.out.println(hypo.calculateHypotenuse(legOne,legTwo));
	}
}