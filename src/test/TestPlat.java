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
	 * Ajoute un plat et son prix avant l'exécution des tests.
	 */
	@Before
	public void setUp() throws Exception {
		plat = new Plat("Salade");
		plat.setPrix(4.50);
	}

	/**
	 * Mets le plat à null une fois que les tests sont effectués.
	 */
	@After
	public void tearDown() throws Exception {
		plat = null;
	}

	/**
	 * Teste si le nom du plat est bien « Salade ».
	 */
	@Test
	public void testNom() {
		assertEquals("Salade", plat.getNom());
	}
	
	/**
	 * Teste si le prix du plat est bien de 4.50.
	 */
	@Test
	public void testPrix() {
		assertEquals(4.50, plat.getPrix(), 0.001);
	}

}
