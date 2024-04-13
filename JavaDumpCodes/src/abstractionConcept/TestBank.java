package abstractionConcept;

public class TestBank {

	//abstaction-hiding the implementation logic
	//Abstact methods can have bothabstract and non-abstact methods
	//you can use the method and implement it but you will not able to know implementation logic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC bank=new HDFC();
		bank.creditAccount();
		bank.debitAccount();
		bank.loan();
		bank.hdfcOverspending();
		
		Bank b=new HDFC();
		b.creditAccount();
		b.debitAccount();
		b.loan();
		//We are not able to get hdfcOverspending method because that can accessed 
		//only by HDFC class reference varibale

	}

}
