package modelo;

import java.io.Serializable;

/**
 * @author DrowSoft
 */
public class Empleado extends Personas implements Serializable{
     String cargo,sueldoBase,nick,contraseña,fnac,preguntaSecreta,respuestaSecreta,observaciones,imagen;
    public Empleado( String nombre, String apellido, String cedula, String direccion, String telefono, String email, String sexo, String fnac,
                    String cargo, String sueldoBase,String nick,String contraseña,String preguntaSecreta, String respuestaSecreta,String observaciones,String imagen) {
        super(nombre, apellido, cedula, direccion, telefono, email, sexo);
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
        this.nick=nick;
        this.contraseña=contraseña;
        this.fnac=fnac;
        this.preguntaSecreta=preguntaSecreta;
        this.respuestaSecreta=respuestaSecreta;
        this.observaciones=observaciones;
        this.imagen=imagen;
    }

    public Empleado() {
        super();
        this.cargo = null;
        this.sueldoBase = null;
        this.nick=null;
        this.contraseña=null;
        this.fnac=null;
        this.preguntaSecreta=null;
        this.respuestaSecreta=null;
        this.observaciones=null;
        this.imagen=null;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(String sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFnac() {
        return fnac;
    }

    public void setFnac(String fnac) {
        this.fnac = fnac;
    }

    public String getPreguntaSecreta() {
        return preguntaSecreta;
    }

    public void setPreguntaSecreta(String preguntaSecreta) {
        this.preguntaSecreta = preguntaSecreta;
    }

    public String getRespuestaSecreta() {
        return respuestaSecreta;
    }

    public void setRespuestaSecreta(String respuestaSecreta) {
        this.respuestaSecreta = respuestaSecreta;
    }
}
