/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author andre
 */
public abstract class Transacciones {

    protected int Id;
    protected String cuenta;
    protected String cuentadestino;
    protected double monto;
    protected double saldoanterior;
    protected double saldofinal;
    protected double saldoanteriordestino;
    protected double saldofinaldestino;

    public int getId() {
        return Id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getCuentadestino() {
        return cuentadestino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldoanterior() {
        return saldoanterior;
    }

    public double getSaldofinal() {
        return saldofinal;
    }

    public double getSaldoanteriordestino() {
        return saldoanteriordestino;
    }

    public double getSaldofinaldestino() {
        return saldofinaldestino;
    }

    public abstract void Transaccion();

    public Transacciones(int Id, String cuenta, double monto, double saldoanterior, double saldofinal) {
        this.Id = Id;
        this.cuenta = cuenta;
        this.monto = monto;
        this.saldoanterior = saldoanterior;
        this.saldofinal = saldofinal;
    }

    public Transacciones(int Id, String cuentaorigen, String cuentadestino, double monto, double saldoanterior, double saldofinal, double saldoanteriordestino, double saldofinaldestino) {
        this.Id = Id;
        this.cuenta = cuentaorigen;
        this.cuentadestino = cuentadestino;
        this.monto = monto;
        this.saldoanterior = saldoanterior;
        this.saldofinal = saldofinal;
        this.saldoanteriordestino = saldoanteriordestino;
        this.saldofinaldestino = saldofinaldestino;
    }

}
