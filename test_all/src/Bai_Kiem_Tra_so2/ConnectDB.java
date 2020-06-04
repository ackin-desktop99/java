
package Bai_Kiem_Tra_so2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConnectDB {
    Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    public void GetConnect(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/KiemTraSo2",
                    "userKT2","123");
                   System.out.println("ket noi thanh cong :)"); 
        } catch (Exception e) {
            System.out.println("ket noi that bai !!!!");
        }
    }
    public boolean UpdateData(String sql){
        GetConnect();
        int row=0;// so truong thay doi khi thuc hien cau lenh update
        try {
            stm=con.createStatement();
            row=stm.executeUpdate(sql);
            if(row>0) return true;
        } catch (Exception e) {
            System.out.println("khong update duoc du lieu!!!! ");
        }
        CLoseConnect();
        return false;
        
    }
    public void ShowDataTable(String sql,JTable tbl,Vector vtData){
        GetConnect();
        try {
            GetStaStatement();
            rs=stm.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int colum=rsm.getColumnCount();
            Vector vtNameColumn = new Vector(colum);
            for(int i=1;i<=colum;i++){
                vtNameColumn.add(rsm.getColumnName(i));
            }
            //Vector vtData=new Vector();
            Vector temp;
            while(rs.next()){
                temp=new Vector(colum);
                for(int i=1;i<=colum;i++){
                    temp.add(rs.getString(i));
                }
                vtData.add(temp);
            }
            ArrayList arr=new ArrayList();
            //arr=vtData.toArray();
            tbl.setModel(new DefaultTableModel(vtData,vtNameColumn));
        } catch (Exception e) {
            System.out.println("khong do duoc bang !!!");
        }
        try {
            rs.close();
        } catch (Exception e) {
        }
        CLoseConnect();
    }
    public void SetDataArrayList(String sql,ArrayList<KiemTraSo2> arr){
        GetConnect();
        try {
            //GetStaStatement();
            stm=con.createStatement();
            rs=stm.executeQuery(sql);
            KiemTraSo2 kt2;
            while(rs.next()){
                kt2=new KiemTraSo2();
                kt2.setMaKT(rs.getString(1));
                kt2.setTenKT(rs.getString(2));
                kt2.setHeSoKT(Integer.parseInt(rs.getString(3)));
                kt2.setDiemKT(Double.parseDouble(rs.getString(4)));
                arr.add(kt2);
            }
        } catch (Exception e) {
            System.out.println("khong do duoc data sang arrayList!!!");
        }
        CLoseConnect();
    }
    public Statement GetStaStatement()  {
        if( stm==null){
             try {
                stm=con.createStatement();
            } catch (Exception e) {
                System.out.println("khong tao duoc statement !!!!");
            }
        }
        return stm;
    }
    public  void CLoseConnect(){
        if(con!=null){
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("dong CSDL that bai !!!!");
            }
        }
    }
    
}
