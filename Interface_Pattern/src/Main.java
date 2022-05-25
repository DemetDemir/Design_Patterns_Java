//Interface pattern implementation
//SalaryCalculator is the interface class

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalaryCalculator c = new CategoryA(10000, 200);
        Employee e = new Employee("Jennifer", c);
        e.display();
        c = new CategoryB(20000, 800);
        e = new Employee("Shania", c);
        e.display();
    }
}

