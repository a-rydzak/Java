public class Project{

	private String name;
	private String description;

	public Project(){
		this("Bunyips", "We will sell lots of Catnisses");
	}

	public Project(String name, String description){
		this.name = name;
		this.description = description;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setDescription(String description){
		this.description = description;
	}


	public String getName(){
		return this.name;
	}

	public String getDescription(){
		return this.description;
	}

	// Generic Method Here
	public <T> void printMe(T[] x){

	}

	public String elevatorPitch(){

		boolean name_flag = this.name != null;
		boolean description_flag = this.description != null;

		if(name_flag && description_flag){
			return this.name +" : "+this.description;
		}else{
			System.out.println("Name and or Description hav not bee established.");
			return null;
		}
	}

}