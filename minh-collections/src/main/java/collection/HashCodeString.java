package collection;

public class HashCodeString {
	
	public static void main(String[] args) {

		String str1 = new String("India");
		String str2 = new String("India");
		String str3 = new String("India");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		Integer integer1=new Integer(100);
		Integer integer2=new Integer(100);
		
		
		System.err.println(integer1.hashCode());
		System.err.println(integer2.hashCode());

	}
}
