/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suma;

/**
 *
 * @author HP
 */
public class E5_Window extends javax.swing.JFrame {

    /**
     * Creates new form E5_Window
     */
    public E5_Window() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcalcular = new javax.swing.JButton();
        txtnuevo = new javax.swing.JButton();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtn3 = new javax.swing.JTextField();
        txtn4 = new javax.swing.JTextField();
        txtn5 = new javax.swing.JTextField();
        txtn6 = new javax.swing.JTextField();
        txtn7 = new javax.swing.JTextField();
        txtn8 = new javax.swing.JTextField();
        txtn9 = new javax.swing.JTextField();
        txtn10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduce el primer numero:");

        jLabel2.setText("Introcuce el segundo numero:");

        txtcalcular.setText("Calcular");
        txtcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalcularActionPerformed(evt);
            }
        });

        txtnuevo.setText("Nuevo");
        txtnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevoActionPerformed(evt);
            }
        });

        txtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtn1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Introduce el tercer numero:");

        jLabel4.setText("Introduce el cuarto numero:");

        jLabel5.setText("Introduce el quinto numero:");

        jLabel6.setText("Introduce el sexto numero:");

        jLabel7.setText("Introduce el septimo numero:");

        jLabel8.setText("Introduce el octavo numero:");

        jLabel9.setText("Introduce el noveno numero:");

        jLabel10.setText("Introduce el decimo numero:");

        txtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtn4ActionPerformed(evt);
            }
        });

        jLabel11.setText("El Resultado es:");

        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(txtcalcular)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(9, 9, 9)))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtn1)
                            .addComponent(txtn2)
                            .addComponent(txtn3)
                            .addComponent(txtn4)
                            .addComponent(txtn5)
                            .addComponent(txtn6)
                            .addComponent(txtn7)
                            .addComponent(txtn8)
                            .addComponent(txtn9)
                            .addComponent(txtn10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtnuevo))
                            .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcalcular)
                    .addComponent(txtnuevo))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtn4ActionPerformed

    private void txtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtn1ActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultadoActionPerformed

    private void txtnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevoActionPerformed
        // TODO add your handling code here:+
        txtn1.setText("");
        txtn2.setText("");
        txtn3.setText("");
        txtn4.setText("");
        txtn5.setText("");
        txtn6.setText("");
        txtn7.setText("");
        txtn8.setText("");
        txtn9.setText("");
        txtn10.setText("");
        txtresultado.setText("");
        
    }//GEN-LAST:event_txtnuevoActionPerformed

    private void txtcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalcularActionPerformed
        // Declaracion de variables:
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int s = 0;
        // TODO add your handling code here:
        
        n1 = Integer.parseInt(txtn1.getText());
        n2 = Integer.parseInt(txtn2.getText());
        n3 = Integer.parseInt(txtn3.getText());
        n4 = Integer.parseInt(txtn4.getText());
        n5 = Integer.parseInt(txtn5.getText());
        n6 = Integer.parseInt(txtn6.getText());
        n7 = Integer.parseInt(txtn7.getText());
        n8 = Integer.parseInt(txtn8.getText());
        n9 = Integer.parseInt(txtn9.getText());
        n10 = Integer.parseInt(txtn10.getText());
        
        
        for (int  i=1; i <= 10; i++) {
            
          s = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
        }
        txtresultado.setText(String.valueOf(s));  
    }//GEN-LAST:event_txtcalcularActionPerformed

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
            java.util.logging.Logger.getLogger(E5_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E5_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E5_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E5_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E5_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton txtcalcular;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn10;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtn3;
    private javax.swing.JTextField txtn4;
    private javax.swing.JTextField txtn5;
    private javax.swing.JTextField txtn6;
    private javax.swing.JTextField txtn7;
    private javax.swing.JTextField txtn8;
    private javax.swing.JTextField txtn9;
    private javax.swing.JButton txtnuevo;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
