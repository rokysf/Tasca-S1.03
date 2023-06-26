package n1exercici3;

import java.util.HashMap;

public class Concurso {

	HashMap<String, String> concursantes;

	public Concurso() {
		this.concursantes = new HashMap<String, String>();
	}
	
	public void nuevoConcursante(String nombre, String puntuacion) {
		concursantes.put(nombre, puntuacion);
		
		
		
		
	}
	
	
}
