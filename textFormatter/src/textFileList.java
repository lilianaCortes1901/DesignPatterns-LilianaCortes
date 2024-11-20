import java.util.ArrayList;
import java.util.Random;

public class textFileList {
    private ArrayList<String> fileContent;
    private FormatInt format;

    public void setFormat(FormatInt format){
        this.format = format;
    }

    public void print(){
        format.format(fileContent);
    }

    public textFileList(ArrayList<String> data){
        fileContent = new ArrayList<>();
    }

}
