package collections.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_002 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Pratik");
		list.add("2");
		list.add("Sumit");
		list.add("3");
		list.add("Chalisgaon");
		

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));


        System.out.println(list);

        System.out.println(" --- ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
		
	}

}
