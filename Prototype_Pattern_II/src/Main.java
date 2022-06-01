import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Vehicle> vehicles;
        vehicles = null;

        List<Vehicle> copyList = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles){
            copyList.add(vehicle.clone());
        }
    }
}