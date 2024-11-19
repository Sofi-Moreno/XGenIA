/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Riarb
 */
public class NoRefrigerado extends javax.swing.JFrame {

    /**
     * Creates new form NoRefrigerado
     */
    public NoRefrigerado() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        this.setResizable(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        almacenamientoTxt1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        almacenamientoTxt2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        almacenamientoTxt3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        guardarButtom = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEDICAMENTOS NO REFRIERADOS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/volver.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        codigoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        codigoLabel.setText("LUGARES DE ALMACENAMIENTO");

        almacenamientoTxt1.setBackground(new java.awt.Color(255, 204, 204));
        almacenamientoTxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        almacenamientoTxt1.setForeground(new java.awt.Color(153, 153, 153));
        almacenamientoTxt1.setText("Ingrese un lugar para almacenar el medicamento");
        almacenamientoTxt1.setToolTipText("");
        almacenamientoTxt1.setBorder(null);
        almacenamientoTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                almacenamientoTxt1MousePressed(evt);
            }
        });
        almacenamientoTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenamientoTxt1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        almacenamientoTxt2.setBackground(new java.awt.Color(255, 204, 204));
        almacenamientoTxt2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        almacenamientoTxt2.setForeground(new java.awt.Color(153, 153, 153));
        almacenamientoTxt2.setText("Ingrese un lugar para almacenar el medicamento");
        almacenamientoTxt2.setToolTipText("");
        almacenamientoTxt2.setBorder(null);
        almacenamientoTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                almacenamientoTxt2MousePressed(evt);
            }
        });
        almacenamientoTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenamientoTxt2ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        almacenamientoTxt3.setBackground(new java.awt.Color(255, 204, 204));
        almacenamientoTxt3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        almacenamientoTxt3.setForeground(new java.awt.Color(153, 153, 153));
        almacenamientoTxt3.setText("Ingrese un lugar para almacenar el medicamento");
        almacenamientoTxt3.setToolTipText("");
        almacenamientoTxt3.setBorder(null);
        almacenamientoTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                almacenamientoTxt3MousePressed(evt);
            }
        });
        almacenamientoTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenamientoTxt3ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        guardarButtom.setBackground(new java.awt.Color(255, 153, 204));
        guardarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarButtomMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("GUARDAR");

        javax.swing.GroupLayout guardarButtomLayout = new javax.swing.GroupLayout(guardarButtom);
        guardarButtom.setLayout(guardarButtomLayout);
        guardarButtomLayout.setHorizontalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarButtomLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel15)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        guardarButtomLayout.setVerticalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarButtomLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almacenamientoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almacenamientoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel)
                    .addComponent(almacenamientoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(codigoLabel)
                .addGap(18, 18, 18)
                .addComponent(almacenamientoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almacenamientoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almacenamientoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(guardarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 650, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/una ciudad minimalista en estilo de dibujo con color rosa en dimensiones de 150x150.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void almacenamientoTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenamientoTxt1MousePressed
        if (almacenamientoTxt1.getText().equals("Ingrese un lugar para almacenar el medicamento")){
            almacenamientoTxt1.setText("");
            almacenamientoTxt1.setForeground(Color.black);
        }
        if (almacenamientoTxt2.getText().isEmpty()){
            almacenamientoTxt2.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt2.setForeground(new Color(153,153,153));
        }
        if (almacenamientoTxt3.getText().isEmpty()){
            almacenamientoTxt3.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_almacenamientoTxt1MousePressed

    private void almacenamientoTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenamientoTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenamientoTxt1ActionPerformed

    private void almacenamientoTxt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenamientoTxt2MousePressed
        if (almacenamientoTxt2.getText().equals("Ingrese un lugar para almacenar el medicamento")){
            almacenamientoTxt2.setText("");
            almacenamientoTxt2.setForeground(Color.black);
        }
        if (almacenamientoTxt1.getText().isEmpty()){
            almacenamientoTxt1.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt1.setForeground(new Color(153,153,153));
        }
        if (almacenamientoTxt3.getText().isEmpty()){
            almacenamientoTxt3.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_almacenamientoTxt2MousePressed

    private void almacenamientoTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenamientoTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenamientoTxt2ActionPerformed

    private void almacenamientoTxt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenamientoTxt3MousePressed
        if (almacenamientoTxt3.getText().equals("Ingrese un lugar para almacenar el medicamento")){
            almacenamientoTxt3.setText("");
            almacenamientoTxt3.setForeground(Color.black);
        }
        if (almacenamientoTxt2.getText().isEmpty()){
            almacenamientoTxt2.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt2.setForeground(new Color(153,153,153));
        }
        if (almacenamientoTxt1.getText().isEmpty()){
            almacenamientoTxt1.setText("Ingrese un lugar para almacenar el medicamento");
            almacenamientoTxt1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_almacenamientoTxt3MousePressed

    private void almacenamientoTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenamientoTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenamientoTxt3ActionPerformed

    private void guardarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseClicked
        crearMedicamento ventana = new crearMedicamento();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_guardarButtomMouseClicked

    private void guardarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseEntered
        guardarButtom.setBackground(Color.pink);
    }//GEN-LAST:event_guardarButtomMouseEntered

    private void guardarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseExited
        guardarButtom.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_guardarButtomMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        crearMedicamento ventana = new crearMedicamento();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(NoRefrigerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoRefrigerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoRefrigerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoRefrigerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoRefrigerado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacenamientoTxt1;
    private javax.swing.JTextField almacenamientoTxt2;
    private javax.swing.JTextField almacenamientoTxt3;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JPanel guardarButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}