//Decorator that implements Notification interface

public class NotificationDecorator implements Notification{
    private Notification notificationDecorator;

    public void setNotificationDecorator(Notification notificationDecorator) {
        this.notificationDecorator = notificationDecorator;
    }

    public String getSent(){
        return notificationDecorator.getSent();
    }

    public String getMessage(){
        return notificationDecorator.getMessage();
    }

    public String getTimeStamp(){
        return notificationDecorator.getTimeStamp();
    }

}
