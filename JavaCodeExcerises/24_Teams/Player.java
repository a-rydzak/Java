// http://localhost:8080/Setup/Home?width=10&height=5


public class Player {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	static int numPlayers = 0;
	
	
	public Player(String firstName, String lastName, int age) {
		numPlayers+=1;
		this.id = numPlayers;
		setAge(age);
		setFirstName(firstName.toLowerCase());
		setLastName(lastName.toLowerCase());
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

}
