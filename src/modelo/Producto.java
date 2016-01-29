package modelo;

import java.io.Serializable;

/**
 * @author DrowSoft
 */
public class Producto implements Serializable{
    private String codigo,nombre,fechaCaducidad,cantidad,valor,tipo,motivo,descuento;
    
    
    public Producto() {
        this.codigo = null;
        this.nombre = null;
        this.fechaCaducidad = null;
        this.cantidad = null;
        this.valor = null;
        this.tipo = null;
        this.motivo = null;
        this.descuento = null;
    }


    public Producto(String codigo, String nombre, String fechaCaducidad, String cantidad, String valor, String tipo,String motivo,String descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.cantidad = cantidad;
        this.valor = valor;
        this.tipo = tipo;
        this.motivo = motivo;
        this.descuento = descuento;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String imagen) {
        this.motivo = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
