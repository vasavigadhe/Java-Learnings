package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
			ArrayList al = new ArrayList();
			// add the Elements
			al.add(10);			al.add("nvb");			al.add(true);			al.add(10);
			al.add("nvb");
			al.add(true); // adding duplicate values
			System.out.println(al);
			// Remove the Elements
			al.remove(1);
			int j = (int) al.get(0);
			System.out.println(j);
			System.out.println(al);
			// Iterate through the ArrayList
			for(int i=0; i<al.size();i++) {
				System.out.print(al.get(i)+ " ");
			}
			System.out.println();
			for(Object obj: al) {
				System.out.print(obj+ " ");
			}
			System.out.println();
			Iterator itr = al.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+ " ");
			}
	}

}
