package stringManipulations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfOccurenceOfStringsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "apple");
		int count=0;
		for(int i=0;i<list.size();i++) {
			count=Collections.frequency(list, list.get(i));
			System.out.println("frequency of "+list.get(i)+" is:"+count);
		}
	}

}
