package n3exercici1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class GestioPersones {

	private static Scanner sc = new Scanner(System.in);
	private static final String FITXER_CSV = "src" + File.separator + "n3exercici1" + File.separator + "persones.csv";
	private Set<Persona> llistaPersones;

	public GestioPersones() {
		this.llistaPersones = new TreeSet<Persona>();
	}

	public void llegirFitxer() {

		try (BufferedReader br = new BufferedReader(new FileReader(FITXER_CSV))) {

			String linea = "";
			while ((linea = br.readLine()) != null) {
				String array[] = linea.split(",");
				llistaPersones.add(new Persona(array[0], array[1], array[2]));
			} 
		} catch (Exception e) {
			System.out.println("Error de lectura del fitxer persones.csv");
		}
	}

	public void iniciar() {
		byte opcio;
		do {
			opcio = menu();
			switch (opcio) {
			case 1:
				introduirPersona();
				break;
			case 2:
				ordenadesNomAZ();
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			default:
				System.out.println("Fins aviat");
			}
		} while (opcio != 0);
	}

	public byte menu() {
		byte opcio;
		do {
			System.out.println("1.- Introduir persona.");
			System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
			System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
			System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
			System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
			System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
			System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
			System.out.println("0.- Sortir.");
			opcio = sc.nextByte();
			sc.nextLine();
			if (opcio < 0 || opcio > 7) {
				System.out.println("L'opció escollida no es correcte");
			}
		} while (opcio < 0 || opcio > 7);
		return opcio;
	}

	public void introduirPersona() {
		System.out.println("Introdueix el nom");
		String nom = sc.nextLine();
		System.out.println("Introdueix el cognom");
		String cognom = sc.nextLine();
		System.out.println("Introdueix el dni");
		String dni = sc.nextLine();
		llistaPersones.add(new Persona(nom, cognom, dni));
	}

	public void ordenadesNomAZ() {
		for (Persona persona : llistaPersones) {
			System.out.println(persona);
		}
	}

}
