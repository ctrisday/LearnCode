/* Assignment
String str1 = "English = 78 Science = 83 Math = 68 History = 65"
1. Calculate the sum of the numbers in the string above
2. Calculate the average of the numbers
*/
package src.baiTapString;

public class bai1 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        String[] stringToClass = str1.split(" ");
        int sum = 0;
        int average;
        int countNumbers = 0;
        for (int i = 0; i < stringToClass.length; i++) {
            try {
                sum = sum + Integer.parseInt(stringToClass[i]);
                countNumbers += 1;
            }
            catch (NumberFormatException e) {
                continue;
            }
        }
        average = sum/countNumbers;
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + average);
    }
}
