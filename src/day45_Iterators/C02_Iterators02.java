package day45_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_Iterators02 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list);//[A, B, C, D]
		
		// her elemana B harfi ekleyelim
		
		ListIterator li1 = list.listIterator();
		
		while (li1.hasNext()) {
			
			String temp = (String) li1.next();
			li1.set(temp + "B");
			
		}

		System.out.println(list);//[AB, BB, CB, DB]
		
	}

}
