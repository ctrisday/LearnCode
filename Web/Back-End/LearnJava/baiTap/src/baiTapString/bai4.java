/*Write a program to split letters and digits from a string entered by the user into two strings
Ex user enters: abc123 you must split and print out into 2 strings abc and 123
 */
package src.baiTapString;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string: ");
        String enter = scanner.nextLine();
        StringBuilder charactersLetter = new StringBuilder();
        StringBuilder charactersDigit = new StringBuilder();

        for (char c : enter.toCharArray()) {
            if (Character.isLetter(c)) {
                charactersLetter.append(c);
            } else if (Character.isDigit(c)) {
                charactersDigit.append(c);
            }
        }
        System.out.println(charactersLetter);
        System.out.println(charactersDigit);
    }
}
