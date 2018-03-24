package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExporterText {

	public ExporterText(Facture facture, String cheminFichier) {
		
		String dt = new SimpleDateFormat("dd/MM/yyyy-HH:mm").format(Calendar.getInstance().getTime());
		
		Path chemin = Paths.get(cheminFichier + dt + ".txt");

		try {

			BufferedWriter ficEcriture = Files.newBufferedWriter(chemin, Charset.defaultCharset());

			ficEcriture.write(facture.toString());

			ficEcriture.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
