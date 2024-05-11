package leetCode;

public class ReverseString {
	
	public static boolean isPal(String string) {
		char[] charString=string.toCharArray();
		int start=0;
		int end=charString.length-1;
		boolean flag=true;
		while(start<=end) {
			if(charString[start]!=charString[end]) {
				flag=false;
			}
			start++;
			end--;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPal("stststsq"));

	}

}
