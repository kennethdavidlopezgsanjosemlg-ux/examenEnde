import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CuentaAhorroTest {
	private CuentaAhorro cuentaAhorro;
	private static ArrayList<CuentaAhorro> cuentasAhorro;
	private double interesEsperado;

	@BeforeClass
	public static void beforeClass() {
		cuentasAhorro = new ArrayList<>();

	}

	@AfterClass
	public static void afterClass() {
		cuentasAhorro = null;
	}

	@Before
	public void before() {
		cuentasAhorro.add(new CuentaAhorro("kenneth", 500, 0));
	}

	@After
	public void after() {
		cuentasAhorro.clear();
	}
	
	

	public CuentaAhorroTest(CuentaAhorro cuentaAhorro, double interesEsperado) {
		this.cuentaAhorro=cuentaAhorro;
		this.interesEsperado = interesEsperado;
	}



	@Parameters
	public static Collection<Object[]> parametros() { return Arrays.asList(new Object[][] {
		{new CuentaAhorro("kenneth",1000.0,0.05),50.0},
		{new CuentaAhorro("david",500.0,0.02),10.0},
		{new CuentaAhorro("lopez",2000.0,0.03),60.0},
		{new CuentaAhorro("carlos",1500.0,0.04),60.0},
		{new CuentaAhorro("johan",0.0,0.05),0.0}
	}); }
	
	@Test
	public void testInteres() {
		double interesReal = cuentaAhorro.calcularInteres();
		
		
		
	}
	
	@Ignore
	@Test
	public void testFiscal() {

	}

}
