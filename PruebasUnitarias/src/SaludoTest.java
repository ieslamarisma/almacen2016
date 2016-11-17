import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SaludoTest {

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
	public void testSaludar() {
		// fail("Not yet implemented");
		Saludo S=new Saludo();
		assertEquals("Hola",S.saludar());

	}

	
	@Test
	public void testSaludar2() {
		// fail("Not yet implemented");
		Saludo S=new Saludo();
		assertEquals("Holahhh",S.saludar());

	}
	
}
