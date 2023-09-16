package abstractionConcept;

public class Test {
	
	//partial abstraction
	//hiding the implementation logic is called abstraction
	//Abstract class can have abs and non abs method
	//can not create the object of abstract class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCBank hBank=new HDFCBank();
		hBank.credit();
		hBank.debit();
		hBank.loan();
		hBank.fund();
		System.out.println("==============");
		Bank bank=new HDFCBank();
		//Bank bank=new Bank(); will give error because Bank is abstract class
		//and we can not create object of abstract class
		bank.credit();
		bank.debit();
		bank.loan();
	}

}
