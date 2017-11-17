package collection;

public class HashCodeStringBuilder {
	
	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("India");
		StringBuilder str2 = new StringBuilder("India");
		StringBuilder str3 = new StringBuilder("India");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	

	}
}
