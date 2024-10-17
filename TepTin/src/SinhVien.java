import java.io.Serializable;

public class SinhVien implements Serializable {
    String maSV;
    String hoTen;
    float diemTB;

    public SinhVien(String maSV, String hoTen, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + maSV + "\n" +
                "Ho ten: " + hoTen + "\n" +
                "Diem trung binh: " + diemTB + "\n" +
                "--------------------\n";
    }
}
