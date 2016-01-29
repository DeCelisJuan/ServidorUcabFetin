package modelo;

import java.io.Serializable;

/**
 * @author DrowSoft
 */

public class Personas implements Serializable{
    private String nombre,apellido,cedula,direccion,telefono,email,sexo;

    public Personas(){
        this.nombre = null;
        this.apellido = null;
        this.cedula = null;
        this.direccion = null; 
        this.telefono = null;
        this.email = null;
        this.sexo = null;
    }
    
    public Personas(String nombre, String apellido, String cedula, String direccion, String telefono, String email, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion; 
        this.telefono = telefono;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
