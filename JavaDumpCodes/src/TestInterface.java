
public class TestInterface {
	
	public static void main(String[] args) {
		InterfacesConcept iConcept=new InterfaceBMW();
		iConcept.car();
		iConcept.vigitables();
		
		SecondInterface scInterface=new InterfaceBMW();
		scInterface.thisIsSecondInterface();
		
		
	}

}
