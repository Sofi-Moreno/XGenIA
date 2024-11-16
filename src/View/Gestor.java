/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Riarb
 */
public class Gestor extends javax.swing.JFrame {

    /**
     * Creates new form Gestor
     */
    public Gestor() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gestionarButtom = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gestionarButtom1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        gestionarButtom2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        gestionarButtom3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTOR DE MEDICAMENTOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gestionarButtom.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarButtomMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CREAR MEDICAMENTO");

        javax.swing.GroupLayout gestionarButtomLayout = new javax.swing.GroupLayout(gestionarButtom);
        gestionarButtom.setLayout(gestionarButtomLayout);
        gestionarButtomLayout.setHorizontalGroup(
            gestionarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtomLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(45, 45, 45))
        );
        gestionarButtomLayout.setVerticalGroup(
            gestionarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtomLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gestionarButtom1.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarButtom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarButtom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarButtom1MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODIFICAR MEDICAMENTO");

        javax.swing.GroupLayout gestionarButtom1Layout = new javax.swing.GroupLayout(gestionarButtom1);
        gestionarButtom1.setLayout(gestionarButtom1Layout);
        gestionarButtom1Layout.setHorizontalGroup(
            gestionarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );
        gestionarButtom1Layout.setVerticalGroup(
            gestionarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gestionarButtom2.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarButtom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarButtom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarButtom2MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ELIMINAR MEDICAMENTO");

        javax.swing.GroupLayout gestionarButtom2Layout = new javax.swing.GroupLayout(gestionarButtom2);
        gestionarButtom2.setLayout(gestionarButtom2Layout);
        gestionarButtom2Layout.setHorizontalGroup(
            gestionarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );
        gestionarButtom2Layout.setVerticalGroup(
            gestionarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        gestionarButtom3.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarButtom3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarButtom3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarButtom3MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ojo blanco.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VER MEDICAMENTO");

        javax.swing.GroupLayout gestionarButtom3Layout = new javax.swing.GroupLayout(gestionarButtom3);
        gestionarButtom3.setLayout(gestionarButtom3Layout);
        gestionarButtom3Layout.setHorizontalGroup(
            gestionarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(gestionarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gestionarButtom3Layout.setVerticalGroup(
            gestionarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 690, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/una ciudad minimalista en estilo de dibujo con color rosa en dimensiones de 150x150.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 780, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtomMouseClicked

    private void gestionarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseEntered
        gestionarButtom.setBackground(Color.pink);
    }//GEN-LAST:event_gestionarButtomMouseEntered

    private void gestionarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseExited
        gestionarButtom.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_gestionarButtomMouseExited

    private void gestionarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom1MouseClicked

    private void gestionarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom1MouseEntered

    private void gestionarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom1MouseExited

    private void gestionarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom2MouseClicked

    private void gestionarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom2MouseEntered

    private void gestionarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom2MouseExited

    private void gestionarButtom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom3MouseClicked

    private void gestionarButtom3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom3MouseEntered

    private void gestionarButtom3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarButtom3MouseExited

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
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gestionarButtom;
    private javax.swing.JPanel gestionarButtom1;
    private javax.swing.JPanel gestionarButtom2;
    private javax.swing.JPanel gestionarButtom3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
