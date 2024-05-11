package numberCodingLogics;

public class RemoveJunk {

	public static void removeJunk() {
		String aString = "!@#$Sun@@daram^&%$##";
		String bString = aString.replaceAll("[^a-zA-Z]", "");
		System.out.println(bString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeJunk();
	}

}
