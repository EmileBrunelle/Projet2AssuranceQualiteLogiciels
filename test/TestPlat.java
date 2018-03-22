/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Plat;

/**
 * @author Philippe Viau
 *
 */
public class TestPlat {

	Plat plat;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		plat = new Plat("Salade");
		plat.setPrix(4.50);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		plat = null;

	}

	@Test
	public void testNom() {

		assertEquals("Salade", plat.getNom());

	}

	@Test
	public void testPrix() {

		assertEquals(4.50, plat.getPrix(), 0.1);

	}

}
