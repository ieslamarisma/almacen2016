import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MayorNumeroTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 // [3, 7, 9, 8] → 9;  caso normal
	@Test
	public void testObt_mayorNumero() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(9,Mayor.obt_mayorNumero(new int[] {3,7,9,8}));
		}
	
	
	 // [9, 7, 8] → 9;     al principio
	
	@Test
	public void testObt_mayorNumeroprincipio() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(9,Mayor.obt_mayorNumero(new int[] {9,7,8}));
		}
	
	 // [7, 9, 8] → 9;     en medio
	
	@Test
	public void testObt_mayorNumeromedio() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(9,Mayor.obt_mayorNumero(new int[] {7,9,8}));
		}
	
	// [7, 8, 9] → 9;     al final
	
	@Test
	public void testObt_mayorNumerofinal() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(9,Mayor.obt_mayorNumero(new int[] {7,8,9}));
		}
	
	 // [9, 7, 9, 8] → 9   se encuentra duplicado
	
	@Test
	public void testObt_mayorNumeroduplicado() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(9,Mayor.obt_mayorNumero(new int[] {9,7,9,8}));
		}
	
	
	 //   [7] → 7          con un solo elemento
	
	
	@Test
	public void testObt_mayorNumerosolo() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(7,Mayor.obt_mayorNumero(new int[] {7}));
		}
	
//  [-4, -6, -7, -22] → -4    compuesto por números negativos
	
	
	
	@Test
	public void testObt_mayorNumeronegativo() {
		MayorNumero Mayor = new MayorNumero();
		assertEquals(-4,Mayor.obt_mayorNumero(new int[] {-4,-6,-7,-22}));
		}
	
	

}
