/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Joyce
 */
public class TarjetaCredito {
    //Atributos
   protected int numeroTarjeta;    
   protected String cuenta;
   protected String fechaCorte;
   protected Double limite;
   protected Double saldo;
   
   //Metodos

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public Double getLimite() {
        return limite;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    //Constructor

    public TarjetaCredito(int numeroTarjeta, String cuenta, String fechaCorte, Double limite, Double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.cuenta = cuenta;
        this.fechaCorte = fechaCorte;
        this.limite = limite;
        this.saldo = saldo;
    }
    

   
}
