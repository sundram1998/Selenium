package javaCoding;

public class Reverse_String {
	public static void main(String[] args) {
		String string="sundram";
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev+= string.charAt(i);
		}
		System.out.println(rev);
	}

}
