package arraysRelatedQuestions;

public class RemoveJunk {
	
	public static void removeJunk() {
		String string="!@#$%sundaram@%%$##";
		String string2=string.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(string2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeJunk();

	}

}
