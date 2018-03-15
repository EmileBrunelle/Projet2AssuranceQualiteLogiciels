package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Client;
import main.Facture;

public class testFacture {
	
	Facture facture;
	
	@Before
	public void init() {
		facture = new Facture();
	}
	
	@After
	public void apres() {
		facture = null;
	}
	
	@Test
	public void testGetListeClientVide() {
		assertEquals(new ArrayList<Client>(),facture.getListeClient());
	}

	@Test
	public void testAjoutClient() {
		facture.addClient(new Client("Jean"));
	}
	
	@Test
	public void testGetListeUnClient() {
		assertEquals(new ArrayList<Client>().add(new Client("Jean")),facture.getListeClient());
	}

}
