
package TableNguoi;

import java.util.Objects;

public class Nguoi {
    private String CMT;
    private String ten;
    private int tuoi;

    public Nguoi(String CMT, String ten, int tuoi) {
        this.CMT = CMT;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Nguoi() {
    }

    public Nguoi(String CMT) {
        this.CMT = CMT;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.CMT);
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
        final Nguoi other = (Nguoi) obj;
        if (!Objects.equals(this.CMT, other.CMT)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "CMT=" + CMT + ", ten=" + ten + ", tuoi=" + tuoi +"\n";
    }
    
}
