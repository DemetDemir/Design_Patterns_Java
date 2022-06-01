public class ConsoleLogger implements Logger{
    public void log(String msg)
    {
        System.out.print(msg);
    }
}