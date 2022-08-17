package Interface;

public class Main {
    public static void main(String[]args) {
        //Interface = a template that can be applied in class.
        //			  similar to inheritance, bit specifies what a class has/must do.
        //			  classes can apply more than one interface, inheritance is limited to 1 super class

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.attack();

        Fish fish = new Fish();
        fish.attack();
        fish.flee();

    }
}
