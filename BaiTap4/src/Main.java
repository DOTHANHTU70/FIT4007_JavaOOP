public class Main {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan("123456", "Nguyen Van A", 1000000.0);

        try {
            System.out.print("Nhập số tiền cần rút: ");
            double soTienCanRut = Double.parseDouble(System.console().readLine());

            taiKhoan.rutTien(soTienCanRut);
            System.out.println("Giao dịch thành công. Số dư tài khoản: " + taiKhoan.getSoDu());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số tiền hợp lệ.");
        } catch (SoDuKhongDuException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
