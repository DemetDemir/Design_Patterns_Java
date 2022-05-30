public class NonLuxuryVehicleFactory extends VehicleFactory {

    public Car getCar() {
        return new NonLuxuryCar("Nl-C");
    }

    public SUV getSUV() {
        return new NonLuxurySuv("NL-S");
    }

}
