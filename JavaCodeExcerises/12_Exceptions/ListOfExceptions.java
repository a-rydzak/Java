import java.util.ArrayList;

public class ListOfExceptions{

	public static void main(String[] args){

		//  Create ArrayList

		//  Try to cast each element to an Integer

		//  Use try/catch blocks to handle the exceptions

		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		try{

			for(int i = 0; i < myList.size(); i++) {
    			Integer castedValue = (Integer) myList.get(i);
			}

		}catch(Exception e){
			System.out.println("An error occured as " + e);
		}


	}
}