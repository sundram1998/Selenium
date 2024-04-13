package abstractionConcept;

public abstract class Bank {
	
	public abstract void creditAccount();
	public abstract void debitAccount();
	
	public void loan() {
		System.out.println("Bank Loans");
	}

}
