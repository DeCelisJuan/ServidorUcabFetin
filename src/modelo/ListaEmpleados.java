package modelo;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * @author DrowSoft
 */
public class ListaEmpleados implements Serializable{
    private ArrayList<Empleado> lista = new ArrayList<Empleado>();

    public ListaEmpleados() {
        lista= null;
    }

    public ArrayList<Empleado> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleado> lista) {
        this.lista = lista;
    }
    
    public int tamañoLista(){
        return lista.size();
    }
}
