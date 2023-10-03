/*
Write a program to check if a string entered by user from keyboard is a palindrome
Ex: radar -> radar, madam -> madam, ...
*/
package src.baiTapString;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String enter = scanner.nextLine();
        String palindrome = new StringBuilder(enter).reverse().toString();
        if (enter.equals(palindrome)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
