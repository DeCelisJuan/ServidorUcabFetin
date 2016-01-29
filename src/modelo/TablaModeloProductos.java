package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author DrowSoft
 */
public class TablaModeloProductos extends AbstractTableModel {
    
    private String[] columnNames = {"Código", "Nombre", "Tipo"};//Creamos las columnas necesarias
    private List<Producto> productos = new ArrayList<Producto>();//Cremos una lista de productos

    public void agregarCliente(Producto producto) {
        productos.add(producto);//Añadimos el producto a la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    public void eliminarCliente(int rowIndex) {
        productos.remove(rowIndex);//Eliminamos el producto de la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex]; //Retorna el nombre de la columna indicada
    }

    @Override
    public int getRowCount() {
        return productos.size();//Retorna cuantas filas hay
    }

    @Override
    public int getColumnCount() {
        return 3;//Retorna cuantas columnas hay
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return productos.get(rowIndex).getCodigo();//Si estas en la columna 0 pasamos el codigo del producto
            case 1:
                return productos.get(rowIndex).getNombre();//Pasamos el nombre del producto
            case 2:
                return productos.get(rowIndex).getTipo();//Pasamos el tipo del producto
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;//Para que no se puedan modificar los datos de la tabla
    }

    @Override//Este procedimiento se usa por si se quiere modificar los datos de un producto desde la tabla, pero no lo usaremos...
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Producto producto = productos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                producto.setCodigo((String) value); 
            case 1:
                producto.setNombre((String) value);
            case 2:
                producto.setTipo((String) value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
