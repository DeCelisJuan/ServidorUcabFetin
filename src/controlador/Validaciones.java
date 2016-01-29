package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author DrowSoft
 */
public class Validaciones {
    
    public boolean validarDecimales(String valor){
        if (valor.contains(",")){
            String[] partes = valor.split(",");
            if (partes[1].length() == 2){
                return true;}
            else{ return false;}
        }else{return true;}
    }
    
    public String fechaString(Date fechaRecibida){
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(fechaRecibida);
        return fecha;
    }
    
    public boolean validarNumero(char letra){
        if((letra>47 && letra<58)){
            return true;
        }else{return false;}
    }
    
    public boolean validarLetras(char letra){
        if((letra>64 && letra<91)||(letra>96 && letra<123)||(letra==209)||(letra==241)){
            return true;
        }else{return false;}
    }
    
    public boolean validarEspeciales(char letra){
        if((letra>00 && letra<8)||(letra>8 && letra<10)||(letra>10 && letra<32) ||(letra>32 && letra<48) || (letra>57 && letra<65) || (letra > 90 && letra < 97)||(letra>122 && letra<127)||(letra>127 && letra<209)||(letra>209 && letra<241)||(letra>241 && letra<255)){
            return true;
        }else{return false;}
    }
    
    public boolean comprobarEmail(String emailRecibido){
        String email= emailRecibido;
        for (int i=0; i<email.length();i++){
            if (email.charAt(i)=='@'){
                email=email.substring(i,email.length());
                email=email.trim();
                if (email.equals("@gmail.com")||email.equals("@hotmail.com")||email.equals("@yahoo.com")||email.equals("@outlook.com")
                    ||email.equals("@hotmail.es")||email.equals("@yahoo.es")||email.equals("@outlook.es")){
                    return true;
                }else{return false;}
            }
        }
        return false;
    }
      
    public String comprobarFecha(Date fecha){
        if (fecha!=null){
            Date fechab = new Date();
            String fechaHoy = new SimpleDateFormat("dd/MM/yyyy").format(fechab);
            String fechaIngresada = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
            String[] Datos = fechaIngresada.split("/");
            String[] Datos2 = fechaHoy.split("/");
            
            int añoIngresado=Integer.parseInt(Datos[2]), añoActual=Integer.parseInt(Datos2[2]);
            int mesIngresado=Integer.parseInt(Datos[1]), mesActual=Integer.parseInt(Datos2[1]);
            int diaIngresado=Integer.parseInt(Datos[0]), diaActual=Integer.parseInt(Datos2[0]);
            
            if (añoIngresado>(añoActual-16)){
                return "Debe tener mas de 16 años";
            }else{
                if (añoIngresado==(añoActual-16)){
                    if (mesIngresado>mesActual){
                        return "Debe tener mas de 16 años";
                    }else{
                        if (diaIngresado>diaActual){
                            return "Debe tener mas de 16 años";
                        }
                    }
                }if (añoIngresado<(añoActual-80)){
                    return "no debe tener mas de 80 años";
                    
                }else{
                    return "Correcto";
                }
            }
        }else{
            return "fecha inválida";
        }
    }
    
    public String validarFechaProducto(Date fecha){
        if (fecha!=null){
            Date fechab = new Date();
            String fechaHoy = new SimpleDateFormat("dd/MM/yyyy").format(fechab);
            String fechaIngresada = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
            String[] Datos = fechaIngresada.split("/");
            String[] Datos2 = fechaHoy.split("/");
            
            int añoIngresado=Integer.parseInt(Datos[2]), añoActual=Integer.parseInt(Datos2[2]);
            int mesIngresado=Integer.parseInt(Datos[1]), mesActual=Integer.parseInt(Datos2[1]);
            int diaIngresado=Integer.parseInt(Datos[0]), diaActual=Integer.parseInt(Datos2[0]);
            
            if (añoIngresado<(añoActual)){
                return "No puede registrar un producto caducado";
            }else{
                if (añoIngresado==(añoActual)){
                    if (mesIngresado<mesActual){
                        return "No puede registrar un producto caducado";
                    }else{
                        if (mesIngresado==mesActual){
                            if (diaIngresado<diaActual){
                                return "No puede registrar un producto caducado";
                            }else {return "Correcto";}
                        }else{
                            return "Correcto";
                        }
                    }
                }else{
                    return "Correcto";
                }
            }
        }else{
            return "fecha inválida";
        }
    
    }
}
