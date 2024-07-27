package CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(90);
		hs.add(56);
		
		System.out.println(hs);
		hs.remove(20);
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		System.out.println();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
