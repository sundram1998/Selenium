package strings;

import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sJoiner=new StringJoiner(",","{","}");
		sJoiner.add("Satyam").add("Shivam").add("Sundram");
		System.out.println(sJoiner);

	}

}
