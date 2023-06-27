package n3exercici1;

import java.util.Objects;

public class Persona{

	private String nom;
	private String cognoms;
	private String dni;

	public Persona(String nom, String cognoms, String dni) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognom) {
		this.cognoms = cognom;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognoms=" + cognoms + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom,cognoms,dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nom, other.nom) && 
				Objects.equals(cognoms, other.cognoms) && Objects.equals(dni, other.dni);
	}
	
}
