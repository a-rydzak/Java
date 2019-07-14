public interface OperateBicycle {
    // constant that is public, static, and final
    double myConstant = 3.0;
    
    // default method that does not need implementation
    // default methods allow developers to create default methods that do not need implementation
    default void sayHello() {
        System.out.println("Hello everybody");
    }
    
    // static method that does not need implementation
    static void staticMethod() {
        System.out.println("Hello from the static method of the interface");
    }

    // Abstract methods are methods that are declared without implementation. 
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

// If you know only methods but not how they are implimented
public interface A{
    public abstract void getSalInfo();
    public abstract void getEmpInfo();
}

abstract class A{}

