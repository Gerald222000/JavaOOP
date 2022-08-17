package Inheritance;

public class GrandChild extends Child{
    String car;

    public GrandChild(String name, int age, String sex, String favoriteGame, String car) {
        super(name, age, sex, favoriteGame);
        this.car = car;

    }
    void checkValue() {
        super.checkValue();
        System.out.println("Car: " + car);
    }
    void drive() {
        System.out.println(name + " drives his " + car + " safely");
    }
}
