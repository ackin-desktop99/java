
package test_all;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DSNguoi implements Comparable<Nguoi>{
    private int ma;
    private TreeSet<Nguoi> tset;

    public DSNguoi(int ma) {
        this.ma = ma;
        tset = new TreeSet<Nguoi>();
    }

    public DSNguoi() {
    }
    
    public void Nhap() throws Exception{
        System.out.println("nhap vao ma nguoi : ");
        Scanner sc=new Scanner(System.in);
        ma=Integer.parseInt(sc.nextLine());
        int n;
        System.out.print("nhap vao so nguoi trong danh sach: ");
        n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.printf("nhap vao thong tin nguoi thu %1$2d : ",i+1);
            Nguoi n1=new Nguoi();
            n1.Nhap();
            tset.add(n1);
        }
    }

    @Override
    public String toString() {
        return "DSNguoi{" + "ma=" + ma + ", hset=" + tset + '}';
    }
    public void Xuat(){
        System.out.printf("ma: %1$-10d \n",ma);
        Nguoi.inTieuDe();
        Comparator c = new Comparator<Nguoi>(){

            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                if(o2.getTen().compareTo(o1.getTen())>0) return 1;
                else
                if(o2.getTen().compareTo(o1.getTen())<0) return -1;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return 0;
            }
        };  
        ArrayList<Nguoi> arr=new ArrayList<Nguoi>(tset);
        Collections.sort(arr,c);
        for (Nguoi arr1 : arr) {
            System.out.print(arr1.toString());
        }
      
    }

    @Override
    public int compareTo(Nguoi o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
