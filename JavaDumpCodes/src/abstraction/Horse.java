package abstraction;

public class Horse extends Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("The sound that a horse makes is called a neigh");	
	}

	@Override
	protected void runs() {
		// TODO Auto-generated method stub\
		System.out.println("Horse run very fast!");
		
	}

	@Override
	void bite() {
		// TODO Auto-generated method stub
		System.out.println("Horse bites as well in it's defence");
	}

}
