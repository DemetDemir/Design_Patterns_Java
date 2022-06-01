public class DeepCopyTest {
    public static void main(String[] args)
    {
        Person p = new Person("test1", "Civic");
        System.out.println(p.getName()+ p.getCar().getName());

        Person q = (Person) p.clone();

        System.out.println("Copy  :" + q.getName()+ q.getCar().getName());

        q.setName("Test2");
        q.getCar().setName("Accord");

        System.out.println("Copied object:" + q.getName() + q.getCar().getName());
        System.out.println("Original object:" + p.getName() + p.getCar().getName());
    }
}
