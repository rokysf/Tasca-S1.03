package n2exercici1;

import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {

		HashSet<Restaurant> llistaRestaurants = new HashSet<Restaurant>();

		llistaRestaurants.add(new Restaurant("El Celler de Can Roca", 10));
		llistaRestaurants.add(new Restaurant("El Celler de Can Roca", 8));
		llistaRestaurants.add(new Restaurant("El Celler de Can Roca", 10));
		llistaRestaurants.add(new Restaurant("Can Traver", 10));
		llistaRestaurants.add(new Restaurant("La Lluerna", 9));
		llistaRestaurants.add(new Restaurant("El Botafumeiro", 8));
		llistaRestaurants.add(new Restaurant("Can Traver", 7));

		for (Restaurant restaurant : llistaRestaurants) {
			System.out.println(restaurant);
		}
	}

}
