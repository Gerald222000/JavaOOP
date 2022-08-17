package Inheritance;

//Super Class
public class Parent {
    // parent can't make the child can
    String name;
    int age;
    String sex;

    //Explicit Constructor = no content
    //used to not make constructor in subclass
    //NOTE: don't use always
    public Parent() {

    }

    //Implicit Constructor
    public Parent(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void checkValue() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }}
