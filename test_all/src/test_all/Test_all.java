

package test_all;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;



public class Test_all {

    public static void main(String[] args) throws Exception{
       
        DSNguoi ds=new DSNguoi(1);
        ds.Nhap();
        ds.Xuat();
        Calendar cal=Calendar.getInstance();
        //cal.getTime();
        cal.add(Calendar.DAY_OF_WEEK, 1);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(sdf.format(cal.getTime()));
    }
    
}
