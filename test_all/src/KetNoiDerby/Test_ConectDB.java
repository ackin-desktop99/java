
package KetNoiDerby;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test_ConectDB {
    static ConnectDB cnn=null;
    static Scanner sc=new Scanner(System.in);
    static ArrayList arr=new ArrayList();
    private static final String createTable="create table SinhVien("
            + "maSV char(10) primary key,"
            + "tenSV char (20))";
    private static final String insertSample="insert into SinhVien values("
            + "'sv01',"
            + "'sv02')";
    public static void TaoBang(){
        cnn.doSQL(createTable);
        System.out.println("tao bang thanh cong ");
    } 
    public static void AddSV(){
        int n;
        System.out.println("nhap vao so sinh vien n= ");
        n=Integer.parseInt(sc.nextLine());
        String ma,ten,strSQL="";
        for(int i=0;i<n;i++){
            System.out.println("nhap vao ma sv: ");
            ma=sc.nextLine();
            System.out.println("nhap vao ten sinh vien: ");
            ten=sc.nextLine();
            strSQL=strSQL.format("insert into SinhVien values("
                    + "'%s',"
                    + "'%s')",ma,ten);
            cnn.doSQL(strSQL);
        }
    }
    public static void RemoveSV(){
        System.out.println("nhap vao ma sinh vien muoon xoa");
        String ma=sc.nextLine();
        String sql="";
        sql=sql.format("delete from SinhVien where maSV='%s'",ma);
        cnn.doSQL(sql);
    }
    public static void setTenSV(){
        System.out.println("nhap vao ma sv vaf ten sinh vien muon sua");
        String ma=sc.nextLine();
        if(cnn.CheckMa(ma)){
        String ten=sc.nextLine();
        String sql="";
        sql=sql.format("update SinhVien set tenSV='%s' where maSV='%s'",ten,ma);
        cnn.doSQL(sql);
        System.out.println("da sua ten xong");
        }
        else System.out.println("ma sinh vien khong co trong bang");
    }
    public static void SapXep(){
        String sql="select * from sinhvien";
        arr=cnn.getData(sql);
        Comparator c= new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Collections.sort(arr,c);
        for (Object arr1 : arr) {
            System.out.println( arr1.toString());
        }
    }
    public static void DropTable(){
        String sql="drop table SinhVien";
        cnn.doSQL(sql);
        System.out.println("xoa bang thanh cong : ");
    }
    public static void InDS(){
        String sql="select * from SinhVien";
        arr=cnn.getData(sql);
        for (Object arr1 : arr) {
            System.out.println(arr1.toString());
        }
    }
    
    public static void main(String[] args) {
        cnn=new ConnectDB();
        
        //TaoBang(); cnn.doSQL(insertSample);
        //AddSV();
        //RemoveSV();
        //setTenSV();
        //SapXep();
        SinhVien.InTieuDe();
        InDS();
    }
    
}
