
/*
When an interface is implemented, a regular class must implement all methods from the interface.
However, if an abstract class implements an interface, it can implement some methods and leave to 
the subclass to implement the rest of the methods.
*/
public abstract class Animal implements Pet{
	private String name;
	private String breed;
	private double weight;
	// Attributes of the animal
	
	public Animal() {}
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	// General constructors for animal class

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	// Getters and setters for the attributes

}

/*
Abstract vs Interfaces

Consider using abstract classes if any of these statements apply to your situation:

You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
Consider using interfaces if any of these statements apply to your situation:

You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
You want to take advantage of multiple inheritances of type.
*/