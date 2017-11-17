package collection;

//Object

class Horse {

	private String name;
	private String color;

	public Horse(String name, String color) {
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
		return "Horse [name=" + name + ", color=" + color + "]";
	}

}

public class HashCodeDemo {

	public static void main(String[] args) {
        
		Horse horse1=new Horse("jhon","brown");
        Horse horse2=new Horse("dave","white");
        
        System.out.println(horse1.hashCode());  //equals = if two object are same as per equals method , it's hashCode must be same
        															  //if two object have same hashcode then they may be equal as per equals method or may not		
        															 //hash collision
                                                                     //2 to power 31-1
        System.out.println(horse1.hashCode());
        System.out.println(horse1.hashCode());
        System.out.println(horse1.hashCode());
        System.out.println(horse1.hashCode());
        
        System.out.println(horse2.hashCode());        
        System.out.println(horse2.hashCode());
        System.out.println(horse2.hashCode());
        System.out.println(horse2.hashCode());
        
        Horse horse=horse1;
        
        System.out.println(horse.hashCode()); //hashCode ?? same because hourse is also pointing same object
        
	}

}

