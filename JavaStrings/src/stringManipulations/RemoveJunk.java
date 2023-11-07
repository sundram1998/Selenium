package stringManipulations;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stubStrin
		String str=" Sundram    Yadav ";
		System.out.println(str);
		System.out.println(str.trim());
		String s1 =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		String[] strA=str.split(" ");
//		for(String i:strA) {
//			System.out.print(i+"/");
//		}
//		System.out.println(strA[strA.length-1].length());

	}

}
