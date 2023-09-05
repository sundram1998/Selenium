package javaCoding;

public class Encapsulation {
	
	private String nameString;
	private double age;
	
	public String getName() {
		return nameString;
	}
	
	public void setName(String nameString) {
		this.nameString=nameString;
	}
	
	public double getAge() {
		return age;
	}
	
	public void setAge(double age) {
		this.age=age;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation personEncapsulation=new Encapsulation();
		personEncapsulation.setName("Sundaram Yadav");
		personEncapsulation.setAge(25.5);
		
		System.out.println(personEncapsulation.getAge());
		System.out.println(personEncapsulation.getName());

	}

}
