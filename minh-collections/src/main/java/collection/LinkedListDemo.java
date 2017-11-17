package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author nagendra.yadav
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		// Generic Declaration
		// collection classes can be used as container for other objects.
		//Capacity is 0
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Papaya");
		list.add("Papaya");

		// size of list

		System.out.println("############################");
		// I want to access it.
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println("3 = " + element);
		}

		System.out.println("############################");

		// retrieving all the elements.
		for (String str : list) {
			System.out.println("1 = " + str);
		}

		// retrieving all the elements.
		// fastest retrieval because access as per index of the array.
		for (int i = 0; i < list.size(); i++) {
			System.out.println("2 = " + list.get(i));
		}

		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println("4 = " + listIterator.next());
			listIterator.add("Nagendra");
		}

		// retrieving all the elements.
		// fastest retrieval bec
	}
}
