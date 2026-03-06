
public class CuentaCorriente extends CuentaBancaria {
	private int interes;

	public CuentaCorriente(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		this.interes = interes;
	}

	public double calcularInteres(int comision) {
		interes = comision;
		return interes;

	}

}
