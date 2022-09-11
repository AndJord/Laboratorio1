/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Banco {
    //Atributos
    protected String ListaCliente;
    protected String nombre;
    protected String correo;
    protected Integer telefono;
    protected int edad;
    private ArrayList<Clientes> ListaClientes;
    
    //Metodos

    public String getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(String ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Constructor

    public Banco(String ListaCliente, String nombre, String correo, Integer telefono, int edad, ArrayList<Clientes> ListaClientes) {
        this.ListaCliente = ListaCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.ListaClientes = ListaClientes;
    }
    
    
    
}
