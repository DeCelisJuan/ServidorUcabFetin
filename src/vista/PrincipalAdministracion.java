package vista;

import controlador.conexionSQL;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author DrowSoft
 */
public class PrincipalAdministracion extends javax.swing.JFrame {

    public PrincipalAdministracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelTitulo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Administracion = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonReportes = new javax.swing.JButton();
        botonEmpleados = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Administracion.setMaximumSize(new java.awt.Dimension(700, 450));
        Administracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Administración de UcabFetin");
        Administracion.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 60));

        botonReportes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonReportes.setForeground(new java.awt.Color(255, 255, 255));
        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/reportes.png"))); // NOI18N
        botonReportes.setText("Generar reportes");
        botonReportes.setBorder(null);
        botonReportes.setContentAreaFilled(false);
        botonReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonReportesMouseExited(evt);
            }
        });
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });
        Administracion.add(botonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, 90));

        botonEmpleados.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        botonEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/empleados.png"))); // NOI18N
        botonEmpleados.setText("Gestión de usuarios");
        botonEmpleados.setBorder(null);
        botonEmpleados.setContentAreaFilled(false);
        botonEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEmpleadosMouseExited(evt);
            }
        });
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });
        Administracion.add(botonEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 300, 90));

        botonProductos.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/inventario.png"))); // NOI18N
        botonProductos.setText("Gestión de productos");
        botonProductos.setBorder(null);
        botonProductos.setContentAreaFilled(false);
        botonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProductosMouseExited(evt);
            }
        });
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });
        Administracion.add(botonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 90));

        botonSalir.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonSalir.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.setContentAreaFilled(false);
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        Administracion.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 100, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        Administracion.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(Administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));
        Administracion.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseEntered
        botonProductos.setContentAreaFilled(true); botonProductos.setForeground(Color.black);
    }//GEN-LAST:event_botonProductosMouseEntered

    private void botonProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseExited
        botonProductos.setContentAreaFilled(false); botonProductos.setForeground(Color.white);
    }//GEN-LAST:event_botonProductosMouseExited

    private void botonEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpleadosMouseEntered
        botonEmpleados.setContentAreaFilled(true); botonEmpleados.setForeground(Color.black);
    }//GEN-LAST:event_botonEmpleadosMouseEntered

    private void botonEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpleadosMouseExited
        botonEmpleados.setContentAreaFilled(false); botonEmpleados.setForeground(Color.white);
    }//GEN-LAST:event_botonEmpleadosMouseExited

    private void botonReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReportesMouseEntered
        botonReportes.setContentAreaFilled(true); botonReportes.setForeground(Color.black);
    }//GEN-LAST:event_botonReportesMouseEntered

    private void botonReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReportesMouseExited
        botonReportes.setContentAreaFilled(false); botonReportes.setForeground(Color.white);
    }//GEN-LAST:event_botonReportesMouseExited

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setContentAreaFilled(true); botonSalir.setForeground(Color.black);
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setContentAreaFilled(false); botonSalir.setForeground(Color.white);
    }//GEN-LAST:event_botonSalirMouseExited

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        String mensaje= conexionSQL.comprobarConexionBDD();
        if (mensaje.equals("Conexion establecida")){
            Inventario obj = new Inventario();
            obj.setVisible(true);
            this.dispose();
        }else{JOptionPane.showMessageDialog(null, mensaje);}
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        String mensaje= conexionSQL.comprobarConexionBDD();
        if (mensaje.equals("Conexion establecida")){
            GestionUsarios obj = new GestionUsarios();
            obj.setVisible(true);
            this.dispose();
        }else{JOptionPane.showMessageDialog(null, mensaje);}
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        GestionReportes obj = new GestionReportes();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonReportesActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Administracion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonEmpleados;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
