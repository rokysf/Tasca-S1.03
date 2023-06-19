package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		System.out.println("La llista abans de l'ordre invers: ");
		for (Integer integer : list1) {
			System.out.println(integer);
		}

		List<Integer> list2 = new ArrayList<Integer>();

		ListIterator<Integer> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) {
			list2.add(it.previous());
		}

		System.out.println("**************************************");
		System.out.println("La llista despres de l'ordre invers");
		for (Integer integer : list2) {
			System.out.println(integer);
		}
	}
}
