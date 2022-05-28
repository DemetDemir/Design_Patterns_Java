import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FileLogger implements Logger {

    File file = new File("log.txt");
    public void log(String msg) throws IOException {
        FileUtils futils = new FileUtils();
        futils.write(file, msg);

    }

}

