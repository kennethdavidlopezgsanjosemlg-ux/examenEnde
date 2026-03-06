public abstract class CuentaBancaria {

    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
    	if (cantidad > 0) {
    		throw new IllegalArgumentException("La cantidad no puede ser negativa");
    		
    	}
        saldo += cantidad;
    }

    public void reintegrar(double cantidad) {
    	if (cantidad > 0) {
    		throw new IllegalArgumentException("La cantidad no puede ser negativa");
    		
    	} else if (cantidad > saldo) {
    		throw new IllegalArgumentException("La cantidad no puede ser mayor a la cantidad de saldo");
    		
    	}

        saldo -= cantidad;
    }

}
