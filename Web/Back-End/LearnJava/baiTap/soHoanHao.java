import java.util.Scanner;

public class soHoanHao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int main_SoHoanThien;
        int main_Tong = 0;

        System.out.print("Nhap so muon kiem tra: ");
        main_SoHoanThien = input.nextInt();
        for (int i = 1; i < main_SoHoanThien; i++) {
            if (main_SoHoanThien % i == 0) {
                main_Tong = main_Tong + i;
            } else {
                continue;
            }
        }
        if (main_Tong == main_SoHoanThien) {
            System.out.println("So " + main_SoHoanThien + " la so hoan thien");
        } else {
            System.out.println("So " + main_SoHoanThien + " khong phai la so hoan thien");
        }
    }
}