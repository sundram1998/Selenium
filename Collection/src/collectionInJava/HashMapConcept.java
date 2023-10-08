package collectionInJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*HashMap implements Map interface
		HashMap contains only unique element
		extends AbstractMap
		stores value in key-value pair
		It may have oe null key and multiple null values
		it maintains no order*/
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Abhishek Jaiswal");
		hashMap.put(2, "Amitesh Mishra");
		hashMap.put(3, "Mahendra Prasad");
		hashMap.put(4, "Mahendra Singh");
		System.out.println(hashMap);
		System.out.println(hashMap.get(5));
		
		for(Entry<Integer,String> mEntry:hashMap.entrySet()) {
			System.out.println(mEntry.getKey()+" "+mEntry.getValue());
		}
		System.out.println("====================================================");
		
		HashMap<Integer, Employee> eMap=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee(25, "Mahendra Prasad", "Qa");
		Employee e2=new Employee(25, "Sundaram Yadav", "Qa");
		Employee e3=new Employee(25, "Shivam Singh", "Dev");
		
		eMap.put(1, e1);
		eMap.put(2, e2);
		eMap.put(3, e3);
		
		for(Entry<Integer, Employee> eEntry:eMap.entrySet()) {
			int keys=eEntry.getKey();
			Employee employee=eEntry.getValue();
			
			System.out.println("Employee No. "+keys+" Info: ");
			System.out.println(employee.name+' '+employee.age+" "+employee.dept);
		}
		
	}

}
