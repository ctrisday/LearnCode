package src;

import java.util.*;

public class baiTapJava4 {
    public static void main(String[] args) {
        // a = "tôi đẹp trai tôi học giỏi tôi giàu"
        String a_main = "tôi đẹp trai tôi học giỏi tôi giàu";
        String[] words_main = a_main.split(" ");
        int count_main = 0;
        for (String word : words_main) {
            if (word.equals("tôi")) {
                count_main++;
            }
        }
        System.out.println(count_main);
    }
}
