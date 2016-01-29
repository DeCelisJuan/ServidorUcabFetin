/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import controlador.conexionSQL;

/**
 *
 * @author Rolando
 */
public class TablaRenderizadorEmpleados implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel etiqueta = new JLabel(); //Creamos el label que se mostrará en la tabla
        etiqueta.setOpaque(true);// Colocamos el label opaco para poder colorearlo y mostrarlo del color deseado
        etiqueta.setBackground(new Color(204,204,255));// Coloriamos la label 
        //En este caso preguntamos si es la columna 1 ya que esa es la que contiene el nombre del empleado
        //y es en esta donde colocaremos la imagen
       
        if (column == 1) {
            String mensaje = (String) value; // Le asignamos a una variable el mensaje recibido del modelo...
            String[] datos = mensaje.split("/");//Separamos el mensaje en cada / que aparezca, y creamos un arreglo con estas divisiones
            etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//Alineamos el texto en el centro
            ImageIcon imagen = new ImageIcon("src/imagenes/Empleados/"+datos[1]);//Creamos la imagen a mostrar con la direccion que recibimos del modelo 
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));//Creamos el icono con la imagen a un tamaño de 20x20 
            etiqueta.setIcon(icono);//Colocamos el icono creado en el label
            etiqueta.setText(value.toString().substring(0, datos[0].length()));//Escribimos en el label el texto recibido del modelo
        } else {//Cuando no estamos en la columna del nombre, solo escribimos el texto y lo ponemos en el centro...
            etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            etiqueta.setText(value.toString());
        }
        //Este if es para colorear la fila si a sido seleccionada
        if (isSelected) {etiqueta.setBackground(new Color(151, 193, 215));}
        return etiqueta;//retornamos el label...
    }
}
