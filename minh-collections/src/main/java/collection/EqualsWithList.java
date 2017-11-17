package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualsWithList {
	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("TATA", "Brown");
		Vehicle vehicle2 = new Vehicle("HONDA", "White");
		
		// Generic Declaration
		// collection classes can be used as container for other objects.
		List<Vehicle> list = new ArrayList<Vehicle>(5);
		
		list.add(vehicle1);
		list.add(vehicle2);
		
		for (Vehicle vehicle : list) {
			System.out.println("Vehicle = " + vehicle);
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.next();
		
		System.out.println("Enter color");
		String color=scanner.next();
		
		Vehicle svehicle=new Vehicle(name, color);
		System.out.println("Content of the object to be searched = "+svehicle);
		boolean b=list.contains(svehicle);
		
		System.out.println("element is found ? "+b);

		boolean bb=list.remove(svehicle);
		System.out.println(svehicle+ " is deleted ??? "+bb);
		

	}

}
