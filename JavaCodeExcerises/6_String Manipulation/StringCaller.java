public class StringCaller{

	public static void main(String[] args){

		// StringManipulation manipulator = new StringManipulation();
		// String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		// System.out.println(str); // Hello, World

		// StringManipulation manipulator = new StringManipulation();
		// char letter = 'o';
		// Integer a = manipulator.getIndexOrNull("Coding", letter);
		// Integer b = manipulator.getIndexOrNull("Hello World", letter);
		// Integer c = manipulator.getIndexOrNull("Hi", letter);
		// System.out.println(a); // 1
		// System.out.println(b); // 4
		// System.out.println(c); // null

		StringManipulation manipulator = new StringManipulation();
		String word = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(word); // eworld
	}
}