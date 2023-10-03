package src;
import java.util.Scanner;

public class baiTapJava8 {
    /*Input a string, then optimize the string according to the following rules:

    1.Remove all unnecessary spaces.
    2.Ensure that each word is separated by one space.
    3.Capitalize the first letter of each word.
    */
    // Nhập vào chuỗi
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào chuỗi: ");
    String input = scanner.nextLine();

    // Loại bỏ tất cả các khoảng trắng dư thừa
    input = input.replaceAll(" +", " ");

    // Viết hoa chữ cái đầu tiên của mỗi từ
    input = input.trim().substring(0, 1).toUpperCase() + input.substring(1);
        for (int i = 1; i < input.length(); i++) {
        if (input.charAt(i) == ' ') {
            input = input.substring(0, i + 1).toUpperCase() + input.substring(i + 1);
        }
    }

    // In ra chuỗi đã tối ưu hóa
        System.out.println("Chuỗi sau khi tối ưu hóa: " + input);
}
