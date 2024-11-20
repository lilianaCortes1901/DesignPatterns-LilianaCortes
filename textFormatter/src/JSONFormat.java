import java.util.ArrayList;

public class JSONFormat implements FormatInt {
    public void format(ArrayList<String> data) {
        System.out.println("{");

        for(int i = 0; i < data.size(); i++) {
            System.out.println("Text: " + data.get(i));
        }

        System.out.println("}");
    }
}