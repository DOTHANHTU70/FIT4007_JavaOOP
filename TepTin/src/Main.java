import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien quanLySV = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Ghi file");
            System.out.println("4. Doc file");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    quanLySV.themSinhVien();
                    break;
                case 2:
                    quanLySV.hienThiDanhSachSinhVien();
                    break;
                case 3:
                    quanLySV.ghiFile();
                    break;
                case 4:
                    quanLySV.docFile();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
    }
}
