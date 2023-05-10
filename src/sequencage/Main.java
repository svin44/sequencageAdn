package sequencage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// récupérer des informations de la console
		Scanner scanner = new Scanner(System.in);

		// Demander l'ADN du patient
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
		case 1: // // 1 x: personne entre 0.5m et 1m50
			System.out.println("Vous mesurez entre 50 cm et 1m50");
			break;
		case 2: // // 2 x: entre 1,51m et 1,71m
			System.out.println("Vous mesurez entre 1m51 et 1m71");
			break;
		case 3: // // 3 x : entre 1,71m et 1,80m
			System.out.println("Vous mesurez entre 1m71 et 1m80");
			break;
		case 4: // // 4 x: entre 1,81m et 1,90m
			System.out.println("Vous mesurez entre 1m81 et 1m90");
			break;
		case 5: // // 5 x: + de 1,90m
			System.out.println("Vous mesurez plus d'1m90");
			break;
		default: // le nombre de X ne correspond à aucune taille connue !
			System.out.println("Compte-tenu du nombre de X, nous ne pouvons pas déterminer votre taille");
		}
	}

}
