import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("A message to log");
    }
}