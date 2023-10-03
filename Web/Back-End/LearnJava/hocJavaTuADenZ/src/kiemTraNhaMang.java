import java.util.Scanner;

public class kiemTraNhaMang {
    public static void main(String[] args) {
        Scanner objSc = new Scanner(System.in);
        String main_soDienThoai;

        System.out.print("Nhap 3 so dau tien cua SDT: ");
        main_soDienThoai = objSc.nextLine();

        if (main_soDienThoai.equals("090") || main_soDienThoai.equals("093") || main_soDienThoai.equals("089")
                || main_soDienThoai.equals("070") || main_soDienThoai.equals("076") || main_soDienThoai.equals("077")
                || main_soDienThoai.equals("078") || main_soDienThoai.equals("079")) {
            System.out.println("Mobifone");
        } else if (main_soDienThoai.equals("086") || main_soDienThoai.equals("096") || main_soDienThoai.equals("097")
                || main_soDienThoai.equals("098") || main_soDienThoai.equals("032") || main_soDienThoai.equals("033")
                || main_soDienThoai.equals("034") || main_soDienThoai.equals("035") || main_soDienThoai.equals("036")
                || main_soDienThoai.equals("037") || main_soDienThoai.equals("038") || main_soDienThoai.equals("039")) {
            System.out.println("Viettel");
        } else if (main_soDienThoai.equals("081") || main_soDienThoai.equals("082") || main_soDienThoai.equals("083")
                || main_soDienThoai.equals("084") || main_soDienThoai.equals("085") || main_soDienThoai.equals("088")
                || main_soDienThoai.equals("091") || main_soDienThoai.equals("094")) {
            System.out.println("Vinaphone");
        } else {
            System.out.println("Chua cap nhat");
        }
    }
}
