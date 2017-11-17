package collection;

public class FrogCloneMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Frog frog=new Frog("Mock", "yellow");
		System.out.println(frog);
		System.out.println(frog.hashCode());
		
		Frog frog2=frog.clone();
		System.out.println(frog2);
		System.out.println(frog2.hashCode());
		
	}

}
