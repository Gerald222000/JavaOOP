package Abstraction;

public abstract class Animal {	//abstract class

    String name;

    public void setName(String name) {
        this.name = name;
    }
    public void showName() {
        System.out.println("Name: " + name);
    }

    abstract void makeSound(); //abstract method
    //only possible if the class is abstracted
    //this force the child of this class to have this method

}
