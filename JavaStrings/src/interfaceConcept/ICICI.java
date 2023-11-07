package interfaceConcept;

public class ICICI implements Bank {
	int money=(int) (Math.random()*1000);
	int min = 1;
    int max = 100000000;
    int randomInt = (int) (Math.random() * (max - min + 1) + min);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI iciciClass=new ICICI();
		iciciClass.addAccount();		
		iciciClass.credit();
		iciciClass.debit();
		iciciClass.deleteAccount();

	}

	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println("You added an account in ICICI bank and your account number is: "+randomInt);
		
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		System.out.println("You deleted your icici account: "+randomInt);
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" credited to your account: "+randomInt);
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Rupees "+money+" debited from your account: "+randomInt);
	}

}
