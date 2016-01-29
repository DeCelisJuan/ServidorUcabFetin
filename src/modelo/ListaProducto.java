package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Casa
 */
public class ListaProducto implements Serializable{
    private ArrayList<Producto> lista = new ArrayList<Producto>();

    public ListaProducto() {
        lista= null;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }
    
    public int tamañoLista(){
        return lista.size();
    }
    
}
