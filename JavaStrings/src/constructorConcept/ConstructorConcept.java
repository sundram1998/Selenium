package constructorConcept;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Default constructor is called");
	}
	public ConstructorConcept(int i) {
		System.out.println("1 parameter constructor is called");
	}
	public ConstructorConcept(int i,int j) {
		System.out.println("2 parameter constructor is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept cpConcept=new ConstructorConcept();
		ConstructorConcept cpConcept1=new ConstructorConcept(10);
		ConstructorConcept cpConcept2=new ConstructorConcept(10,20);

	}

}
