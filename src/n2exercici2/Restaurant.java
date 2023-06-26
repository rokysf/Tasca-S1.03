package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

	private String nom;
	private int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", puntuacio=" + puntuacio + "]";
	}

	@Override
	public int compareTo(Restaurant o) {
		 int comparaNom = this.nom.compareTo(o.nom);
		    if (comparaNom != 0) {
		        return comparaNom;
		    } else {
		        return Integer.compare(this.puntuacio, o.puntuacio);
		    }    
	}

}
