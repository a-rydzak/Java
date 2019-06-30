class Ninja extends Human{

	private int stealth = 10;

	public Ninja steal(Human human){
		
		if(human.reduceHealth(this.stealth).currentHealth() !=0){
			this.increaseHealth(this.stealth);
			human.reduceHealth(this.stealth);
		}else{
			this.increaseHealth(this.stealth-human.currentHealth());
			human.reduceHealth(this.stealth);
		}
		return this;
	}

	public Ninja runAway(){
		this.reduceHealth(10);
		return this;
	}

}