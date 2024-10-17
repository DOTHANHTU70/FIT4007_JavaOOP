import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    private List<SanPham> danhSachSP;
    private Scanner sc;
public QuanLySanPham() {
    danhSachSP = new ArrayList<>();
    sc = new Scanner(System.in);
}
    public void ThemSanPham() {
        System.out.println("Nhap ma sp: ");
        String maSP = sc.nextLine();
        System.out.println("Nhap ten sp: ");
        String tenSP = sc.nextLine();
        System.out.println("Nhap so luong sp: ");
        int soLuongSP = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia sp: ");
        double donGiaSP = Double.parseDouble(sc.nextLine());
        sc.nextLine();
        danhSachSP.add(new SanPham(maSP, tenSP, soLuongSP, donGiaSP));
    }

    public void HienThiDanhSachSanPham() {
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham trong!");
        } else {
            danhSachSP.forEach(System.out::println);
        }
    }

    public void TimKiemSanPhamTheoMa() {
        String maTimKiem = "";
        for (SanPham sanPham : danhSachSP) {
            if (sanPham.getMaSP().equals(maTimKiem)) {
                System.out.println("Thông tin sản phẩm:");
                System.out.println("Mã SP: " + sanPham.getMaSP());
                System.out.println("Tên SP: " + sanPham.getTenSP());
                System.out.println("Số lượng: " + sanPham.getSoLuong());
                System.out.println("Đơn giá: " + sanPham.getDonGia());
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã " + maTimKiem);
    }

    public void XoaSPTheoMa() {
        String maXoa = "";
        boolean removed = danhSachSP.removeIf(sp -> sp.getMaSP().equals(maXoa));
        if (removed) {
            System.out.println("Xoa san pham thanh cong!");
        } else {
            System.out.println("Khong tim thay san pham de xoa!");
        }
    }
    public void SuaThongTinSPTheoMa() {
        for (SanPham sanPham : danhSachSP) {
            if (sanPham.getMaSP().equals(toString())) {
                System.out.println("Thông tin sản phẩm cần sửa:");
                System.out.println("Mã SP: " + sanPham.getMaSP());
                System.out.println("Tên SP: " + sanPham.getTenSP());
                System.out.println("Số lượng: " + sanPham.getSoLuong());
                System.out.println("Đơn giá: " + sanPham.getDonGia());
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã ");
    }
    public void ghiFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("sinhvien.dat", true))) {
            outputStream.writeObject(danhSachSP);
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Khong the mo file de ghi!");
            e.printStackTrace();
        }
    }
    public void docFile() {
        danhSachSP.clear(); 
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SanPham.dat"))) {
            while (true) {
                try {
                    @SuppressWarnings("unchecked")
                    List<SanPham> sv = (List<SanPham>) inputStream.readObject();
                    danhSachSP.addAll(sv);
                } catch (EOFException e) {
                    break; // Kết thúc tệp
                }
            }
            System.out.println("Doc file thanh cong!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Khong the mo file de doc!");
            e.toString();
        }
    }

    public void DocFile() {
        
    }
}

