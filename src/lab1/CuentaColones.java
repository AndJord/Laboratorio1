
package lab1;

/**
 *
 * @author ADMIN
 */
public class CuentaColones {
    private Integer numeroCuenta;
    private double saldoCliente;

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public CuentaColones(Integer numeroCuenta, double saldoCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCliente = saldoCliente;
    }  
    
}

