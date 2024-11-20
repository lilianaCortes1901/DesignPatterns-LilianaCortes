import java.util.ArrayList;
import java.util.Random;

public class MarkdownFormat implements FormatInt{

    public void format(ArrayList<String> data){
            String[] option = {"** ", "***", "<sub>", "~~", "__"};

            Random rng = new Random();
            // number = rng.nextInt(option.length);

            System.out.println("#" + data.get(0));

            for(int i = 1; i < data.size(); i++){
                int number = rng.nextInt(option.length);
                String options = option[number];
                System.out.println(option + data.get(i) + option);
            }

    }
}
