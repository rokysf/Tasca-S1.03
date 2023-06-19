package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Month> mesos = new ArrayList<Month>();

		mesos.add(new Month("gener"));
		mesos.add(new Month("febrer"));
		mesos.add(new Month("març"));
		mesos.add(new Month("abril"));
		mesos.add(new Month("maig"));
		mesos.add(new Month("juny"));
		mesos.add(new Month("juliol"));
		mesos.add(new Month("setembre"));
		mesos.add(new Month("octubre"));
		mesos.add(new Month("novembre"));
		mesos.add(new Month("desembre"));
		
		mesos.add(7, new Month("agost"));
		
		for (Month month : mesos) {
			System.out.println(month);
		}
		
		System.out.println("*******************************************");
		
		HashSet<Month> mesoshash = new HashSet<>();
        mesoshash.addAll(mesos);
        
        mesoshash.add(new Month("gener"));
        mesoshash.add(new Month("febrer"));
        mesoshash.add(new Month("març"));

        for (Month month : mesoshash) {
			System.out.println(month);
		}
        
        System.out.println("*******************************************");
        
        Iterator<Month> iter = mesoshash.iterator();
        while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
