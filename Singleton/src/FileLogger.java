import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class FileLogger implements Logger {

    private static FileLogger logger;
    FileLogger() {
    }

    public static FileLogger getFileLogger()
    {
        if(logger == null)
        {
            logger = new FileLogger();
            return logger;
        }
        return logger;
    }

    File file = new File("log.txt");
    public synchronized void log(String msg) throws IOException {
        FileUtils futils = new FileUtils();
        futils.write(file, msg);
    }

}

