class ThisPerson {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        
        // this will not set the attribute value. 'age' is a local variable in the constructor method and its value is the very first argument.
        age = age 
    }
}