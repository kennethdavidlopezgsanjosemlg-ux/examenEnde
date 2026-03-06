/**
 * Clase que extiende a cuenta bancaria y añde un interes
 */
public class CuentaAhorro extends CuentaBancaria {
	/** Variable que guarda el interes de la cuenta*/
	private double interes;
	
	/**
	 * Constructor por defecto
	 * @param titular
	 * @param saldoInicial
	 * @param interes
	 */
	public CuentaAhorro(String titular, double saldoInicial,double interes) {
		super(titular, saldoInicial);
		this.interes=interes;
		
	}
	
	/**
	 * Método que calcula el interes de la cuenta
	 * @return el interes
	 */
	public int calcularInteres() {
		int interesCobrado = (int) (this.saldo * interes);
		
		return interesCobrado;
	}


}
