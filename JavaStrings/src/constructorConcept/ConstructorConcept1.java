package constructorConcept;

public class ConstructorConcept1 {

	String consName;
	String consModel;

	// Default constructor
	public ConstructorConcept1() {
		consName = "Unknown";
		consModel = "Unknown";
	}

	// Parameterized constructor
	public ConstructorConcept1(String consName, String consModel) {
		this.consModel = consModel;
		this.consName = consName;
	}

	public static void main(String[] args) {

		ConstructorConcept1 cp1 = new ConstructorConcept1();
		ConstructorConcept1 cp2 = new ConstructorConcept1("ConsName", "ConsModel");
		System.out.println(cp1);
		System.out.println(cp2);
	}

}
