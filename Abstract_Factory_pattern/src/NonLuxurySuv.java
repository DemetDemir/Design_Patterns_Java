public class NonLuxurySuv implements SUV{

    String name;

    public NonLuxurySuv(String n)
    {
        name = n;
    }

    public String getSUVName()
    {
        return name;
    }

    public String getSUVFeatures()
    {
        return "Nonluxury SUV features";
    }

}
