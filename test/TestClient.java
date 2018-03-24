package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Client;

/**
 * @author Émile
 * 
 * TestClient teste les différentes fonctionnalités la classe Client.
 *
 */
public class TestClient {
	
	Client client;

	/**
	 * Initialise un client avant le test.
	 */
	@Before
	public void setUp() throws Exception {
		client = new Client("Roger");
	}

	/**
	 * Remet le client à null après les tests.
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	/**
	 * Teste si le retour est bien le bon nom initialisé ici haut.
	 */
	@Test
	public void testGetNom() {
		assertEquals("Roger", client.getNom());
	}

	/**
	 * Ajoute un montant de facture au client et teste si le retour de la méthode getMontantFacture() est bon.
	 */
	@Test
	public void testGetMontantFacture() {
		client.setMontantFacture(42.84);
		assertEquals(42.84, client.getMontantFacture(), 0.01);
	}

	/**
	 * Teste la méthode toString() lorsque la facture contient un montant.
	 */
	@Test
	public void testToStringNonVide() {
		client.setMontantFacture(42.84);
		assertEquals("Roger 42,84$", client.toString());
	}
	
	/**
	 * Teste la méthode toString() lorsque la facture ne contient pas de montant.
	 */
	@Test
	public void testToStringVide() {
		client.setMontantFacture(0);
		assertEquals("", client.toString());
	}

}
