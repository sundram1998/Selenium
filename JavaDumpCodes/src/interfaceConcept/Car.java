package interfaceConcept;

public interface Car {
	//interface only allow abstract methods 
	public abstract void start();
	public abstract void stop();
	
	public default void refule() {
		System.out.println("Car--refule");
	}
	public default void repair() {
		System.out.println("Car--repair");
	}

}
