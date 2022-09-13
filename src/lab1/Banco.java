package lab1;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Banco {

    TarjetaDebito debito;
    TarjetaCredito credito;
    Transferencia transferir;
    Deposito depositar;
    Retiro retirar;
    //Atributos

    private String nombre;
    private String correo;
    private Integer telefono;
    private int edad;
    private ArrayList<Clientes> ListaClientes;
    private ArrayList<CuentaDolares> ListaCuentaDolares;
    private ArrayList<CuentaColones> ListaCuentaColones;
    private ArrayList<Transacciones> ListaTransacciones;
    //Metodos

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

    public void agregarClientes(Clientes cliente) {
        ListaClientes.add(cliente);
    }

    public void eliminarClientes(Clientes cliente) {
        ListaClientes.remove(cliente);
    }

    public void agregarCuentaDolar(CuentaDolares dolares) {
        ListaCuentaDolares.add(dolares);
    }

    public void agregarCuentaColon(CuentaColones colones) {
        ListaCuentaColones.add(colones);
    }

    public void eliminarCuentaDolar(CuentaColones dolar) {
        if (dolar.getSaldo() == 0) {
            ListaCuentaColones.remove(dolar);
        }
    }

    public void eliminarCuentaColon(CuentaColones colones) {
        if (colones.getSaldo() == 0) {
            ListaCuentaColones.remove(colones);
        }
    }

    public void agregarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.add(credito);

    }

    public void eliminarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.remove(credito);

    }

    public void asignarTarjetaDebito(Clientes cliente) {
        debito = new TarjetaDebito();
        cliente.listaTarjetaDebito.add(debito);
    }

    public void agregarTransferencia(Transferencia trasferir) {
        ListaTransacciones.add(transferir);
    }

    public void agregarDeposito(Deposito depositar) {
        ListaTransacciones.add(depositar);
    }

    public void agregarRetiro(Retiro retirar) {
        ListaTransacciones.add(retirar);
    }

    //Constructor
    public Banco(String nombre, String correo, Integer telefono, int edad, ArrayList<Clientes> ListaClientes) {
        this.ListaClientes = ListaClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.ListaClientes = ListaClientes;
    }

}
