package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author DrowSoft
 */
public class Ventas implements Serializable {
    
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private Cliente cliente;
    private int iva,tarjeta,clave;
    private double monto,total;
    private String formaPago,empleado;
    private Date fecha;

    public Ventas(ArrayList<Producto> productos,Cliente cliente,double total, double monto, int iva, int tarjeta, int clave, String formaPago, String empleado, Date fecha) {
        this.productos=productos;
        this.cliente=cliente;
        this.total = total;
        this.monto = monto;
        this.iva = iva;
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.formaPago = formaPago;
        this.empleado = empleado;
        this.fecha = fecha;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Ventas() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double Total) {
        this.total = Total;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
    
    
}
