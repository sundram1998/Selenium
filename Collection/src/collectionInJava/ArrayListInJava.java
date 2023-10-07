package collectionInJava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList);
//		arrayList.clear();
		System.out.println(arrayList.contains(200));
		if (arrayList.contains(1000)) {
			System.out.println("Yes,it contains this element");
		}else {
			System.out.println("No,it does not cntains this element");
		}
		
		System.out.println(arrayList.indexOf(1000));
		System.out.println(arrayList.remove(0));
		System.out.println(arrayList);
		
	}

}
