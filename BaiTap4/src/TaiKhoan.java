class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void rutTien(double soTienCanRut) throws SoDuKhongDuException {
        if (soTienCanRut > soDu) {
            throw new SoDuKhongDuException(soDu, soTienCanRut);
        }
        soDu -= soTienCanRut;
    }

    public double getSoDu() {
        return soDu;
    }
}
