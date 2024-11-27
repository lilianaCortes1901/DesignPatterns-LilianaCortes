public class EventLogMain {
    public static void main(String [] args){
        EventLogSystem eventLog1 = EventLogSystem.getInstance();
        EventLogSystem eventLog2 = EventLogSystem.getInstance();
        EventLogSystem eventLog3 = EventLogSystem.getInstance();


        System.out.println("Hash code of log1 is " + eventLog1);
        System.out.println("Hash code of log2 is " + eventLog2);
        System.out.println("Hash code of log3 is " + eventLog3);

        //Condition check: if logs are pointing to the same object
        if(eventLog1 == eventLog2 && eventLog2 == eventLog3){
            System.out.println("All objects point to the same memory location on the heap.");
        } else {
            System.out.println("All objects DO NOT point to same memory location.");
        }

    }
}
