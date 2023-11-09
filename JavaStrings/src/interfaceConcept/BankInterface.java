package interfaceConcept;

public interface BankInterface {
	//No static methods in interfaces
	//No method body
	// we can declare variable and they will be static by default in nature
	//variable vales will not be changed
	//We can not create object of interface
	//Interface is abstract in nature
	
	int min_bal=1000;
	public void openAccount();
	public void removeAccount();
	public void creditMoney();
	public void debitMoney();
}
