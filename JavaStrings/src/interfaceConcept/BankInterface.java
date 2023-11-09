package interfaceConcept;

public interface BankInterface {
	/*
	  1:No static methods in interfaces
	  2:No method body
	  3:we can declare variable and they will be static by default in nature
	  4:variable vales will not be changed
	  5:We can not create object of interface
	  6:Interface is abstract in nature
	  7:It is used to achieve abstraction and support inheritance functionality
	  8:It can be used to achieve loose couping
	*/
	
	int min_bal=1000;
	public void openAccount();
	public void removeAccount();
	public void creditMoney();
	public void debitMoney();
}
