package collectionInJava;

public class Employee {
	int age;
	String name;
	String dept;

	Employee(int age,String name,String dept){
		this.age=age;
		this.name=name;
		this.dept=dept;
//		System.out.println(name+" || "+dept+" || "+age);
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee(25, "Sundaram", "Quality Assurance");
	}
	
}
