package arrayStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfStringsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("sun", "mon", "tues", "sut", "sun", "mon"));

		Map<String, Long> countMap = arrayList.stream()
				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
		System.out.println(countMap);

		Map<String, Long> resultMap = arrayList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(resultMap);

		List names = Arrays.asList("Reflection", "Collection", "Stream");
		Map<String, Long> result = (Map<String, Long>) names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

}
