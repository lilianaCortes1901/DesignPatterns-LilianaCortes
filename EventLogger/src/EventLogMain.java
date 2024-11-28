import java.io.IOException;

public class EventLogMain {
    public static void main(String [] args) throws IOException {
        EventLogSystem eventLog1 = EventLogSystem.getInstance();
        EventLogSystem eventLog2 = EventLogSystem.getInstance();
        EventLogSystem eventLog3 = EventLogSystem.getInstance();

        //Regular log messages
        System.out.println("log1 is " + eventLog1);
        System.out.println("log2 is " + eventLog2);
        System.out.println("log3 is " + eventLog3);

        //Condition check: if logs are pointing to the same object
        if(eventLog1 == eventLog2 && eventLog2 == eventLog3){
            System.out.println("All objects point to the same memory location on the heap.");
        } else {
            System.out.println("All objects DO NOT point to same memory location.");
        }


        //Log messages with different severity levels
        EventLogSystem logger = EventLogSystem.getInstance();
        logger.log(LogLevel.INFO, "Log successful");
        logger.log(LogLevel.DEBUG, "Log debugging");
        logger.log(LogLevel.ERROR, "Log failed");

        //Printing & reviewing log history
        System.out.println("Log history: ");
        for (String log : logger.getLogHistory()){
            System.out.println(log);
        }

        logger.close();

    }
}
