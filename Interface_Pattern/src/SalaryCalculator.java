//Interface between CategoryA and CategoryB
//Both inherit the method getSalary
//Employee Class can now act as a Client and can use the method based on the
//Category provided
public interface SalaryCalculator {
    public double getSalary();
}
