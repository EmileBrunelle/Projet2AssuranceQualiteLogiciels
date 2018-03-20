package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Client;
import main.Facture;
import main.Plat;

/**
 * @author Émile Brunelle
 *
 */
public class TestFacture {
	
	Facture facture;
	Plat plat;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		facture = new Facture();
		plat = new Plat("Bagel");
		plat.setPrix(1.50);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		facture = null;
	}
	
	/**
	 * Test method for {@link main.Facture#getListeClient()}.
	 */
	@Test
	public void testGetListeClientVide() {
		assertEquals(new ArrayList<Client>(),facture.getListeClient());
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
		facture.afficherFacture();
	}

	/**
	 * Test method for {@link main.Facture#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals(facture.toString(), "Bienvenue chez Barette !\nFactures:\n");
	}

	/**
	 * Test method for {@link main.Facture#calculerMontantFacture(main.Plat, int)}.
	 */
	@Test
	public void testCalculerMontantFacture() {
		assertEquals(3, facture.calculerMontantFacture(plat, 2));
	}

	/**
	 * Test method for {@link main.Facture#calculerTaxes(double)}.
	 */
	@Test
	public void testCalculerTaxes() {
		assertEquals(0.15, facture.calculerTaxes(1));
	}

	/**
	 * Test method for {@link main.Facture#calculerTotalAvecTaxes(double)}.
	 */
	@Test
	public void testCalculerTotalAvecTaxes() {
		assertEquals(1.15, facture.calculerTotalAvecTaxes(1));
	}

}
