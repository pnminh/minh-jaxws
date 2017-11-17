package collection;

import java.util.Comparator;


//Comparator can define sorting behavior on the fly..............
public class MobileComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//we are sorting object as per mobile in ascending order
		int p=o1.getMobile().compareTo(o2.getMobile());
		return p;
	}

}
