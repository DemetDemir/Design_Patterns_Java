public class SalesRep extends Employee{

    public String computeCompensation()
    {
        return ("consultant salary is base + commission " + "allowance - tax deductions" );
    }

    public SalesRep(String name, String empID)
    {
        super(name, empID);
    }

}
