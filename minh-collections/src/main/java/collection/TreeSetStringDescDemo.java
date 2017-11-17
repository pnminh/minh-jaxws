package collection;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetStringDescDemo {
	public static void main(String[] args) {
		
	 //TreeSet is based on binary search tree
	 //red black tree 
	 Set<String> set=new TreeSet<String>(new StringComparator());
	 set.add("Apple");
	 set.add("Banana");
	 set.add("Papaya");
	 set.add("Guava");
	 set.add("Grapse");
	 
	 //displaying all the elements
	 //p2 and p5 contains different hashCode , that's why we are able 
	 //to add duplicate element in set and violating the it's contract
	 for(String p : set){
		 System.out.println(p.toString());//p.toString();
	 }
	 
	}

}
