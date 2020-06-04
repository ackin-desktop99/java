
package Bai_Kiem_Tra_so2;

import java.util.Objects;

public class KiemTraSo2 {
    private String maKT;
    private String TenKT;
    private int heSoKT;
    private  double diemKT;

    public KiemTraSo2() {
    }

    public KiemTraSo2(String maKT, String TenKT, int heSoKT, double diemKT) {
        this.maKT = maKT;
        this.TenKT = TenKT;
        this.heSoKT = heSoKT;
        this.diemKT = diemKT;
    }

    public String getMaKT() {
        return maKT;
    }

    public void setMaKT(String maKT) {
        this.maKT = maKT;
    }

    public String getTenKT() {
        return TenKT;
    }

    public void setTenKT(String TenKT) {
        this.TenKT = TenKT;
    }

    public int getHeSoKT() {
        return heSoKT;
    }

    public void setHeSoKT(int heSoKT) {
        this.heSoKT = heSoKT;
    }

    public double getDiemKT() {
        return diemKT;
    }

    public void setDiemKT(double diemKT) {
        this.diemKT = diemKT;
    }

    @Override
    public String toString() {
        return "KiemTraSo2{" + "maKT=" + maKT + ", TenKT=" + TenKT + ", heSoKT=" + heSoKT + ", diemKT=" + diemKT + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.maKT);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KiemTraSo2 other = (KiemTraSo2) obj;
        if (!Objects.equals(this.TenKT, other.TenKT)) {
            return false;
        }
        return true;
    }
    
}
