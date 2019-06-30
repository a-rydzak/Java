public class Human{

	private int health = 100;
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;


	public int currentHealth(){
		System.out.println(this.health);
		return this.health;
	}

	public Human attackHuman(Human human, int attack){
		human.reduceHealth(attack);
		return this;
	}

	public Human reduceHealth(int amount){
		if(this.health-amount >0){
			this.health-=amount;

		}
		else{
			System.out.println("Dead!");
			this.health = 0;
		}	
		return this;
	}


	public Human increaseHealth(int amount){
		if(this.health+amount <= 100){
			this.health+=amount;
		}
		else{
			System.out.println("Full Health Achieved!!");
			this.health = 100;
		}	
		return this;
	}
}