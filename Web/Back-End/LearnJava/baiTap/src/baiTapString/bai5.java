//Write a program to extract strings from the path: D:\galailaptrinh\music\remix.mp3
//
//        Extract the file name without the extension: remix
//        Extract the file name including the extension: remix.mp3
package src.baiTapString;

public class bai5 {
    public static void main(String[] args) {
        String enter = "D:/galailaptrinh/music/remix.mp3";

        int lastIndexOfEnter = enter.lastIndexOf('/');
        String fileName = enter.substring(lastIndexOfEnter + 1);
        System.out.println(fileName);

        int lastIndexDot = fileName.lastIndexOf('.');
        String fileNameWithoutExtension = fileName.substring(0, lastIndexDot);
        System.out.println(fileNameWithoutExtension);
    }
}
