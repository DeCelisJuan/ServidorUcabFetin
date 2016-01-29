package controlador;

import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import modelo.Producto;
import modelo.TablaModeloProDes;
import modelo.TablaModeloProductos;
import modelo.TablaRenderizadorProductos;

/**
 * @author DrowSoft
 */
public class InterfazInventario {
    
    public void llenarTablaDesactivados(JTable tabla){
       TablaModeloProDes modelo = new TablaModeloProDes();
        TablaRenderizadorProductos renderizador = new TablaRenderizadorProductos();
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(String.class, renderizador);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setRowHeight(20);
        setAnchoColumnas(tabla);
        Iterator<Producto> it = conexionSQL.listaProductos(false).iterator();
        while (it.hasNext())  {
            Producto objProducto = it.next();  
            modelo.agregarCliente(objProducto);
        }
    }
    
    public void llenarTabla(String parametro, String dato,JTable tabla){
        TablaModeloProductos modelo = new TablaModeloProductos();
        TablaRenderizadorProductos renderizador = new TablaRenderizadorProductos();
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(String.class, renderizador);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setRowHeight(30);
        setAnchoColumnas(tabla);
        Iterator<Producto> it = conexionSQL.listaProductos(true).iterator();
        while (it.hasNext())  {
            Producto objProducto = it.next();  
            if(parametro.equals("Código")){
                if(objProducto.getCodigo().contains(dato)){
                    modelo.agregarCliente(objProducto);
                }
            }
            if(parametro.equals("Nombre")){
                if(objProducto.getNombre().contains(dato)){
                    modelo.agregarCliente(objProducto);
                }
            }
            if(parametro.equals("Todos")){modelo.agregarCliente(objProducto);}
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
