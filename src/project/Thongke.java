/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Thongke extends javax.swing.JFrame {

    /**
     * Creates new form Thongke
     */
    private int stk;

    public Thongke(int stk) throws IOException {
        initComponents();
        this.stk = stk;
        LoadDuLieuTK();
    }

    void LoadDuLieuTK() throws IOException {
        Object ob[] = new Object[13];

        DefaultTableModel tb = (DefaultTableModel) table.getModel();
        tb.setRowCount(0);

        //TK nap
        File ftknap = new File("tknaptien" + stk + ".txt");
        try {
            FileReader frnap = new FileReader(ftknap);
            BufferedReader bwnap = new BufferedReader(frnap);
            String l = "";
            ob[0] = "Nạp tiền";
            ob[1] = 0;
            ob[2] = 0;
            ob[3] = 0;
            ob[4] = 0;
            ob[5] = 0;
            ob[6] = 0;
            ob[7] = 0;
            ob[8] = 0;
            ob[9] = 0;
            ob[10] = 0;
            ob[11] = 0;
            ob[12] = 0;
            while (true) {
                l = bwnap.readLine();
                if (l == null) {
                    break;
                }
                String[] t = l.split("-");
                ob[Integer.parseInt(t[0])] = Integer.parseInt(String.valueOf(ob[Integer.parseInt(t[0])])) + Integer.parseInt(t[1]);
            }
            tb.addRow(ob);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thongke.class.getName()).log(Level.SEVERE, null, ex);
        }

        //TK ruttien
        File ftkrut = new File("tkruttien" + stk + ".txt");
        try {
            FileReader frrut = new FileReader(ftkrut);
            BufferedReader bwrut = new BufferedReader(frrut);
            String l = "";
            ob[0] = "Rút tiền";
            ob[1] = 0;
            ob[2] = 0;
            ob[3] = 0;
            ob[4] = 0;
            ob[5] = 0;
            ob[6] = 0;
            ob[7] = 0;
            ob[8] = 0;
            ob[9] = 0;
            ob[10] = 0;
            ob[11] = 0;
            ob[12] = 0;
            while (true) {
                l = bwrut.readLine();
                if (l == null) {
                    break;
                }
                String[] t = l.split("-");
                ob[Integer.parseInt(t[0])] = Integer.parseInt(String.valueOf(ob[Integer.parseInt(t[0])])) + Integer.parseInt(t[1]);
            }
            tb.addRow(ob);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thongke.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //TK Chuyen
        File ftkchuyen = new File("tkchuyen" + stk + ".txt");
        try {
            FileReader frchuyen = new FileReader(ftkchuyen);
            BufferedReader bwchuyen = new BufferedReader(frchuyen);
            String l = "";
            ob[0] = "Chuyển tiền";
            ob[1] = 0;
            ob[2] = 0;
            ob[3] = 0;
            ob[4] = 0;
            ob[5] = 0;
            ob[6] = 0;
            ob[7] = 0;
            ob[8] = 0;
            ob[9] = 0;
            ob[10] = 0;
            ob[11] = 0;
            ob[12] = 0;
            while (true) {
                l = bwchuyen.readLine();
                if (l == null) {
                    break;
                }
                String[] t = l.split("-");
                ob[Integer.parseInt(t[0])] = Integer.parseInt(String.valueOf(ob[Integer.parseInt(t[0])])) + Integer.parseInt(t[1]);
            }
            tb.addRow(ob);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thongke.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //TK Nhan tien
        File ftknhan = new File("tkduocchuyen" + stk + ".txt");
        try {
            FileReader frnhan = new FileReader(ftknhan);
            BufferedReader bwnhan = new BufferedReader(frnhan);
            String l = "";
            ob[0] = "Nhận tiền";
            ob[1] = 0;
            ob[2] = 0;
            ob[3] = 0;
            ob[4] = 0;
            ob[5] = 0;
            ob[6] = 0;
            ob[7] = 0;
            ob[8] = 0;
            ob[9] = 0;
            ob[10] = 0;
            ob[11] = 0;
            ob[12] = 0;
            while (true) {
                l = bwnhan.readLine();
                if (l == null) {
                    break;
                }
                String[] t = l.split("-");
                ob[Integer.parseInt(t[0])] = Integer.parseInt(String.valueOf(ob[Integer.parseInt(t[0])])) + Integer.parseInt(t[1]);
            }
            tb.addRow(ob);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thongke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Thongke() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnquaylai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Thống kê");

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Thông tin", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
            }
        ));
        jScrollPane1.setViewportView(table);

        btnquaylai.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnquaylai.setText("Quay lại");
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(btnquaylai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnquaylai)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        // TODO add your handling code here:
        new ChucnangUser(stk).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnquaylaiActionPerformed

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
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquaylai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
