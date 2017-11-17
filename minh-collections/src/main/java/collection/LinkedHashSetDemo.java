package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		//DC=10
		//  int newCapacity = ((oldCapacity * 3)/2)+ 1;
		//List is acting as a container for the object
		Set<String> superSet=new LinkedHashSet<String>();
		
		superSet.add("Nagendra");
		superSet.add("Nagendra");
		superSet.add("Nagendra");
		superSet.add("Nagendra");
		superSet.add("Nagendra");
		superSet.add("Nagendra");
		
		superSet.add("Siddhartha");
		superSet.add("Siddhartha");
		superSet.add("Dave");
		superSet.add("Michal");
		superSet.add("Ahmed"); ////  int newCapacity = ((oldCapacity * 3)/2)+ 1;
		System.out.println("Size = "+superSet.size());
		
		
		//For each loop 
		for(String names:superSet) {
			System.out.println(" names are = "+names);
		}
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		Iterator<String > it=superSet.iterator();
		while(it.hasNext()){
			String names=it.next();
			System.out.println(" names are = "+names);
		}
		
		boolean found=superSet.contains("Nagendra");
		System.out.println("found = "+found);
		
	}

}
