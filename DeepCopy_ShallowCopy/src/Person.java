public class Person implements Cloneable{

    private String name;
    private Car car;

    public String getName()
    {
        return name;
    }

    public Car getCar()
    {
        return car;
    }

    public void setName(String n)
    {
        name = n;
    }

    public Person(String n, String t)
    {
        name = n;
        car = new Car(t);
    }

    /*
    public Object clone()
    {
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
*/
    //Deep Copy
    public Object clone()
    {
        Person p = new Person(name, car.getName());
        return p;
    }



}
