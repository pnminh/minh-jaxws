package collection;


public class Vehicle {

	private String name;
	private String color;

	public Vehicle(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + "]";
	}
	
	@Override
	 public boolean equals(Object obj) {
		 Vehicle pvehicle=(Vehicle)obj;
		 if(pvehicle.getName().equals(name) &&  pvehicle.getColor().equals(color)){
			 return true;
		 }
		 return false;
	}
}
