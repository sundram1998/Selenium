package javaCoding;
abstract class Animal{
	public abstract void makeSound();
}

class Pig extends Animal{
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Pig says wee wee!!");
	}
}

public class Animal_abstraction{
	public static void main(String[] args) {
		Animal animal=new Pig();
		animal.makeSound();
	}
}