import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public abstract class Employee {
    String name;
    String ID;

    public Employee(String n, String empId) {
        name = n;
        ID = empId;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        String str = "Employee Name: " + getName() + "," + " Employee ID: " + getID();
        return str;
    }
//Write employee data into file Employee_Data.txt
    public void save() throws IOException {
        FileUtils futil = new FileUtils();
        futil.writeStringToFile(new File("Employee_Data.txt"), this.toString());

    }

    public abstract String computeCompensation();
}
