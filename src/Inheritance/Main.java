package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Inheritance = makes the attributes and method of a parent class inherit by its child.
        //				 this makes your code reusable.
        //Parent mama = new Parent();
        //Child son = new Child();

 //No constructor
        //		mama.name = "Marilou";
        //		mama.age = 38;
        //		mama.sex = "Female";
        //
        //		mama.checkValue();
        //
        //		son.name = "Gerald";
        //		son.age = 21;
        //		son.sex = "Male";
        //
        //		son.checkValue();
        //		son.run();

//With constructor
        Parent papa = new Parent("Leonardo", 45, "Male");
        Child daughter = new Child("Angelica", 19, "Female", "Mobile Legends: Bang Bang");
        GrandChild grandSon = new GrandChild("unknown", 0, "Male", "Hover Boarding", "Camero");

        papa.checkValue();

        System.out.println("\n");

        daughter.checkValue();

        // papa.run();
        daughter.run();

        System.out.println("\n");

        grandSon.checkValue();
        grandSon.drive();

    }
}
