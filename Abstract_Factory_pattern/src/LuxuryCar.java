public class LuxuryCar implements Car{
    private String name;

    public LuxuryCar(String n)
    {
        name = n;
    }

    public String getCarName()
    {
        return name;
    }

    public String getCarFeatures()
    {
        return "Luxury Car features";
    }

}
