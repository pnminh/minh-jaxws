package collection;

/**
 * 
 * @author nagendra.yadav
 *
 */

//Comparable interface should be implement in the class which has to be sorted
public class Puppy implements Comparable<Puppy>{
	
  private String name;
  private int age;
  
  public String getName() {
	return name;
  }

  public int getAge() {
	  return age;
  }


public Puppy(){
	  
  }
  //to assign initiate state for the object
  //to be created
  public Puppy(String name, int age) {
	super(); //constructor calling sequence
	this.name = name; //instance hiding
	this.age = age;
  }
  
  //to assign initiate state for the object
  //to be created
  public Puppy(int age,String name) {
	  //This is example for constructor chaining 
	 this(name,age);
	 //Super and this cannot come together because both should be 
	 //first statement inside the constructor definition
	 
  }
  
  @Override
  public int hashCode() {
	  if(name!=null)
	  return name.hashCode()+age;
	  else
		  return age;
  }
  
  @Override
  public boolean equals(Object obj) {
	  Puppy cpuppy=(Puppy)obj;
	  if(name!=null) {
		  if(name.equals(cpuppy.name) && age==cpuppy.age){
			  return true;
		  }
	  }else if(age==cpuppy.age){
		  return true;
	  }
	  return false;
  }
  
 

  @Override
  //to print current state of the object
  //Puppy pp=new Puppy("abc",34);
  //System.out.println(pp);pp.toString();
  public String toString() {
	  return "Puppy [name=" + name + ", age=" + age + "]";
  }

@Override
public int compareTo(Puppy o) {
	int p=o.age-age;
	if(p==0){
		p=o.name.compareTo(name);
	}
	return p;
}
  
   
}
