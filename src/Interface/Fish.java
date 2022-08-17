package Interface;

public class Fish implements Predator,Prey{
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from bigger fish");

    }

    @Override
    public void attack() {
        System.out.println("This fish is attacking smaller fish");

    }
}
