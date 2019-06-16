public class Loops{

	public static void main(String[] args){

		int i = 0;
		while(i < 7)
		{
		    System.out.println("foo");
		    i++;
		}

		for (int i = 0; i < 7; i++){
		    System.out.println("bar");
		}


		ArrayList<String> dynamicArray = new ArrayList<String>();
		dynamicArray.add("hello");
		dynamicArray.add("world");
		dynamicArray.add("etc");
		
		for (int i = 0; i < dynamicArray.size(); i++){
		    System.out.println(dynamicArray.get(i));
		}

		for(int i = 0; i < dynamicArray.size(); i++){
		    String name = dynamicArray.get(i);
		    Systemcopy.out.println("hello " + name);
		    // other operations using name
		}

	}
}