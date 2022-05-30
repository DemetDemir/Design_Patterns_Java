public class NonLuxuryCar implements Car{

    String name;

    public NonLuxuryCar(String n)
    {
        name = n;
    }

    public String getCarName()
    {
        return name;
    }

    public String getCarFeatures()
    {
        return "Non luxury Car features";
    }
}
