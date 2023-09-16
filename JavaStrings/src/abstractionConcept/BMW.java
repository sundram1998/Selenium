package abstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW stared");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW stopped");
	}

	@Override
	public void refule() {
		// TODO Auto-generated method stub
		System.out.println("BMW refuling");
	}
	
	//can have non overriden methods as well
	public void theftSecurity() {
		System.out.println("Theft Security");
	}

}
