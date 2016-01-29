package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import modelo.Empleado;
import modelo.TablaModeloEmpleados;
import modelo.TablaRenderizadorEmpleados;
import controlador.conexionSQL;
import modelo.TablaModeloEmpEli;

/**
 * @author DrowSoft
 */
public class InterfazGestionUsuarios {
    
    public String agregarpregunta(JComboBox box, JTextField texto){
        if (box.getItemAt(box.getSelectedIndex()).equals("Escribir otra pregunta...")) {
            return texto.getText();
        }else{
            return box.getSelectedItem().toString();
        }
    }
    
    public void copiar(File original, File copia){ 
        FileInputStream archivoOriginal = null; 
        FileOutputStream archivoCopia = null; 
        if((original != null)&&(copia != null)){ 
            try{ 
                copia.createNewFile(); 
                archivoOriginal = new FileInputStream(original); 
                archivoCopia = new FileOutputStream(copia); 
        //lectura por segmentos de 0.5MB 
                byte buffer[] = new byte[512*1024]; 
                int nbLectura; 
                while((nbLectura=archivoOriginal.read(buffer)) != -1){ 
                    archivoCopia.write(buffer,0,nbLectura); 
                } 
            }catch(FileNotFoundException fnf){ 
            }catch(IOException io){ 
            }finally{ 
                try{ 
                    archivoOriginal.close(); 
                }catch(Exception e){} 
                try{ 
                    archivoCopia.close(); 
                }catch(Exception e){} 
            }
        }
    }
    
     public boolean comprobarPregunta(JComboBox box, JTextField texto){
        if (box.getSelectedItem().toString().equals("Escribir otra pregunta...")){
            if (texto.getText().equals("")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public String fecha(Date fechaRecibida){
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(fechaRecibida);
        return fecha;
    }
     
    public String sexo(JCheckBox chek){
        if (chek.isSelected()){ return "F";
        }else{return "M";}
    }
 
    public void llenarTablaEliminados(JTable tabla){
        TablaModeloEmpEli modelo = new TablaModeloEmpEli();
        TablaRenderizadorEmpleados renderizador = new TablaRenderizadorEmpleados();
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(String.class, renderizador);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setRowHeight(20);
        setAnchoColumnas(tabla);
        Iterator<Empleado> it = conexionSQL.listaEmpleados(false).iterator();
        while (it.hasNext())  {
            Empleado objEmpleado = it.next();  
            modelo.agregarCliente(objEmpleado);
        }
    }
    
      
    public void llenarTabla(String parametro, String dato,JTable tabla){
        TablaModeloEmpleados modelo = new TablaModeloEmpleados();
        TablaRenderizadorEmpleados renderizador = new TablaRenderizadorEmpleados();
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(String.class, renderizador);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setRowHeight(30);
        setAnchoColumnas(tabla);
        Iterator<Empleado> it = conexionSQL.listaEmpleados(true).iterator();
        while (it.hasNext())  {
            Empleado objEmpleado = it.next();  
            if(parametro.equals("Cédula")){
                if(objEmpleado.getCedula().contains(dato)){
                    modelo.agregarCliente(objEmpleado);
                }
            }
            if(parametro.equals("Nombre")){
                if(objEmpleado.getNombre().contains(dato)){
                    modelo.agregarCliente(objEmpleado);
                }
            }
            if(parametro.equals("Todos")){modelo.agregarCliente(objEmpleado);}
        }
        
    }
    
    public void setAnchoColumnas(JTable tabla) {
        JViewport scroll = (JViewport) tabla.getParent();
        int ancho = scroll.getWidth();
        int anchoColumna = 0;
        TableColumnModel modeloColumna = tabla.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            switch (i) {
                case 0:
                    anchoColumna = 70;
                    break;
                case 1:
                    anchoColumna = 150;
                    break;
                case 2:
                    anchoColumna = 90;
                    break;
            }
            columnaTabla.setPreferredWidth(anchoColumna);
        }
    }
    
}
