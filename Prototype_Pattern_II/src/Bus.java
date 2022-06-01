public class Bus extends Vehicle{
    private int numOfDoors;

    public Bus(){}

    public Bus(Bus bus){
        super(bus);
        this.numOfDoors = bus.numOfDoors;
    }

    @Override
    public Bus clone(){
        return new Bus(this);
    }

}
