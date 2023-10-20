package arrayStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountOfStringsInListUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList("sun","mon","sun","tue"));
		
		Set<String> set=new HashSet<String>(arrayList);
		for(String s:set) {
			System.out.println(s+" "+Collections.frequency(arrayList, s));
		}
	}

}
