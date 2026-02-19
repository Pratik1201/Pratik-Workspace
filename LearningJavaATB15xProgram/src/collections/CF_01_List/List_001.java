package collections.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class List_001 {
	public static void main(String[] args) {
		List fruits = List.of("Mango", "Apple", "Dragon-Fruit", "Banana");
		System.out.println(fruits);
		
		List arrayList = new ArrayList();
		arrayList.add("Orange");
		arrayList.add("Watermelon");
		
		System.out.println(arrayList);
	}

}
