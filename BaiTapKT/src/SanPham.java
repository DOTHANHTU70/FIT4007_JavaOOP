
public class SanPham  {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;
    public SanPham(String maSP, String tenSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "Ma san pham: " + maSP + "\n" +
                "Ten san pham: " + tenSP + "\n" +
                "So luong san pham: " + soLuong + "\n" +
                "Don gia san pham: " + donGia + "\n";
    }
}


