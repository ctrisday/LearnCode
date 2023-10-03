import java.util.Scanner;

public class tinhToanCoBan {
    public static void main(String[] args) {
        Scanner objSc = new Scanner(System.in);
        int a, b;
        byte c;

        // Yeu cau nhap bien a,b
        System.out.println("Nhap vao 2 so a va b");
        System.out.print("Nhap so a: ");
        a = objSc.nextInt();
        System.out.print("Nhap so b: ");
        b = objSc.nextInt();

        // Yeu cau nhap phep tinh
        System.out.println("Nhan 1 de tinh tong");
        System.out.println("Nhan 2 de tinh hieu");
        System.out.println("Nhan 3 de tinh tich");
        System.out.println("Nhan 4 de tinh thuong");
        System.out.print("Hay chon phep tinh: ");
        c = objSc.nextByte();

        // Kiem tra cu phap nhap tu ban phim
        do {
            if (c == 1 || c == 2 || c == 3 || c == 4) {
                break;
            } else {
                System.out.println("Nhan 1 de tinh tong");
                System.out.println("Nhan 2 de tinh hieu");
                System.out.println("Nhan 3 de tinh tich");
                System.out.println("Nhan 4 de tinh thuong");
                System.out.print("Hay chon phep tinh: ");
                c = objSc.nextByte();
            }
        } while (c != 1 && c != 2 && c != 3 && c != 4);

        // Thuc hien yeu cau
        if (c == 1) {
            tinhTong(a, b);
        } else if (c == 2) {
            tinhHieu(a, b);
        } else if (c == 3) {
            tinhTich(a, b);
        } else if (c == 4) {
            do {
                if (b != 0) {
                    break;
                } else {
                    System.out.println("Loi loi loi!!!");
                    System.out.print("Mau so khong the bang 0. Vui long nhap lai b: ");
                    b = objSc.nextInt();
                }
            } while (b == 0);
            tinhThuong(a, b);
        }
    }

    public static void tinhTong(int a, int b) {
        int kq = a + b;
        System.out.println("Tong a va b la: " + kq);
    }

    public static void tinhHieu(int a, int b) {
        int kq = a - b;
        System.out.println("Hieu a va b la: " + kq);
    }

    public static void tinhTich(int a, int b) {
        int kq = a * b;
        System.out.println("Tich a va b la: " + kq);
    }

    public static void tinhThuong(int a, int b) {
        int kq = a / b;
        System.out.println("Thuong a va b la: " + kq);
    }
}