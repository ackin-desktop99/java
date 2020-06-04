
package Bai_Kiem_Tra_so2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CustumTableKiemTra2 extends AbstractTableModel{
    ArrayList<KiemTraSo2> arr=new ArrayList<>();
    private String name[]={"makt","tenkt","he so","diem kt"};
    private Class classes[]={String.class,String.class,Integer.class,Double.class};
    public CustumTableKiemTra2(ArrayList<KiemTraSo2> arr){
        this.arr=arr;
    }
    @Override
    public int getRowCount() {
        return arr.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return name.length;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      switch(columnIndex){
          case 0: return arr.get(rowIndex).getMaKT();
              case 1: return arr.get(rowIndex).getTenKT();
                  case 2: return arr.get(rowIndex).getHeSoKT();
                      case 3: return arr.get(rowIndex).getDiemKT();
                          default:return null;
      }  
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
//return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
}
