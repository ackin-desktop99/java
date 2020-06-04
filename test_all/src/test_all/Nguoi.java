
package test_all;

import java.util.Objects;
import java.util.Scanner;

public class Nguoi implements Comparable<Nguoi>{
   private String ten;
   private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    //@Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 23 * hash + Objects.hashCode(this.ten);
//        return hash;
//    }

    

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nguoi other = (Nguoi) obj;
        if (!Objects.equals(this.ten, other.ten)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  ten  +"\t"+ tuoi+"\n" ;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) throws Exception{
        if(ten.trim().equals("")) throw new Exception("ten khong duoc de trong ");
        else
        this.ten = ten;
    }

    public void setTuoi(int tuoi) throws Exception {
        if(tuoi<12) throw new Exception("tuoi phai lon hon 12 ");
        else
        this.tuoi = tuoi;
    }
    public void Nhap(){
        System.out.println("nhap vao thong tin cua nguoi ");
        Scanner sc = new Scanner(System.in);
        
            System.out.println("nhap vao ten: ");
            ten =sc.nextLine(); 
            System.out.println("nhap vao tuoi ");
            tuoi=Integer.parseInt( sc.nextLine());
        
    }

    @Override
    public int compareTo(Nguoi o) {
        return String.valueOf(o.tuoi).compareTo(String.valueOf(this.tuoi));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   static void inTieuDe(){
       System.out.println("ten"+"\t"+"tuoi");
   }
}
