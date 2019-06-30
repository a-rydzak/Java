
// Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

public class Gorilla extends Mammal{

	public void throwSomething(String itemThrown){

		System.out.println("The Gorilla has thrown, " +  itemThrown + ".");
		super.lowerEnergy(5);
	}

	public void eatBananas(){
		System.out.println("The Gorilla loves the Bananas!!");
		super.increaseEnergy(10);
	}

	public void climb(){
		System.out.println("Climbing Now");
		super.lowerEnergy(10);
	}
}