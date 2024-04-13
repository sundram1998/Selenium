package abstractionConcept;

public class HDFC extends Bank {
	
	@Override
	public void creditAccount() {
		System.out.println("HDFC-- Credit Account");
	}
	@Override
	public void debitAccount() {
		System.out.println("HDFC-- Debit Account");
	}

	public void hdfcOverspending() {
		System.out.println("You got covered for overspending");
	}
	
}
