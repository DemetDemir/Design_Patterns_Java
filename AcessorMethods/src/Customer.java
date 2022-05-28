import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Customer {
    private String firstName;
    private String lastName;
    private boolean active;
    private String address;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String fname)
    {
        firstName = fname;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lname)
    {
        lastName = lname;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active1)
    {
        active = active1;
    }

    public boolean isValidCustomer()
    {
        if(getFirstName().length() > 0 && getLastName().length() > 0)
        {
            return true;
        }else{return false;}

    }

    public void save() throws IOException {
        String data = this.firstName + this.lastName + this.isActive();
        FileUtils futil = new FileUtils();
        futil.writeStringToFile(new File("Customer.txt"), data);
    }

    public void display()
    {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " " + this.isActive());
    }
}
