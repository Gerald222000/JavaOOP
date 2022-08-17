package Encapsulation;

public class Main2 {
    public static void main(String[] args) {
        //	Encapsulation = attributes of a class will be hidden or private
        //					can be accessed only through methods (getters & getters)
        //					you should make attributes private if you don't have a reason to make them public/protected

        Car2 car = new Car2("Honda", "Civic");


        car.setMake("Ford"); //set Ford as a new Make attribute
        String model = car.getModel();

        System.out.println(car.getMake() + " " + model);
    }
}
