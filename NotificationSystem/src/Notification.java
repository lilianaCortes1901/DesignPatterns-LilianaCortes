//Component Interface following Decorator Design Pattern

public interface Notification {
    void send(String message);
    String getSent();
    String getMessage();
    String getTimeStamp();
}
