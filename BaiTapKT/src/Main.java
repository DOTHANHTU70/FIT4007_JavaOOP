import java.util.Scanner;
public class Main {
    private static Object quanLySP;

    public static void main(String[] args) {
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        Scanner sc = new Scanner(System.in);
        int LuaChon;
        do{
            System.out.print("MENU chuc nang: \n");
            System.out.println("1. Them san pham moi: ");
            System.out.println("2. Hien thi danh sach san pham: ");
            System.out.println("3. Tim kiem san pham theo ma: ");
            System.out.println("4. Xoa san pham theo ma: ");
            System.out.println("5. Sua thong tin san pham theo ma: ");
            System.out.println("6. Luu danh sach san pham vao file: ");
            System.out.println("7. Doc danh sach san pham tu file: ");
            System.out.println("0. Thoat chuong trinh!");
            System.out.print("Nhap lua chon: ");
            LuaChon = sc.nextInt();
            switch (LuaChon){
                case 1:
                    quanLySanPham.ThemSanPham();
                    break;
                case 2:
                    quanLySanPham.HienThiDanhSachSanPham();
                    break;
                case 3:
                    quanLySanPham.TimKiemSanPhamTheoMa();
                    break;
                case 4:
                    quanLySanPham.XoaSPTheoMa();
                     break;
                 case 5:
                     quanLySanPham.SuaThongTinSPTheoMa();
                     break;
                 case 6:
                     quanLySanPham.ghiFile();
                     break;
                 case 7:
                     quanLySanPham.DocFile();

            }
        }while (LuaChon != 0);
    }
}