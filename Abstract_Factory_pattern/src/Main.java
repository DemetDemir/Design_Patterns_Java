import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String vhCategory = reader.readLine();

        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);
        System.out.println(vf.getCar());

    }
}