package arraysRelatedQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInString {
	
	public static void findDuplicates(String str) {
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		String[] strArray=str.split("");
		for(String s:strArray) {
			if(hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s)+1);
			}else {
				hashMap.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:hashMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Thisisjavacodefindingduplicateswordsnjavacodewords";
		findDuplicates(string);

	}

}
