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
	 * Initialise quelques données avant le test.
	 */
	@Before
	public void setUp() throws Exception {
		facture = new Facture();
		plat = new Plat("Bagel");
		plat.setPrix(1.50);
	}

	/**
	 *  Remet la facture à null après les tests.
	 */
	@After
	public void tearDown() throws Exception {
		facture = null;
	}
	
	/**
	 * Teste la méthode getListeClient lorsqu'elle est supposée être vide.
	 */
	@Test
	public void testGetListeClientVide() {
		assertEquals(new ArrayList<Client>(), facture.getListeClient());
	}

	/**
	 * Teste si ajouter un client ne crée par d'erreur.
	 */
	@Test
	public void testAddClient() {
		facture.addClient(new Client("Jean"));
	}
	
	/**
	 * Teste pour savoir si la liste ne retourne que le client Jean.
	 */
	@Test
	public void testGetListeUnClient() {
		ArrayList<Client> testListe = new ArrayList<>();
		
		assertEquals(testListe, facture.getListeClient());
	}

	/**
	 * Teste si afficher la facture ne crée par d'erreur.
	 */
	@Test
	public void testAfficherFacture() {
		facture.afficherFacture();
	}

	/**
	 * Teste si une facture où les clients n'ont rien commandé retourne seulement le titre.
	 */
	@Test
	public void testToString() {
		assertEquals("Bienvenue chez Barette !\nFactures:\n", facture.toString());
	}

	/**
	 * Teste si le montant avant taxes de la facture est exact.
	 */
	@Test
	public void testCalculerMontantFacture() {
		assertEquals(3.45, Facture.calculerMontantFacture(plat, 2), 0.1);
	}

	/**
	 * Teste si le montant des taxes de la facture est exact.
	 */
	@Test
	public void testCalculerTaxes() {
		assertEquals(0.15, Facture.calculerTaxes(1), 0.1);
	}

	/**
	 * Teste si le total final (avec taxes) de la facture est exact.
	 */
	@Test
	public void testCalculerTotalAvecTaxes() {
		assertEquals(1.15, Facture.calculerTotalAvecTaxes(1), 0.1);
	}

}
