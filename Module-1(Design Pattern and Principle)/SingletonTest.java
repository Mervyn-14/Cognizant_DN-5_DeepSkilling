 class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger Instance Created");
    }
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Log: "+message);
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("App Started");
        logger2.log("User Logged in");

        System.out.println(logger1);
        System.out.println(logger2);

        System.out.println(
            logger1 == logger2
        );
    }
}