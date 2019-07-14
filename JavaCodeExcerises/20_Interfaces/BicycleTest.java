// interfaces can achieve something very close to multi class inheritence
// interface says what will happen and not how.  The classes impliment the how

class BicycleTest {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        // print constant
        System.out.println(Bicycle.myConstant);
        b.sayHello();
        Bicycle.staticMethod();
        b.speedUp(3);
        b.applyBrakes(2);
        System.out.println(b.getSpeed());
    }
}