

public interface Pet {
	String showAffection();
	// This is across all pets 
}

/*
 An interface can contain any number of methods.

 An interface is written in a file with a .java extension, with the 
	name of the interface matching the name of the file.

 The bytecode of an interface appears in a .class file.

 Interfaces appear in packages, and their corresponding bytecode 
	file must be in a directory structure that matches the package name.

However, an interface is different from a class in several ways, including:

You cannot instantiate an interface.

An interface does not contain any constructors.

An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.

An interface is not extended by a class; it is implemented by a class.

An interface can extend multiple interfaces; a class can only extend from one class, but it can implement multiple interfaces.

Interface Methods

There are 3 types of interface methods: default, static and abstract.

New in Java 8, default methods allow developers to create default methods that do not need implementation.

Static methods are interface member methods. Also new to Java 8, they are implemented on the interface level and are 
	called on the interface, not the class. Therefore, you cannot override static interface methods. You can only call them 
	directly on the interface that they were declared.

Abstract methods are methods that are declared without implementation. We saw an example of that in the OperateBicycle example above.

Default methods are declared with default, and static methods with the static keyword; abstract methods are implicit, and you 
	do not include a method type. Below are all implicit declarations:

Abstract is the implicit method type; without declaration of either Static or default the method will be Abstract
public is the implicit access modifier.

An interface can contain constant declarations as well (i.e. static final class variables). All constant values defined in an 
	interface are implicitly public, static, and final. Therefore, you are free to omit these modifiers

*/