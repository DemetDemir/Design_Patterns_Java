import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Account {

    ConstantDataManager c = new ConstantDataManager();

    public void save() throws IOException {
        FileUtils futil = new FileUtils();
        futil.writeStringToFile(new File(c.ACCOUNT_DATA_FILE), this.toString());
    }
}
