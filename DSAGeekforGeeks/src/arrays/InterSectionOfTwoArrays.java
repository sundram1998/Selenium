package arrays;

import java.util.HashSet;

public class InterSectionOfTwoArrays {
	
	public static int arrayIntersection(int[] a,int[] b) {
		int count=0;
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i:a) {
			hashSet.add(i);
		}
//		hashSet.
		
		for(int i:b) {
			if(hashSet.contains(i)) {
				count++;
//				System.out.println(i);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 5, 3, 10, 12, 13, 14, 15 };
		System.out.println(arrayIntersection(a, b));
	}

}
