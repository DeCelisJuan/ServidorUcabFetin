package vista;

import controlador.Validaciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import controlador.InterfazInventario;
import controlador.conexionSQL;
import controlador.Validaciones;
import controlador.controlBotonLabel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;
/**
 * @author DrowSoft
 */
public class Inventario extends javax.swing.JFrame {

    private Validaciones validar = new Validaciones();
    private controlBotonLabel controlBL = new controlBotonLabel();//Para controlar los botones y label
    private InterfazInventario control = new InterfazInventario();
    Producto prodActual;
    String mensaje="";
    boolean ver=false,edit=false,cambioImagen=false;
    
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null); 
        RegistrarProd.setVisible(false); panelProdDesac.setVisible(false);
        panelEliminar.setVisible(false);
        control.llenarTabla("Todos", "", tablaProductos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        labelRegistroProd1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonDesactivar = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        labelBuscar2 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        boxBuscar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        botonTodos = new javax.swing.JButton();
        botonVerEliminados = new javax.swing.JButton();
        panelEliminar = new javax.swing.JPanel();
        labelRazonEliminar1 = new javax.swing.JLabel();
        botonEliminarDefi = new javax.swing.JButton();
        botonCancelarEli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRazon = new javax.swing.JTextArea();
        panelProdDesac = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDesactivados = new javax.swing.JTable();
        botonRegre = new javax.swing.JButton();
        botonActivar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();
        RegistrarProd = new javax.swing.JPanel();
        btnAceptarReg = new javax.swing.JButton();
        btnRegresarReg = new javax.swing.JButton();
        labelRegistroProd = new javax.swing.JLabel();
        labelNombreProd = new javax.swing.JLabel();
        textNombreProd = new javax.swing.JTextField();
        labelTipoProd = new javax.swing.JLabel();
        labelCodigoBar = new javax.swing.JLabel();
        textCodigoBar = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        labelDescuento = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        textFecha = new com.toedter.calendar.JDateChooser();
        textValor = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        boxDescuentos = new javax.swing.JComboBox<>();
        boxTipoProd = new javax.swing.JComboBox<>();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRegistroProd1.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelRegistroProd1.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistroProd1.setText("Gestión de productos");
        principal.add(labelRegistroProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 50));

        botonAgregar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonAgregar.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.setBorder(null);
        botonAgregar.setContentAreaFilled(false);
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

        botonModificar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonModificar.png"))); // NOI18N
        botonModificar.setText("Ver Datos");
        botonModificar.setBorder(null);
        botonModificar.setContentAreaFilled(false);
        botonModificar.setIconTextGap(10);
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonModificarMouseExited(evt);
            }
        });
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        principal.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 80));

        botonDesactivar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonDesactivar.setForeground(new java.awt.Color(255, 255, 255));
        botonDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonEliminar.png"))); // NOI18N
        botonDesactivar.setText("Desactivar");
        botonDesactivar.setBorder(null);
        botonDesactivar.setContentAreaFilled(false);
        botonDesactivar.setIconTextGap(10);
        botonDesactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDesactivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDesactivarMouseExited(evt);
            }
        });
        botonDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesactivarActionPerformed(evt);
            }
        });
        principal.add(botonDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, 80));

        panelBuscar.setOpaque(false);
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBuscar2.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        labelBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar2.setText("Buscar producto:");
        panelBuscar.add(labelBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBuscarKeyTyped(evt);
            }
        });
        panelBuscar.add(textBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        boxBuscar.setFont(new java.awt.Font("PMingLiU-ExtB", 2, 12)); // NOI18N
        boxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de barra", "Nombre" }));
        boxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBuscarActionPerformed(evt);
            }
        });
        panelBuscar.add(boxBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaProductos);

        panelBuscar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 200));

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

        panelEliminar.setOpaque(false);
        panelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRazonEliminar1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelRazonEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        labelRazonEliminar1.setText("Razón de la desactivación:");
        panelEliminar.add(labelRazonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));

        botonEliminarDefi.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        botonEliminarDefi.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarDefi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        botonEliminarDefi.setText("Desactivar");
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

        areaRazon.setColumns(20);
        areaRazon.setRows(5);
        jScrollPane1.setViewportView(areaRazon);

        panelEliminar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 190));

        principal.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 300, 320));

        panelProdDesac.setOpaque(false);
        panelProdDesac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo2.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        labelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo2.setText("Productos desactivados:");
        panelProdDesac.add(labelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tablaDesactivados.setAutoCreateRowSorter(true);
        tablaDesactivados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDesactivados.setName(""); // NOI18N
        tablaDesactivados.getTableHeader().setResizingAllowed(false);
        tablaDesactivados.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaDesactivados);

        panelProdDesac.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 190));

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
        panelProdDesac.add(botonRegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 40));

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
        panelProdDesac.add(botonActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 40));

        principal.add(panelProdDesac, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 330, 340));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonRegresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        principal.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 40, 40));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        principal.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        RegistrarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnAceptarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonOk.png"))); // NOI18N
        btnAceptarReg.setText("Aceptar");
        btnAceptarReg.setBorderPainted(false);
        btnAceptarReg.setContentAreaFilled(false);
        btnAceptarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegActionPerformed(evt);
            }
        });
        RegistrarProd.add(btnAceptarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, -1));

        btnRegresarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnRegresarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botones/botonRegresar.png"))); // NOI18N
        btnRegresarReg.setText("Regresar");
        btnRegresarReg.setBorderPainted(false);
        btnRegresarReg.setContentAreaFilled(false);
        btnRegresarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRegActionPerformed(evt);
            }
        });
        RegistrarProd.add(btnRegresarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        labelRegistroProd.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelRegistroProd.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistroProd.setText("Registro de productos");
        RegistrarProd.add(labelRegistroProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 50));

        labelNombreProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNombreProd.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreProd.setText("Nombre del producto:");
        RegistrarProd.add(labelNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 30));

        textNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreProdKeyTyped(evt);
            }
        });
        RegistrarProd.add(textNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 30));

        labelTipoProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelTipoProd.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoProd.setText("Tipo del producto:");
        RegistrarProd.add(labelTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 30));

        labelCodigoBar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCodigoBar.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigoBar.setText("Código de barras:");
        RegistrarProd.add(labelCodigoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 30));

        textCodigoBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCodigoBarKeyTyped(evt);
            }
        });
        RegistrarProd.add(textCodigoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 30));

        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });
        RegistrarProd.add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, 30));

        labelDescuento.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelDescuento.setForeground(new java.awt.Color(255, 255, 255));
        labelDescuento.setText("Descuento:");
        RegistrarProd.add(labelDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 30));

        labelCantidad.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad:");
        RegistrarProd.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 80, 30));
        RegistrarProd.add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 190, 30));

        textValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textValorKeyTyped(evt);
            }
        });
        RegistrarProd.add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 190, 30));

        labelValor.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));
        labelValor.setText("Valor del producto:");
        RegistrarProd.add(labelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, 30));

        labelFecha.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha de caducidad:");
        RegistrarProd.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 30));

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
        RegistrarProd.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 130, 40));

        boxDescuentos.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        boxDescuentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%" }));
        RegistrarProd.add(boxDescuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 30));

        boxTipoProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        boxTipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos", "Productos de limpieza", "Artesanales" }));
        RegistrarProd.add(boxTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos/FondoIngresar.jpg"))); // NOI18N
        RegistrarProd.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(RegistrarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValorKeyTyped
        char letra = evt.getKeyChar();
        if ((letra<00 && letra<8) || (letra>8 && letra<10) || (letra>10 && letra<44) || (letra>44 && letra<48) || (letra>57 && letra<255))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textValorKeyTyped

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar())||validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textCantidadKeyTyped

    private void btnRegresarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRegActionPerformed
        if (edit){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            if (JOptionPane. showConfirmDialog (null,  "¿Estás seguro? no se guardarán los cambios",  "ADVERTENCIA",JOptionPane. YES_NO_OPTION)  ==  JOptionPane. YES_OPTION) {
                 principal.setVisible(true);  RegistrarProd.setVisible(false); edit=false; ver= true; vaciarCampos();
            }          
        }else{
            if (!ver){
                if (campoLleno()){
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    if (JOptionPane. showConfirmDialog (null,  "¿Estás seguro? se borrarán los datos ya ingresados",  "ADVERTENCIA",JOptionPane. YES_NO_OPTION)  ==  JOptionPane. YES_OPTION) {
                        principal.setVisible(true);  RegistrarProd.setVisible(false); vaciarCampos();
                    }        
                }else{principal.setVisible(true);  RegistrarProd.setVisible(false); }
            }else{principal.setVisible(true);  RegistrarProd.setVisible(false); vaciarCampos(); habiDesacCampos(true);}
        }
    }//GEN-LAST:event_btnRegresarRegActionPerformed
    
    private void btnAceptarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegActionPerformed
    if (!ver){
        if (!campoVacio()){
            String mensaje=validar.validarFechaProducto(textFecha.getDate());
            if (mensaje.equals("Correcto")){
                if (validar.validarDecimales(textValor.getText())){
                    if (!edit){
                        mensaje = conexionSQL.insertarProducto(textCodigoBar.getText(), textNombreProd.getText(), validar.fechaString(textFecha.getDate()), 
                                                                textCantidad.getText(), textValor.getText(), boxTipoProd.getSelectedItem().toString(), "","0%");
                    }else{
                        mensaje = conexionSQL.modificarProducto(prodActual.getCodigo(),textCodigoBar.getText(), textNombreProd.getText(), validar.fechaString(textFecha.getDate()), 
                                                                textCantidad.getText(), textValor.getText(), boxTipoProd.getSelectedItem().toString(),boxDescuentos.getSelectedItem().toString());
                        edit=false;ver=true;
                    }
                    if (mensaje.equals("Se agregó con éxito el producto")||mensaje.equals("Modificado con éxito!")){
                        JOptionPane.showMessageDialog(null, mensaje);
                        RegistrarProd.setVisible(false); principal.setVisible(true); vaciarCampos();
                        control.llenarTabla("Todos", "", tablaProductos);
                    }else{JOptionPane.showMessageDialog(null,mensaje);}
                }else{JOptionPane.showMessageDialog(null,"ERROR con decimales");}
            }else{JOptionPane.showMessageDialog(null,mensaje);}
        }else{JOptionPane.showMessageDialog(null, "no pueden haber campos vacios");}
        
    
    }else{principal.setVisible(true); RegistrarProd.setVisible(false);}
    labelFondo.requestFocus();
    }//GEN-LAST:event_btnAceptarRegActionPerformed

    private void textNombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreProdKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textNombreProdKeyTyped

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        botonAgregar.setContentAreaFilled(true); botonAgregar.setForeground(Color.black);
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        botonAgregar.setContentAreaFilled(false); botonAgregar.setForeground(Color.white);
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        principal.setVisible(false); RegistrarProd.setVisible(true); botonEditar.setVisible(false); ver=false;
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseEntered
        botonModificar.setContentAreaFilled(true); botonModificar.setForeground(Color.black);
    }//GEN-LAST:event_botonModificarMouseEntered

    private void botonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseExited
        botonModificar.setContentAreaFilled(false); botonModificar.setForeground(Color.white);
    }//GEN-LAST:event_botonModificarMouseExited

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (tablaProductos.getSelectedRow()!=-1){
            prodActual=conexionSQL.consultarProducto(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
            if (prodActual!=null){
                RegistrarProd.setVisible(true); principal.setVisible(false); ver=true;
                habiDesacCampos(false);ver=true; botonEditar.setVisible(true); vaciarCampos(); llenarCampos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe selecionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonDesactivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesactivarMouseEntered
        botonDesactivar.setContentAreaFilled(true); botonDesactivar.setForeground(Color.black);
    }//GEN-LAST:event_botonDesactivarMouseEntered

    private void botonDesactivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesactivarMouseExited
        botonDesactivar.setContentAreaFilled(false); botonDesactivar.setForeground(Color.white);
    }//GEN-LAST:event_botonDesactivarMouseExited

    private void botonDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesactivarActionPerformed
        if (tablaProductos.getSelectedRow()!=-1){
            prodActual=conexionSQL.consultarProducto(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
            if (prodActual!=null){
                panelBuscar.setVisible(false); panelEliminar.setVisible(true); panelProdDesac.setVisible(false);
            }else{JOptionPane.showMessageDialog(null, "Error al buscar el producto seleccionado", "Error", JOptionPane.ERROR_MESSAGE);}
        }else{
            JOptionPane.showMessageDialog(null, "Debe selecionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonDesactivarActionPerformed

    private void textBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyTyped
        if (boxBuscar.getSelectedIndex()==0){
            if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
        }else{
            if (boxBuscar.getSelectedIndex()==1){
                if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
            }
        }
    }//GEN-LAST:event_textBuscarKeyTyped

    private void boxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBuscarActionPerformed
        textBuscar.setText("");
    }//GEN-LAST:event_boxBuscarActionPerformed

    private void botonEliminarDefiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarDefiMouseEntered
        botonEliminarDefi.setContentAreaFilled(true); botonEliminarDefi.setForeground(Color.black);
    }//GEN-LAST:event_botonEliminarDefiMouseEntered

    private void botonEliminarDefiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarDefiMouseExited
        botonEliminarDefi.setContentAreaFilled(false); botonEliminarDefi.setForeground(Color.white);
    }//GEN-LAST:event_botonEliminarDefiMouseExited

    private void botonEliminarDefiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarDefiActionPerformed
        if (!areaRazon.getText().equals("")){
            String mensaje = conexionSQL.desactivarProducto(prodActual.getCodigo(),false,areaRazon.getText());
            if (mensaje.equals("Desactivado con exito!")){
                JOptionPane.showMessageDialog(null, mensaje);
                panelBuscar.setVisible(true); panelProdDesac.setVisible(false); panelEliminar.setVisible(false);
                control.llenarTabla("Todos", "", tablaProductos);  areaRazon.setText("");
            }else{
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe colocar una razón");
        }
    }//GEN-LAST:event_botonEliminarDefiActionPerformed

    private void botonCancelarEliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarEliMouseEntered
        botonCancelarEli.setContentAreaFilled(true); botonCancelarEli.setForeground(Color.black);
    }//GEN-LAST:event_botonCancelarEliMouseEntered

    private void botonCancelarEliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarEliMouseExited
        botonCancelarEli.setContentAreaFilled(false); botonCancelarEli.setForeground(Color.white);
    }//GEN-LAST:event_botonCancelarEliMouseExited

    private void botonCancelarEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEliActionPerformed
        panelBuscar.setVisible(true); panelEliminar.setVisible(false); areaRazon.setText("");
    }//GEN-LAST:event_botonCancelarEliActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        PrincipalAdministracion obj = new PrincipalAdministracion();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        controlBL.imagenBoton(botonBuscar, "src/imagenes/Botones/buscar.png");
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        controlBL.imagenBoton(botonBuscar, "src/imagenes/Botones/buscar2.png");
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (boxBuscar.getSelectedItem().equals("Código de barra")){
            control.llenarTabla("Código", textBuscar.getText(),tablaProductos);
        }else{
            control.llenarTabla("Nombre", textBuscar.getText(),tablaProductos);
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
        control.llenarTabla("Todos", "",tablaProductos);labelFondo.requestFocus();
    }//GEN-LAST:event_botonTodosActionPerformed

    private void botonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMouseEntered
        botonEditar.setContentAreaFilled(true); botonEditar.setForeground(Color.black);
    }//GEN-LAST:event_botonEditarMouseEntered

    private void botonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMouseExited
        botonEditar.setContentAreaFilled(false); botonEditar.setForeground(Color.white);
    }//GEN-LAST:event_botonEditarMouseExited

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        habiDesacCampos(true); ver=false; edit=true; botonEditar.setVisible(false);Fondo1.requestFocus();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonVerEliminadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerEliminadosMouseEntered
        controlBL.imagenBoton(botonVerEliminados,"src/imagenes/Botones/verEliminado.png" );
    }//GEN-LAST:event_botonVerEliminadosMouseEntered

    private void botonVerEliminadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerEliminadosMouseExited
        controlBL.imagenBoton(botonVerEliminados,"src/imagenes/Botones/verEliminado2.png" );
    }//GEN-LAST:event_botonVerEliminadosMouseExited

    private void botonVerEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEliminadosActionPerformed
        panelProdDesac.setVisible(true); panelBuscar.setVisible(false);
        control.llenarTablaDesactivados(tablaDesactivados); labelFondo.requestFocus();
    }//GEN-LAST:event_botonVerEliminadosActionPerformed

    private void botonRegreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegreMouseEntered
        botonRegre.setContentAreaFilled(true); botonRegre.setForeground(Color.black);
    }//GEN-LAST:event_botonRegreMouseEntered

    private void botonRegreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegreMouseExited
        botonRegre.setContentAreaFilled(false); botonRegre.setForeground(Color.white);
    }//GEN-LAST:event_botonRegreMouseExited

    private void botonRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegreActionPerformed
        panelProdDesac.setVisible(false); panelBuscar.setVisible(true); control.llenarTabla("Todos", "",tablaProductos); labelFondo.requestFocus();
    }//GEN-LAST:event_botonRegreActionPerformed

    private void botonActivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivarMouseEntered
        botonActivar.setContentAreaFilled(true); botonActivar.setForeground(Color.black);
    }//GEN-LAST:event_botonActivarMouseEntered

    private void botonActivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActivarMouseExited
        botonActivar.setContentAreaFilled(false); botonActivar.setForeground(Color.white);
    }//GEN-LAST:event_botonActivarMouseExited

    private void botonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivarActionPerformed
        if (tablaDesactivados.getSelectedRow()!=-1){
            prodActual=conexionSQL.consultarProducto(String.valueOf(tablaDesactivados.getValueAt(tablaDesactivados.getSelectedRow(), 0)));
            if (prodActual!=null){
                String mensaje= conexionSQL.desactivarProducto(prodActual.getCodigo(), true,"");
                if (mensaje.equals("Activado con exito!")){
                    JOptionPane.showMessageDialog(null, mensaje);
                    panelBuscar.setVisible(true); panelProdDesac.setVisible(false); panelEliminar.setVisible(false);
                    control.llenarTabla("Todos", "", tablaProductos);
                }else{JOptionPane.showMessageDialog(null, mensaje);}
            }else{JOptionPane.showMessageDialog(null, "Error al crear el objeto producto");}
        }else{JOptionPane.showMessageDialog(null, "Debe selecionar un producto");}
    }//GEN-LAST:event_botonActivarActionPerformed

    private void textCodigoBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodigoBarKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textCodigoBarKeyTyped

    private boolean campoLleno(){
        if (!textNombreProd.getText().equals("")||!textValor.getText().equals("")||!textCodigoBar.getText().equals("")||
            !textCantidad.getText().equals("")||(textFecha.getDate()!=null)){
            return true;
        }else{return false;}
    }
    
    private void vaciarCampos(){
        textNombreProd.setText(""); boxTipoProd.setSelectedIndex(0); textCodigoBar.setText("");
        textValor.setText(""); textCantidad.setText(""); textFecha.setDate(null);
    }
    
    private void llenarCampos(){
        try {
            textNombreProd.setText(prodActual.getNombre()); textCodigoBar.setText(prodActual.getCodigo());
            textValor.setText(prodActual.getValor()); textCantidad.setText(prodActual.getCantidad());
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            textFecha.setDate(formato.parse(prodActual.getFechaCaducidad()));
            if (prodActual.getTipo().equals("Alimentos")){ boxTipoProd.setSelectedIndex(0);
            }else{if (prodActual.getTipo().equals("Productos de limpieza")){boxTipoProd.setSelectedIndex(1);
                }else{boxTipoProd.setSelectedIndex(2);}}
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar la fecha");
        }
    }
    
    public boolean campoVacio(){
        if (textNombreProd.getText().equals("")||textValor.getText().equals("")||
                textCodigoBar.getText().equals("")||textCantidad.getText().equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    private void habiDesacCampos(boolean dato){
        textNombreProd.setEditable(dato);boxTipoProd.setEnabled(dato); textCodigoBar.setEditable(dato);
        textValor.setEditable(dato); textCantidad.setEditable(dato); textFecha.setEnabled(dato);
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JPanel RegistrarProd;
    private javax.swing.JTextArea areaRazon;
    private javax.swing.JButton botonActivar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelarEli;
    private javax.swing.JButton botonDesactivar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminarDefi;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegre;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonTodos;
    private javax.swing.JButton botonVerEliminados;
    private javax.swing.JComboBox<String> boxBuscar;
    private javax.swing.JComboBox<String> boxDescuentos;
    private javax.swing.JComboBox<String> boxTipoProd;
    private javax.swing.JButton btnAceptarReg;
    private javax.swing.JButton btnRegresarReg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelBuscar2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigoBar;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreProd;
    private javax.swing.JLabel labelRazonEliminar1;
    private javax.swing.JLabel labelRegistroProd;
    private javax.swing.JLabel labelRegistroProd1;
    private javax.swing.JLabel labelTipoProd;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelValor;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelProdDesac;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tablaDesactivados;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textCodigoBar;
    private com.toedter.calendar.JDateChooser textFecha;
    private javax.swing.JTextField textNombreProd;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
