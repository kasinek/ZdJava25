package grcy.sda.solid.ocp.fixed;

public class FileLogger implements MessageLogger {
    @Override
    public void log(String message) throws Exception {
        System.out.println("Logging " + message + " to file");
    }
}
