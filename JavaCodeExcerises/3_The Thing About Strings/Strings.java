public class Strings {
	public static void main(String[] args){

		String declaration = "This is my Kitchems cats!";
		int stringLength = declaration.length();

		System.out.println("Your statment is " + stringLength + " long.");

		String uno = "uno ";
		String dos = "dos";
		String tres = uno.concat(dos);

		System.out.println(tres);

		String nina = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
		System.out.println(nina);

		String ninja = "Welcome to Coding Dojo!";
		int aa = ninja.indexOf("Coding"); // a is 11
		int bb = ninja.indexOf("co"); // b is 3
		int cc = ninja.indexOf("pizza"); // c is -1, "pizza" is not found

		String sentence = "   spaces everywhere!   ";
		System.out.println(sentence.trim());

		String a = "HELLO";
		String b = "world";
		System.out.println(a.toLowerCase()); // hello
		System.out.println(b.toUpperCase()); // WORLD

		String c = new String("word");
		String d = new String("word");
		System.out.println(c == d); // false. not the same exact object.
		System.out.println(c.equals(d)); // true. same exact characters.

		String andrew = "andrew";
		String billy = "andrew";
		System.out.println(andrew == billy);


		String ninja_2 = "Welcome to Coding Dojo!";
		Integer aaa = ninja_2.indexOf("Andrew"); // a is 11
		System.out.println(aaa);

		char letter = 'o';
		Integer a = "Coding".indexOf(letter);
		Integer b = "Hello World".indexOf(letter);
		Integer c = "Hi".indexOf(letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null




	}
}