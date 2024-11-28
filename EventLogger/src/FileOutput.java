import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements AdminLog{
    private FileWriter fileWriter;

    public FileOutput(String filename){
        try{
            fileWriter = new FileWriter(filename);
        } catch (IOException e){
            throw new RuntimeException("Failed file log", e);
        }
    }

    @Override
    public void write(String message) {
        try{
            fileWriter.write(message);
            fileWriter.flush();
        } catch (IOException e){
            System.out.println("File log FAIL " + e.getMessage());
        }

    }

    public void close(){
        try{
            if (fileWriter != null){
                fileWriter.close();
            }
        } catch (IOException e){
            System.out.println("Error closing file log " + e.getMessage());
        }
    }
}
