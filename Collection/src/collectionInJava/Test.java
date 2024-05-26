package collectionInJava;

public class Test extends AbstractClassConcept {

	@Override
	void cat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is small");
		
	}

	@Override
	void dog() {
		// TODO Auto-generated method stub
		System.out.println("Dog is big");
		
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		test.cat();
		test.dog();
	}

}
