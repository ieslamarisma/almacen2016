import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SumaTest {

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

	@Test
	public void testSumapositivo() {
		Suma javier= new Suma(9,7);
		assertEquals(16,javier.sumar());
		//assertTrue(javier.sumar()==16);
		//fail("Not yet implemented");
	}

	@Test
	public void testSumanegativo() {
		Suma javier2 = new Suma(-8,-4);
		assertTrue(javier2.sumar()==-12);
		
		//fail("Not yet implemented");
	}

}
