/**
 * Clase que extiende cuenta bancaria
 */
public class CuentaCorriente extends CuentaBancaria {
	private int interes;
	
	/**
	 * Constructor por defecto
	 * 
	 * @param titular
	 * @param saldoInicial
	 */
	public CuentaCorriente(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		this.interes = interes;
	}
	
	/**
	 * Método que calcula el interes
	 * @param comision
	 * @return interes
	 */
	public double calcularInteres(int comision) {
		interes = comision;
		return interes;

	}

}
