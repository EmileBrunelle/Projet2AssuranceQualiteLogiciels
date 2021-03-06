package main;

import java.io.IOException;

public class Main {
	private static String cheminFichierImport = "src/fichiers/facture.txt";
	private static String cheminFichierExport = "src/fichiers/Facture-du-";

	public static void main(String[] args) {
		Facture facture;
		try {
			facture = new ImporterText(cheminFichierImport).getFacture();
			new ExporterText(facture, cheminFichierExport);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
