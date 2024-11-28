import java.io.FileWriter;

public class ConsoleOutput implements AdminLog{
    public void write(String message){
        System.out.println(message);
    }
}
