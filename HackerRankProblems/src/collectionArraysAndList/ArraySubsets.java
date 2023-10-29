package collectionArraysAndList;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySubsets {
	
	public static int sumOfList(List<Integer> arr) {
		int sum=0;
		for(int i:arr) {
			sum+=arr.get(i);
		}
		return sum;
	}
	
	public static List<Integer> subsetA(List<Integer> arr){
		Collections.sort(arr);
		System.out.println(arr);
		int totalsum=sumOfList(arr);
		List<Integer> A=new ArrayList<Integer>();
		List<Integer> B=new ArrayList<Integer>();
		for(int i=arr.size()-1;i>=0;i--) {
			if(sumOfList(A)<=sumOfList(B) || totalsum-sumOfList(A)>=sumOfList(A)) {
				A.add(arr.get(i));
			}else {
				B.add(arr.get(i));
			}
		}
		Collections.sort(A);
		return A;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(9);
		al.add(1);
		System.out.println(al.size());
		System.out.println(subsetA(al));

	}

}
