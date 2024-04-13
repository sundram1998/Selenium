
public class Test extends EncapsulationExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.setAge(23);
		test.setEmailId("yadavSundram@gmail.com");
		test.setEmpNumber(23272727);
		test.setName("Shashwatam Yadav");

		System.out.println(test.getName()+" "+test.getEmpNumber()+" "+test.getEmailId());
	}

}
