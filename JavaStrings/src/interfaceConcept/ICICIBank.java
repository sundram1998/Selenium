package interfaceConcept;

public class ICICIBank implements BankInterface {
	int money=(int) (Math.random()*1000);
	int min = 1;
    int max = 100000000;
    int randomInt = (int) (Math.random() * (max - min + 1) + min);

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("You added an account in ICICI Bank and your account number is: "+randomInt);
		
	}

	@Override
	public void removeAccount() {
		// TODO Auto-generated method stub
		System.out.println("You deleted your icici account: "+randomInt);
		
	}

	@Override
	public void creditMoney() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" credited to your account: "+randomInt);
		
	}

	@Override
	public void debitMoney() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" debited from your account: "+randomInt);
	}

}
