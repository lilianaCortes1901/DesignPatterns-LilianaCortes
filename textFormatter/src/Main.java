import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> data = new ArrayList<>();
        data.add("The beginning of a new world");
        data.add("Starts with the creation of an idolized image of a higher being.");
        data.add("The implementation of a God, or a being strong witted and dumb enough to call themselves one.");

        textFileList file = new textFileList(data);

        //Gets user input on format style options
        Scanner styleInput = new Scanner(System.in);
        System.out.println("Enter format style: ");

        String formatStyle = styleInput.nextLine();
        if (formatStyle.contains("Plain")){
            file.setFormat(new PlainTextFormat());
        } else if (formatStyle.contains("HTML")){
            file.setFormat(new HTMLFormat());
        } else if (formatStyle.contains("Markdown")){
            file.setFormat(new MarkdownFormat());
        } else {
            file.setFormat(new JSONFormat());
        }

        //user story number 4: switching between formatting styles.
        int option = 0;
        switch (option){
            case 0:
                file.setFormat(new PlainTextFormat());
                break;
            case 1:
                file.setFormat(new HTMLFormat());
                break;
            case 2:
                file.setFormat(new MarkdownFormat());
                break;
            default:
                file.setFormat(new PlainTextFormat());
        }
    }
}
