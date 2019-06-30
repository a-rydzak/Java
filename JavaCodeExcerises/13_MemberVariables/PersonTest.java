class PersonTest {
    public static void main(String[] args) {
        SuperClassPerson person1 = new Person(10, "Person1");
        SuperClassPerson person2 = new Person(5, "Person2");
        person1.objectMethods(person2);
    }
}