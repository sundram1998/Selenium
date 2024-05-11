package mathematics;

public class SeocndLargestNum {
	
	public static void secLargest(int[] arr) {
		int largest=-1;
		int secLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest && arr[i]<largest) {
				secLargest=arr[i];
			}
		}
		System.out.println(secLargest);
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,3,5};
		secLargest(arr);
	}

}
