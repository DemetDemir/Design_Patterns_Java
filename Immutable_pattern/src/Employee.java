public final class Employee {
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private final String address;
    private final Car car;

    public Employee(String fname, String lname, String ssn, String adr, Car c)
    {
        firstName = fname;
        lastName = lname;
        SSN = ssn;
        address = adr;
        car = c;

    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getSSN()
    {
        return SSN;
    }

    public Car getCar()
    {
        return car;
    }

    public void display()
    {
        System.out.println(this.getFirstName() + this.getLastName() + this.getSSN() + this.getAddress() + this.getCar());
    }
}
