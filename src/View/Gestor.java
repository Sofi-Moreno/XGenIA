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
public class Gestor extends javax.swing.JFrame {

    /**
     * Creates new form Gestor
     */
    public Gestor() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/logo.png")).getImage());
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
        volverButtom = new javax.swing.JLabel();
        gestionarButtom = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gestionarButtom1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gestionarButtom2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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

        volverButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/volver.png"))); // NOI18N
        volverButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtomMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(volverButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(volverButtom)
                        .addGap(33, 33, 33))))
        );

        gestionarButtom.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar.png"))); // NOI18N

        javax.swing.GroupLayout gestionarButtomLayout = new javax.swing.GroupLayout(gestionarButtom);
        gestionarButtom.setLayout(gestionarButtomLayout);
        gestionarButtomLayout.setHorizontalGroup(
            gestionarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtomLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(gestionarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtomLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtomLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14))))
        );
        gestionarButtomLayout.setVerticalGroup(
            gestionarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        gestionarButtom1.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EDITAR.png"))); // NOI18N

        javax.swing.GroupLayout gestionarButtom1Layout = new javax.swing.GroupLayout(gestionarButtom1);
        gestionarButtom1.setLayout(gestionarButtom1Layout);
        gestionarButtom1Layout.setHorizontalGroup(
            gestionarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(gestionarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64))))
        );
        gestionarButtom1Layout.setVerticalGroup(
            gestionarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gestionarButtom2.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PAPELERA.png"))); // NOI18N

        javax.swing.GroupLayout gestionarButtom2Layout = new javax.swing.GroupLayout(gestionarButtom2);
        gestionarButtom2.setLayout(gestionarButtom2Layout);
        gestionarButtom2Layout.setHorizontalGroup(
            gestionarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gestionarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarButtom2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(59, 59, 59))))
        );
        gestionarButtom2Layout.setVerticalGroup(
            gestionarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gestionarButtom3.setBackground(new java.awt.Color(255, 153, 204));
        gestionarButtom3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(29, 29, 29)
                .addGroup(gestionarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gestionarButtom3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gestionarButtom3Layout.setVerticalGroup(
            gestionarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarButtom3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gestionarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestionarButtom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestionarButtom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionarButtom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 690, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/una ciudad minimalista en estilo de dibujo con color rosa en dimensiones de 150x150.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseClicked
        crearMedicamento menu = new crearMedicamento();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionarButtomMouseClicked

    private void gestionarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseEntered
        gestionarButtom.setBackground(Color.pink);
    }//GEN-LAST:event_gestionarButtomMouseEntered

    private void gestionarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtomMouseExited
        gestionarButtom.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_gestionarButtomMouseExited

    private void gestionarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseClicked
        ModificarMedicamento menu = new ModificarMedicamento();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionarButtom1MouseClicked

    private void gestionarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseEntered
        gestionarButtom1.setBackground(Color.pink);
    }//GEN-LAST:event_gestionarButtom1MouseEntered

    private void gestionarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom1MouseExited
        gestionarButtom1.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_gestionarButtom1MouseExited

    private void gestionarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseClicked
        EliminarMedicamento menu = new EliminarMedicamento();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionarButtom2MouseClicked

    private void gestionarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseEntered
        gestionarButtom2.setBackground(Color.pink);
    }//GEN-LAST:event_gestionarButtom2MouseEntered

    private void gestionarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom2MouseExited
        gestionarButtom2.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_gestionarButtom2MouseExited

    private void gestionarButtom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseClicked
        VerMedicamento menu = new VerMedicamento();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionarButtom3MouseClicked

    private void gestionarButtom3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseEntered
        gestionarButtom3.setBackground(Color.pink);
    }//GEN-LAST:event_gestionarButtom3MouseEntered

    private void gestionarButtom3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtom3MouseExited
        gestionarButtom3.setBackground(new Color(255, 153, 204));
    }//GEN-LAST:event_gestionarButtom3MouseExited

    private void volverButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtomMouseClicked
        
    }//GEN-LAST:event_volverButtomMouseClicked

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel volverButtom;
    // End of variables declaration//GEN-END:variables
}
