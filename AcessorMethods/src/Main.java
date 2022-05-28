import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer c = new Customer();
        c.setFirstName("Demet");
        c.setLastName("Demir");
        c.setActive(true);
        c.display();
        c.save();
    }
}