import java.util.Arrays;

public class RemoveDuplicateString {

	public static void removeDuplicate(String a) {

		char[] str = a.toCharArray();
		Arrays.sort(str);
		System.out.println(str);
		int res = 1;
		for(int i=1;i<str.length;i++) {
			if(str[i]!=str[i-1]) {
				str[res]=str[i];
				res++;
			}
		}

		a=new String(str);
		System.out.println(a.substring(0, res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString="aabsdhdhd";
		removeDuplicate(aString);
	}

}
