public class Car {
    String model;
    String year;
    String fuel;

    public Car(String m, String y, String f)
    {
        model = m;
        year = y;
        fuel = f;
    }

    public Car()
    {
        model = "Opel";
        year = "2010";
        fuel = "Diesel";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
