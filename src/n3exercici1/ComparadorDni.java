package n3exercici1;

import java.util.Comparator;

public class ComparadorDni implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getDni().compareTo(o2.getDni());
	}

}
