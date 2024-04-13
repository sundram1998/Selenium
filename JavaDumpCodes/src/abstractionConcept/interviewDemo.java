package abstractionConcept;

public class interviewDemo {
	
	public static boolean isPal(String str) {
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString=revString+str.charAt(i);
		}
		if(revString.equals(str)) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPal("nitinf "));

	}

}
