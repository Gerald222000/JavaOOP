package Inheritance;
//Sub Class
public class Child extends Parent{
    // This child can inherit its attribute from parent.
    // child is the improved version of parent.
    String favoriteGame;

    //Overriding Constructor: used super then its method name which is the superclass's constructor.
    //to be child be able to use its attributes from parent and adds on it.
    public Child(String name, int age, String sex, String favoriteGame) {
        super(name, age, sex);
        this.favoriteGame = favoriteGame;
    }
    void run() {
        System.out.println(name + " run as much as He can.");
    }

    //Overriding Method: used super then its method name which is the superclass's method.
    //to be child be able to use its method from parent and adds on it.
    void checkValue() {
        super.checkValue();
        System.out.println("Favorite Game: " + favoriteGame);
    }
}
