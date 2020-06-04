
package TableNguoi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JTable_Nguoi extends javax.swing.JFrame {
    ArrayList<Nguoi> dsN=new ArrayList<Nguoi>();
    int dongChon=-1;
    Nguoi n=new Nguoi();
    ConnectDB cnn=new ConnectDB();
     
    public JTable_Nguoi() throws Exception {
        initComponents();
        loadData();
        //inds();
    }
    public void LoadDataTableNguoi() throws Exception{
        String sql="select * from nguoi";
        cnn.showDataTable(sql, tableNguoi);
    }
    public void loadTableNguoi(){
        tableNguoi.setModel(new TableNguoi(dsN));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableNguoi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCMT = new javax.swing.JTextField();
        jtfTen = new javax.swing.JTextField();
        jtfTuoi = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(java.awt.Color.white);

        tableNguoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableNguoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNguoiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNguoi);

        jLabel1.setText("CMT");

        jLabel2.setText("ho ten");

        jLabel3.setText("tuoi");

        jtfTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTuoiActionPerformed(evt);
            }
        });

        btnSapXep.setText("sap xep");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnClose.setText("close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnXoa.setText("xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoaTrang.setText("xoa trang");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        btnThem.setText("them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfCMT)
                    .addComponent(jtfTen)
                    .addComponent(jtfTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSapXep, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaTrang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnXoaTrang)
                    .addComponent(btnThem))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTuoiActionPerformed

    private void tableNguoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNguoiMouseClicked
        dongChon=tableNguoi.getSelectedRow();
        if(dongChon!=-1){
            n=dsN.get(dongChon);
            jtfCMT.setText(n.getCMT()+"");
            jtfTen.setText(n.getTen()+"");
            jtfTuoi.setText(String.valueOf(n.getTuoi())+""); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNguoiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        n=new Nguoi(jtfCMT.getText(), jtfTen.getText(), Integer.parseInt(jtfTuoi.getText()));
        dsN.add(n);
        String sql="";
        
        sql=sql.format("insert into nguoi values('%s','%s',%d)"
                ,jtfCMT.getText(), jtfTen.getText(), Integer.parseInt(jtfTuoi.getText()));
        try {
            cnn.UpdateData(sql);
        } catch (Exception ex) {
            Logger.getLogger(JTable_Nguoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTableNguoi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String sql="delete from Nguoi where cmt='"
                + jtfCMT.getText()+"'";
        try {
            cnn.UpdateData(sql);
        } catch (Exception ex) {
            Logger.getLogger(JTable_Nguoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(dongChon!=-1){
            dsN.remove(dongChon);
            
        }
        else {
            JOptionPane.showMessageDialog(this, "chua chon dong xoa","thong bao",WIDTH);
        }
        loadTableNguoi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String sql="update nguoi set ten='"+jtfTen.getText()+"',tuoi="
                + jtfTuoi.getText()+ "where cmt='"+jtfCMT.getText()+"'";
        try {
            cnn.UpdateData(sql);
        } catch (Exception ex) {
            Logger.getLogger(JTable_Nguoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(dongChon!=-1){
            Nguoi newN=new Nguoi(jtfCMT.getText(), jtfTen.getText(), Integer.parseInt(jtfTuoi.getText()));
            dsN.set(dongChon, newN);
            
        }
        else{
            JOptionPane.showMessageDialog(this,"chua chon dong chon","thong bao",WIDTH);
        }
        loadTableNguoi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        jtfCMT.setText("");
        jtfTen.setText("");
        jtfTuoi.setText("");
        jtfCMT.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        Comparator<Nguoi> c= new Comparator<Nguoi>() {

            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                return o1.getCMT().compareTo(o2.getCMT());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Collections.sort(dsN,c);
        loadTableNguoi();
// TODO add your handling code here:
    }//GEN-LAST:event_btnSapXepActionPerformed
    public void loadData() throws Exception{
        ConnectDB cn=new ConnectDB();
        String Sql= "select * from NGUOI";
        cn.showDataTable(Sql,tableNguoi);
        //cn.setDataArrayList(Sql, dsN);
        
    }
    public void setData(){
        ConnectDB cn=new ConnectDB();
        
    }
    public void inds(){
        for (Nguoi dsN1 : dsN) {
            System.out.println(dsN1.toString());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTable_Nguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable_Nguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable_Nguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable_Nguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JTable_Nguoi().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(JTable_Nguoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCMT;
    private javax.swing.JTextField jtfTen;
    private javax.swing.JTextField jtfTuoi;
    private javax.swing.JTable tableNguoi;
    // End of variables declaration//GEN-END:variables
}
