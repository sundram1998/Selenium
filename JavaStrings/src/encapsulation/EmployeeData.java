package encapsulation;

public class EmployeeData {
	
	private String name;
	private int empId;
	private String empMail;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpMail() {
		return empMail;
	}


	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData data=new EmployeeData();
		data.setEmpId(1149711);
		data.setEmpMail("sundram.yadav@infosys.com");
		data.setName("Sundram Yadav");
		
		System.out.println(data.getName());

	}

}
