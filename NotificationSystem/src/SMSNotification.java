//Concrete Decorator: SMS Notification extends Notification Decorator

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notificationDecorator){
        super(notificationDecorator);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getSent() {
        return super.getSent();
    }

    @Override
    public String getTimeStamp() {
        return super.getTimeStamp();
    }

    @Override
    public void send(String message) {
        System.out.println("SMS Notification" + super.getTimeStamp()+ " - " + super.getSent() + " : " + super.getMessage());
    }
}