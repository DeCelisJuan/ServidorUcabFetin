package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author DrowSoft
 */
public class TablaModeloEmpEli  extends AbstractTableModel{
    
    private String[] columnNames = {"Cédula", "Nombre", "Motivo"};//Creamos las columnas necesarias
    private List<Empleado> empleados = new ArrayList<Empleado>();//Cremos una lista de empleados

    public void agregarCliente(Empleado empleado) {
        empleados.add(empleado);//Añadimos el empleado a la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    public void eliminarCliente(int rowIndex) {
        empleados.remove(rowIndex);//Eliminamos el empleado de la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex]; //Retorna el nombre de la columna indicada
    }

    @Override
    public int getRowCount() {
        return empleados.size();//Retorna cuantas filas hay
    }

    @Override
    public int getColumnCount() {
        return 3;//Retorna cuantas columnas hay
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return empleados.get(rowIndex).getCedula();//Si estas en la columna 0 pasamos la cedula del empleado
            case 1:
                return empleados.get(rowIndex).getNombre()+"/"+empleados.get(rowIndex).getImagen();//Pasamos el nombre y la direccion de la imagen
            case 2:
                return empleados.get(rowIndex).getObservaciones();//Pasamos el motivo de eliminacion
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

    @Override//Este procedimiento se usa por si se quiere modificar los datos de un empleado desde la tabla, pero no lo usaremos...
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Empleado empleado = empleados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                empleado.setCedula((String) value); 
            case 1:
                empleado.setNombre((String) value);
            case 2:
                empleado.setObservaciones((String) value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
}
