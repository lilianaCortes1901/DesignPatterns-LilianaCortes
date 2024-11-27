//Concrete Decorator: Slack Notification extends Notification Decorator

public class SlackNotification extends NotificationDecorator {
    public SlackNotification(Notification notificationDecorator){
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
        System.out.println("Slack Notification" + super.getTimeStamp()+ " - " + super.getSent() + " : " + super.getMessage());
    }
}