package practical2;
abstract class BCA{
	public void display() {

		System.out.println("this is display function");
	}
	abstract public int add();
}
interface human{
	public int sub();
	int id=12;
}

class bcachild extends BCA implements human {
	public void childfun() {
		System.out.println("this is a child function in child class");
	}
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int sub() {
		
		return 0;
	}
	
}

public class lab1 {

	public static void main(String[] args) {
		bcachild ch1 = new bcachild();
		ch1.childfun();
		ch1.add();
		ch1.sub();
	}
}
