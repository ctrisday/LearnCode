package src;
import java.util.Scanner;
public class baiTapJava5 {
    /*Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi:
    - ví dụ nhập vào: abc123 sẽ táh và in ra thành 2 chuỗi abc và 123
    */

    public static void main(String[] args) {
        String stringInput_main = input();
        output(stringInput_main);
    }

    public static String input(){
        System.out.println("Nhap chuoi: ");
        Scanner objSc_input = new Scanner(System.in);
        String stringInput_input = objSc_input.nextLine();
        return stringInput_input;
    }

    public static void output(String stringInput){
        StringBuilder letter_output = new StringBuilder();
        StringBuilder number_output = new StringBuilder();
        for (int i = 0; i < stringInput.length(); i++) {
            char letter1_output = stringInput.charAt(i);
            if (Character.isDigit(letter1_output)) {
                number_output.append(letter1_output);
            }
            else if (Character.isLetter(letter1_output)){
                letter_output.append(letter1_output);
            }
        }
        System.out.println(letter_output);
        System.out.println(number_output);
    }
}
