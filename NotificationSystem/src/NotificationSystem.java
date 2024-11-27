public class NotificationSystem {
    public static void main(String[] args){
        //Basic notification
        Notification basicMessage = new CheckInNotification();

        //SMS & Email Notification
        Notification smsAndEmail = new EmailNotification(new SMSNotification(basicMessage));

        //SMS w/ Email & Slack Notification
        Notification allNotifications = new SlackNotification(smsAndEmail);

        //Sending messages through all channels
        System.out.println("User with SMS + ");
    }
}