
public class CuentaAhorro extends CuentaBancaria {
	private double interes;

	public CuentaAhorro(String titular, double saldoInicial,double interes) {
		super(titular, saldoInicial);
		this.interes=interes;
		
	}
	
	public int calcularInteres() {
		int interesCobrado = (int) (this.saldo * interes);
		
		return interesCobrado;
	}


}
