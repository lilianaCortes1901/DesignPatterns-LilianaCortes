import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EventLogSystem {
    //static variable reference to Singleton
    private static volatile EventLogSystem event_instance;
    private FileWriter fileWriter;

    //declaring a file writer for receiving messages
    public String messageWriter;

    //private constructor restricted to this class itself
    private EventLogSystem() throws IOException {
        try {
            fileWriter = new FileWriter("event_logs.log");
        } catch (IOException e){
            throw new RuntimeException("Failed to start logger", e);
        }
    }

    //Static method to create instance of Singleton class - EventLogSystem
    public static synchronized EventLogSystem getInstance() throws IOException {
        if (event_instance == null){
            synchronized (EventLogSystem.class){
                if (event_instance == null){
                    event_instance = new EventLogSystem();
                }
            }
        }
        return event_instance;
    }

    //User Story 2: log different messages with severity levels
    public synchronized void log(LogLevel level, String message) throws IOException {
        try {
            String logEntry = String.format("[%s] [%s] %s%n", LocalDateTime.now(), level.name(), message);
            fileWriter.write(logEntry);
            fileWriter.flush();
            System.out.println(logEntry);
        } catch (IOException e){
            System.out.println("Logging failed: " + e.getMessage());
        }
    }

    public synchronized void close(){
        try{
            if (fileWriter != null){
                fileWriter.close();
            }
        } catch (IOException e){
            System.out.println("Error closing logger: " + e.getMessage());
        }
    }
}
