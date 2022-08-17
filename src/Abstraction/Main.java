package Abstraction;

public class Main {
    public static void main(String [] args) {
        //Abstraction = abstract classes cannot be instantiated, but they can have a subclass
        //				abstract method are declared without an implementation
        //Compare to interface this adds added security

        //create object
        Animal dogAnimal = new Dog();
        Animal catAnimal = new Cat();

        catAnimal.setName("Mik mik");//set name for cat
        catAnimal.showName();// show the cats name
        catAnimal.makeSound();// call makeSound method in Cat.java

        dogAnimal.makeSound();
    }
}
