package Encapsulation;

public class Car2 {
    //Attribute
    private String make;
    private final String model;

    //Constructor
    public Car2(String make, String model){
        this.make = make;
        this.model = model;

    }
    //Setter
    public void setMake(String make) {
        this.make = make;
    }
    //Getter
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
