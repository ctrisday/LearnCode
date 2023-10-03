package src;
public class baiTapJava6 {
    public static void main(String[] args) {
        String input = "D:/galailaptrinh/music/remix.mp3";
        handle(input);
    }

    public static void handle(String input){
        String dinhDangFile = null;
        int lastSlashIndex = input.lastIndexOf("/");
        String fileName = input.substring(lastSlashIndex + 1);
        for (int i = 0; i < fileName.length(); i++) {
            char c = fileName.charAt(i);
            if (c == '.'){
                dinhDangFile = fileName.substring(i + 1);
                break;
            }
            else {
                continue;
            }
        }
        System.out.println("Ten file: " + fileName);
        System.out.println("Ten duoi file: " + dinhDangFile);
    }
}
