package controlador;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Producto;
import modelo.Ventas;

public class conexionSQL{
    
  static Connection conn;  
  
  //PROCEDIMIENTOS PARA LOS EMPLEADOS
  
    public static String insertarEmpleado( String nombre, String apellido, String cedula, String direccion, String telefono, String email, String sexo, String fnac,
                    String cargo, String sueldoBase,String nick,String contraseña,String preguntaSecreta, String respuestaSecreta,String observaciones,String imagen)
    {
        Empleado empleado= new Empleado();
        empleado=consultarEmpleado(cedula);
        if (empleado.getCedula()==null){
            try 
            {
                conn = conectarADb();
                if (conn!=null){
                    PreparedStatement st;
                    String nombreBD = "empleados";
                    String statement = "INSERT INTO " +nombreBD+ "(\n" +
                    " nom_emp, ape_emp, ced_emp, dir_emp, tel_emp, ema_emp, sex_emp, fnac_emp,car_emp, sue_emp, nick_emp, con_emp, preg_emp, resp_emp, obs_emp , ima_emp,estado) VALUES ("
                    +"'"+nombre+"', '"+apellido+"', '"+cedula+"' ,'"+direccion+"' ,'"+telefono+"' ,'"+email+"' ,'"+sexo+"', '"+fnac+"', '"+cargo+"', '"+sueldoBase+"', "
                    + "'"+nick+"', '"+contraseña+"', '"+preguntaSecreta+"', '"+respuestaSecreta+"', '"+observaciones+"', '"+imagen+"',"+true+")";
                    try{
                        st = conn.prepareStatement(statement);
                        st.executeUpdate();
                        return "Empleado agregado exitosamente!";}
                    catch(Exception e){
                        return "Error al insertar en la tabla";
                    }
                }else{return"Error al conectar con la base de datos";}
            }
            catch (SQLException se) {
                return "No se pudo establecer conexión con la base de datos";
            }
        }else{
           return "La cédula ya existe";
       }
    }  
  
    public static Empleado consultarEmpleado(String cedula)
    {
        Empleado consulta = new Empleado();
        
        try {         
            conn = conectarADb();
            if (conn!=null){
                Statement comando = conn.createStatement();
                String sql = "SELECT * FROM empleados where ced_emp ='"+cedula+"'";
                ResultSet resultado = comando.executeQuery(sql);
                while(resultado.next()) {
                    consulta.setNombre(resultado.getString("nom_emp"));
                    consulta.setApellido(resultado.getString("ape_emp"));
                    consulta.setCedula(resultado.getString("ced_emp"));
                    consulta.setDireccion(resultado.getString("dir_emp"));
                    consulta.setTelefono(resultado.getString("tel_emp"));
                    consulta.setEmail(resultado.getString("ema_emp"));
                    consulta.setSexo(resultado.getString("sex_emp"));
                    consulta.setFnac(resultado.getString("fnac_emp"));
                    consulta.setCargo(resultado.getString("car_emp"));
                    consulta.setSueldoBase(resultado.getString("sue_emp"));
                    consulta.setNick(resultado.getString("nick_emp"));
                    consulta.setContraseña(resultado.getString("con_emp"));
                    consulta.setPreguntaSecreta(resultado.getString("preg_emp"));
                    consulta.setRespuestaSecreta(resultado.getString("resp_emp"));
                    consulta.setObservaciones(resultado.getString("obs_emp"));
                    consulta.setImagen(resultado.getString("ima_emp"));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
            }
        } catch (SQLException ex) {
            //error al conectar con la base de datos
        }
        return consulta;
    }
    
    public static String modificarEmpleado (String empleado, String nombre, String apellido, String cedula, String direccion, String telefono, String email, String sexo, String fnac,
                                            String cargo, String sueldoBase,String nick,String contraseña,String preguntaSecreta, String respuestaSecreta,String observaciones,String imagen)
    {
        Empleado emp= new Empleado();
        if (!empleado.equals(cedula)){
            emp=consultarEmpleado(cedula);}
        if (emp.getCedula()==null){
            try {
                conn = conectarADb();
                PreparedStatement st;        
                String nombreTabla = "empleados";
                String statement = "UPDATE " +nombreTabla+ " SET nom_emp = '"+nombre+"', ape_emp = '"+apellido+"', ced_emp = '"+cedula+"', dir_emp = '"+direccion+"', tel_emp = '"+telefono+"', ema_emp = '"+email+
                                    "', sex_emp = '"+sexo+"', fnac_emp = '"+fnac+"', car_emp = '"+cargo+"', sue_emp = '"+sueldoBase+"', nick_emp = '"+nick+"', con_emp = '"+contraseña+"', preg_emp = '"+preguntaSecreta+
                                    "', resp_emp = '"+respuestaSecreta+"', obs_emp = '"+observaciones+"', ima_emp = '"+imagen+"' WHERE ced_emp = '"+empleado+"'";
                st = conn.prepareStatement(statement);
                st.executeUpdate();  
                return "Empleado modificado con éxito!";
            }catch (SQLException ex) {
                return "No se pudo conectar con la base de datos";
            } 
        }else{
           return "La cédula ya existe";
       }
    }
    
    public static String Desactivar(String cedula,boolean dato,String observaciones)
    {
        try {
            conn = conectarADb();
            PreparedStatement st;        
            String nombreTabla = "empleados";
            String statement = "UPDATE " +nombreTabla+ " SET obs_emp = '"+observaciones+"', estado = "+dato+" WHERE ced_emp = '"+cedula+"'";
          
            st = conn.prepareStatement(statement);
            st.executeUpdate();  
            if (!dato){
                return "Empleado desactivado con éxito!";
            }else{return "Empleado Activado con éxito!";}
        }catch (SQLException ex) {
            return "No se pudo conectar con la base de datos";
      }
    }   
    
    public static boolean verificarStatus(String cedula){
        boolean activo= true;    
        try {         
            conn = conectarADb();
            Statement comando = conn.createStatement();
            String sql = "SELECT * FROM empleados where ced_emp ='"+cedula+"'";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()) {
                activo= resultado.getBoolean("estado");
            }
        } catch (SQLException ex) {
            //error al conectar con la base de datos
        }
            return activo;
    }
    
    public static ArrayList<Empleado> listaEmpleados(Boolean dato) {
        ArrayList<Empleado> lista = new ArrayList<Empleado>();
       
        try {         
            conn = conectarADb();
            if(conn!=null) {
                Statement comando = conn.createStatement();
                String sql = "SELECT * FROM empleados WHERE estado = "+dato;
                ResultSet resultado = comando.executeQuery(sql);
                while(resultado.next()) {
                    Empleado consulta = new Empleado();
                    consulta.setNombre(resultado.getString("nom_emp"));
                    consulta.setApellido(resultado.getString("ape_emp"));
                    consulta.setCedula(resultado.getString("ced_emp"));
                    consulta.setDireccion(resultado.getString("dir_emp"));
                    consulta.setTelefono(resultado.getString("tel_emp"));
                    consulta.setEmail(resultado.getString("ema_emp"));
                    consulta.setSexo(resultado.getString("sex_emp"));
                    consulta.setFnac(resultado.getString("fnac_emp"));
                    consulta.setCargo(resultado.getString("car_emp"));
                    consulta.setSueldoBase(resultado.getString("sue_emp"));
                    consulta.setNick(resultado.getString("nick_emp"));
                    consulta.setContraseña(resultado.getString("con_emp"));
                    consulta.setPreguntaSecreta(resultado.getString("preg_emp"));
                    consulta.setRespuestaSecreta(resultado.getString("resp_emp"));
                    consulta.setObservaciones(resultado.getString("obs_emp"));
                    consulta.setImagen(resultado.getString("ima_emp"));
                    lista.add(consulta);
                }
            }
        } catch (SQLException ex) {
            //error al conectar con la base de datos
        }
        return lista;
    }
    
    
    //PROCEDIMIENTOS DE LOS PRODUCTOS DEL INVENTARIO
    
    public static String insertarProducto(String codigo, String nombre, String fechaCaducidad, String cantidad, String valor, String tipo, String motivo, String descuento)
    {
        Producto producto = new Producto();
        producto = consultarProducto(codigo);
        if (producto.getCodigo()==null){
            try 
            {
                conn = conectarADb();
                if (conn!=null){
                    PreparedStatement st;
                    String nombreTabla = "productos";
                    String statement = "INSERT INTO " +nombreTabla+ "(\n" +
                    "            cod_pro, nom_pro, fcad_pro, can_pro, val_pro, tip_pro, raz_pro, des_pro, estado) VALUES ("
                    +"'"+codigo+"', '"+nombre+"', '"+fechaCaducidad+"' ,'"+cantidad+"' ,'"+valor+"' ,'"+tipo+"', '"+motivo+"', '"+descuento+"',  '"+true+"')";
                    st = conn.prepareStatement(statement);
                    st.executeUpdate();
                    return "Se agregó con éxito el producto";
                }else{return "Error al conectar con la base de datos";}
            }catch (SQLException se) {
                return "Error con la base de datos";
            }
        }
        else{return "El producto esta repetido";}
  }
    
    public static Producto consultarProducto(String codigo)
    {
        Producto consulta = new Producto();
              try {         
          conn = conectarADb();
          Statement comando = conn.createStatement();
          String sql = "SELECT * FROM productos where cod_pro ='"+codigo+"'";
          ResultSet resultado = comando.executeQuery(sql);
          while(resultado.next()) {
                consulta.setCodigo(resultado.getString("cod_pro"));
                consulta.setNombre(resultado.getString("nom_pro"));
                consulta.setFechaCaducidad(resultado.getString("fcad_pro"));
                consulta.setCantidad(resultado.getString("can_pro"));
                consulta.setValor(resultado.getString("val_pro"));
                consulta.setTipo(resultado.getString("tip_pro"));
                consulta.setMotivo(resultado.getString("raz_pro"));
                consulta.setDescuento(resultado.getString("des_pro"));
            }
      } catch (SQLException ex) {
//          Logger.getLogger(manejoSQL.class.getName()).log(Level.SEVERE, null, ex);
      }

        return consulta;
    }
    
      public static String consultarProductoNombre(String nombre)
    {
        String consulta="";
              try {         
          conn = conectarADb();
          Statement comando = conn.createStatement();
          String sql = "SELECT * FROM productos where nom_pro ='"+nombre+"'";
          ResultSet resultado = comando.executeQuery(sql);
          while(resultado.next()) {
                consulta=resultado.getString("cod_pro")+":";
                consulta=consulta+resultado.getString("nom_pro")+":";
                consulta=consulta+resultado.getString("val_pro")+":";
                String[] Datos=resultado.getString("des_pro").split("%");
                consulta=consulta+Datos[0];
            }
      } catch (SQLException ex) {
//          Logger.getLogger(manejoSQL.class.getName()).log(Level.SEVERE, null, ex);
      }

        return consulta;
    }
    
    public static String modificarProducto (String codigoAnt,String codigo ,String nombre,String fechaven, String cantidad, String valor,String tipo,String descuento){
        Producto producto = new Producto();
        if (!codigoAnt.equals(codigo))
            producto = consultarProducto(codigo);
        if (producto.getCodigo()==null){
            try {
                conn = conectarADb();
                if(conn!=null){
                    PreparedStatement st;        
                    String nombreTabla = "productos";
                    String statement = "UPDATE " +nombreTabla+ " SET cod_pro = '"+codigo+"', nom_pro = '"+nombre+"', fcad_pro = '"
                            +fechaven+"', can_pro = '"+cantidad+"', val_pro = '"+valor+"', tip_pro = '"+tipo+"', des_pro = '"+descuento+"' WHERE cod_pro = '"+codigoAnt+"'";
                    st = conn.prepareStatement(statement);
                    st.executeUpdate(); 
                    return "Modificado con éxito!";
                }else {return "Error al conectar con la base de datos";}
            }catch (SQLException ex) {
                return "Error con la base de datos";
            }
        }else{return "Ya exite ese número de código";}
    }   
       
    public static String desactivarProducto(String codigo,boolean dato, String razon){
        try {
            conn = conectarADb();
            PreparedStatement st;        
            String nombreTabla = "productos";
            String statement = "UPDATE " +nombreTabla+ " SET estado = '"+dato+"', raz_pro = '"+razon+"' WHERE cod_pro = '"+codigo+"'";
            st = conn.prepareStatement(statement);
            st.executeUpdate(); 
            if (!dato)
                return "Desactivado con exito!";
            else
                return "Activado con exito!";
        }catch (SQLException ex) {
            return "Error al desactivar";
        }
    }
       
    public static ArrayList<Producto> listaProductos(Boolean dato) {
        ArrayList<Producto> lista = new ArrayList<Producto>();
       
        try {         
            conn = conectarADb();
            if (conn!=null){
                Statement comando = conn.createStatement();
                String sql = "SELECT * FROM productos WHERE estado = "+dato;
                ResultSet resultado = comando.executeQuery(sql);
                while(resultado.next()) {
                    Producto consulta = new Producto();
                    consulta.setCodigo(resultado.getString("cod_pro"));
                    consulta.setNombre(resultado.getString("nom_pro"));
                    consulta.setFechaCaducidad(resultado.getString("fcad_pro"));
                    consulta.setCantidad(resultado.getString("can_pro"));
                    consulta.setValor(resultado.getString("val_pro"));
                    consulta.setTipo(resultado.getString("tip_pro"));
                    consulta.setMotivo(resultado.getString("raz_pro"));
                    String[] des = resultado.getString("des_pro").split("%");;
                    consulta.setDescuento(des[0]);
                    lista.add(consulta);
                }
            }
        } catch (SQLException ex) {
            //error al conectar con la base de datos
        }
        return lista;
    }
    
    
    
//    
//        public static Empleado consultarEmpleadoNick(String Nick)
//    {
//      Empleado consulta = new Empleado();
//      try {         
//          conn = conectarADb();
//          Statement comando = conn.createStatement();
//          String sql = "SELECT * FROM empleado where nick ='"+Nick+"'";
//          ResultSet resultado = comando.executeQuery(sql);
//          while(resultado.next()) {
//                consulta.setNombre(resultado.getString("nombre"));
//                consulta.setApellido(resultado.getString("apellido"));
//                consulta.setCedula(resultado.getString("cedula"));
//                consulta.setDireccion(resultado.getString("direccion"));
//                consulta.setTelefono(resultado.getString("telefono"));
//                consulta.setEmail(resultado.getString("email"));
//                consulta.setSexo(resultado.getString("sexo"));
//                consulta.setCargo(resultado.getString("cargo"));
//                consulta.setSueldoBase(resultado.getString("sueldobase"));
//                consulta.setNick(resultado.getString("nick"));
//                consulta.setContraseña(resultado.getString("contrasena"));
//                consulta.setPreguntaSecreta(resultado.getString("preguntaseg"));
//                consulta.setRespuestaSecreta(resultado.getString("respuestaseg"));
//                consulta.setFnac(resultado.getString("fechanac"));
//             }
//          
//      } catch (SQLException ex) {
////          Logger.getLogger(manejoSQL.class.getName()).log(Level.SEVERE, null, ex);
//      }
//      return consulta;
//    }
//    
    //PROCEDIMIENTOS PARA EL INICIO DE SESION DEL CLIENTE
    
    public static String iniciarSesionCliente (String nick, String password)
    {
        String respuesta = "Usuario incorrecto";
        try {         
            conn = conectarADb();
            Statement comando = conn.createStatement();
            String sql = "SELECT * FROM empleados WHERE nick_emp ='"+nick+"' AND con_emp = '"+password+"'";
            ResultSet resultado = comando.executeQuery(sql);
            if(resultado.next()) {
                respuesta = "Usuario Correcto/"+resultado.getString("car_emp");
            }
        } catch (SQLException ex) {
            //  No se pudo establecer conexión
            return "Error al conectar con la base de datos";
        }
        return respuesta;
    }
    
    public static String recuperarContraseña (String nick, String pregunta, String respuesta)
    {
        String res = "Datos incorrectos";
        try {         
            conn = conectarADb();
            Statement comando = conn.createStatement();
            String sql = "SELECT * FROM empleados WHERE nick_emp ='"+nick+"' AND preg_emp = '"+pregunta+"' AND resp_emp = '"+respuesta+"'";
            ResultSet resultado = comando.executeQuery(sql);
            if(resultado.next()) {
                res = "Datos Correctos";
            }
        } catch (SQLException ex) {
            //  No se pudo establecer conexión
            return "Error al conectar con la base de datos";
        }
        return res;
    }
    
    public static String modificarContraseña (String nick, String contraseña)
    {
        try {         
           conn = conectarADb();
            PreparedStatement st; 
            String nombreTabla = "empleados";
            String statement = "UPDATE " +nombreTabla+ " SET con_emp = '"+contraseña+"' WHERE nick_emp = '"+nick+"'";
            st = conn.prepareStatement(statement);
            st.executeUpdate();  
            return "Empleado desactivado con éxito!";
        } catch (SQLException ex) {
            //  No se pudo establecer conexión
            return "No se pudo establecer conexión";
        }
    }
    
    //PROCEDIMIENTOS DE CONEXION CON LA BASE DE DATOS
    
    private static Connection conectarADb() throws SQLException
    {
        Connection conn = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/UcabFetin";
            conn = DriverManager.getConnection(url,"postgres", "1011011");
        }
        catch (ClassNotFoundException e)
        {
            
        }
        catch (SQLException e)
        {
            
        }
        return conn;
    }
    
    public static String comprobarConexionBDD(){
      try {
          conn = conectarADb();
          if (conn!=null){
              return "Conexion establecida";
          }else{return "Error al conectar a la base de datos";}
      } catch (SQLException ex) {
          return "Exception";
      }
    }
    
    public static String realizarVenta(Ventas venta){
            try 
            {
                conn = conectarADb();
                if (conn!=null){
                    PreparedStatement st;
                    String nombreBD = "ventas";
                    String productos="";
                    DecimalFormat decimales = new DecimalFormat("0.00");
                    String cliente=venta.getCliente().getNombre()+":"+venta.getCliente().getDireccion()+":"+
                                    venta.getCliente().getCedula()+":"+venta.getCliente().getTelefono();
                    for(int i=0;i<venta.getProductos().size();i++){
                        if (i==0){
                            productos=venta.getProductos().get(i).getNombre()+"/"+venta.getProductos().get(i).getCantidad()+"/"+venta.getProductos().get(i).getValor()+":";
                        }else{
                            if (i==venta.getProductos().size()-1){
                                productos=productos+venta.getProductos().get(i).getNombre()+"/"+venta.getProductos().get(i).getCantidad()+"/"+venta.getProductos().get(i).getValor();
                            }else{productos=productos+venta.getProductos().get(i).getNombre()+"/"+venta.getProductos().get(i).getCantidad()+"/"+venta.getProductos().get(i).getValor()+":";}
                        }
                        descontarProducto(venta.getProductos().get(i));
                    }
                    String statement = "INSERT INTO " +nombreBD+ "(\n" +
                    " pro_ven, cli_ven, tot_ven, mon_ven, iva_ven, tar_ven, cla_ven, pag_ven,emp_ven, fec_ven) VALUES ("
                    +"'"+productos+"','"+cliente+"','"+decimales.format(venta.getTotal())+"','"+decimales.format(venta.getMonto())
                    +"','"+"12"+"','"+String.valueOf(venta.getTarjeta())+"','"+String.valueOf(venta.getClave())+"','"+venta.getFormaPago()
                    +"','"+venta.getEmpleado()+"', '"+String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(venta.getFecha()))+"')";
                    try{
                        st = conn.prepareStatement(statement);
                        st.executeUpdate();
                        return "Venta realizada";}
                    catch(Exception e){
                        return "Error al insertar en la tabla";
                    }
                }else{return"Error al conectar con la base de datos";}
            }
            catch (SQLException se) {
                return "No se pudo establecer conexión con la base de datos";
            }
    }
    
    private static void descontarProducto(Producto producto){
        try {         
            int cantidadTabla,cantidadProducto=Integer.parseInt(producto.getCantidad());
            Producto obj = consultarProducto(producto.getCodigo());
            cantidadTabla=Integer.parseInt(obj.getCantidad());
            conn = conectarADb();
            if (conn!=null){
            PreparedStatement st; 
            String statement = "UPDATE productos SET can_pro = '"+String.valueOf(cantidadTabla-cantidadProducto)+"' WHERE cod_pro = '"+producto.getCodigo()+"'";
            st = conn.prepareStatement(statement);
            st.executeUpdate();  
            }
        } catch (SQLException ex) {
            //  No se pudo establecer conexión
        }
        
    }
    
}