package lab1;

import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Clientes {
    private String nombre;
    private String apellido;
    private String cedula;
    private Integer fechaNacimiento;
    private String correo;
    private Integer telefono;
    private int edad;
    private ArrayList<CuentaDolares> listaCuentaDolares;
    private ArrayList<CuentaColones> listaCuentaColones;
   
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public Clientes(String nombre, String apellido, String cedula, Integer fechaNacimiento,
            String correo, Integer telefono, int edad,
            ArrayList<CuentaDolares> listaCuentaDolares,
            ArrayList<CuentaColones> listaCuentaColones) {
        
        this.nombre = nombre;
        this.apellido = apellido;
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
        listaCuentaColones.remove(dolar);
      }
    
     public void eliminarCuentaColon(CuentaColones colones){
        listaCuentaColones.remove(colones);
      }
     
}


