// Create a Pokemon class with:

	// name, health, and type member variables.

	// void attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10

	// a count static variable that keeps the number of Pokemon created in the program.

	// getters and setters for each member variable.

	// a constructor class to set the instance's name, health, and type on creation


public class Pokemon{
    private String name;
    private int health = 0;
    private String type;
    private static int count = 0;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health += health;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public Pokemon(String name, String type, int health){
        count++;
        setName(name);
        setType(type);
        setHealth(health);
    }
}