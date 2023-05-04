//thread using implements 
package practical8;
class threadsayhi11 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("HI "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class lab3 {

	public static void main(String[] args) {
		
		threadsayhi11 t1=new threadsayhi11();
		Thread t11=new Thread(t1);
		t11.start();
		
		
	}

}
