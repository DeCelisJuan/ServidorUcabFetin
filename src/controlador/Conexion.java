package controlador;

import java.io.IOException;
import java.net.ServerSocket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import modelo.Empleado;
import modelo.ListaEmpleados;
import modelo.ListaProducto;
import modelo.Producto;
import modelo.Ventas;

/**
 * @author DrowSoft
 */

public class Conexion {
    ListaProducto lista = new ListaProducto();
    ListaEmpleados listaEmpleados = new ListaEmpleados();
    String mensajeSalida="";
    String mensajeEntrada="";
    ObjectOutputStream respuesta;
    ObjectInputStream entrada;
    
    public void iniciarServidor(){
        try {
        //1 - Creamos el servidor en el puerto 1000
        ServerSocket servidor = new ServerSocket(1000);
        while(true){
            //2 - Esperamos que un cliente se conecte
                Socket cliente = servidor.accept();
            //3 - Creamos el objeto de entrada para poder recibir el mensaje
                entrada = new ObjectInputStream(cliente.getInputStream());
                //3.1 - Asiganamos el mensaje recibido a la variable string
                mensajeEntrada= (String) entrada.readObject();
                //Si el mensaje es cerrar es que el cliente que se conectó fue el administrador y cerró la conexión
                if (mensajeEntrada.equals("Cerrar")){
                    entrada.close(); //Cortamos la entrada
                    cliente.close(); //Cortamos la conexion con el cliente
                    servidor.close(); //Cortamos el servidor
                    break; // rompemos el ciclo
                }
                if (mensajeEntrada.equals("Conexion")){
                    mensajeSalida=conexion(mensajeEntrada);
                }
                //Divimos el mensaje en un vecto separado por los :
                String[] Datos = mensajeEntrada.split(":");
                //Se comprueba el mensaje de la posicion 0 y se llama al procedimiento correspondiente
                if (Datos[0].equals("Login")){
                    mensajeSalida=login(mensajeEntrada);
                }else{
                    if (Datos[0].equals("recuperarContraseña")){
                        mensajeSalida=recuperarContra(mensajeEntrada);
                    }else{
                        if (Datos[0].equals("modificarContraseña")){
                            mensajeSalida=modificarContra(mensajeEntrada);
                        }else{
                            if (Datos[0].equals("listaProductos")){
                                lista.setLista(listaProductos());
                                mensajeSalida="Lista";
                            }else{
                                if (Datos[0].equals("listaEmpleados")){
                                    listaEmpleados.setLista(listaEmpleados()); 
                                    mensajeSalida="ListaEmpleados";
                                }else{
                                    if (Datos[0].equals("Venta")){
                                        respuesta = new ObjectOutputStream(cliente.getOutputStream());
                                        respuesta.writeObject("Envia objeto");
                                        entrada = new ObjectInputStream(cliente.getInputStream());
                                        //3.1 - Asiganamos el mensaje recibido a la variable string
                                        Ventas venta = (Ventas) entrada.readObject();
                                        mensajeSalida=realizarVenta(venta);
                                    }
                                }
                            }
                        }
                    }
                }
                //Si el mensaje es Lista quiere decir que lo que se enviara es un objeto tipo Lista
                if (mensajeSalida.equals("Lista")){
                    respuesta = new ObjectOutputStream(cliente.getOutputStream());
                    respuesta.writeObject(lista);
                }else{
                    if (mensajeSalida.equals("ListaEmpleados")){
                        respuesta = new ObjectOutputStream(cliente.getOutputStream());
                        respuesta.writeObject(listaEmpleados);
                    }else{//Si no lo que se envia es un String
                        respuesta = new ObjectOutputStream(cliente.getOutputStream());
                        respuesta.writeObject(mensajeSalida);
                    }
                }
                entrada.close();
//                respuesta.close();
                cliente.close();
            }
        }catch (IOException ex){ //Error inesperado
            System.out.println("Error inesperado");
        }catch (ClassNotFoundException ex) {//Error al asiganar el mensaje a una variable(....readObject())
            System.out.println("Error de lectura, la clase no existe");
        }
        
    }
    
    public ArrayList<Producto> listaProductos(){
        return conexionSQL.listaProductos(true);
    }
    
    public ArrayList<Empleado> listaEmpleados(){
        return conexionSQL.listaEmpleados(true);
    }
    
    private String conexion(String mensaje){
        return "Si hay conexion";
    }
    
    public String login(String mensaje){
        String[] Datos = mensaje.split(":");
        return conexionSQL.iniciarSesionCliente(Datos[1], Datos[2]);
    }
    
    public String recuperarContra(String mensaje){
        String[] Datos = mensaje.split(":");
        return conexionSQL.recuperarContraseña(Datos[1], Datos[2], Datos[3]);
    }
    
     public String modificarContra(String mensaje){
        String[] Datos = mensaje.split(":");
        return conexionSQL.modificarContraseña(Datos[1], Datos[2]);
    }
     
    private String realizarVenta(Ventas venta){
        return conexionSQL.realizarVenta(venta);
    } 
}
