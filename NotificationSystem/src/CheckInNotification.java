//Concrete Component that implements Componentt interface

public class CheckInNotification implements Notification{
    public String getSent(){
        System.out.println("Boss");
    }

    public String getMessage(){
        System.out.println("Meeting at 1 pm still a go?");
    }

    public String getTimeStamp(){
        System.out.println("12:30");
    }

    public void send(String message){
        System.out.println("New Message" );
    }
}