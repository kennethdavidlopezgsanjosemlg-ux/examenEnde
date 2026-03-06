
public class CuentaAhorro extends CuentaBancaria {
	private double comision;

	public CuentaAhorro(String titular, double saldoInicial,double interes) {
		super(titular, saldoInicial);
		this.comision=comision;
		
	}
	
	public double calcularInteres(int interes) {
		double interesCobrado = this.saldo * interes;
		
		return interesCobrado;
	}


}
