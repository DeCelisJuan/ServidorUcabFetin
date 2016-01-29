package vista;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author DrowSoft
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        passContraseña = new javax.swing.JPasswordField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 30));

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 30));

        textUsuario.setText("admin");
        panelPrincipal.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 240, 25));

        botonSalir.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        botonSalir.setText("Entrar");
        botonSalir.setBorder(null);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        panelPrincipal.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, 40));

        botonCancelar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonX.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
        });
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, 40));

        passContraseña.setText("1234");
        panelPrincipal.add(passContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, 25));

        labelFondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/Fondo2.jpg"))); // NOI18N
        panelPrincipal.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setContentAreaFilled(true); botonSalir.setForeground(Color.black);
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setContentAreaFilled(false); botonSalir.setForeground(Color.white);
    }//GEN-LAST:event_botonSalirMouseExited

    private void botonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseEntered
        botonCancelar.setContentAreaFilled(true); botonCancelar.setForeground(Color.black);
    }//GEN-LAST:event_botonCancelarMouseEntered

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        botonCancelar.setContentAreaFilled(false); botonCancelar.setForeground(Color.white);
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        if (!textUsuario.getText().equals("")&&!passContraseña.getText().equals("")){
            if (textUsuario.getText().equals("admin")&&passContraseña.getText().equals("1234")){
                PrincipalAdministracion obj = new PrincipalAdministracion();
                obj.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField passContraseña;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
