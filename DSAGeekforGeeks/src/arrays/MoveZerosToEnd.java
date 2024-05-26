package arrays;

public class MoveZerosToEnd {
	
	static void moveZero(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[i];
				nums[i]=nums[count];
				nums[count]=temp;
				count++;
			}
		}
		for(int k=0;k<nums.length;k++) {
			System.out.print(nums[k]+" ");
		}
	}
	
	public static void moveZeros(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]>0 && arr[j]>0) {
				i++;
			}else if(arr[i]>0 && arr[j]==0) {//arr= {8,5,0,10,0,20};
				j--;
			}else if(arr[i]==0 && arr[j]>0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}else if(arr[i]==0 && arr[j]==0) {
				j--;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,8,5,0,10,30,40,6,7,0,9,0,10,0,20,0};
		moveZero(arr);

	}

}
