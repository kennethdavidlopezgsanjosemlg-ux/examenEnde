/**
 * Clase principal que inicaliza la cuenta de banco
 */
public abstract class CuentaBancaria {
	/** Variable que guarda el nombre del titular */
    protected String titular;
    /**Variable que guarda el saldo de la persona */
    protected double saldo;
    
    /**
     * Constructor por defecto
     * @param titular
     * @param saldoInicial
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    /**
     * Obtiene el nombre  del titular
     * @return
     */
    public String getTitular() {
        return titular;
    }
    
    /**
     * Obtiene el saldo
     * @return
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método que aumenta a el saldo una cantidad
     * @param cantidad
     */
    public void ingresar(double cantidad) {

        saldo += cantidad;
    }
    
    /**
     * Método que resta una cantidad al saldo
     * @param cantidad
     */
    public void reintegrar(double cantidad) {

        saldo -= cantidad;
    }

}
