package src;

import java.util.*;

public class baiTapJava1 {
    public static void main(String[] args) {
        /*
         * Nhập vào một chuỗi từ bàn phím và đến xem có bao nhiêu ký tự thường, bao
         * nhiêu ký tự in hoa, bao nhiêu ký tự số và bao nhiêu ký tự space
         */
        Scanner objSc_main = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String input_main = objSc_main.nextLine();
        // Khoi tao bien dem
        int countNumber_main = 0;
        int countLowerCase_main = 0;
        int countUpperCase_main = 0;
        int countWhiteSpace_main = 0;
        // Kiem tra
        for (int i = 0; i < input_main.length(); i++) {
            // Lấy từng ký tự tại vị trí index i
            char getChar_main = input_main.charAt(i);
            // Điều kiện
            if (Character.isDigit(getChar_main)) {
                countNumber_main += 1;
            } else if (Character.isLowerCase(getChar_main)) {
                countLowerCase_main += 1;
            } else if (Character.isUpperCase(getChar_main)) {
                countUpperCase_main += 1;
            } else if (Character.isWhitespace(getChar_main)) {
                countWhiteSpace_main += 1;
            }
        }
        // Output data
        System.out.println("So ky tu thuong la: " + countLowerCase_main);
        System.out.println("So ky tu in hoa la: " + countUpperCase_main);
        System.out.println("So ky tu so la: " + countNumber_main);
        System.out.println("So ky tu khoang trang la: " + countWhiteSpace_main);
    }
}
