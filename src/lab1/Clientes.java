package lab1;

import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Clientes {
    private String nombre;
    private String cedula;
    private Integer fechaNacimiento;
    private String correo;
    private Integer telefono;
    private int edad;
    private ArrayList<CuentaDolares> listaCuentaDolares;
    private ArrayList<CuentaColones> listaCuentaColones;
    private ArrayList<TarjetaCredito> listaTarjertaCredito;
   
    CuentaColones colones;
    CuentaDolares dolares;
    
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<CuentaDolares> getListaCuentaDolares() {
        return listaCuentaDolares;
    }

    public ArrayList<CuentaColones> getListaCuentaColones() {
        return listaCuentaColones;
    }

    public Clientes(String nombre, String cedula, Integer fechaNacimiento,
            String correo, Integer telefono, int edad,
            ArrayList<CuentaDolares> listaCuentaDolares,
            ArrayList<CuentaColones> listaCuentaColones) {
        
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.listaCuentaDolares = listaCuentaDolares;
        this.listaCuentaColones = listaCuentaColones;
    }
    
     public void agregarCuentaDolar(CuentaDolares dolares){
        listaCuentaDolares.add(dolares);
    }
     
     public void agregarCuentaColon(CuentaColones colones){
        listaCuentaColones.add(colones);
    }
     
    public void eliminarCuentaDolar(CuentaColones dolar){     
        if(dolares.getSaldo()==0){
        listaCuentaColones.remove(dolar);
        }
      }
    
     public void eliminarCuentaColon(CuentaColones colones){
         if(colones.getSaldo()==0){
        listaCuentaColones.remove(colones);
         }
      }
     
}


