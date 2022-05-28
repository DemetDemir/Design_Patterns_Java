public class Main {
    public static void main(String[] args)
    {
        Car c = new Car();
        Employee test1 = new Employee("Demet", "Demir", "123456", "testaddress1", c);
        test1.display();
    }
}