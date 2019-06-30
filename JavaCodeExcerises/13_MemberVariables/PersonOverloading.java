public class PersonOverloading {
    private int age;
    private int cmHeight;
    private String name;
    public Person() {
        this(20, "John Doe", 171);
    }
    
    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }
    // ...