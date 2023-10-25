package mathematics;

public class CheckLeapYear {
	
	public static boolean isLeapYear(int year) {
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
			
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		if (isLeapYear(2100)) {
			System.out.println("This is a leap year");
		}else {
			System.out.println("This is not a leap year");
		}
		
	}

}
