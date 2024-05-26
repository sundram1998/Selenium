package arrays;
// Reverse the sentence and make the first later capital

//and last one small and add a full stop in the end

public class ReverseSentence {

	public static String reverseSentence(String sentenceString) {
		// reverse the sentence
		String makeLowerString = sentenceString.substring(0, 1).toLowerCase() + sentenceString.substring(1);
//		System.out.println(makeLowerString);
		String[] splitStrings = makeLowerString.split(" ");
		int i = 0;
		int j = splitStrings.length - 1;
		while (i <= j) {
			String temp = splitStrings[i];
			splitStrings[i] = splitStrings[j];
			splitStrings[j] = temp;
			i++;
			j--;
		}
		String reversedString = String.join(" ", splitStrings);
		String capitalizedString = capitalizeString(reversedString);
		
		if(!capitalizedString.contains(".")) {
			capitalizedString=capitalizedString+".";
		}

		return capitalizedString;
	}

	public static String capitalizeString(String str) {
		String result=str.substring(0,1).toUpperCase()+str.substring(1);
//		String result = str.substring(0, str.length() - 1) + str.substring(str.length() - 1).toLowerCase();
		return result;
	}

	public static void main(String[] args) {
		String string = "Auto generated method stub";
		System.out.println(reverseSentence(string));

	}

}
