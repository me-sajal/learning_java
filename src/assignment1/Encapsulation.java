package assignment1;

public class Encapsulation {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setage(33);
		s1.setbatch(3);
		s1.setname("Harry");
		System.out.println(s1.getage());
		System.out.println(s1.getbatch());
		System.out.println(s1.getname());
	}

}
class Student{
	private String name;
	private int age, batch;
	public void setage(int age) {
		this.age=age;
	}
	public void setbatch(int batch) {
		this.batch=batch;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage(){
		return age;
	}
	public int getbatch(){
		return batch;
	}
	public String getname(){
		return name;
	}
}

