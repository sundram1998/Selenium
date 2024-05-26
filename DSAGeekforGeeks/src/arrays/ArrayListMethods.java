package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMethods {
	
	public static void listMethods() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int[] nums= {1,2,3,4,5,6,4,3,1,2,3};
		for(int i:nums) {
			al.add(i);
		}
//		System.out.println(al);
		Iterator<Integer> iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listMethods();
		

	}

}
