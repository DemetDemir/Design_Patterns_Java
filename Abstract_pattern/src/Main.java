import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Consultant c = new Consultant("Jennifer", "234534");
        //String ID = c.getID();
        //System.out.println(ID);
        String emp1 = c.toString();
        System.out.println(emp1);
        c.save();
    }
}