package constructorConcept;

public class ConstructorConcept {
	
	int age;
	String name;
	
	public ConstructorConcept() {
		System.out.println("Default constructor is called");
	}
	public ConstructorConcept(int i) {
		System.out.println("1 parameter constructor is called");
	}
	public ConstructorConcept(int i,String j) {
		System.out.println("2 parameter constructor is called");
		this.age=i;
		this.name=j;
		System.out.println(i+" "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept cpConcept=new ConstructorConcept();
		ConstructorConcept cpConcept1=new ConstructorConcept(10);
		ConstructorConcept cpConcept2=new ConstructorConcept(10,"Sundram");

	}

}
