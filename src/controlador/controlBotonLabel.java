package controlador;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author DrowSoft
 */
public class controlBotonLabel {
        public void imagenBoton(JButton boton,String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage()); 
        boton.setIcon(icono);
    }
     public void imagenLabel(JLabel label,String ruta,int ancho, int largo){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho,largo,Image.SCALE_DEFAULT)); 
        label.setIcon(icono);
    }
}
