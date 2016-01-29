package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import controlador.Validaciones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.Empleado;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import controlador.controlBotonLabel;
import controlador.InterfazGestionUsuarios;
import controlador.conexionSQL;

/**
 * @author DrowSoft
 */
public class GestionUsarios extends javax.swing.JFrame {

   private controlador.Validaciones validar = new Validaciones(); //Para todas las validaciones necesarias...
   private InterfazGestionUsuarios control = new InterfazGestionUsuarios();//Para controlar los procedimientos necesarios de la interfaz
   private controlBotonLabel controlBL = new controlBotonLabel();//Para controlar los botones y label
   private Empleado empActual; //Para manipular datos referidos a los empleados
   private boolean edit=false//*Para saber si se esta editando
                   ,ver=false//*Para saber si esta viendo o modificando
                   ,cambioImagen=false;//Para saber si la imagen por defecto fue cambiada
   File fichero,ficheroDestino;//Para guardar la imagen del empleado en las carpetas del proyecto
   
    public GestionUsarios() {
        initComponents(); //inicializa todos los componentes de la interfaz
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla
        //Se colocan los paneles que no se desean mostrar en el inicio en false
        panelEliminar.setVisible(false);registroUsuario.setVisible(false);regDatosUsuario.setVisible(false);
        panelPregEscrita.setVisible(false);panelEmpEliminados.setVisible(false);
        //Se llena la tabla... ver el procedimiento para entender porque los parámetros
        control.llenarTabla("Todos","",tablaEmpleados);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroUsuario = new javax.swing.JPanel();
        regDatosUsuario = new javax.swing.JPanel();
        labelTitulo6 = new javax.swing.JLabel();
        labelNick = new javax.swing.JLabel();
        textNick = new javax.swing.JTextField();
        labelContraseña = new javax.swing.JLabel();
        textContraseña = new javax.swing.JTextField();
        labelPreguntaS = new javax.swing.JLabel();
        boxPregSecreta = new javax.swing.JComboBox<>();
        labelRespuestaS = new javax.swing.JLabel();
        textRespuestaS = new javax.swing.JTextField();
        labelDatUsuarioU = new javax.swing.JLabel();
        labelDatPersonalesU = new javax.swing.JLabel();
        panelPregEscrita = new javax.swing.JPanel();
        labelPreguntaS1 = new javax.swing.JLabel();
        textPregSecreta = new javax.swing.JTextField();
        regDatosPersonales = new javax.swing.JPanel();
        labelTitulo5 = new javax.swing.JLabel();
        botonAgrImagen = new javax.swing.JButton();
        labelImagenPerfil = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        textApellido = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        labelSexo = new javax.swing.JLabel();
        checkF = new javax.swing.JCheckBox();
        checkM = new javax.swing.JCheckBox();
        labelNacimiento = new javax.swing.JLabel();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        labelSueldo = new javax.swing.JLabel();
        textSueldo = new javax.swing.JTextField();
        labelCargo = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        labelDatPersonalesP = new javax.swing.JLabel();
        labelDatUsuarioP = new javax.swing.JLabel();
        btnRegresarReg = new javax.swing.JButton();
        btnAceptarReg = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        labelTitulo1 = new javax.swing.JLabel();
        boxBuscar = new javax.swing.JComboBox<>();
        textBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        botonVerEliminados = new javax.swing.JButton();
        panelEmpEliminados = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEliminados = new javax.swing.JTable();
        botonRegre = new javax.swing.JButton();
        botonActivar = new javax.swing.JButton();
        panelEliminar = new javax.swing.JPanel();
        labelTitulo3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaRazon = new javax.swing.JTextArea();
        botonCancelarEli = new javax.swing.JButton();
        botonEliminarDefi = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonVer = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regDatosUsuario.setOpaque(false);
        regDatosUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo6.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo6.setText("Registro de usuarios:");
        regDatosUsuario.add(labelTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 50));

        labelNick.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNick.setForeground(new java.awt.Color(255, 255, 255));
        labelNick.setText("Nick:");
        regDatosUsuario.add(labelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 30));

        textNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNickKeyTyped(evt);
            }
        });
        regDatosUsuario.add(textNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 30));

        labelContraseña.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        labelContraseña.setText("Contraseña:");
        regDatosUsuario.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 30));
        regDatosUsuario.add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 30));

        labelPreguntaS.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelPreguntaS.setForeground(new java.awt.Color(255, 255, 255));
        labelPreguntaS.setText("Pregunta secreta:");
        regDatosUsuario.add(labelPreguntaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, 30));

        boxPregSecreta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        boxPregSecreta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Nombre de tu primera mascota?", "¿Cuál es tu comida preferida?", "¿Lugar de nacimiento de la madre?", "Escribir otra pregunta..." }));
        boxPregSecreta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPregSecretaItemStateChanged(evt);
            }
        });
        regDatosUsuario.add(boxPregSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 30));

        labelRespuestaS.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelRespuestaS.setForeground(new java.awt.Color(255, 255, 255));
        labelRespuestaS.setText("Respuesta secreta:");
        regDatosUsuario.add(labelRespuestaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 30));

        textRespuestaS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRespuestaSKeyTyped(evt);
            }
        });
        regDatosUsuario.add(textRespuestaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 30));

        labelDatUsuarioU.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 20)); // NOI18N
        labelDatUsuarioU.setForeground(new java.awt.Color(255, 255, 255));
        labelDatUsuarioU.setText("Datos de Usuario");
        regDatosUsuario.add(labelDatUsuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 160, 50));

        labelDatPersonalesU.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 20)); // NOI18N
        labelDatPersonalesU.setForeground(new java.awt.Color(255, 255, 255));
        labelDatPersonalesU.setText("Datos Personales");
        labelDatPersonalesU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDatPersonalesU.setEnabled(false);
        labelDatPersonalesU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDatPersonalesUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDatPersonalesUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDatPersonalesUMouseExited(evt);
            }
        });
        regDatosUsuario.add(labelDatPersonalesU, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 160, 50));

        panelPregEscrita.setOpaque(false);
        panelPregEscrita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPreguntaS1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelPreguntaS1.setForeground(new java.awt.Color(255, 255, 255));
        labelPreguntaS1.setText("Pregunta secreta:");
        panelPregEscrita.add(labelPreguntaS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 30));
        panelPregEscrita.add(textPregSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 30));

        regDatosUsuario.add(panelPregEscrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 310, 80));

        registroUsuario.add(regDatosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        regDatosPersonales.setOpaque(false);
        regDatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo5.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo5.setText("Registro de usuarios:");
        regDatosPersonales.add(labelTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 50));

        botonAgrImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/agregarPequeño.png"))); // NOI18N
        botonAgrImagen.setBorder(null);
        botonAgrImagen.setContentAreaFilled(false);
        botonAgrImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgrImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgrImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgrImagenMouseExited(evt);
            }
        });
        botonAgrImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgrImagenActionPerformed(evt);
            }
        });
        regDatosPersonales.add(botonAgrImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 30, 30));

        labelImagenPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagenPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empleados/usuarioHombre.png"))); // NOI18N
        regDatosPersonales.add(labelImagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 120));

        labelNombre.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre:");
        regDatosPersonales.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 30));

        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });
        regDatosPersonales.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 30));

        labelApellido.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelApellido.setForeground(new java.awt.Color(255, 255, 255));
        labelApellido.setText("Apellido:");
        regDatosPersonales.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 280, 30));

        textApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textApellidoKeyTyped(evt);
            }
        });
        regDatosPersonales.add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 30));

        labelCedula.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCedula.setForeground(new java.awt.Color(255, 255, 255));
        labelCedula.setText("Cédula:");
        regDatosPersonales.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 30));

        textCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCedulaKeyTyped(evt);
            }
        });
        regDatosPersonales.add(textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, 30));

        labelTelefono.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefono.setText("Teléfono:");
        regDatosPersonales.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, 30));

        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });
        regDatosPersonales.add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, 30));

        labelSexo.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(255, 255, 255));
        labelSexo.setText("Sexo:");
        regDatosPersonales.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 80, 30));

        checkF.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        checkF.setForeground(new java.awt.Color(255, 255, 255));
        checkF.setText("F");
        checkF.setOpaque(false);
        checkF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFActionPerformed(evt);
            }
        });
        regDatosPersonales.add(checkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 40, 30));

        checkM.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        checkM.setForeground(new java.awt.Color(255, 255, 255));
        checkM.setText("M");
        checkM.setOpaque(false);
        checkM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMActionPerformed(evt);
            }
        });
        regDatosPersonales.add(checkM, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 40, 30));

        labelNacimiento.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        labelNacimiento.setText("Fecha de nacimiento:");
        regDatosPersonales.add(labelNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 180, 30));
        regDatosPersonales.add(dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, 30));

        labelEmail.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email:");
        regDatosPersonales.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 260, 30));
        regDatosPersonales.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 280, 30));

        labelDireccion.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        labelDireccion.setText("Dirección:");
        regDatosPersonales.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 260, 30));
        regDatosPersonales.add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 280, 30));

        labelSueldo.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelSueldo.setForeground(new java.awt.Color(255, 255, 255));
        labelSueldo.setText("Sueldo base:");
        regDatosPersonales.add(labelSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, 30));

        textSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSueldoKeyTyped(evt);
            }
        });
        regDatosPersonales.add(textSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, 30));

        labelCargo.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(255, 255, 255));
        labelCargo.setText("Cargo:");
        regDatosPersonales.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 120, 30));

        boxCargo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Administrador", "Gerente" }));
        regDatosPersonales.add(boxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 120, 30));

        labelDatPersonalesP.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 20)); // NOI18N
        labelDatPersonalesP.setForeground(new java.awt.Color(255, 255, 255));
        labelDatPersonalesP.setText("Datos Personales");
        regDatosPersonales.add(labelDatPersonalesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 160, 50));

        labelDatUsuarioP.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 20)); // NOI18N
        labelDatUsuarioP.setForeground(new java.awt.Color(255, 255, 255));
        labelDatUsuarioP.setText("Datos de Usuario");
        labelDatUsuarioP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDatUsuarioP.setEnabled(false);
        labelDatUsuarioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDatUsuarioPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDatUsuarioPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDatUsuarioPMouseExited(evt);
            }
        });
        regDatosPersonales.add(labelDatUsuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 160, 50));

        registroUsuario.add(regDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        btnRegresarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnRegresarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonRegresar.png"))); // NOI18N
        btnRegresarReg.setText("Regresar");
        btnRegresarReg.setBorderPainted(false);
        btnRegresarReg.setContentAreaFilled(false);
        btnRegresarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarRegMouseExited(evt);
            }
        });
        btnRegresarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRegActionPerformed(evt);
            }
        });
        registroUsuario.add(btnRegresarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 391, -1, 40));

        btnAceptarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnAceptarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        btnAceptarReg.setText("Aceptar");
        btnAceptarReg.setBorderPainted(false);
        btnAceptarReg.setContentAreaFilled(false);
        btnAceptarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarRegMouseExited(evt);
            }
        });
        btnAceptarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegActionPerformed(evt);
            }
        });
        registroUsuario.add(btnAceptarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 391, 120, 40));

        botonEditar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 12)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Habilitar edición");
        botonEditar.setBorder(null);
        botonEditar.setContentAreaFilled(false);
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEditarMouseExited(evt);
            }
        });
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        registroUsuario.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 130, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(700, 400));
        fondo.setMinimumSize(new java.awt.Dimension(700, 400));
        fondo.setName(""); // NOI18N
        registroUsuario.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(registroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Gestión de empleados");
        principal.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 80));

        panelBuscar.setOpaque(false);
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Buscar empleado:");
        panelBuscar.add(labelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        boxBuscar.setFont(new java.awt.Font("PMingLiU-ExtB", 2, 12)); // NOI18N
        boxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombre" }));
        boxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBuscarActionPerformed(evt);
            }
        });
        panelBuscar.add(boxBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBuscarKeyTyped(evt);
            }
        });
        panelBuscar.add(textBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/buscar2.png"))); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelBuscar.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 30, 30));

        botonTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/lista2.png"))); // NOI18N
        botonTodos.setBorder(null);
        botonTodos.setContentAreaFilled(false);
        botonTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTodosMouseExited(evt);
            }
        });
        botonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodosActionPerformed(evt);
            }
        });
        panelBuscar.add(botonTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 20, 30));

        jScrollPane1.setBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setOpaque(false);

        tablaEmpleados.setBackground(new java.awt.Color(153, 204, 255));
        tablaEmpleados.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleados.setShowHorizontalLines(false);
        tablaEmpleados.setShowVerticalLines(false);
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaEmpleados);

        panelBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 200));

        botonVerEliminados.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        botonVerEliminados.setForeground(new java.awt.Color(255, 255, 255));
        botonVerEliminados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/verEliminado2.png"))); // NOI18N
        botonVerEliminados.setText("Ver empleados eliminados");
        botonVerEliminados.setBorder(null);
        botonVerEliminados.setContentAreaFilled(false);
        botonVerEliminados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerEliminados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVerEliminadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVerEliminadosMouseExited(evt);
            }
        });
        botonVerEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEliminadosActionPerformed(evt);
            }
        });
        panelBuscar.add(botonVerEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 40));

        principal.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 330, 340));

        panelEmpEliminados.setOpaque(false);
        panelEmpEliminados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo2.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        labelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo2.setText("Empleados eliminados:");
        panelEmpEliminados.add(labelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tablaEliminados.setAutoCreateRowSorter(true);
        tablaEliminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEliminados.setName(""); // NOI18N
        tablaEliminados.getTableHeader().setResizingAllowed(false);
        tablaEliminados.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaEliminados);

        panelEmpEliminados.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 190));

        botonRegre.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 12)); // NOI18N
        botonRegre.setForeground(new java.awt.Color(255, 255, 255));
        botonRegre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonRegresar.png"))); // NOI18N
        botonRegre.setText("Regresar");
        botonRegre.setBorder(null);
        botonRegre.setContentAreaFilled(false);
        botonRegre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegreMouseExited(evt);
            }
        });
        botonRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegreActionPerformed(evt);
            }
        });
        panelEmpEliminados.add(botonRegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 40));

        botonActivar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 12)); // NOI18N
        botonActivar.setForeground(new java.awt.Color(255, 255, 255));
        botonActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        botonActivar.setText("Activar");
        botonActivar.setBorder(null);
        botonActivar.setContentAreaFilled(false);
        botonActivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActivarMouseExited(evt);
            }
        });
        botonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActivarActionPerformed(evt);
            }
        });
        panelEmpEliminados.add(botonActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 40));

        principal.add(panelEmpEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 330, 340));

        panelEliminar.setOpaque(false);
        panelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo3.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo3.setText("Razón de eliminación:");
        panelEliminar.add(labelTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));

        areaRazon.setColumns(20);
        areaRazon.setLineWrap(true);
        areaRazon.setRows(5);
        areaRazon.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaRazon);

        panelEliminar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 210));

        botonCancelarEli.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        botonCancelarEli.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelarEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonX.png"))); // NOI18N
        botonCancelarEli.setText("Cancelar");
        botonCancelarEli.setBorder(null);
        botonCancelarEli.setContentAreaFilled(false);
        botonCancelarEli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCancelarEliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarEliMouseExited(evt);
            }
        });
        botonCancelarEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarEliActionPerformed(evt);
            }
        });
        panelEliminar.add(botonCancelarEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 40));

        botonEliminarDefi.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        botonEliminarDefi.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarDefi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        botonEliminarDefi.setText("Eliminar");
        botonEliminarDefi.setBorder(null);
        botonEliminarDefi.setContentAreaFilled(false);
        botonEliminarDefi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarDefiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarDefiMouseExited(evt);
            }
        });
        botonEliminarDefi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarDefiActionPerformed(evt);
            }
        });
        panelEliminar.add(botonEliminarDefi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 40));

        principal.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 300, 320));

        botonAgregar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonAgregar.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.setBorder(null);
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregar.setIconTextGap(10);
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        principal.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 80));

        botonVer.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonModificar.png"))); // NOI18N
        botonVer.setText("Ver Datos");
        botonVer.setBorder(null);
        botonVer.setContentAreaFilled(false);
        botonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVer.setIconTextGap(10);
        botonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVerMouseExited(evt);
            }
        });
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        principal.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 80));

        botonEliminar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonEliminar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.setIconTextGap(10);
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        principal.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, 80));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonRegresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        principal.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 40, 40));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        principal.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNickKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNickKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textNickKeyTyped

    private void textRespuestaSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRespuestaSKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textRespuestaSKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textNombreKeyTyped

    private void btnRegresarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRegActionPerformed
        if (campoLLeno()){
            if (!ver){
                if (edit){
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    if (JOptionPane. showConfirmDialog (null,  "¿Estás seguro? no se guardarán los cambios",  "ADVERTENCIA",JOptionPane. YES_NO_OPTION)  ==  JOptionPane. YES_OPTION) {
                        registroUsuario.setVisible(false); principal.setVisible(true); panelEliminar.setVisible(false); panelBuscar.setVisible(true);
                        vaciarCampos();regDatosPersonales.setVisible(true);  regDatosUsuario.setVisible(false);
                        cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
                    }
                }else{
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    if (JOptionPane. showConfirmDialog (null,  "¿Estás seguro? se borrarán los datos ya ingresados",  "ADVERTENCIA",JOptionPane. YES_NO_OPTION)  ==  JOptionPane. YES_OPTION) {
                        registroUsuario.setVisible(false); principal.setVisible(true); panelEliminar.setVisible(false); panelBuscar.setVisible(true);
                        vaciarCampos();regDatosPersonales.setVisible(true);  regDatosUsuario.setVisible(false);
                        cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
                    }
                }
            }else{
                registroUsuario.setVisible(false); principal.setVisible(true); panelEliminar.setVisible(false); panelBuscar.setVisible(true);
                vaciarCampos();regDatosPersonales.setVisible(true);  regDatosUsuario.setVisible(false);
                cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
            }
        }else{
            //Este boton es el que esta en el panel Registro de usuario, si le das se regresa al panel principal
            //asi que se ponen todos los paneles en false menos el principal y el buscar que se pone en true..
            registroUsuario.setVisible(false); principal.setVisible(true); panelEliminar.setVisible(false); panelBuscar.setVisible(true);
            //Se vacian los campos y se pone el panel regDatosPersonales en true y el regDatosUsuario  en false para que cuando 
            //vuelvas a entrar en ver datos los primeros que aparezcan sean los personales y no los de usuario
            vaciarCampos();regDatosPersonales.setVisible(true);  regDatosUsuario.setVisible(false);
            //cambioImagen false porque cuando entres la imagen que estara será la predeterminada y se coloca esta en el label...
            cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
        }
    }//GEN-LAST:event_btnRegresarRegActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //se colocan los paneles que estaban activos en false y se pone el de registrarUsuario en true y se vacian los campos
        registroUsuario.setVisible(true); principal.setVisible(false); vaciarCampos(); regDatosPersonales.setVisible(true); regDatosUsuario.setVisible(false);
        //Se activan los campos para poder introducir los datos, se quita el boton editar y el focus se manda al fondo...
        habiDesacCampos(true); botonEditar.setVisible(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarDefiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarDefiActionPerformed
        if (areaRazon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe escribir una razón");//No puedes eliminar si no escribes algo en el areaRazon
        }else{
            empActual.setObservaciones(areaRazon.getText());//Se agrega lo que escribiste en las observaciones del empleado
            String mensaje=conexionSQL.Desactivar(empActual.getCedula(),false, empActual.getObservaciones());
            if (mensaje.equals("Empleado desactivado con éxito!")){ //Se agrega el empleado a la lista de eliminados
                panelBuscar.setVisible(true); panelEliminar.setVisible(false); areaRazon.setText(""); //Se regresa al panel buscar
                JOptionPane.showMessageDialog(null, "Eliminado con exito");//Manda mensaje de exito
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
//                datosEmpleado.borrarEmpleado(empActual.getCedula());//Se borra al empleado de la lista de los empleados
                control.llenarTabla("Todos", "",tablaEmpleados);//Se vuelve a llenar la tabla...
        }
        labelFondo.requestFocus();//Se manda el focus al fondo(solo por comodidad en la vision, no es necesario)
    }//GEN-LAST:event_botonEliminarDefiActionPerformed

    private void botonCancelarEliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarEliMouseEntered
        botonCancelarEli.setContentAreaFilled(true); botonCancelarEli.setForeground(Color.black);
    }//GEN-LAST:event_botonCancelarEliMouseEntered

    private void botonCancelarEliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarEliMouseExited
        botonCancelarEli.setContentAreaFilled(false); botonCancelarEli.setForeground(Color.white);
    }//GEN-LAST:event_botonCancelarEliMouseExited

    private void botonEliminarDefiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarDefiMouseEntered
        botonEliminarDefi.setContentAreaFilled(true); botonEliminarDefi.setForeground(Color.black);
    }//GEN-LAST:event_botonEliminarDefiMouseEntered

    private void botonEliminarDefiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarDefiMouseExited
        botonEliminarDefi.setContentAreaFilled(false); botonEliminarDefi.setForeground(Color.white);
    }//GEN-LAST:event_botonEliminarDefiMouseExited

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        botonAgregar.setContentAreaFilled(true); botonAgregar.setForeground(Color.black);
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        botonAgregar.setContentAreaFilled(false); botonAgregar.setForeground(Color.white);
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseEntered
        botonVer.setContentAreaFilled(true); botonVer.setForeground(Color.black);
    }//GEN-LAST:event_botonVerMouseEntered

    private void botonVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseExited
        botonVer.setContentAreaFilled(false); botonVer.setForeground(Color.white);
    }//GEN-LAST:event_botonVerMouseExited

    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
        botonEliminar.setContentAreaFilled(true); botonEliminar.setForeground(Color.black);
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        botonEliminar.setContentAreaFilled(false); botonEliminar.setForeground(Color.white);
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (tablaEmpleados.getSelectedRow()!=-1){ //Entra si tienes un empleado de la lista seleccionado
            empActual=conexionSQL.consultarEmpleado(String.valueOf(tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0)));//Crea el objeto empleado
            panelBuscar.setVisible(false); panelEliminar.setVisible(true); //Coloca el panel eliminar
        }else{//Mensaje de advertencia si no haz seleccionado un empleado de la lista
            JOptionPane.showMessageDialog(null, "Debe selecionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        labelFondo.requestFocus();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        //Muestra la ventana principal y cierra esta
        PrincipalAdministracion obj = new PrincipalAdministracion();  obj.setVisible(true);  this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCancelarEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEliActionPerformed
        //Sale del panel eliminar y vuelve a mostrar el panel buscar
        panelBuscar.setVisible(true); panelEliminar.setVisible(false);labelFondo.requestFocus(); areaRazon.setText("");
    }//GEN-LAST:event_botonCancelarEliActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        if (tablaEmpleados.getSelectedRow()!=-1){//Entra si haz seleccionado a un empleado de la lista
            empActual=conexionSQL.consultarEmpleado(String.valueOf(tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0)));//Crea el objeto empleado
            if (empActual!=null){//Si se pudo crear el empleado sin ningun problema
                //Se muestra el panel registroUsuario 
                regDatosPersonales.setVisible(true); regDatosUsuario.setVisible(false); registroUsuario.setVisible(true); principal.setVisible(false);
                //Se desactivan los campos ya que estas viendo y no editando y se llenan los campos con los datos del empleado seleccionado
                habiDesacCampos(false);ver=true; botonEditar.setVisible(true); vaciarCampos(); llenarCampos(); 
            }else{//Mensaje si no se pudo crear el objeto empleado
                JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{//Mensaje si no haz seleccionado a ningun empleado
            labelFondo.requestFocus();
            JOptionPane.showMessageDialog(null, "Debe selecionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonVerActionPerformed

    private void labelDatUsuarioPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatUsuarioPMouseEntered
        labelDatUsuarioP.setEnabled(true);
    }//GEN-LAST:event_labelDatUsuarioPMouseEntered

    private void labelDatUsuarioPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatUsuarioPMouseExited
        labelDatUsuarioP.setEnabled(false);
    }//GEN-LAST:event_labelDatUsuarioPMouseExited

    private void labelDatUsuarioPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatUsuarioPMouseClicked
        labelDatUsuarioP.setEnabled(false); regDatosPersonales.setVisible(false); 
        regDatosUsuario.setVisible(true); fondo.requestFocus();
    }//GEN-LAST:event_labelDatUsuarioPMouseClicked

    private void labelDatPersonalesUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatPersonalesUMouseEntered
        labelDatPersonalesU.setEnabled(true);
    }//GEN-LAST:event_labelDatPersonalesUMouseEntered

    private void labelDatPersonalesUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatPersonalesUMouseExited
        labelDatPersonalesU.setEnabled(false);
    }//GEN-LAST:event_labelDatPersonalesUMouseExited

    private void labelDatPersonalesUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDatPersonalesUMouseClicked
        labelDatPersonalesU.setEnabled(false); regDatosPersonales.setVisible(true); 
        regDatosUsuario.setVisible(false); fondo.requestFocus();
    }//GEN-LAST:event_labelDatPersonalesUMouseClicked

    private void textApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textApellidoKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textApellidoKeyTyped

    private void textCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCedulaKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
        if (textCedula.getText().length()== 8)evt.consume();
    }//GEN-LAST:event_textCedulaKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
        if (textTelefono.getText().length()== 11)evt.consume();
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSueldoKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textSueldoKeyTyped

    private void textBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyTyped
        if (boxBuscar.getSelectedIndex()==0){//Si el campo seleccionado es Cedula, se validan letras y especiales
            if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
        }else{
             if (boxBuscar.getSelectedIndex()==1){//Si el campo seleccionado es Nombre, se validan numeros y especiales
                 if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
             }
        }
    }//GEN-LAST:event_textBuscarKeyTyped

    private void boxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBuscarActionPerformed
        textBuscar.setText("");
    }//GEN-LAST:event_boxBuscarActionPerformed

    private void btnRegresarRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarRegMouseEntered
        btnRegresarReg.setContentAreaFilled(true); btnRegresarReg.setForeground(Color.black);
    }//GEN-LAST:event_btnRegresarRegMouseEntered

    private void btnRegresarRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarRegMouseExited
        btnRegresarReg.setContentAreaFilled(false); btnRegresarReg.setForeground(Color.white);
    }//GEN-LAST:event_btnRegresarRegMouseExited

    private void btnAceptarRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarRegMouseEntered
        btnAceptarReg.setContentAreaFilled(true); btnAceptarReg.setForeground(Color.black);
    }//GEN-LAST:event_btnAceptarRegMouseEntered

    private void btnAceptarRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarRegMouseExited
        btnAceptarReg.setContentAreaFilled(false); btnAceptarReg.setForeground(Color.white);
    }//GEN-LAST:event_btnAceptarRegMouseExited

    private void btnAceptarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegActionPerformed
    if (!ver){
    //Se comprueba que no hallan campos vacios
        if (camposVacios()){
    //Se crea un objeto de tipo Empleado
                if (validar.comprobarFecha(dateNacimiento.getDate()).equals("Correcto")){
                    if (validar.comprobarEmail(textEmail.getText())){
                        if (edit){ 
                            String mensaje = conexionSQL.modificarEmpleado(empActual.getCedula(),textNombre.getText(), textApellido.getText(), textCedula.getText(), textDireccion.getText(),
                                                        textTelefono.getText(),textEmail.getText(),control.sexo(checkF),control.fecha(dateNacimiento.getDate()).toString(),
                                                        boxCargo.getSelectedItem().toString(),textSueldo.getText(),textNick.getText(),textContraseña.getText(),
                                                        control.agregarpregunta(boxPregSecreta,textPregSecreta),textRespuestaS.getText(),"",guardarImagen());
                            if (mensaje.equals("Empleado modificado con éxito!")){
                                edit=false;
                                registroUsuario.setVisible(false); principal.setVisible(true);
                                control.llenarTabla("Todos", "",tablaEmpleados);
                                JOptionPane.showMessageDialog(null,mensaje);
                                cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
                                control.copiar(fichero, ficheroDestino);
                            }else{
                                JOptionPane.showMessageDialog(null,mensaje);
                            }
                        }else{
                            String mensaje=conexionSQL.insertarEmpleado(textNombre.getText(), textApellido.getText(), textCedula.getText(), textDireccion.getText(),
                                                        textTelefono.getText(),textEmail.getText(),control.sexo(checkF),control.fecha(dateNacimiento.getDate()).toString(),
                                                        boxCargo.getSelectedItem().toString(),textSueldo.getText(),textNick.getText(),textContraseña.getText(),
                                                        control.agregarpregunta(boxPregSecreta,textPregSecreta),textRespuestaS.getText(),"",guardarImagen());
                            if (mensaje.equals("Empleado agregado exitosamente!")){
                                edit=false;
                                registroUsuario.setVisible(false); principal.setVisible(true);
                                control.llenarTabla("Todos", "",tablaEmpleados);
                                JOptionPane.showMessageDialog(null,mensaje);
                                cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
                                control.copiar(fichero, ficheroDestino);
                            }else{
                                JOptionPane.showMessageDialog(null, mensaje); 
                            }
                        }
                    }else{ JOptionPane.showMessageDialog(null, "El campo email no posee un formato valido");}
                }else{ JOptionPane.showMessageDialog(null, validar.comprobarFecha(dateNacimiento.getDate()));}
        }else{JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");}
    }else{principal.setVisible(true); registroUsuario.setVisible(false);
    cambioImagen=false; controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);
    control.copiar(fichero, ficheroDestino);}
    fondo.requestFocus();
    }//GEN-LAST:event_btnAceptarRegActionPerformed

    private void checkMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMActionPerformed
        if (checkM.isSelected()){
            checkF.setSelected(false);
                if (!cambioImagen){
                controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioHombre.png",120,120);}
        }else{
            checkM.setSelected(true);}
    }//GEN-LAST:event_checkMActionPerformed

    private void checkFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFActionPerformed
        if (checkF.isSelected()){
            checkM.setSelected(false);
            if (!cambioImagen){
                controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/usuarioMujer.png",120,120);
            }
        }else
            checkF.setSelected(true);
    }//GEN-LAST:event_checkFActionPerformed

    private void boxPregSecretaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPregSecretaItemStateChanged
        if (boxPregSecreta.getSelectedItem()!=null){
            if (boxPregSecreta.getSelectedItem().equals("Escribir otra pregunta...")){
                panelPregEscrita.setVisible(true);
            }else{
                panelPregEscrita.setVisible(false);
            }
        }
    }//GEN-LAST:event_boxPregSecretaItemStateChanged

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        controlBL.imagenBoton(botonBuscar, "src/imagenes/Botones/buscar2.png");
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        controlBL.imagenBoton(botonBuscar, "src/imagenes/Botones/buscar.png");
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (boxBuscar.getSelectedItem().equals("Cédula")){
            control.llenarTabla("Cédula", textBuscar.getText(),tablaEmpleados);
        }else{
            control.llenarTabla("Nombre", textBuscar.getText(),tablaEmpleados);
        }
        labelFondo.requestFocus();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTodosMouseEntered
        controlBL.imagenBoton(botonTodos,"src/imagenes/Botones/lista.png" );
    }//GEN-LAST:event_botonTodosMouseEntered

    private void botonTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTodosMouseExited
        controlBL.imagenBoton(botonTodos,"src/imagenes/Botones/lista2.png" );
    }//GEN-LAST:event_botonTodosMouseExited

    private void botonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodosActionPerformed
        control.llenarTabla("Todos", "",tablaEmpleados);labelFondo.requestFocus();
    }//GEN-LAST:event_botonTodosActionPerformed

    private void botonVerEliminadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerEliminadosMouseEntered
        controlBL.imagenBoton(botonVerEliminados,"src/imagenes/Botones/verEliminado.png" );
    }//GEN-LAST:event_botonVerEliminadosMouseEntered

    private void botonVerEliminadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerEliminadosMouseExited
        controlBL.imagenBoton(botonVerEliminados,"src/imagenes/Botones/verEliminado2.png" );
    }//GEN-LAST:event_botonVerEliminadosMouseExited

    private void botonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMouseEntered
        botonEditar.setContentAreaFilled(true); botonEditar.setForeground(Color.black);
    }//GEN-LAST:event_botonEditarMouseEntered

    private void botonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMouseExited
        botonEditar.setContentAreaFilled(false); botonEditar.setForeground(Color.white);
    }//GEN-LAST:event_botonEditarMouseExited

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        habiDesacCampos(true); ver=false; edit=true; botonEditar.setVisible(false);fondo.requestFocus();
        if (!empActual.getImagen().equals("usuarioHombre.png")&&!empActual.getImagen().equals("usuarioMujer.png")){
            cambioImagen=true;
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonVerEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEliminadosActionPerformed
        panelEmpEliminados.setVisible(true); panelBuscar.setVisible(false);
        control.llenarTablaEliminados(tablaEliminados); labelFondo.requestFocus();
    }//GEN-LAST:event_botonVerEliminadosActionPerformed

    private void botonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivarActionPerformed
        if (tablaEliminados.getSelectedRow()!=-1){
            empActual=conexionSQL.consultarEmpleado(String.valueOf(tablaEliminados.getValueAt(tablaEliminados.getSelectedRow(), 0)));
            String mensaje=conexionSQL.Desactivar(empActual.getCedula(),true, "");
            if (mensaje.equals("Empleado Activado con éxito!")){
                JOptionPane.showMessageDialog(null,mensaje);
                control.llenarTabla("Todos", "", tablaEmpleados); labelFondo.requestFocus();
                panelBuscar.setVisible(true); panelEmpEliminados.setVisible(false); panelEliminar.setVisible(false);
            }else{JOptionPane.showMessageDialog(null,mensaje);}
        }else{JOptionPane.showMessageDialog(null, "Dece selecionar un empleado");}
    }//GEN-LAST:event_botonActivarActionPerformed

    private void botonRegreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegreMouseEntered
        botonRegre.setContentAreaFilled(true); botonRegre.setForeground(Color.black);
    }//GEN-LAST:event_botonRegreMouseEntered

    private void botonRegreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegreMouseExited
        botonRegre.setContentAreaFilled(false); botonRegre.setForeground(Color.white);
    }//GEN-LAST:event_botonRegreMouseExited

    private void botonActivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivarMouseEntered
        botonActivar.setContentAreaFilled(true); botonActivar.setForeground(Color.black);
    }//GEN-LAST:event_botonActivarMouseEntered

    private void botonActivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivarMouseExited
        botonActivar.setContentAreaFilled(false); botonActivar.setForeground(Color.white);
    }//GEN-LAST:event_botonActivarMouseExited

    private void botonRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegreActionPerformed
        panelEmpEliminados.setVisible(false); panelBuscar.setVisible(true); control.llenarTabla("Todos", "",tablaEmpleados); labelFondo.requestFocus();
    }//GEN-LAST:event_botonRegreActionPerformed

    private void botonAgrImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgrImagenMouseEntered
        controlBL.imagenBoton(botonAgrImagen,"src/imagenes/Botones/agregarPequeño2.png" );
    }//GEN-LAST:event_botonAgrImagenMouseEntered

    private void botonAgrImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgrImagenMouseExited
        controlBL.imagenBoton(botonAgrImagen,"src/imagenes/Botones/agregarPequeño.png" );
    }//GEN-LAST:event_botonAgrImagenMouseExited

    private void botonAgrImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgrImagenActionPerformed
    int resultado;

    CargarArchivo obj = new CargarArchivo();

    FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
    obj.JFCCargarFoto.setFileFilter(filtro);
    resultado= obj.JFCCargarFoto.showOpenDialog(null);

    if (JFileChooser.APPROVE_OPTION == resultado){
        fichero = obj.JFCCargarFoto.getSelectedFile();
        try{
            controlBL.imagenLabel(labelImagenPerfil, fichero.toString(),120,120);
            cambioImagen=true;
        }catch(Exception ex){           
            JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
       }
    }
    }//GEN-LAST:event_botonAgrImagenActionPerformed

    private String guardarImagen(){
        if (cambioImagen){
            control.copiar(fichero, ficheroDestino= new File("src/imagenes/Empleados/"+textNombre.getText()+textCedula.getText()+".png"));
            return textNombre.getText()+textCedula.getText()+".png";
        }else{
            if (checkM.isSelected()){
                return "usuarioHombre.png";
            }else{
                return "usuarioMujer.png";
            }
            
        }
    }
    
    private void habiDesacCampos(boolean dato){
        textNombre.setEditable(dato); textApellido.setEditable(dato);textCedula.setEditable(dato);textDireccion.setEditable(dato);
        textEmail.setEditable(dato); textTelefono.setEditable(dato);textSueldo.setEditable(dato);textNick.setEditable(dato);textContraseña.setEditable(dato);
        dateNacimiento.setEnabled(dato);checkF.setEnabled(dato);checkM.setEnabled(dato); textRespuestaS.setEditable(dato); 
        boxCargo.setEnabled(dato); boxPregSecreta.setEnabled(dato); botonAgrImagen.setEnabled(dato);
    }
    
    private void vaciarCampos(){
        textNombre.setText(""); textApellido.setText("");textCedula.setText("");textDireccion.setText("");
        textEmail.setText(""); textTelefono.setText("");textSueldo.setText("");textNick.setText("");textContraseña.setText("");
        dateNacimiento.setDate(null);checkF.setSelected(false);checkM.setSelected(false); textPregSecreta.setText("");textRespuestaS.setText("");
        //Se cargar las preguntas por defecto
        boxPregSecreta.removeAllItems();
        boxPregSecreta.addItem("¿Nombre de tu primera mascota?");
        boxPregSecreta.addItem("¿Cuál es tu comida preferida?");
        boxPregSecreta.addItem("¿Lugar de nacimiento de la madre?");
        boxPregSecreta.addItem("Escribir otra pregunta...");
        panelPregEscrita.setVisible(false);
        
    }
    
    private boolean camposVacios(){
        if (textNombre.getText().equals("")||textApellido.getText().equals("")||textCedula.getText().equals("")||textDireccion.getText().equals("")||
            textEmail.getText().equals("")||textTelefono.getText().equals("")||textSueldo.getText().equals("")||textNick.getText().equals("")||
            textRespuestaS.getText().equals("")|| textContraseña.getText().equals("")||control.comprobarPregunta(boxPregSecreta,textPregSecreta)||    
            (dateNacimiento.getDate()==null)||(!checkM.isSelected()&&!checkF.isSelected())){
            return false;
        }else{
           return true;
        }
    }
    
    private boolean campoLLeno(){
        if (!textNombre.getText().equals("")||!textApellido.getText().equals("")||!textCedula.getText().equals("")||!textDireccion.getText().equals("")||
            !textEmail.getText().equals("")||!textTelefono.getText().equals("")||!textSueldo.getText().equals("")||!textNick.getText().equals("")||
            !textRespuestaS.getText().equals("")|| !textContraseña.getText().equals("")||   
            !(dateNacimiento.getDate()==null)||!(!checkM.isSelected()&&!checkF.isSelected())){
            return true;
        }else{
           return false;
        }
    }

    private void llenarCampos(){
       try {
           //Se llenan todos los jTextField
           textNombre.setText(empActual.getNombre()); textApellido.setText(empActual.getApellido()); textCedula.setText(empActual.getCedula());
           textDireccion.setText(empActual.getDireccion()); textTelefono.setText(empActual.getTelefono());textEmail.setText(empActual.getEmail());
           textSueldo.setText(empActual.getSueldoBase());textNick.setText(empActual.getNick());textContraseña.setText(empActual.getContraseña());
           textRespuestaS.setText(empActual.getRespuestaSecreta());
           //Se llena el jChekBox del sexo
           if (empActual.getSexo().equals("M")){checkM.setSelected(true);}else{checkF.setSelected(true);}
           //Se llena el campo fecha de tipo Date
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           dateNacimiento.setDate(formato.parse(empActual.getFnac()));
           //Se llena el jComboBox del cargo
           if(empActual.getCargo().equals("Cajero")){boxCargo.setSelectedIndex(0);
           }else{ if(empActual.getCargo().equals("Administrador")){boxCargo.setSelectedIndex(1);
                    }else{boxCargo.setSelectedIndex(2);}}
           //Se llena el jComboBox de la pregunta secreta
           if(empActual.getPreguntaSecreta().equals("¿Nombre de tu primera mascota?")){
               boxPregSecreta.setSelectedIndex(0);
           }else{
               if(empActual.getPreguntaSecreta().equals("¿Cuál es tu comida preferida?")){
                   boxPregSecreta.setSelectedIndex(1);
               }else{
                   if(empActual.getPreguntaSecreta().equals("¿Lugar de nacimiento de la madre?")){
                       boxPregSecreta.setSelectedIndex(2);
                   }else{
                       boxPregSecreta.removeItemAt(3);
                       boxPregSecreta.addItem(empActual.getPreguntaSecreta());
                       boxPregSecreta.setSelectedIndex(3);
                       boxPregSecreta.addItem("Escribir otra pregunta...");
                   }
               }
           }
           controlBL.imagenLabel(labelImagenPerfil, "src/imagenes/Empleados/"+empActual.getImagen(),120,120);
       } catch (ParseException ex) {
           System.out.println("No se puedo cambiar el dato de fecha");
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
            java.util.logging.Logger.getLogger(GestionUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRazon;
    private javax.swing.JButton botonActivar;
    private javax.swing.JButton botonAgrImagen;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelarEli;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminarDefi;
    private javax.swing.JButton botonRegre;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonTodos;
    private javax.swing.JButton botonVer;
    private javax.swing.JButton botonVerEliminados;
    private javax.swing.JComboBox<String> boxBuscar;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxPregSecreta;
    private javax.swing.JButton btnAceptarReg;
    private javax.swing.JButton btnRegresarReg;
    private javax.swing.JCheckBox checkF;
    private javax.swing.JCheckBox checkM;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelDatPersonalesP;
    private javax.swing.JLabel labelDatPersonalesU;
    private javax.swing.JLabel labelDatUsuarioP;
    private javax.swing.JLabel labelDatUsuarioU;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelImagenPerfil;
    private javax.swing.JLabel labelNacimiento;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPreguntaS;
    private javax.swing.JLabel labelPreguntaS1;
    private javax.swing.JLabel labelRespuestaS;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSueldo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTitulo5;
    private javax.swing.JLabel labelTitulo6;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelEmpEliminados;
    private javax.swing.JPanel panelPregEscrita;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel regDatosPersonales;
    private javax.swing.JPanel regDatosUsuario;
    private javax.swing.JPanel registroUsuario;
    private javax.swing.JTable tablaEliminados;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textContraseña;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNick;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPregSecreta;
    private javax.swing.JTextField textRespuestaS;
    private javax.swing.JTextField textSueldo;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables

}
