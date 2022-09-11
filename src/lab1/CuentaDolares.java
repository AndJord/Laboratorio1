
package lab1;

/**
 *
 * @author ADMIN
 */
public class CuentaDolares {
    private Integer numeroCuenta;
    private double saldoCliente;
    private double tipoCambio;

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }
    
    

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(Integer numeroCuenta, double saldoCliente, double tipoCambio) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCliente = saldoCliente;
        this.tipoCambio = tipoCambio;
    }
    
    
    
}
