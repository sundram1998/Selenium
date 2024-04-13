package Interviews;

public class TestAllBankAndServices extends Banks {

	@Override
	public void iciciBank() {
		// TODO Auto-generated method stub
		System.out.println("This is ICICI Bank at your service");
		
	}

	@Override
	public void hdfcBank() {
		// TODO Auto-generated method stub
		System.out.println("This is hdfcBank at your service");
	}

	@Override
	public void axisBank() {
		// TODO Auto-generated method stub
		System.out.println("This is axisBank at your service");
	}

	@Override
	public void canaraBank() {
		// TODO Auto-generated method stub
		System.out.println("This is canaraBank at your service");
	}

	@Override
	public void overseasBank() {
		// TODO Auto-generated method stub
		System.out.println("This is overseas at your service");
	}

	@Override
	public void centralBank() {
		// TODO Auto-generated method stub
		System.out.println("This is central at your service");
	}

	public static void main(String[] args) {
		TestAllBankAndServices testAllBankAndServices=new TestAllBankAndServices();
		testAllBankAndServices.axisBank();
		testAllBankAndServices.canaraBank();
		testAllBankAndServices.centralBank();
		testAllBankAndServices.iciciBank();
		testAllBankAndServices.hdfcBank();
		testAllBankAndServices.overseasBank();
		testAllBankAndServices.centralBank();
	}
}
