//Prototype class
public abstract class Vehicle{
    private String brand;
    private String model;
    private String color;
    private int topSpeed;

    public Vehicle() {}

    protected Vehicle (Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
        this.topSpeed = vehicle.topSpeed;
    }

    public abstract Vehicle clone();

}
