package abstraction;

public class Dogs extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog barks!!");
	}
	
	@Override
	public void runs() {
		System.out.println("Dogs run 80 km/h.");
	}
	@Override
	public void bite() {
		System.out.println("Dogs have good bite force");
	}

}
