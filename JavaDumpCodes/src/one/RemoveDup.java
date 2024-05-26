package one;

public class RemoveDup {
	
	public static void removeDup(int[] arr) {
		int i=1;
		for(int j=1;j<arr.length;j++) {//6,7,7,8,9,9,10
			if(arr[i-1]!=arr[j]) {
				arr[i]=arr[j];
				i++;
			}
		}
		for(int k=0;k<i;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] nums= {6,7,7,8,9,9,10};
		removeDup(nums);
	}

}
