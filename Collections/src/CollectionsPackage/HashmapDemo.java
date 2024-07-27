package CollectionsPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("QA", "https://qa.com");
		hm.put("google", "https:goole.com");
		hm.put("SDET", "https:sdet.com");
		
		System.out.println(hm);
		
		for(String key: hm.keySet()) {
			System.out.println("Key is "+key +"value is "+ hm.get(key));
		}
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println("Key is "+key +"value is "+ hm.get(key));
		}
}
}
