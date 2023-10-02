package abstractionAnimal;

public abstract class Animal {
	
	public abstract void makeSound();
	
	protected void animal() {
		System.out.println("Animal makes sound");
	}
	
	protected void animal(String animal) {
		System.out.println("animal makes sound: "+animal);
	}

}
