/*
Count the number of occurrences of the word "tôi" in the following string:
"Tôi chăm học tôi chịu khó tôi đẹp trai"
*/
package src.baiTapString;
public class bai3 {
    public static void main(String[] args) {
        String enter = "Tôi chăm học tôi chịu khó tôi đẹp trai";
        int count = 0;
        String[] cutWords = enter.toLowerCase().split(" ");
        for (int i = 0; i < cutWords.length; i++) {
            if (cutWords[i].equals("tôi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
