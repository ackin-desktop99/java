
package TableNguoi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConnectDB {
    //khoi tao
    Statement stm=null;
    ResultSet rs=null;
    Connection cnn=null;
    // tao ket noi 
    public void getconnect() throws Exception{
        String url="jdbc:derby://localhost:1527/Nguoi_testall";
        String user="testall";
        String pass="123";
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cnn=DriverManager.getConnection(url,user,pass);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"khong tim thay driver "+ex);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"khong tim thay driver "+e);
        }
    }
    public void showDataTable(String strSQL,JTable tbl ) throws Exception{
        getconnect();
        try{
            stm=(Statement) cnn.createStatement();
            rs =(ResultSet)  stm.executeQuery(strSQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int colum=rsm.getColumnCount();
            Vector vtCol=new Vector(colum);
            for(int i=1;i<=colum;i++){
                vtCol.add(rsm.getColumnName(i));
            }
            Vector vtData=new Vector();
            Vector temp;
            while(rs.next()){
                temp=new Vector(colum);
                for(int i=1;i<=colum;i++){
                    temp.add(rs.getString(i));
                }
                vtData.add(temp);
            }
            tbl.setModel( new DefaultTableModel(vtData,vtCol));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        finally{
            ConnectClose();
            
        }
        
    }
    public boolean UpdateData(String strSQL) throws Exception{
        getconnect();
        int row=0;
        try{
            
            stm=(Statement) cnn.createStatement();
            row=stm.executeUpdate(strSQL);
            if(row >0) return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            ConnectClose();
        }
        return false;
    }
    public void ConnectClose(){
        if(cnn!=null){
            try{
                cnn.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    public void setDataArrayList(String SQL,ArrayList arr) throws SQLException, Exception{
        getconnect();
        try{
        stm=cnn.createStatement();
        rs=stm.executeQuery(SQL);
        ResultSetMetaData rsm= rs.getMetaData();
        int colum=rsm.getColumnCount();
        Nguoi n;
        String cmt;
        String te;
        int tu;
        while(rs.next()){
            cmt=rs.getString(1);
            te=rs.getString(2);
            tu=Integer.parseInt(rs.getString(3));
            n=new Nguoi(cmt, te, tu);
            arr.add(n);
        }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            ConnectClose();
        }
    }
    
}
