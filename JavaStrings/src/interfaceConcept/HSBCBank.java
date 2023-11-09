package interfaceConcept;

public class HSBCBank implements BankInterface{

	int money=(int) (Math.random()*1000);
	int min = 1;
    int max = 100000000;
    int accountNumber = (int) (Math.random() * (max - min + 1) + min);

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("You added an account in HSBC Bank and your account number is: "+accountNumber);
		
	}

	@Override
	public void removeAccount() {
		// TODO Auto-generated method stub
		System.out.println("You deleted your HSBC Bank account: "+accountNumber);
		
	}

	@Override
	public void creditMoney() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" credited to your account: "+accountNumber);
		
	}

	@Override
	public void debitMoney() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" debited from your account: "+accountNumber);
	}
	int transferMoney=(int) (Math.random()*100);
	public void transferMoney() {
		System.out.println("You transfered: "+transferMoney+" from you account: "+accountNumber);
	}
	
	void carLoan() {
		System.out.println("You have car loan of: "+(int)(Math.random()*Math.pow(10, 6))+" from HSBC Bank");
	}
	void educationLoan() {
		System.out.println("You have education loan of: "+(int)(Math.random()*Math.pow(10, 5))+" from HSBC Bank");
	}

}
