package src;
import java.util.Scanner;

public class baiTapJava7 {
    /*viết chương trình kiểm tra một chuỗi nhập vào từ bàn phím có phải Panlyndrome không? (là chuỗi có đảo ngược
    cũng bằng chính nó, ví dụ: madam, radar, ... */
    public static void main(String[] args) {
        String enter = input();
        processing(enter);
    }

    //Input function
    public static String input() {
        Scanner objSc_input = new Scanner(System.in);
        System.out.println("Enter string:");
        String enter_input = objSc_input.nextLine();
        return enter_input;
    }

    public static void processing(String enter) {
        String stringReverse = new StringBuilder(enter).reverse().toString();
        if (enter.equalsIgnoreCase(stringReverse)) {
            System.out.println("This is Panlyndrome");
        }
        else {
            System.out.println("This isn't Panlyndrome");
        }
    }

}
