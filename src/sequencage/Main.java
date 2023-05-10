package sequencage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		// création d'un file reader pour lire le fichier d'entrée des séquences adn
		FileReader fileReader = new FileReader(
				"C:/Users/sylva/OneDrive/Documents/INFORMATIQUE/LANGAGES/JAVA/sequencage/src/sequencage/adn.txt");

		// Création d’un bufferedReader qui utilise le fileReader
		BufferedReader reader = new BufferedReader(fileReader);

		// création d'une liste pour stocker l'ensemble des ADN lues dans le fichier
		List<String> listAdn = new ArrayList<String>();

		try {
			// variable pour les lignes du fichier lues
			String line = reader.readLine();
			// tant que des lignes peuvent être lues:
			while (line != null) {
				// enregistrement de la ligne dans la liste
				listAdn.add(line);
				// lecture de la prochaine ligne
				line = reader.readLine();
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		reader.close();
		// variable qui va stocker le nombre de personnes de + de 65 ans
		int ageSup = 0;
		// variable qui va stocker le nombre de femmes
		int nbFemmes = 0;

		// boucle qui va vérifier certaines conditions de la liste et stocker des
		// résultats d'age, de sexe, et de moyenne d'age
		for (String adnS : listAdn) {

			// variable qui récupère le nombre de caractères de l'ADN
			int adnLength = adnS.length();
			System.out.println("ADN: " + adnS + " :Nombre de caractères de l'ADN: " + adnLength);

			// vérifier si la personne a + de 65 ans
			// les conditions d'ADN: age
			if (adnLength < 6) {
				ageSup += 1;
			}

			// vérifier la personne est de sexe féminin
			// les conditions d'ADN: sexe
			if (adnS.contains("9")) {
				nbFemmes += 1;
			}

		}
		System.out.println("Le nombre de personnes de plus de 65 ans est de: " + ageSup);
		System.out.println("Le nombre de personnes de sexe féminin est de: " + nbFemmes);

	}
}
