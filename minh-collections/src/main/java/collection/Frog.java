package collection;

public class Frog implements Cloneable {

	private String name;
	private String color;

	public Frog(String name, String color) {
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
		return "Frog [name=" + name + ", color=" + color + "]";
	}
	
	@Override
	public Frog clone() throws CloneNotSupportedException {
		return (Frog)super.clone();
    }
}
