package collections.CF_01_List;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	
	public static void main(String[] args) {
		String arr [] = {"Java", "Selenium","Python", "Ruby"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
	}

}
