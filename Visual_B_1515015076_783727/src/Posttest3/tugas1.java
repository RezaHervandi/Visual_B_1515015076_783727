/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;

/**
 *
 * @author mikado
 */
public class tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form tugas1
     */
    public tugas1() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jAtas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTengah = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Roda4 = new javax.swing.JRadioButton();
        Roda2 = new javax.swing.JRadioButton();
        NoKendaraan = new javax.swing.JTextField();
        jamMasuk = new javax.swing.JTextField();
        lamaParkir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        totalBayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        hargaParkir = new javax.swing.JTextField();
        jBawah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jKiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jKanan = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAtas.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Raleway ExtraLight", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aplikasi Perhitungan Parkir Kendaraan");

        javax.swing.GroupLayout jAtasLayout = new javax.swing.GroupLayout(jAtas);
        jAtas.setLayout(jAtasLayout);
        jAtasLayout.setHorizontalGroup(
            jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAtasLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(64, 64, 64))
        );
        jAtasLayout.setVerticalGroup(
            jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAtasLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jAtas, java.awt.BorderLayout.PAGE_START);

        jTengah.setBackground(new java.awt.Color(0, 153, 204));
        jTengah.setPreferredSize(new java.awt.Dimension(562, 440));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Kendaraan");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Parkir");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam Masuk");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kendaraan");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jam Keluar");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Bayar");

        buttonGroup1.add(Roda4);
        Roda4.setText("Roda 4");
        Roda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roda4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Roda2);
        Roda2.setText("Roda 2");
        Roda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roda2ActionPerformed(evt);
            }
        });

        NoKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoKendaraanActionPerformed(evt);
            }
        });

        jamMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamMasukActionPerformed(evt);
            }
        });

        lamaParkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaParkirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jam");

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        totalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBayarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Lama Parkir");

        hargaParkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaParkirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTengahLayout = new javax.swing.GroupLayout(jTengah);
        jTengah.setLayout(jTengahLayout);
        jTengahLayout.setHorizontalGroup(
            jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTengahLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTengahLayout.createSequentialGroup()
                        .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jTengahLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTengahLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)))
                            .addGroup(jTengahLayout.createSequentialGroup()
                                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12))
                                .addGap(46, 46, 46)))
                        .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jTengahLayout.createSequentialGroup()
                                .addComponent(Roda4)
                                .addGap(28, 28, 28)
                                .addComponent(Roda2))
                            .addComponent(NoKendaraan)
                            .addComponent(jamMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addGroup(jTengahLayout.createSequentialGroup()
                                .addComponent(lamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addComponent(hargaParkir, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addGroup(jTengahLayout.createSequentialGroup()
                        .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(55, 55, 55)
                        .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jTengahLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jTengahLayout.setVerticalGroup(
            jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTengahLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NoKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roda4)
                    .addComponent(jLabel7)
                    .addComponent(Roda2))
                .addGap(18, 18, 18)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hargaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(jTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalBayar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jTengah, java.awt.BorderLayout.CENTER);

        jBawah.setBackground(new java.awt.Color(255, 255, 51));
        jBawah.setPreferredSize(new java.awt.Dimension(715, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel11.setText("Copyright@RezaHervandi");

        javax.swing.GroupLayout jBawahLayout = new javax.swing.GroupLayout(jBawah);
        jBawah.setLayout(jBawahLayout);
        jBawahLayout.setHorizontalGroup(
            jBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBawahLayout.createSequentialGroup()
                .addContainerGap(374, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(295, 295, 295))
        );
        jBawahLayout.setVerticalGroup(
            jBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBawahLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        getContentPane().add(jBawah, java.awt.BorderLayout.PAGE_END);

        jKiri.setBackground(new java.awt.Color(153, 255, 204));
        jKiri.setPreferredSize(new java.awt.Dimension(74, 440));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setText("CEK");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setText("KESINI");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel13.setText("YUUK");

        javax.swing.GroupLayout jKiriLayout = new javax.swing.GroupLayout(jKiri);
        jKiri.setLayout(jKiriLayout);
        jKiriLayout.setHorizontalGroup(
            jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jKiriLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKiriLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(jKiriLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jKiriLayout.setVerticalGroup(
            jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKiriLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        getContentPane().add(jKiri, java.awt.BorderLayout.LINE_START);

        jKanan.setBackground(new java.awt.Color(102, 255, 102));
        jKanan.setPreferredSize(new java.awt.Dimension(169, 440));

        jButton3.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mikado\\Documents\\NetBeansProjects\\Visual_B_1515015076_783727\\1489755001_Home.png")); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mikado\\Documents\\NetBeansProjects\\Visual_B_1515015076_783727\\1489756908_teacher_writing_on_board.png")); // NOI18N
        jButton4.setText("Math");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\mikado\\Documents\\NetBeansProjects\\Visual_B_1515015076_783727\\Door-Exit-Sign-Out-128_Fotor.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jKananLayout = new javax.swing.GroupLayout(jKanan);
        jKanan.setLayout(jKananLayout);
        jKananLayout.setHorizontalGroup(
            jKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKananLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jKananLayout.setVerticalGroup(
            jKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKananLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(jKanan, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Roda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roda4ActionPerformed
        // TODO add your handling code here:
        hargaParkir.setText("5000");
        jamMasuk.setText("08.00 WITA");
    }//GEN-LAST:event_Roda4ActionPerformed

    private void NoKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoKendaraanActionPerformed

    private void jamMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamMasukActionPerformed

    private void lamaParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaParkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaParkirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int c = Integer.parseInt(hargaParkir.getText());
        int d = Integer.parseInt(lamaParkir.getText());
        int hasilnya = c*d;
        totalBayar.setText("Rp. "+hasilnya);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NoKendaraan.setText("");
        jamMasuk.setText("");
        lamaParkir.setText("");
        hargaParkir.setText("");
        totalBayar.setText("");
        Roda2.setSelected(false);
        Roda4.setSelected(false);
        Roda2.setEnabled(true);
        Roda4.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBayarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTengah.setVisible(true);
        jKiri.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTengah.setVisible(false);
        jKiri.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void hargaParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaParkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaParkirActionPerformed

    private void Roda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roda2ActionPerformed
        // TODO add your handling code here:
        hargaParkir.setText("2000");
        jamMasuk.setText("08.00 WITA");
    }//GEN-LAST:event_Roda2ActionPerformed

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
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoKendaraan;
    private javax.swing.JRadioButton Roda2;
    private javax.swing.JRadioButton Roda4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hargaParkir;
    private javax.swing.JPanel jAtas;
    private javax.swing.JPanel jBawah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jKanan;
    private javax.swing.JPanel jKiri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jTengah;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jamMasuk;
    private javax.swing.JTextField lamaParkir;
    private javax.swing.JTextField totalBayar;
    // End of variables declaration//GEN-END:variables
}