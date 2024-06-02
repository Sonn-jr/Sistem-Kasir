/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistem_kasir_restoran;

public class Menu_Dashboard extends javax.swing.JFrame {
    koneksi_db k = new koneksi_db();
    
    public Menu_Dashboard() {
        initComponents();
        k.connect();
        setIdLevel(Login_Menu.userLevel);
    }
    
    public void setIdLevel(int id_level) {
        switch (id_level) {
            case 1:
                btn_registrasi.setEnabled(true);
                btn_menu_makanan.setEnabled(true);
                btn_transaksi.setEnabled(true);
                break;
            case 2:
                btn_registrasi.setEnabled(false);
                btn_menu_makanan.setEnabled(true);
                btn_transaksi.setEnabled(true);
                break;
            case 3:
                btn_registrasi.setEnabled(false);
                btn_menu_makanan.setEnabled(true);
                btn_transaksi.setEnabled(true);;
                break;
            case 4:
                btn_registrasi.setEnabled(false);
                btn_menu_makanan.setEnabled(true);
                btn_transaksi.setEnabled(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_menu_makanan = new javax.swing.JButton();
        btn_registrasi = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 204, 51));
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\15.jpg")); // NOI18N

        btn_menu_makanan.setBackground(new java.awt.Color(0, 0, 0));
        btn_menu_makanan.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_menu_makanan.setForeground(new java.awt.Color(255, 204, 51));
        btn_menu_makanan.setText("MENU MAKANAN");
        btn_menu_makanan.setEnabled(false);
        btn_menu_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_makananActionPerformed(evt);
            }
        });

        btn_registrasi.setBackground(new java.awt.Color(0, 0, 0));
        btn_registrasi.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_registrasi.setForeground(new java.awt.Color(255, 204, 51));
        btn_registrasi.setText("MENU REGISTRASI");
        btn_registrasi.setEnabled(false);
        btn_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrasiActionPerformed(evt);
            }
        });

        btn_transaksi.setBackground(new java.awt.Color(0, 0, 0));
        btn_transaksi.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(255, 204, 51));
        btn_transaksi.setText("MENU TRANSAKSI");
        btn_transaksi.setEnabled(false);
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        jLabel2.setText("Rasa Nusantara");

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel3.setText("DASHBOARD");

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        jLabel4.setText("Rasa Nusantara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(btn_logout))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_menu_makanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(74, 74, 74)
                .addComponent(btn_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_menu_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Login_Menu l = new Login_Menu();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrasiActionPerformed
        // TODO add your handling code here:
        Menu_Registrasi reg = new Menu_Registrasi();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrasiActionPerformed

    private void btn_menu_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_makananActionPerformed
        // TODO add your handling code here:
        Menu_Makanan makan = new Menu_Makanan();
        makan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_makananActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
        Menu_Transaksi tran = new Menu_Transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_makanan;
    public javax.swing.JButton btn_registrasi;
    public javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
