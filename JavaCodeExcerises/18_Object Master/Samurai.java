// Samurai: Set a default health of 200

// Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half

// Samurai: Add a method meditate() that heals the Samurai for half of their current health.

// Samurai: Add a method howMany() that returns the total current number of Samurai.

class Samurai extends Human{

	private int health = 200;

	static int noOfObSamurai = 0;
	

	public Samurai(){noOfObSamurai+=1;}

	public Samurai deathBlow(Human human){
		human.reduceHealth(human.currentHealth());
		int reducedAmount =(int) this.currentHealth()/2;
		this.reduceHealth(reducedAmount);
		return this;
	}

	@Override
	public Samurai increaseHealth(int amount){
		if(this.health+amount <= 200){
			this.health+=amount;
		}
		else{
			System.out.println("Full Health Achieved!!");
			this.health = 200;
		}	
		return this;
	}

	public Samurai meditate(){
		int increasedAmount =(int) this.currentHealth()/2;
		this.increaseHealth(increasedAmount);
		return this;
	}


}