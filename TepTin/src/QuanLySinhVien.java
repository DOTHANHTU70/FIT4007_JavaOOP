import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    private List<SinhVien> danhSachSV;
    private Scanner scanner;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void themSinhVien() {
        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        float diemTB = scanner.nextFloat();
        scanner.nextLine(); // Xóa bộ đệm
        danhSachSV.add(new SinhVien(maSV, hoTen, diemTB));
    }

    public void hienThiDanhSachSinhVien() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sach sinh vien rong!");
            return;
        }
        danhSachSV.forEach(System.out::println);
    }

    public void ghiFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("sinhvien.dat", true))) {
            outputStream.writeObject(danhSachSV);
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Khong the mo file de ghi!");
            e.printStackTrace();
        }
    }

    public void docFile() {
        danhSachSV.clear(); // Xóa danh sách hiện tại trước khi đọc từ file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("sinhvien.dat"))) {
            while (true) {
                try {
                    @SuppressWarnings("unchecked")
                    List<SinhVien> sv = (List<SinhVien>) inputStream.readObject();
                    danhSachSV.addAll(sv);
                } catch (EOFException e) {
                    break; // Kết thúc tệp
                }
            }
            System.out.println("Doc file thanh cong!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Khong the mo file de doc!");
            e.printStackTrace();
        }
    }
}
