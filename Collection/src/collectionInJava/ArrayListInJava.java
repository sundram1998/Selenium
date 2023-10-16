package collectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList);
//		arrayList.clear();
//		System.out.println(arrayList.contains(200));
//		if (arrayList.contains(1000)) {
//			System.out.println("Yes,it contains this element");
//		}else {
//			System.out.println("No,it does not cntains this element");
//		}
//		
//		System.out.println(arrayList.indexOf(1000));
//		System.out.println(arrayList.remove(0));
//		System.out.println(arrayList);
//		
//		arrayList.set(2, 400); 
//		System.out.println(arrayList.lastIndexOf(200));
//		
//		for(int i:arrayList) {
//			System.out.println(i);
//		}
//		System.out.println("Using iterator-----------");
//		Iterator<Integer> iterator =arrayList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		System.out.println("Using while loop=-------");
//		int num=0;
//		while(arrayList.size()>num) {
//			System.out.println(arrayList.get(num));
//			num++;
//		}
		ArrayList<String> arrayList2=new ArrayList<String>(Arrays.asList("Foo", "Bar", "Bar", "Bar", "Foo","mon","mon","tues "));
//		arrayList2.add("Java");
//		arrayList2.add("Java");	
//		arrayList2.add("sun");
//		arrayList2.add("mon");
//		arrayList2.add("sun");
//		arrayList2.add("Java");
//		arrayList2.add("mon");
//		arrayList2.add("tue");
		System.out.println(arrayList2);
		
		Map<String, Long> couterMap = arrayList2.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        System.out.println(couterMap); 
        Map<String, Long> couterMap2 = arrayList2.stream().collect(Collectors.groupingBy(e -> e.toString().toLowerCase(),Collectors.counting()));
        System.out.println(couterMap2);
//        System.out.println(Collections.frequency(arrayList2, "Java"));
//		int count=1;
//		HashSet<String> hashSet=new HashSet<String>();
//		
//		for(int i=0;i<arrayList2.size();i++) {
//			hashSet.add(arrayList2.get(i));
//		}
//		for(int i=0;i<hashSet.size();i++) {
//			System.out.println(Collections.frequency(arrayList2, ));
//		}
//		System.out.println(hashSet);
//        
//        List<String> list = new ArrayList<>(Arrays.asList("Foo", "Bar", "Bar", "Bar", "Foo"));
//        System.out.println(list);
//        
//        Map<String, Long> result = list.stream()
//        		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(result);
	}
}
