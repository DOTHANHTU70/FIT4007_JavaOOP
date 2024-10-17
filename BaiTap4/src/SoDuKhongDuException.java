
class SoDuKhongDuException extends Exception {
    public SoDuKhongDuException(double soDuHienTai, double soTienCanRut) {
        super("Số dư không đủ. Số dư hiện tại: " + soDuHienTai + ", Số tiền cần rút: " + soTienCanRut);
    }
}



