package src;
import java.util.Scanner;

public class baiTapJava8 {
    /*Input a string, then optimize the string according to the following rules:

    1.Remove all unnecessary spaces.
    2.Ensure that each word is separated by one space.
    3.Capitalize the first letter of each word.
    */
    public static void main(String[] args) {
        String enter = input();
        System.out.println(processing(enter));
    }

    //Data input function
    public static String input(){
        Scanner scanner_input = new Scanner(System.in);
        System.out.println("Enter new string: ");
        String input_input = scanner_input.nextLine();
        return input_input;
    }

    //Data processing function
    public static String processing(String input_processing) {
        //Use the trim() method to trim whitespace from the beginning and end of a string
        input_processing = input_processing.trim();

        input_processing = input_processing.toLowerCase();
        String[] words = input_processing.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            /*
            * Use the substring() method to get characters in a string from index start to index end.
            * If the end position is not specified, then the substring will be taken from the start position to the end
             of the string*/
            String firstChar = words[i].substring(0,1).toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        //Use the join() method to concatenate the elements of the words array with the content in double quotes
        return String.join(" ", words);
    }
}
