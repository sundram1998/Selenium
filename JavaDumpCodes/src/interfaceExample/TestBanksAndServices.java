package interfaceExample;

public class TestBanksAndServices implements Banks ,Services {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBanksAndServices test=new TestBanksAndServices();
		test.axisBank();
		test.axisLoanServices();
	}

	@Override
	public void iciciNetBanking() {
		// TODO Auto-generated method stub
		System.out.println("iciciNetBanking Services");
		
	}

	@Override
	public void hdfcUPIServices() {
		// TODO Auto-generated method stub
		System.out.println("hdfcUPIServices");
	}

	@Override
	public void axisLoanServices() {
		// TODO Auto-generated method stub
		System.out.println("axisLoanServices");
	}

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

}
