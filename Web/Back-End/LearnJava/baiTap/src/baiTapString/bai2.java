/*
1. Write a program to check the validity of a password, according to the following rules:
        The password must be at least 6 characters long.
        The password must contain at least one letter (uppercase or lowercase).
        The password must contain at least one digit.

2. Let the user enter a password. Compare the password just entered with the password saved. If correct, allow login.
If wrong more than 5 times, exit the program.

 */
package src.baiTapString;
import java.util.Calendar;
import java.util.Scanner;

public class bai2 {
    public static void main (String[] args) {
        System.out.println("Enter a new password: ");
        String enterPassword = input();
        byte count_checkPass = 1;
        boolean numberOfEntries = false;
        if (enterPassword.length() < 6) {
            do {
                Scanner scanner_check = new Scanner(System.in);
                System.out.println("Enter password again: ");
                enterPassword = input();
                count_checkPass++;
                if (count_checkPass > 5) {
                    break;
                }
                else {
                    numberOfEntries = true;
                }
            } while (enterPassword.length() < 6);
        }

        if (checkPass(enterPassword) == true && numberOfEntries == true) {
            System.out.println("Password is: " + enterPassword);
        }
        else {
            System.out.println("Password isn't validity");
        }
    }

    public static String input () {
        Scanner scanner_input = new Scanner(System.in);
        return scanner_input.nextLine();
    }

    public static boolean checkPass(String enterPassword) {
        boolean checkLength_checkPass = false;
        if (enterPassword.length() < 6) {
            checkLength_checkPass = false;
        }
        else {
            checkLength_checkPass = true;
        }

        boolean hasLetter_checkPass = false;
        for (char c : enterPassword.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter_checkPass = true;
                break;
            }
            else {
                hasLetter_checkPass = false;
            }
        }

        boolean hasDigit_checkPass = false;
        for (char c1 : enterPassword.toCharArray()) {
            if (Character.isDigit(c1)) {
                hasDigit_checkPass = true;
                break;
            }
            else {
                hasDigit_checkPass = false;
            }
        }

        boolean checkAll_checkPass = false;
        if (hasDigit_checkPass == true && hasLetter_checkPass == true && checkLength_checkPass == true) {
            checkAll_checkPass = true;
        }
        else {
            checkAll_checkPass = false;
        }

        return checkAll_checkPass;
    }
}
