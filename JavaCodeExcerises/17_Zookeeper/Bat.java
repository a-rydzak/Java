// Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.

// For the fly() method, print the sound a bat taking off and decrease its energy by 50.

// For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.

// For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.

// Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.

class Bat extends Mammal{

	
	private int energyLevel = 300;

	public void fly(){System.out.println("This Bat is a flying bat"); super.lowerEnergy(50);}
	public void eatHumans(){System.out.println("We eating up all your people"); super.increaseEnergy(25);}
	public void attackTown(){System.out.println("All this town are belong to us"); super.lowerEnergy(100);}

}