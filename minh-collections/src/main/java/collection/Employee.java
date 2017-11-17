package collection;

//Comparable is used to provide default sorting behaviour 
public class Employee implements Comparable<Employee>{

	private String name;
	private String email;
	private String mobile;

	public Employee() {
	}

	public Employee(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
	@Override
	public int hashCode() {
         return name.hashCode()+email.hashCode()+mobile.hashCode();
	}
	

	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		if(name.equals(employee.name) && email.equals(employee.email) && mobile.equals(employee.mobile)) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		//we are sorting object as per email in ascending order
		int p=email.compareTo(o.email);
		return p;
	}
}
