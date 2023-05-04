package exam;
class egg1 extends Thread{

	public void run() {
		for(int i=0; i<100; i++) {
			addby1();
		}
	}

	int c=0;
	synchronized void addby1(){
		c=c+1;
		}
}
public class sa {
	
	public static void main(String[] args) throws InterruptedException{
		egg1 th1=new egg1();
		egg1 th2=new egg1();
		th1.start();
		th2.start();
			System.out.println(th1.c);
		
		
	}

}
