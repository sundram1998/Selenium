package setConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hSet=new HashSet<String>();
		hSet.add(null);
		hSet.add("Sundram");
		hSet.add("satyam");
		hSet.add("Shivam");
		
		System.out.println(hSet);
		
		System.out.println(hSet.contains("Sundram"));
		
		for(String eString:hSet) {
			System.out.print(eString+" ");
		}
		
	}

}
