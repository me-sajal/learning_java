
package assignment1;

public class constructor {
	public static void main(String[] args) {
		 Person obj1 = new Person();
		 System.out.println("\nDefault Constructor values: \n");  
		 System.out.println("name : "+obj1.name + "\n age : "+obj1.age);  
		 System.out.println("\nParameterized Constructor values: \n");  
		 Person obj2 = new Person(17,"ram");
		 System.out.println("name : "+obj2.name + "\n age : "+obj2.age);
	}
}

	class Person{
	public int age=0;
	public String name;
	public Person() {
		}
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
}
}