/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai20_Giaiptbac2 extends javax.swing.JFrame {

    /**
     * Creates new form Bai20_Giaiptbac2
     */
    public Bai20_Giaiptbac2() {
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

        lblgiaiptbac2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        lblketqua = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        btntinh = new javax.swing.JButton();
        lblc = new javax.swing.JLabel();
        txtketqua1 = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        lblkq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblgiaiptbac2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Giải Phương trình bậc 2");

        lbla.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbla.setText("Nhập a");

        lblb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblb.setText("Nhập b");

        lblketqua.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblketqua.setText("Kết quả");

        btntinh.setText("Tính");
        btntinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntinhActionPerformed(evt);
            }
        });

        lblc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblc.setText("Nhập c");

        javax.swing.GroupLayout lblgiaiptbac2Layout = new javax.swing.GroupLayout(lblgiaiptbac2);
        lblgiaiptbac2.setLayout(lblgiaiptbac2Layout);
        lblgiaiptbac2Layout.setHorizontalGroup(
            lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                                    .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblb)
                                        .addComponent(lbla))
                                    .addGap(18, 18, 18)
                                    .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                                            .addGap(0, 1, Short.MAX_VALUE)
                                            .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblgiaiptbac2Layout.createSequentialGroup()
                                    .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblkq)
                                        .addComponent(lblketqua))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtketqua1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btntinh, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                                    .addComponent(lblc)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        lblgiaiptbac2Layout.setVerticalGroup(
            lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgiaiptbac2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbla)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblb)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblc)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(lblgiaiptbac2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblketqua)
                    .addComponent(txtketqua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblkq)
                .addGap(18, 18, 18)
                .addComponent(btntinh)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblgiaiptbac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblgiaiptbac2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblgiaiptbac2.getAccessibleContext().setAccessibleName("lblgiaiptbac2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntinhActionPerformed
        double soa = Double.parseDouble(txta.getText());
        double sob = Double.parseDouble(txtb.getText());
        double soc = Double.parseDouble(txtc.getText());
        double delta, x1, x2;
        
        if(soa == 0)
            if(sob == 0)
                if(soc != 0){
                    txtc.setText("PT vo nghiem");
                }
                else {
                    txtc.setText("PT co vo so nghiem");
                }
            else {
                txtc.setText("PT co nghiem x1 = x2 = " + (-soc / sob));
            }
        else {
            delta = sob * sob - 4 * soa * soc;
            if (delta < 0)
                txtc.setText("PT vo nghiem");
            else {
                if (delta == 0)
                    txtc.setText("PT co nghiem " + ((-sob) / (2 * soa)));
                else {
                    x1 = (-sob + Math.sqrt(delta)) / (2 * soa);
                    x2 = (-sob - Math.sqrt(delta)) / (2 * soa);
                    txtc.setText("PT có 2 nghiệm phân biệt: + x1 = " + x1 + ", x2 = "  + x2);
                    lblkq.setText("<html>PT có 2 nghiệm <br>x1 = " + x1 + " <br>x2 = " + x2 + "</html>");
                }
            }
        }    
    }//GEN-LAST:event_btntinhActionPerformed

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
            java.util.logging.Logger.getLogger(Bai20_Giaiptbac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai20_Giaiptbac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai20_Giaiptbac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai20_Giaiptbac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai20_Giaiptbac2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JLabel lblc;
    private javax.swing.JPanel lblgiaiptbac2;
    private javax.swing.JLabel lblketqua;
    private javax.swing.JLabel lblkq;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtketqua1;
    // End of variables declaration//GEN-END:variables
}
