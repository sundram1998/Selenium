package stringManipulations;

import java.util.Iterator;

public class FindMissingNumberFromsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5};
		int n=5;
		int totalSum=(n*(n+1))/2;
		int arrSum=0;
		for(int i=0;i<arr.length;i++) {
			arrSum=arrSum+arr[i];
		}
		int missingNum=totalSum-arrSum;
		System.out.println(missingNum);

	}

}
