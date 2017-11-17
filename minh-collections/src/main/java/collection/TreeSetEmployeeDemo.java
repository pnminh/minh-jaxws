package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEmployeeDemo {
	
	public static void main(String[] args) {
		
		//16 elements  = load factor =.75
		//16*.75 =12 
		//12th element  = 16*2 =32 
		//32*.75 =24 th element =64
		Set<Employee> employees=new TreeSet<Employee>(new MobileComparator());
		//Set<Employee> employees=new TreeSet<Employee>();
		
		Employee employee1=new Employee("jhon","j@gmail.com","43100");
		Employee employee2=new Employee("dave","m@gmail.com","653100");
		Employee employee3=new Employee("lee","l@gmail.com","55323100");
		Employee employee5=new Employee("dave","m@gmail.com","93100");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee5);
		
		 for(Employee employee:employees) {
		    	System.out.println(employee);
		    }
		 
		
		 Employee employee4=new Employee("lee","l@gmail.com","3323100");
		 //true
		 boolean  b=employees.contains(employee4);
		 System.out.println("Employee = "+employee4 +"  = is found = "+b);
		
	}

}
