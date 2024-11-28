import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Gets user input on format style options
        Scanner styleInput = new Scanner(System.in);
        System.out.println("Enter format style: ");

        ArrayList<String> data = new ArrayList<>();
        data.add("The beginning of a new world");
        data.add("Starts with the creation of an idolized image of a higher being.");
        data.add("The implementation of a God, or a being strong witted and dumb enough to call themselves one.");

        textFileList file = new textFileList(data);

        String formatStyle = styleInput.nextLine().trim();
        if (formatStyle.equalsIgnoreCase("Plain")){
            file.setFormat(new PlainTextFormat());
            System.out.println("PlainTextFormat has been set.");
            file.print();
        } else if (formatStyle.equalsIgnoreCase("HTML")){
            System.out.println("HTMLFormat has been set.");
            file.setFormat(new HTMLFormat());
            file.print();
        } else if (formatStyle.equalsIgnoreCase("Markdown")){
            System.out.println("MarkdownFormat has been set.");
            file.setFormat(new MarkdownFormat());
            file.print();
        } else if (formatStyle.equalsIgnoreCase("JSON")){
            System.out.println("JSONFormat has been set.");
            file.setFormat(new JSONFormat());
            file.print();
        } else {
            System.out.println("Invalid format style. Defaulting to PlainTextFormat.");
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
