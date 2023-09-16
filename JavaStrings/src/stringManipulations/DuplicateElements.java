package stringManipulations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElements {
	
	public void countDuplicates() {
		String[] charStrings= {"java","javaScript","ruby","ruby","java","javaScript","Me"};
		for(int i=0;i<charStrings.length;i++) {
//			int count=1;
			for(int j=i+1;j<charStrings.length;j++) {
				if(charStrings[i]==charStrings[j]) {
//					count++;
					System.out.println(charStrings[i]+" is duplicate");
				}
			}
			
		}
	}

	public void duplicatewithset() {
		String[] charStrings= {"java","javaScript","ruby","java","javaScript"};
		Set<String> set=new HashSet<String>();
//		for(int i=0;i<charStrings.length;i++) {
//			if (set.add(charStrings[i])==false) {
//				System.out.println(charStrings[i]+" is duplicate element");
//			}
//		}
		for(String name:charStrings) {
			if (set.add(name)==false) {
				System.out.println(name+" is duplicate element");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub+


		DuplicateElements elements=new DuplicateElements();
//		elements.countDuplicates();
		elements.duplicatewithset();
	}
 
}
