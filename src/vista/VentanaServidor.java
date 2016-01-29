package vista;

import controlador.Conexion;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author DrowSoft
 */
public class VentanaServidor extends javax.swing.JFrame {
    
    Conexion serv = new Conexion();
    hiloServidor servidor = new hiloServidor();

    public VentanaServidor() {
        initComponents();
        this.setLocationRelativeTo(null);
        servidor.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAdministrador = new javax.swing.JButton();
        botonApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAdministrador.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        botonAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        botonAdministrador.setText("Administrador");
        botonAdministrador.setBorder(null);
        botonAdministrador.setContentAreaFilled(false);
        botonAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAdministradorMouseExited(evt);
            }
        });
        botonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        botonApagar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        botonApagar.setForeground(new java.awt.Color(255, 255, 255));
        botonApagar.setText("Apagar Servidor");
        botonApagar.setBorder(null);
        botonApagar.setContentAreaFilled(false);
        botonApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonApagarMouseExited(evt);
            }
        });
        botonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(botonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministradorMouseEntered
        botonAdministrador.setContentAreaFilled(true); botonAdministrador.setForeground(Color.black);
    }//GEN-LAST:event_botonAdministradorMouseEntered

    private void botonAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministradorMouseExited
        botonAdministrador.setContentAreaFilled(false); botonAdministrador.setForeground(Color.white);
    }//GEN-LAST:event_botonAdministradorMouseExited

    private void botonApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonApagarMouseEntered
        botonApagar.setContentAreaFilled(true); botonApagar.setForeground(Color.black);
    }//GEN-LAST:event_botonApagarMouseEntered

    private void botonApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonApagarMouseExited
        botonApagar.setContentAreaFilled(false); botonApagar.setForeground(Color.white);
    }//GEN-LAST:event_botonApagarMouseExited

    private void botonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministradorActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
    }//GEN-LAST:event_botonAdministradorActionPerformed

    private void botonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApagarActionPerformed
        try {
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("Cerrar");
        } catch (IOException ex) {
            Logger.getLogger(VentanaServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_botonApagarActionPerformed

    public class hiloServidor extends Thread{
        public void run(){
            serv.iniciarServidor();
        }
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
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrador;
    private javax.swing.JButton botonApagar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
