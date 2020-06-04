
package Xe_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Xe_ConnectDB {
    Connection cn=null;
    Statement stm=null;
    ResultSet rs=null;
    public void GetConect(){
        String url="jdbc:derby://localhost:1527/QLXe";
        String user="userXe";
        String pass="123";
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        try{
            cn=DriverManager.getConnection(url,user,pass);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void CloseConnect(){
        if(cn!=null)
            try{
                cn.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
    }
    public void UpdateData(String SQL){
        GetConect();
        try{
            stm=cn.createStatement();
            stm.executeUpdate(SQL);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            CloseConnect();
        }
    }
    public ResultSet ExecuteQuery(String SQL){
        GetConect();
        try{
        stm=cn.createStatement();
        rs=stm.executeQuery(SQL);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            CloseConnect();
        }
        return rs;
    }
    public void setArr(ArrayList arr){
        GetConect();
        XE x;
        try{
            stm=cn.createStatement();
            rs=stm.executeQuery("select * from xe");
            String so;
            String ma;
            double gia;
            while(rs.next()){
                so=rs.getString(1);
                ma=rs.getString(2);
                gia=Double.parseDouble(rs.getString(3));
                x=new XE(so, ma, gia);
                //x=new XE(rs.getString(1),rs.getString(2),Double.parseDouble(rs.getString(3)));
                arr.add(x);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
