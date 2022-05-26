public class Consultant extends Employee{
    public String computeCompensation()
    {
        return ("consultant salary is base + " + "allowance + OT - tax deductions" );
    }
    public Consultant(String name, String empId)
    {
        super(name, empId);
    }
}
