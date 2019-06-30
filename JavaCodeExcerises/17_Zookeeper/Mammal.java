public class Mammal{

	private int energyLevel = 100;

	public int displayEnergy(){
		System.out.println("Energy level is currently " + energyLevel);
		return energyLevel;
	}

	public void lowerEnergy(int energy){
		this.energyLevel-=energy;
	}

	public void increaseEnergy(int energy){
		this.energyLevel+=energy;
	}
}