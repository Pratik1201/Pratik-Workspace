package tasks.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachArray {
	public static void main(String[] args) {
		int [] numbers = {2,4,5,5,6,4,3,2,9,8,9,6};
		Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
	}

}
}