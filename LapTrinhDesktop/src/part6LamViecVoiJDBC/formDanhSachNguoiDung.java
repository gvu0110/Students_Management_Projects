/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6LamViecVoiJDBC;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang Vu
 */
public class formDanhSachNguoiDung extends javax.swing.JFrame {

    /**
     * Creates new form formDanhSachNguoiDung
     */
    public formDanhSachNguoiDung() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiDung = new javax.swing.JTable();
        btnDong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh Sach Sinh Vien");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblNguoiDung);

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part6LamViecVoiJDBC/Images/dong.png"))); // NOI18N
        btnDong.setText("Dong");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part6LamViecVoiJDBC/Images/xoa.gif"))); // NOI18N
        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part6LamViecVoiJDBC/Images/sua.gif"))); // NOI18N
        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/part6LamViecVoiJDBC/Images/them.png"))); // NOI18N
        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // Mo rong cua so giao dien chinh
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Goi ham hien thi danh sach
        hienThiDanhSachNguoiDung();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        // Khai bao 1 doi tuong form
        formThemSinhVien formThem = new formThemSinhVien();
        formThem.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String maSV = "";

        // Lay thong tin ma sinh vien nguoi dung chon tren table
        int dongChon = tblNguoiDung.getSelectedRow();
        maSV = "" + tblNguoiDung.getValueAt(dongChon, 0);
        formThemSinhVien formSua = new formThemSinhVien();

        // Truyen ma sinh vien len form sua
        formSua.setMaSV(maSV);

        formSua.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ketQua = JOptionPane.showConfirmDialog(rootPane,
                "Ban co chac chan muon xoa sinh vien nay khong?",
                "Thong bao", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (ketQua == JOptionPane.YES_OPTION) {
            // Xu ly xoa
            String maSV = "";

            // Lay thong tin ma sinh vien nguoi dung chon tren table
            int dongChon = tblNguoiDung.getSelectedRow();
            maSV = "" + tblNguoiDung.getValueAt(dongChon, 0);

            boolean ketQuaXoa = DataProvider.QLSinhVien().xoaSinhVien(maSV);
            if (ketQuaXoa == true) {
                JOptionPane.showMessageDialog(rootPane, "Xoa thong tin sinh vien thanh cong");
            }
        }
        formDanhSachNguoiDung.hienThiDanhSachNguoiDung();
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void hienThiDanhSachNguoiDung() {
        // Khai bao 1 mang chua tieu de
        String tieuDe[] = new String[]{"Ma SV", "Ho ten", "Gioi tinh", "Ngay sinh", "Dien thoai", "Email", "So CMT", "Dia chi", "Ma khoa"};

        // Khai bao 1 doi tuong de dua du lieu len table
        DefaultTableModel model = new DefaultTableModel(tieuDe, 0);

        QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();

        // Lay danh sach
        List<NguoiDung> listNguoiDung = quanLyNguoiDung.layDanhSachNguoiDung();

        // Duyet danh sach de dua vao model
        Object row[];
        for (NguoiDung nd : listNguoiDung) {
            row = new Object[8];
            row[0] = nd.getUserID();
            row[1] = nd.getTenDangNhap();
            row[2] = nd.getMatKhau();
            row[3] = nd.getHoTen();
            row[4] = nd.getDienThoai();
            row[5] = nd.getEmail();
            row[6] = nd.getDiaChi();
            row[7] = nd.getQuyen();

            // Them vao model
            model.addRow(row);
        }

        // Hien thi du lieu len table
        tblNguoiDung.setModel(model);
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
            java.util.logging.Logger.getLogger(formDanhSachNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDanhSachNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDanhSachNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDanhSachNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDanhSachNguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblNguoiDung;
    // End of variables declaration//GEN-END:variables
}
