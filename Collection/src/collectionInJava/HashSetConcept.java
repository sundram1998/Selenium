package collectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

public class HashSetConcept {

	public static int lonelyInteger(List<Integer> a) {
//		HashSet<Integer> set=new HashSet<Integer>();
		for (int i : a) {
			if (Collections.frequency(a, i) < 2) {
				return i;
			}
		}
		throw new NoSuchElementException("No such element found");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aIntegers = new ArrayList<Integer>(Arrays.asList(1, 2,2, 3, 3, 4, 4, 1));
		System.out.println(lonelyInteger(aIntegers));

	}

}
