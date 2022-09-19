
package Tarjetas;

/**
 *
 * @author Joyce
 */
public abstract class Tarjeta {
    //Atributos
    protected int numeroTarjeta;
    protected String cuenta;
    protected Tarjeta tarjetaDebito ;
    
    //Metodos

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCuenta() {
        return cuenta;
    }

    
    //Constructor

    public Tarjeta(int numeroTarjeta, String cuenta) {
        this.numeroTarjeta = numeroTarjeta;
        this.cuenta = cuenta;
    }
    
    
}
