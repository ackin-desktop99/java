
package TableNguoi;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableNguoi extends AbstractTableModel{
    ArrayList<Nguoi> dsN = new ArrayList<Nguoi>();
    private String name[]={"CMT","ho ten","tuoi"};
    private Class classes[]={String.class,String.class,Integer.class};

    public TableNguoi(ArrayList<Nguoi> ds) {
        dsN=ds;
    }
    @Override
    public int getRowCount() {
        return dsN.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return name.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsN.get(rowIndex).getCMT();
            case 1: return dsN.get(rowIndex).getTen();
            case 2: return dsN.get(rowIndex).getTuoi();
                default: return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// override method
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
