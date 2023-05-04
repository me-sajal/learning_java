package exam;
class eg1 extends Thread{
	String name;
	eg1(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("hello "+name);
		}
	}
}

public class threadeg {
	public static void main(String[] args) throws InterruptedException{
		eg1 e=new eg1("sajal");
		eg1 e1=new eg1("sajl");
		e.start();
		Thread.sleep(1000);
		e1.start();
		
		
		
		
	}

}
