package interfaceConcept;

public class TestAllBanks {
	public static void main(String[] args) {
		HSBCBank hsbcBank=new HSBCBank();
		hsbcBank.openAccount();
		hsbcBank.creditMoney();
		hsbcBank.debitMoney();
		hsbcBank.removeAccount();
		hsbcBank.transferMoney();
		hsbcBank.carLoan();
		hsbcBank.educationLoan();
		
		ICICIBank iciciBank=new ICICIBank();
		iciciBank.openAccount();		
		iciciBank.creditMoney();
		iciciBank.debitMoney();
		iciciBank.removeAccount();
	}

}
