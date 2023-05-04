// thread using delay and sleep
package practical8;
class threadsayhi extends Thread {
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

class threadsayhii extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class lab2 {

	public static void main(String[] args) {
		threadsayhi t1=new threadsayhi();
		t1.start();
		threadsayhii t11=new threadsayhii();
		t11.start();
		
	}

}
