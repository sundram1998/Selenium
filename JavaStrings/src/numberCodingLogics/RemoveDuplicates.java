package numberCodingLogics;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] a) {
		int res=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				a[res]=a[i];
				res++;//res==2
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,20,30,40,40,50};

	}

}
