//Concrete Component that implements Component interface

public class CheckInNotification implements Notification{
    public String getSent(){
        System.out.println("Boss");
        return null;
    }

    public String getMessage(){
        System.out.println("Meeting at 1 pm still a go?");
        return null;
    }

    public String getTimeStamp(){
        System.out.println("12:30");
        return null;
    }

    public void send(String message){
        System.out.println("New Message" );
    }
}