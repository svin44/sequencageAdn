package sequencage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

			// une fonction à essayer pouvant générer une erreur
			String line = reader.readLine();
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

		// pour chaque ligne du fichier txt, vérifier si:
		// la personne a + de 65 ans
		// la personne est de sexe féminin
		// afficher le resultat de ces deux boucles
		// faire la moyenne d'age des personnes ayant moins de 21 ans

		reader.close();

		// affiche la taille de la liste
		System.out.println(listAdn.size());
		// afficher tous les élements de la liste
		for (String adnS : listAdn) {
			System.out.println(adnS);
		}

		// récupérer des informations de la console
		Scanner scanner = new Scanner(System.in);

		// Demander l'ADN du patien
		System.out.println("Veuillez préciser votre ADN ");
		String adn = scanner.nextLine();

		// variable qui récupère le nombre de caractères de l'ADN
		int adnLength = adn.length();
		System.out.println("Nombre de caractères de l'ADN: " + adnLength);

		// Demander le prénom
		System.out.println("Veuillez préciser votre prénom:");
		String prenom = scanner.nextLine();

		// Demander le sexe
		System.out.println("Veuillez préciser votre sexe:");
		String sexe = scanner.nextLine();

		// Demander l'age
		System.out.println("Veuillez préciser votre age:");
		int age = scanner.nextInt();

		// Afficher les informations obtenues dans la console
		System.out.println("Bienvenu " + prenom + ", de sexe " + sexe + ", d'un age de " + age + " ans. "
				+ "Votre ADN est le suivant: " + adn);
		System.out.println("-----------------------------------------------------------------------------------");

		// les conditions d'ADN: sexe
		if (adn.contains("7")) {
			System.out.println("Il s'agit d'un adn de sexe masculin");
		}

		else if (adn.contains("9")) {
			System.out.println("Il s'agit d'un adn de sexe féminin");
		} else {
			System.out.println("Il doit y avoir une erreur dans l'ADN indiqué, celui-ci est de type inexistant");
		}

		// les conditions d'ADN: age
		// Vérifier si les informations transmises par le patient sont correctes
		if (adnLength < 6) {
			// System.out.println("La personne a 65 ans ou +");
			if (age < 65) {
				System.out.println(
						"Vous avez menti sur votre age, vous n'avez pas " + age + " ans, vous avez plus de 65 ans");
			}

		} else if (adnLength < 18) {
			// System.out.println("La personne a 21 ans ou moins");
			if (age >= 21) {
				System.out.println(
						"Vous avez menti sur votre age,  vous n'avez pas " + age + " ans,  vous avez moins de 21 ans");
			}

		} else {
			// System.out.println("La personne a plus de 21 ans");
			if (age < 21 || age >= 65) {
				System.out.println(
						"Vous avez menti sur votre age,  vous n'avez pas " + age + " ans,  vous avez plus de 65 ans");
			}
		}
		// récupérer le nombre de x dans l'ADN
		long compteurTaille = adn.chars().filter(caracter -> caracter == 'x').count();
		System.out.println("nombre de x: " + compteurTaille);

		// transformer la variable compteurtaille en int pour réaliser le switch
		int nombreXAdn = (int) compteurTaille;

		// les conditions de l'ADN: la taille (en fonction des x présents dans l'ADN
		switch (nombreXAdn) {
		case 1:
			System.out.println("Vous mesurez entre 50 cm et 1m50");
			break;
		case 2:
			System.out.println("Vous mesurez entre 1m51 et 1m71");
			break;
		case 3:
			System.out.println("Vous mesurez entre 1m71 et 1m80");
			break;
		case 4:
			System.out.println("Vous mesurez entre 1m81 et 1m90");
			break;
		case 5:
			System.out.println("Vous mesurez plus d'1m90");
			break;
		default:
			System.out.println("Compte-tenu du nombre de X, nous ne pouvons pas déterminer votre taille");
		}
	}

}
