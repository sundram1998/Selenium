package encapsulation;

public class Test extends EncapsulationPractice{

	public static void main(String[] args) {
		EmployeeData test=new EmployeeData();
		test.setEmpId(9878978);
		System.out.println(test.getEmpId());
		EncapsulationPractice encapsulationPractice=new EncapsulationPractice();
		encapsulationPractice.setEmpId(1234);
		encapsulationPractice.setEmpMail("Helow@gmail.com");
		encapsulationPractice.setName("Sk yadav");
		System.out.println(encapsulationPractice.getEmpId());
	}
}
