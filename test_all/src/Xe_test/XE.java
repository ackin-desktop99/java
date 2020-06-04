
package Xe_test;

public class XE {
    private String soHieuXe;
    private String mauSacXe;
    private double giaTriXe;

    public XE() {
    }

    public XE(String soHieuXe, String mauSacXe, double giaTriXe) {
        this.soHieuXe = soHieuXe;
        this.mauSacXe = mauSacXe;
        this.giaTriXe = giaTriXe;
    }

    public XE(String soHieuXe) {
        this.soHieuXe = soHieuXe;
    }

    public String getSoHieuXe() {
        return soHieuXe;
    }

    public void setSoHieuXe(String soHieuXe) {
        this.soHieuXe = soHieuXe;
    }

    public String getMauSacXe() {
        return mauSacXe;
    }

    public void setMauSacXe(String mauSacXe) {
        this.mauSacXe = mauSacXe;
    }

    public double getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(double giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    @Override
    public String toString() {
        return   soHieuXe + "\t" + mauSacXe + "\t" + giaTriXe + "\n";
    }
    public static void inTieuDe(){
        System.out.println("so hieu xe \t mau sac xe \t gia tri xe");
    }
}
