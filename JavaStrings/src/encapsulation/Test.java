package encapsulation;

public class Test extends EmployeeData{

	public static void main(String[] args) {
		EmployeeData test=new EmployeeData();
		test.setEmpId(1149711);
		System.out.println(test.getEmpId());
	}
}
