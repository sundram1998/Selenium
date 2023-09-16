package stringManipulations;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stubStrin
		String str="!@# ^%& *&( sundram ()(&^^^%^";
		String s1 =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
