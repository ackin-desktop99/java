
package Xe_test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Xe_test {
    static String CreateTable=
"create table Xe ( sohieuxe char(20) primary key,"
          + "mausacxe char(20) not null,"
           + "giatrixe float)";
                                
    static Xe_ConnectDB cnn=new Xe_ConnectDB();
    static ResultSet rs=null;
    static String sql=null;
    static ArrayList<XE> dsXe=new ArrayList<XE>();
    static Scanner sc=new Scanner(System.in);
    static XE x;
    static void TaoBang(){
        try{
        cnn.UpdateData(CreateTable);
        }catch(Exception e){
            System.out.println("khong tao duoc bang ");
        }
    }
    static void AddXe(){
        System.out.println("nhap vao xe muoosn them:\n nhap vao so hieu: ");
        String sohieu;
        String mau;
        double gia;
        sohieu=sc.nextLine();
        System.out.println("nhap vao mau sac: ");
        mau=sc.nextLine();
        System.out.println("nhap vao gia tri : ");
        gia=Double.parseDouble(sc.nextLine());
        String sql="";
        sql=sql.format("insert into xe values ('%s','%s',%f)",sohieu,mau,gia);
        cnn.UpdateData(sql);
        x=new XE(sohieu, mau, gia);
        dsXe.add(x);
    }
    static void XuatXe(){
//       sql="select * from XE";
//       
//       ResultSet rs1=cnn.ExecuteQuery(sql);
//       System.out.println(rs1);
//       try {
//           while(rs1.next()){
//             x=new XE(rs1.getString(1),rs1.getString(2),Double.parseDouble(rs1.getString(3)));
//               System.out.println(x.toString());
//             dsXe.add(x);
//           }
//       } catch (SQLException ex) {
//            Logger.getLogger(Xe_test.class.getName()).log(Level.SEVERE, null, ex);
//      }
        cnn.setArr(dsXe);
       XE.inTieuDe();
       for (XE dsXe1 : dsXe) {
           System.out.println(dsXe1.toString());
        }
        
    }
    static void sua() throws SQLException{
        sql="select * from xe where sohieuxe='122377'";
        Connection db=null;
        Statement stm=null;
        stm=db.createStatement();
        rs=stm.executeQuery(sql);
        while(rs.next()){
            System.out.println("me no");
        }
//        if(rs.next()){
//            sql="update xe set sohieuxe='77777' where sohieuxe='1223'";
//            System.out.println("thuc hien update");
//            cnn.UpdateData(sql);
//        }
//        else System.out.println("khonfg co ma de update ");
    }
    public static void main(String[] args) throws SQLException {
        //cnn.GetConect();
        //AddXe();
        //XuatXe();
        sua();
    }
}
