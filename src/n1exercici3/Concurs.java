package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Concurs {

	private static Scanner sc = new Scanner(System.in);
	private static final String FITXER_CLASSIFICACIO = "C:\\Users\\JORDI\\eclipse-workspace\\S103\\src\\n1exercici3\\classificacio.txt";
	private static final String FITXER_PAISOS = "C:\\Users\\JORDI\\eclipse-workspace\\S103\\src\\n1exercici3\\countries.txt";
	private HashMap<String, String> dadesConcurs;

	public Concurs() {
		this.dadesConcurs = new HashMap<String, String>();
	}

	public void iniciarConcurs() {

		llegirFitxer();
		
		int puntuacio = 0;

		System.out.println("Introdueix el teu nom");
		String nom = sc.nextLine();

		for (int i = 0; i < 10; i++) {

			int paisAleatori = (int) (Math.random() * dadesConcurs.size());

			String pais = (String) dadesConcurs.keySet().toArray()[paisAleatori];
			System.out.println("Quina es la capital de " + pais);
			String resposta = sc.nextLine();
			String capital = (String) dadesConcurs.values().toArray()[paisAleatori];
			if (resposta.equalsIgnoreCase(capital)) {
				puntuacio++;
				System.out.println("Resposta correcte!!");
			} else {
				System.out.println("Resposta incorrecte");
			}
			dadesConcurs.remove(pais);
		}
		System.out.println(nom + " aquesta es la teva puntuació: " + puntuacio);

		escriureFitxer(nom, puntuacio);
	}

	public void llegirFitxer() {

		try (BufferedReader br = new BufferedReader(new FileReader(FITXER_PAISOS))) {

			String linea = "";
			while ((linea = br.readLine()) != null) {
				String array[] = linea.split(";");
				dadesConcurs.put(array[0], array[1]);
			}
		} catch (Exception e) {
			System.out.println("Error de lectura del fitxer countries.txt");
		}
	}

	public void escriureFitxer(String nom, int puntuacio) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(FITXER_CLASSIFICACIO, true))) {

			pw.println(nom + ";" + puntuacio);
		} catch (Exception e) {
			System.out.println("Error d'escritura del fitxer classificacio.txt");
		}
	}

}
