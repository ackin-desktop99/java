
package KetNoiDerby;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {
    Statement  stm = null;
    ResultSet rs = null;
    Connection cnn = null;
   
    String uRl = "jdbc:derby://localhost:1527/SinhVienDerby";//;create=true";
    String userName = "SinhVienDerby";// chema mặc định
    String pas = "123";
    //CREATE SCHEMA <schema name>
    //jdbc:derby://localhost:1527/ktpm3 [ABC on ABC]
    public ConnectDB() {
        try {         
           //org.apache.derby.jdbc.ClientDriver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            cnn = DriverManager.getConnection(uRl, userName,pas);    
            System.out.println("ket noi thanh cong");
        } catch (Exception ex) {
            System.out.println("ket noi that bai"+ ex.toString());
        }
    }   
 public void doSQL(String sql)  {
        try {
            stm = cnn.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n"+sql);
        }
   } public ArrayList getData(String sql)  {
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        try {
                stm =   (Statement) cnn.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    SinhVien sv = new SinhVien(rs.getString(1), 
                            rs.getString(2));
                    ds.add(sv);                        
                }                                
        } catch (Exception ex) {           
            System.out.println("loi getData "+ ex.toString());
            return null;
        }
        return ds;
    }
   public void CloseConnect(){
       try{
       cnn.close();
   }catch(SQLException ex){
           System.out.println("khong dong duoc ket noi!!!");
   }
   }
   public boolean CheckMa(String ma){
       String sql="select * from sinhvien where masv="+"'"+ma+"'";
         //sql=sql.format("select * from sinhvien where masv='%s'",ma);
         System.out.println(sql);
       try{
           stm = cnn.createStatement();
            rs=stm.executeQuery(sql);
       }catch(SQLException ex){
           System.out.println("khong check duoc du lieu: ");
       }
        try {
            if(rs.next()){
                return true;
            }} catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      return false;
  }
}