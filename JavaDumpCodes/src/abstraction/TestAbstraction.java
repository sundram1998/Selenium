package abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dogs();
		animal.bite();
		animal.runs();
		animal.makeSound();
		
		Animal animal2=new Horse();
		animal2.bite();
		animal2.runs();
		animal2.makeSound();
		
		animal.car=5;
		System.out.println(animal.car);

	}

}
