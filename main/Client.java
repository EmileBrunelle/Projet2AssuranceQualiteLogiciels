package main;

import java.text.DecimalFormat;

public class Client {
	private String nom;
	private double montantFacture = 0;

	// Initialise avec le nom du client
	public Client(String nom) {
		this.nom = nom;
	}

	// Ajout du montant de la facture
	public void setMontantFacture(double montantFacture) {
		this.montantFacture = montantFacture;
	}

	// Retourne le nom du client
	public String getNom() {
		return nom;
	}

	// Retourne le montant de la facture
	public double getMontantFacture() {
		return montantFacture;
	}

	// Génération de la chaîne de sortie pour ce client
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		String ligneFacture;
		if (montantFacture != 0)
			ligneFacture = nom + ' ' + decimalFormat.format(montantFacture) + "$";
		else
			ligneFacture = "";
		return ligneFacture;
	}

}
