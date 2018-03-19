/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Client;
import main.Facture;

/**
 * @author Émile Brunelle
 *
 */
public class TestFacture {
	
	Facture facture;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		facture = new Facture();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		facture = null;
	}

	/**
	 * Test method for {@link main.Facture#Facture()}.
	 */
	@Test
	public void testFacture() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link main.Facture#getListeClient()}.
	 */
	@Test
	public void testGetListeClientVide() {
		assertEquals(new ArrayList<Client>(),facture.getListeClient());
	}
	
	@Test
	public void testAjoutClient() {
		facture.addClient(new Client("Jean"));
	}

	/**
	 * Test method for {@link main.Facture#addClient(main.Client)}.
	 */
	@Test
	public void testAddClient() {
		facture.addClient(new Client("Jean"));
	}
	
	@Test
	public void testGetListeUnClient() {
		assertEquals(new ArrayList<Client>().add(new Client("Jean")),facture.getListeClient());
	}

	/**
	 * Test method for {@link main.Facture#afficherFacture()}.
	 */
	@Test
	public void testAfficherFacture() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link main.Facture#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link main.Facture#calculerMontantFacture(main.Plat, int)}.
	 */
	@Test
	public void testCalculerMontantFacture() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link main.Facture#calculerTaxes(double)}.
	 */
	@Test
	public void testCalculerTaxes() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link main.Facture#calculerTotalAvecTaxes(double)}.
	 */
	@Test
	public void testCalculerTotalAvecTaxes() {
		fail("Not yet implemented"); // TODO
	}

}
