import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LoggerFactory test1 = new LoggerFactory();
        Logger logger = test1.getLogger();
        logger.log("A message to log");

    }
}