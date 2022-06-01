public class ShallowcopyTest {
    public static void main(String[] args)
    {
        //Original object
        Person p = new Person("test1", "Civic");
        System.out.println(p.getName() + p.getCar().getName());

        //Shallow copy

        Person q = (Person) p.clone();
        System.out.println(q.getName() + q.getCar().getName());

        q.setName("test2");
        System.out.println(q.getName());
        System.out.println(p.getName());

        q.getCar().setName("Accord");
        System.out.println(p.getCar().getName());

    }
}