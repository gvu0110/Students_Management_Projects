/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1CauTrucLapTrinh;

import javax.swing.JOptionPane;

/**
 *
 * @author Truong Giang
 */
public class formKieuDuLieu extends javax.swing.JFrame {

    /**
     * Creates new form formKieuDuLieu
     */
    public formKieuDuLieu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbKieuDuLieu = new javax.swing.JComboBox();
        btnXemThongTin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblKichThuoc = new javax.swing.JLabel();
        lblKieu = new javax.swing.JLabel();
        lblMoTaGiaTri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kieu Du Lieu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap kieu du lieu de xem thong tin"));

        jLabel1.setText("Chon kieu du lieu:");

        cmbKieuDuLieu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>", "byte", "char", "bool", "float", "short", "long", "int" }));

        btnXemThongTin.setText("Xem thong tin");
        btnXemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbKieuDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnXemThongTin)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbKieuDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemThongTin))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thong tin kieu du lieu"));

        jLabel2.setText("Kich thuoc (bit):");

        jLabel3.setText("Kieu:");

        jLabel4.setText("Mo ta - Gia tri:");

        lblKichThuoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKichThuoc.setText("none");

        lblKieu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKieu.setText("none");

        lblMoTaGiaTri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMoTaGiaTri.setText("none");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoTaGiaTri)
                    .addComponent(lblKieu)
                    .addComponent(lblKichThuoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblKichThuoc))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblKieu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblMoTaGiaTri))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemThongTinActionPerformed
        // TODO add your handling code here:
        int kieuDuLieu = 0;
        String strKichThuoc = "", strKieu = "", strMoTaGiaTri = "";
        kieuDuLieu = cmbKieuDuLieu.getSelectedIndex();
        
        if (kieuDuLieu == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Ban chua chon kieu du lieu can xem");
            cmbKieuDuLieu.requestFocus();
            return;
        }
        
        switch (kieuDuLieu)
        {
            case 1:
                strKichThuoc = "8 bits";
                strKieu = "Byte";
                strMoTaGiaTri = "-128 den 127";
                break;
            case 2:
                strKichThuoc = "16 bits";
                strKieu = "Char";
                strMoTaGiaTri = "\\u0000 den \\uFFFF";
                break;
            case 3:
                strKichThuoc = "1 bit";
                strKieu = "Boolean";
                strMoTaGiaTri = "True - False";
                break;
            case 4:
                strKichThuoc = "32 bits";
                strKieu = "Float";
                strMoTaGiaTri = "1.17E-38 den 3.40E+38";
                break;
            case 5:
                strKichThuoc = "16 bits";
                strKieu = "Short";
                strMoTaGiaTri = "-32,768 den 32,767";
                break;
            case 6:
                strKichThuoc = "64 bits";
                strKieu = "Long";
                strMoTaGiaTri = "-2,147,483,648 den -2,147,483,647";
                break;
            case 7:
                strKichThuoc = "32 bits";
                strKieu = "Int";
                strMoTaGiaTri = "-32,768 den 32,767";
                break;
        }
        
        lblKichThuoc.setText(strKichThuoc);
        lblKieu.setText(strKieu);
        lblMoTaGiaTri.setText(strMoTaGiaTri);
    }//GEN-LAST:event_btnXemThongTinActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblKichThuoc.setText("");
        lblKieu.setText("");
        lblMoTaGiaTri.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(formKieuDuLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKieuDuLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKieuDuLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKieuDuLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKieuDuLieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXemThongTin;
    private javax.swing.JComboBox cmbKieuDuLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblKichThuoc;
    private javax.swing.JLabel lblKieu;
    private javax.swing.JLabel lblMoTaGiaTri;
    // End of variables declaration//GEN-END:variables
}