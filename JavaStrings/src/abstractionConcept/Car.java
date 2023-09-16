package abstractionConcept;

public interface Car {
	//only final and static variables are defined
	final int carsWheel=4;
	static int loanRate=5;

	//Always define only abstract methods but we need not use abstract keyword
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	//can not create the object of interface
	public void start();
	public void stop();
	public void refule();
}
