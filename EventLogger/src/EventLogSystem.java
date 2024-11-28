import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventLogSystem {
    //static variable reference to Singleton
    private static volatile EventLogSystem event_instance;
    private FileWriter fileWriter;
    //Store log history in array
    private List<String> logHistory;
    //List of outputs
    private List<String> outputs;

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
        logHistory = new ArrayList<>();
        String logEntry = String.format("[%s] [%s] %s", LocalDateTime.now(), level.name(), message);
        logHistory.add(logEntry);
        try {
            fileWriter.write(logEntry);
            fileWriter.flush();
        } catch (IOException e){
            System.out.println("Log failed " + e.getMessage());
        }
        System.out.println(logEntry);
    }

    //Printing log history
    public synchronized List<String> getLogHistory(){
        return logHistory;
    }

    //Implementing User Story 4
    public synchronized void addOutput(AdminLog output){
        outputs = new ArrayList<>();
        outputs.add(output.toString());
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
