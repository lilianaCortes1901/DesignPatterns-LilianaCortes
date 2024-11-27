public class EventLogSystem {
    //static variable reference to Singleton
    private static volatile EventLogSystem event_instance;

    //declaring a file writer for receiving messages
    public String messageWriter;

    //private constructor restricted to this class itself
    private EventLogSystem(){
        messageWriter = "Message for Logs";
    }

    //Static method to create instance of Singleton class - EventLogSystem
    public static synchronized EventLogSystem getInstance(){
        if (event_instance == null){
            event_instance = new EventLogSystem();
        }
        return event_instance;
    }
}
