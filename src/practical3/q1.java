package practical3;

public class q1 {
		public static void main(String[] args)
		{
			Person obj1=new Person();
			Person obj2=new Person();
			System.out.println("Obj1 instance of person:"+(obj1 instanceof Person));
			System.out.println("Obj1 instance of person:"+(obj1 instanceof Boy));
			System.out.println("Obj1 instance of person:"+(obj1 instanceof MyInterface));
			
			System.out.println("Obj1 instance of person:"+(obj2 instanceof Person));
			System.out.println("Obj1 instance of person:"+(obj2 instanceof Boy));
			System.out.println("Obj1 instance of person:"+(obj2 instanceof MyInterface));
			
		}}
class Person{
	
}
class Boy extends Person implements MyInterface{
	
}
interface MyInterface{
	
}